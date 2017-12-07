package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import plannedactsofkindness.org.plannedactsofkindness.Function.Reusable;
import plannedactsofkindness.org.plannedactsofkindness.Function.ReusableGraphicButton;
import plannedactsofkindness.org.plannedactsofkindness.Function.text;
import plannedactsofkindness.org.plannedactsofkindness.R;

public class Volunteer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_without_g);
        int imageInt [] = {R.drawable.test,R.drawable.second,R.drawable.inviteothers};

        Reusable reuse = new Reusable(Volunteer.this, Volunteer_2.class);
        reuse.setup();

        text getContent = new text();
        String volunteer = getContent.getVolunteer();
        WebView webView = (WebView)findViewById(R.id.reusableWebView);
        webView.loadDataWithBaseURL(null, volunteer, "text/html", "utf-8", null);
        webView.setBackgroundColor(Color.TRANSPARENT);
    }
}