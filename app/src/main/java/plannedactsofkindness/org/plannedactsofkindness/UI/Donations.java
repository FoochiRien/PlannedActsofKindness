package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import plannedactsofkindness.org.plannedactsofkindness.Function.Reusable;
import plannedactsofkindness.org.plannedactsofkindness.Function.text;
import plannedactsofkindness.org.plannedactsofkindness.R;

/**
 * Created by pkkwilliam on 6/2/17.
 */

public class Donations extends AppCompatActivity{

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

            //String url = "http://google.com";
            //Intent i = new Intent(Intent.ACTION_VIEW);
            //i.setData(Uri.parse(url));
            //startActivity(i);
            setContentView(R.layout.test_without_g);

            Reusable reuse = new Reusable(Donations.this, PersonOfTheWeek.class);
            reuse.setup();

            WebView webView = (WebView) findViewById(R.id.reusableWebView);
            webView.loadUrl("http://plannedactsofkindness.org/home-5-4/");
            //webView.setBackgroundColor(Color.TRANSPARENT);
            {

            }
        }}