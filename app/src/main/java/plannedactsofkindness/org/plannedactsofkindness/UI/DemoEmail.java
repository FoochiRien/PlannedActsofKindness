package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
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

public class DemoEmail extends AppCompatActivity {
    Session session=null;
    String from_email;
    String to_email;
    String greeding;
    String signoff;
    String senderName;
    String emailDemo;
    AlertDialog pdialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_email);

        text text = new text();

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            from_email = extras.getString("fromEmail");
            to_email = extras.getString("toEmail");
            greeding = extras.getString("greeding");
            signoff = extras.getString("signoff");
            senderName = extras.getString("senderName");
        }

        ImageButton rReviseButton = (ImageButton)findViewById(R.id.reviseButton);
        ImageButton rSendButton = (ImageButton)findViewById(R.id.sendButton);

        emailDemo = text.emailTemplate(greeding,senderName,signoff);
        WebView webview = (WebView)findViewById(R.id.webview);
        webview.setInitialScale(getScale());
        webview.loadDataWithBaseURL(null, emailDemo, "text/html", "utf-8", null);

        rReviseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DemoEmail.super.onBackPressed();
            }
        });

        rSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    send();
                }
        });
    }
    private int getScale(){
        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int width = display.getWidth();
        Double val = new Double(width)/new Double(450);
        val = val * 100d;
        return val.intValue();
    }
    private void send(){


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
        pdialog = ProgressDialog.show(this, "Email Status", "Sending Mail...", true);
        DemoEmail.RetreiveFeedTask task = new DemoEmail.RetreiveFeedTask();
        task.execute();
    }


    class RetreiveFeedTask extends AsyncTask<String, Void, String> {

        protected String doInBackground(String... urls) {

            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("interships.16things@gmail.com"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to_email));
                message.setSubject("Join Karma Club");
                message.setContent(emailDemo, "text/html; charset=utf-8");

                Transport.send(message);

            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        protected void onPostExecute(String feed) {
            pdialog.dismiss();
            Toast.makeText(getApplicationContext(), "Email sent", Toast.LENGTH_LONG).show();
        }
    }
    }
