package plannedactsofkindness.org.plannedactsofkindness.Function;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import plannedactsofkindness.org.plannedactsofkindness.R;
import plannedactsofkindness.org.plannedactsofkindness.UI.SignUp;


/**
 * Created by pkkwilliam on 5/19/17.
 */

public class Reusable {
    Activity thisActivity;
    Class nextActivity;
    ImageButton rMenuButton;

    public Reusable(Activity thisActivity, Class nextActivity){
        this.thisActivity = thisActivity;
        this.nextActivity = nextActivity;
    }

    public void setup(){
        final menu rMenu = new menu(thisActivity);

        rMenuButton = (ImageButton)thisActivity.findViewById(R.id.reuseMenuButton);
        ImageButton rJoinButton = (ImageButton)thisActivity.findViewById(R.id.resueJoinButton);
        ImageButton rNextButton = (ImageButton)thisActivity.findViewById(R.id.reusePopupWindowNextButton);

        rMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(thisActivity, rMenuButton);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        rMenu.switchActivity(item);
                        return true;
                    }
                });
                popupMenu.show();
            }
        });

        rJoinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(thisActivity, SignUp.class);
                thisActivity.startActivity(i);
            }
        });

        rNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(thisActivity, nextActivity);
                thisActivity.startActivity(i);
            }
        });
    }
}
