package plannedactsofkindness.org.plannedactsofkindness.activity_loading;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import plannedactsofkindness.org.plannedactsofkindness.R;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        //todo add progress bar

        //Check if there is a network connection
        NetworkInfo network = ((ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE))
                .getActiveNetworkInfo();
        if (network != null && network.isConnected()){
           startActivity(new Intent(LoadingActivity.this, SignInActivity.class));
        } else {
            Toast.makeText(this, "Check your internet connection.", Toast.LENGTH_LONG).show();
        }


    }
}
