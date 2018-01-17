package plannedactsofkindness.org.plannedactsofkindness.activity_loading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import plannedactsofkindness.org.plannedactsofkindness.HomeActivity;
import plannedactsofkindness.org.plannedactsofkindness.R;

public class SignInActivity extends AppCompatActivity {

  private String mUsername, mPassword;
  TextView forgotpassword, joinpak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        /* Takes in the username and password*/
        //todo activate once the API is working
        EditText username = (EditText) findViewById(R.id.signin_username);
        EditText password = (EditText) findViewById(R.id.signin_password);
        mUsername = username.getText().toString();
        mPassword = password.getText().toString();


        Button mSignin = (Button) findViewById(R.id.signin_button);
        mSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignInActivity.this, HomeActivity.class));
            }
        });

        forgotpassword = (TextView) findViewById(R.id.signin_forgotpassword);
        joinpak = (TextView) findViewById(R.id.signin_joinpak);

        //todo forgot password

        //todo add link to



    }
}
