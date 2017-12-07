package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import plannedactsofkindness.org.plannedactsofkindness.R;

public class ContactUs extends AppCompatActivity {
    String name;
    String email;
    String message;

    String subject;
    String emailBody;
    Session session;
    AlertDialog alertDialog;
    AlertDialog pdiDialog;

    EditText rContactName;
    EditText rContactEmail;
    EditText rContactMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Contact Us");

        rContactName = (EditText) findViewById(R.id.contactNameEditText);
        rContactEmail = (EditText) findViewById(R.id.contactEmailEditText);
        rContactMessage = (EditText) findViewById(R.id.contactMessageEditText);
        ImageButton rContactButton = (ImageButton)findViewById(R.id.contactImageButton);

        rContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean check = checkEditTextField();
                if(check == true){
                    sendMessage();
                }

            }
        });
    }

    private boolean checkEditTextField() {
        name = rContactName.getText().toString();
        email = rContactEmail.getText().toString();
        message = rContactMessage.getText().toString();
        Boolean nameCheck = name.isEmpty();
        Boolean emailCheck = email.isEmpty();
        Boolean messageCheck = message.isEmpty();

        if (nameCheck == false && emailCheck == false && (messageCheck == false || !email.equals(""))) {
            return true;
        }else{
            alertDialog.setMessage("Please Check All Field");
            alertDialog.show();
            return false;
        }
    }
    private void sendMessage(){
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        subject = name + " Contact Us From PAK Android App";

        emailBody = name + " Send Us a Message From Android Contact Us<br/>The Email S/He Left Is: "+email+"<br/><br/>The Following Is The Message S/He Left:<br/>"+message;


        session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("internships.16things@gmail.com", "Success2016@@");
            }
        });
        pdiDialog = ProgressDialog.show(this, "Message Status", "Sending Mail...", true);
        ContactUs.RetreiveFeedTask task = new ContactUs.RetreiveFeedTask();
        task.execute();
    }


    class RetreiveFeedTask extends AsyncTask<String, Void, String> {

        protected String doInBackground(String... urls) {

            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("interships.16things@gmail.com"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("internships.16things@gmail.com"));
                message.setSubject(subject);
                message.setContent(emailBody, "text/html; charset=utf-8");

                Transport.send(message);

            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        protected void onPostExecute(String feed) {
            pdiDialog.dismiss();
            //alertDialog.setMessage("Message Sent\nThank You");
            //alertDialog.show();
            rContactName.setText("");
            rContactEmail.setText("");
            rContactMessage.setText("");
            Toast.makeText(getApplicationContext(), "Message Sent\n Thank You", Toast.LENGTH_LONG).show();
        }
    }
    }

