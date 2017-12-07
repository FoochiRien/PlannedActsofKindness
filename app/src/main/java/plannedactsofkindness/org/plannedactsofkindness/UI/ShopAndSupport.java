package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import plannedactsofkindness.org.plannedactsofkindness.Function.Reusable;
import plannedactsofkindness.org.plannedactsofkindness.R;

/**
 * Created by pkkwilliam on 6/30/17.
 */

public class ShopAndSupport extends AppCompatActivity{

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //String url = "http://google.com";
        //Intent i = new Intent(Intent.ACTION_VIEW);
        //i.setData(Uri.parse(url));
        //startActivity(i);
        setContentView(R.layout.test_without_g);

        Reusable reuse = new Reusable(ShopAndSupport.this, PersonOfTheWeek.class);
        reuse.setup();

        WebView webView = (WebView) findViewById(R.id.reusableWebView);
        webView.loadUrl("http://plannedactsofkindness.org/Shop/");
        //webView.setBackgroundColor(Color.TRANSPARENT);
        {

        }
    }}