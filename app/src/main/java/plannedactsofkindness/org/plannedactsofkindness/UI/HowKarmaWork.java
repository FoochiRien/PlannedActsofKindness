package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import plannedactsofkindness.org.plannedactsofkindness.Function.Reusable;
import plannedactsofkindness.org.plannedactsofkindness.Function.text;
import plannedactsofkindness.org.plannedactsofkindness.R;

public class HowKarmaWork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_karma_work);

        text getContent = new text();

        String karmaLevel = getContent.getKarmaWork();
        WebView webview = (WebView)findViewById(R.id.karmaLevelWebView);
        webview.loadDataWithBaseURL(null, karmaLevel, "text/html", "utf-8", null);
        webview.setBackgroundColor(Color.TRANSPARENT);

        Reusable reuse = new Reusable(HowKarmaWork.this, KarmaReward.class);
        reuse.setup();

    }

}
