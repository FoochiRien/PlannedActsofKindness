package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import plannedactsofkindness.org.plannedactsofkindness.Function.Reusable;
import plannedactsofkindness.org.plannedactsofkindness.R;

public class CauseOfTheMonth extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todays_daily_pak);

        Reusable reuse = new Reusable(CauseOfTheMonth.this, kidCanDoOrg.class);
        reuse.setup();

        ImageButton rInviteOthersImageButton = (ImageButton) findViewById(R.id.inviteOthersImageButton);
        TextView comingSoonContent = (TextView)findViewById(R.id.comingSoonContent);
        comingSoonContent.setText("  Cause Of The Month  ");

        rInviteOthersImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CauseOfTheMonth.this, template.class);
                startActivity(i);
            }
        });

    }

}