package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import plannedactsofkindness.org.plannedactsofkindness.R;

/**
 * Created by pkkwilliam on 6/15/17.
 */

public class TShirtAndAppeal extends AppCompatActivity{
    ImageButton rPopupNextButton;
    ImageButton rPopupBackButton;
    ImageButton rPopupCloseButton;
    ImageView rPopupImageView;
    ImageButton rPopupPurchaseButton;
    int drawableInt [] = {};
    int currentImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_image);

        currentImage = 0;

        drawableInt = new int[]{
                R.drawable.finalpage17, R.drawable.finalpage18
                , R.drawable.finalpage19, R.drawable.finalpage20, R.drawable.finalpage21
        };

        rPopupNextButton = (ImageButton)findViewById(R.id.reusePopupWindowNextButton);
        rPopupBackButton = (ImageButton)findViewById(R.id.reusePopupWindowBackButton);
        rPopupCloseButton = (ImageButton)findViewById(R.id.reusePopupWindowCloseButton);
        rPopupImageView = (ImageView)findViewById(R.id.reusePopupWindowImageView);
        rPopupPurchaseButton = (ImageButton)findViewById(R.id.reusePopupWindowPuschase);

        rPopupImageView.setImageResource(drawableInt[currentImage]);

        checkCurrentImage();


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
                TShirtAndAppeal.super.onBackPressed();
            }
        });
        rPopupPurchaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://plannedactsofkindness.org/shop/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
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
