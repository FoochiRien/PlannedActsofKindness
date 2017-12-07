package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import plannedactsofkindness.org.plannedactsofkindness.Function.ReusableGraphicButton;
import plannedactsofkindness.org.plannedactsofkindness.Function.text;
import plannedactsofkindness.org.plannedactsofkindness.R;

public class HowWeHelp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        int imageInt [] = {R.drawable.compresspage3};

        ReusableGraphicButton reuse = new ReusableGraphicButton(HowWeHelp2.this, NationalKidsMonth.class, imageInt,false);
        reuse.setup();

        text getContent = new text();
        String volunteer = getContent.getHowWeHelp2();
        WebView webView = (WebView)findViewById(R.id.reusableWebView);
        webView.loadDataWithBaseURL(null, volunteer, "text/html", "utf-8", null);
        webView.setBackgroundColor(Color.TRANSPARENT);
    }

}