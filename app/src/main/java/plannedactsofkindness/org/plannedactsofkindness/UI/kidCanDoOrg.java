package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import plannedactsofkindness.org.plannedactsofkindness.R;

public class kidCanDoOrg extends AppCompatActivity{
    ImageButton rPopupNextButton;
    ImageButton rPopupBackButton;
    ImageButton rPopupCloseButton;
    ImageView rPopupImageView;
    int drawableInt [] = {};
    int currentImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_image);

        currentImage = 0;

        drawableInt = new int[]{R.drawable.finalpage1, R.drawable.finalpage2, R.drawable.finalpage3, R.drawable.finalpage4, R.drawable.finalpage5, R.drawable.finalpage6
                , R.drawable.finalpage7, R.drawable.finalpage8, R.drawable.finalpage9, R.drawable.finalpage10, R.drawable.finalpage11, R.drawable.finalpage12, R.drawable.finalpage13
                , R.drawable.finalpage14, R.drawable.finalpage15, R.drawable.finalpage16
        };

        rPopupNextButton = (ImageButton)findViewById(R.id.reusePopupWindowNextButton);
        rPopupBackButton = (ImageButton)findViewById(R.id.reusePopupWindowBackButton);
        rPopupCloseButton = (ImageButton)findViewById(R.id.reusePopupWindowCloseButton);
        rPopupImageView = (ImageView)findViewById(R.id.reusePopupWindowImageView);

        ImageButton rPopupPurchaseButton = (ImageButton)findViewById(R.id.reusePopupWindowPuschase);
        rPopupPurchaseButton.setVisibility(View.INVISIBLE);

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
                kidCanDoOrg.super.onBackPressed();
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
