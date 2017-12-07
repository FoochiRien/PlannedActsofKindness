package plannedactsofkindness.org.plannedactsofkindness.Function;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;

import plannedactsofkindness.org.plannedactsofkindness.R;
import plannedactsofkindness.org.plannedactsofkindness.UI.SignUp;

/**
 * Created by pkkwilliam on 5/26/17.
 */

public class ReusableGraphicButton {
    ImageButton rMenuButton;
    Activity thisActivity;
    Class nextActivity;
    int drawableInt [];
    Boolean purchaseButton;

    int currentImage = 0;
    ImageButton rPopupBackButton;
    ImageButton rPopupNextButton;

    public ReusableGraphicButton(Activity thisActivity, Class nextActivity, int [] drawableInt, Boolean purchaseButton){
        this.thisActivity = thisActivity;
        this.nextActivity = nextActivity;
        this.drawableInt = drawableInt;
        this.purchaseButton = purchaseButton;
    }
    public void setup(){
        final menu rMenu = new menu(thisActivity);

        LayoutInflater layoutInflater = LayoutInflater.from(thisActivity);
        View prompView = layoutInflater.inflate(R.layout.popup_image, null);
        final AlertDialog alertDialog = new AlertDialog.Builder(thisActivity).create();
        alertDialog.setView(prompView);
        alertDialog.setCanceledOnTouchOutside(true);

        rMenuButton = (ImageButton)thisActivity.findViewById(R.id.reuseMenuButton);
        ImageButton rJoinButton = (ImageButton)thisActivity.findViewById(R.id.resueJoinButton);
        ImageButton rNextButton = (ImageButton)thisActivity.findViewById(R.id.reusePopupWindowNextButton);
        ImageButton rGraphicButton = (ImageButton)thisActivity.findViewById(R.id.reuseGraphButton);

        rPopupNextButton = (ImageButton)prompView.findViewById(R.id.reusePopupWindowNextButton);
        rPopupBackButton = (ImageButton)prompView.findViewById(R.id.reusePopupWindowBackButton);
        ImageButton rPopupCloseButton = (ImageButton)prompView.findViewById(R.id.reusePopupWindowCloseButton);
        ImageButton rPopupPurchaseButton = (ImageButton)prompView.findViewById(R.id.reusePopupWindowPuschase);

        final ImageView rPopupImageView = (ImageView)prompView.findViewById(R.id.reusePopupWindowImageView);

        rPopupImageView.setImageResource(drawableInt[currentImage]);

        checkCurrentImage();

        if (purchaseButton == false) {
            rPopupPurchaseButton.setVisibility(View.INVISIBLE);
        }

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
        rGraphicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
               alertDialog.show();
            }
        });
        rPopupNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImage++;
                rPopupImageView.setImageResource(drawableInt[currentImage]);
                checkCurrentImage();
            }
        });
        rPopupBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImage--;
                rPopupImageView.setImageResource(drawableInt[currentImage]);
                checkCurrentImage();
            }
        });
        rPopupCloseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
    }
    private void checkCurrentImage(){
        if(drawableInt.length <= 1){
            rPopupNextButton.setVisibility(View.INVISIBLE);
            rPopupBackButton.setVisibility(View.INVISIBLE);
        }
        else if (currentImage == drawableInt.length - 1){
            rPopupNextButton.setVisibility(View.INVISIBLE);
            rPopupBackButton.setVisibility(View.VISIBLE);
        }
        else if(currentImage == 0){
            rPopupBackButton.setVisibility(View.INVISIBLE);
            rPopupNextButton.setVisibility(View.VISIBLE);
        }
        else{
            rPopupNextButton.setVisibility(View.VISIBLE);
            rPopupBackButton.setVisibility(View.VISIBLE);
        }
    }
}