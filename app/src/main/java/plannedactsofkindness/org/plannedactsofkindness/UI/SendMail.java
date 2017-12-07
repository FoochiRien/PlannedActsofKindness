package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import plannedactsofkindness.org.plannedactsofkindness.Function.text;
import plannedactsofkindness.org.plannedactsofkindness.R;

public class SendMail extends Activity implements View.OnClickListener {

    Session session=null;
    ProgressDialog pdialog=null;
    Context context=null;
    EditText reciept=null;
    EditText rReceiverName = null;
    String recpient=null;
    String subject=null;
    String textmessage=null;
    text getContent = new text();
    String receiverName;
    String senderName;
    EditText rSenderName = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_mail);
        context=this;
        Button login = (Button) findViewById(R.id.mBtnSubmit);
        login.setOnClickListener(this);

        reciept=(EditText)findViewById(R.id.editText_to);
        rReceiverName = (EditText)findViewById(R.id.nickname);
        rSenderName = (EditText)findViewById(R.id.sender);

    }

    @Override
    public void onClick(View v) {

        receiverName = rReceiverName.getText().toString();
        senderName = rSenderName.getText().toString();

        recpient = reciept.getText().toString();

        subject = receiverName + " Join Karma Club";
        textmessage = getContent.emailTemplate(receiverName, senderName,"");// body of the email

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");


        session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("internships.16things@gmail.com", "Success2016@@");
            }
        });
        //pdialog = ProgressDialog.show(context, "", "Sending Mail...", true);
        RetreiveFeedTask task = new RetreiveFeedTask();
        task.execute();
    }


    class RetreiveFeedTask extends AsyncTask<String, Void, String> {

        protected String doInBackground(String... urls) {

            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("interships.16things@gmail.com"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recpient));
                message.setSubject(subject);
                message.setContent(textmessage, "text/html; charset=utf-8");

                Transport.send(message);

            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        protected void onPostExecute(String feed) {
            //pdialog.dismiss();
            reciept.setText("");
            rReceiverName.setText("");
            Toast.makeText(getApplicationContext(), "Message sent", Toast.LENGTH_LONG).show();
        }
    }
}
