package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import plannedactsofkindness.org.plannedactsofkindness.Function.Reusable;
import plannedactsofkindness.org.plannedactsofkindness.Function.text;
import plannedactsofkindness.org.plannedactsofkindness.R;

public class Karma_Page_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karma_page_2);

        text getContent = new text();

        WebView webView = (WebView)findViewById(R.id.karmaPage2WebView);

        String description = getContent.getKarmaDescription();
        webView.loadDataWithBaseURL(null, description, "text/html", "utf-8", null);
        webView.setBackgroundColor(Color.TRANSPARENT);

        Reusable reuse = new Reusable(Karma_Page_2.this, HowKarmaWork.class);
        reuse.setup();
    }

}
