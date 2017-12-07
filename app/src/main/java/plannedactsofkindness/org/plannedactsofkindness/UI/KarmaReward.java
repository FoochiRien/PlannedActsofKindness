package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import plannedactsofkindness.org.plannedactsofkindness.Function.Reusable;
import plannedactsofkindness.org.plannedactsofkindness.Function.text;
import plannedactsofkindness.org.plannedactsofkindness.R;

public class KarmaReward extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karma_reward);
        text getContent = new text();

        String karmaLevel = getContent.getKarmaReward();
        WebView webview = (WebView)findViewById(R.id.karmaRewardWebView);
        webview.loadDataWithBaseURL(null, karmaLevel, "text/html", "utf-8", null);
        webview.setBackgroundColor(Color.TRANSPARENT);


        Reusable reuse = new Reusable(KarmaReward.this, TheWorldIsEnding.class);
        reuse.setup();
    }

}