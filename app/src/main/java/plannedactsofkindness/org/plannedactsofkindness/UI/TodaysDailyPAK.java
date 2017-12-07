package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import plannedactsofkindness.org.plannedactsofkindness.Function.Reusable;
import plannedactsofkindness.org.plannedactsofkindness.Function.menu;
import plannedactsofkindness.org.plannedactsofkindness.R;

public class TodaysDailyPAK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todays_daily_pak);

        Reusable reuse = new Reusable(TodaysDailyPAK.this, KarmaPage.class);
        reuse.setup();

        ImageButton rInviteOthersImageButton = (ImageButton)findViewById(R.id.inviteOthersImageButton);

        rInviteOthersImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TodaysDailyPAK.this, template.class);
                startActivity(i);
            }
        });

    }

}


