package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import plannedactsofkindness.org.plannedactsofkindness.Function.Reusable;
import plannedactsofkindness.org.plannedactsofkindness.Function.text;
import plannedactsofkindness.org.plannedactsofkindness.R;

public class SocialResponsibility extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_responsibility);

        text getContext = new text();
        String socialResponsibility = getContext.getSocialResponsibility();

        WebView webView = (WebView)findViewById(R.id.socialResponsibilityWebView);
        webView.loadDataWithBaseURL(null, socialResponsibility,"text/html","utf-8",null);
        webView.setBackgroundColor(Color.TRANSPARENT);

        Reusable reuse = new Reusable(SocialResponsibility.this, HowWeHelp.class);
        reuse.setup();
    }
}
