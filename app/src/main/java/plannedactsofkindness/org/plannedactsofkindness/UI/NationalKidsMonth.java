package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import plannedactsofkindness.org.plannedactsofkindness.Function.Reusable;
import plannedactsofkindness.org.plannedactsofkindness.Function.ReusableGraphicButton;
import plannedactsofkindness.org.plannedactsofkindness.Function.text;
import plannedactsofkindness.org.plannedactsofkindness.R;

/**
 * Created by pkkwilliam on 5/24/17.
 */

public class NationalKidsMonth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        int imageInt [] = {R.drawable.compresspage11};

        ReusableGraphicButton reuse = new ReusableGraphicButton(NationalKidsMonth.this, CustomBenefitPlans1.class, imageInt,false);
        reuse.setup();
        text getContent = new text();
        String volunteer = getContent.getNationalKidsMonth();
        WebView webView = (WebView) findViewById(R.id.reusableWebView);
        webView.loadDataWithBaseURL(null, volunteer, "text/html", "utf-8", null);
        webView.setBackgroundColor(Color.TRANSPARENT);
        {

        }
    }}

