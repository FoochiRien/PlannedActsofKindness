package plannedactsofkindness.org.plannedactsofkindness.UI;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import plannedactsofkindness.org.plannedactsofkindness.Function.Reusable;
import plannedactsofkindness.org.plannedactsofkindness.Function.text;
import plannedactsofkindness.org.plannedactsofkindness.R;

public class KarmaPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karma_page);

        text getContent = new text();
        String welcomeKarma = getContent.getWelcomeKarma();
        WebView webView = (WebView)findViewById(R.id.welcomeKarmaWebView);
        webView.loadDataWithBaseURL(null, welcomeKarma, "text/html", "utf-8", null);
        webView.setBackgroundColor(Color.TRANSPARENT);

        Reusable reuse = new Reusable(KarmaPage.this, Karma_Page_2.class);
        reuse.setup();
    }

}
