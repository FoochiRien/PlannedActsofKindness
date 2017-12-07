package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import plannedactsofkindness.org.plannedactsofkindness.Function.SignUpInsertBackground;
import plannedactsofkindness.org.plannedactsofkindness.R;


public class SignUp extends AppCompatActivity {

    // UI Global
    AlertDialog alertDialog;

    EditText rFirstnameEditText;
    EditText rLastnameEditText;
    EditText rNicknameEditText;
    EditText rCityEditText;
    EditText rStateEditText;
    EditText rCountryEditText;
    EditText rEmailEditText;
    EditText rComfirmEmailEditText;
    EditText rPhoneEditText;
    EditText rFacebookEditText;
    EditText rTwitterEditText;
    EditText rOtherSocialMediaEdidText;
    EditText rLongQuestion1EditText;
    EditText rLongQuestion2EditText;
    EditText rLongQuestion3EditText;
    EditText rLongQuestion4EditText;
    EditText rLongQuestion5EditText;
    EditText rLongQuestion6EditText;
    CheckBox rCheckBox;

    Button rSignupButton;

    // Global Variable

    String first;
    String last;
    String nickname;
    String city;
    String state;
    String country;
    String email1;
    String email2;
    String phone;
    String facebook;
    String twitter;
    String otherSocialMedia;
    String longQuestion1;
    String longQuestion2;
    String longQuestion3;
    String longQuestion4;
    String longQuestion5;
    String longQuestion6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // UI Set Up
        rFirstnameEditText = (EditText) findViewById(R.id.firstnameEditText);
        rLastnameEditText = (EditText) findViewById(R.id.lastnameEditText);
        rNicknameEditText = (EditText) findViewById(R.id.nicknameEditText);
        rCityEditText = (EditText) findViewById(R.id.cityEditText);
        rStateEditText = (EditText) findViewById(R.id.stateEditText);
        rCountryEditText = (EditText) findViewById(R.id.countryEditText);
        rEmailEditText = (EditText) findViewById(R.id.emailEditText);
        rComfirmEmailEditText = (EditText) findViewById(R.id.emailConfirmationEditText);
        rPhoneEditText = (EditText) findViewById(R.id.phoneEditText);
        rFacebookEditText = (EditText)findViewById(R.id.firstnameEditText);
        rTwitterEditText = (EditText)findViewById(R.id.twitterEditText);
        rOtherSocialMediaEdidText = (EditText)findViewById(R.id.otherSocialMediaEditText);
        rLongQuestion1EditText = (EditText)findViewById(R.id.longQuestion1EditText);
        rLongQuestion2EditText = (EditText)findViewById(R.id.longQuestion2EditText);
        rLongQuestion3EditText = (EditText)findViewById(R.id.longQuestion3EditText);
        rLongQuestion4EditText = (EditText)findViewById(R.id.longQuestion4EditText);
        rLongQuestion5EditText = (EditText)findViewById(R.id.longQuestion5EditText);
        rLongQuestion6EditText = (EditText)findViewById(R.id.longQuestion6EditText);
        rCheckBox = (CheckBox)findViewById(R.id.checkBox);
        rSignupButton = (Button) findViewById(R.id.signUpButton);

        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Field Error");


        rSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    testing();
            }
        });
    }
public void testing(){

    String type = "login";
    Boolean allFieldCheck = checkInput();

    if(allFieldCheck == true){
        SignUpInsertBackground signUpInsertBackground = new SignUpInsertBackground(this);
        signUpInsertBackground.execute(type, first,last,nickname,city,state,country,email1,phone,facebook,
                twitter,otherSocialMedia,longQuestion1,longQuestion2,longQuestion3,longQuestion4,longQuestion5,
                longQuestion6);
    }

}
private boolean checkInput(){
    // Retrieve From UI
    first = rFirstnameEditText.getText().toString();
    last = rLastnameEditText.getText().toString();
    nickname = rNicknameEditText.getText().toString();
    city = rCityEditText.getText().toString();
    state = rStateEditText.getText().toString();
    country = rCountryEditText.getText().toString();
    email1 = rEmailEditText.getText().toString();
    email2 = rComfirmEmailEditText.getText().toString();
    phone = rPhoneEditText.getText().toString();
    facebook = rFacebookEditText.getText().toString();
    twitter = rTwitterEditText.getText().toString();
    otherSocialMedia = rOtherSocialMediaEdidText.getText().toString();
    longQuestion1 = rLongQuestion1EditText.getText().toString();
    longQuestion2 = rLongQuestion2EditText.getText().toString();
    longQuestion3 = rLongQuestion3EditText.getText().toString();
    longQuestion4 = rLongQuestion4EditText.getText().toString();
    longQuestion5 = rLongQuestion5EditText.getText().toString();
    longQuestion6 = rLongQuestion6EditText.getText().toString();
    boolean getCheck = rCheckBox.isChecked();
    boolean firstCheck = first.isEmpty();
    boolean lastCheck = last.isEmpty();
    boolean cityCheck = city.isEmpty();
    boolean stateCheck = state.isEmpty();
    boolean countryCheck = country.isEmpty();
    boolean email1Check = email1.isEmpty();
    boolean email2Check = email2.isEmpty();
    boolean question1Check = longQuestion1.isEmpty();
    boolean question2Check = longQuestion2.isEmpty();
    boolean question3Check = longQuestion3.isEmpty();
    boolean question4Check = longQuestion4.isEmpty();
    boolean question5Check = longQuestion5.isEmpty();

    if(getCheck != false && firstCheck == false && lastCheck == false && cityCheck == false && stateCheck == false
            && countryCheck == false && email1Check == false && email2Check == false && question1Check == false && question2Check == false &&
            question3Check == false &&question3Check == false && question4Check == false && question5Check == false){
        if(email1.equals(email2))
            return true;
            else {
            alertDialog.setMessage("Your Email Does Not Match.");
            alertDialog.show();
            return false;
            }
        }
        else {
        alertDialog.setMessage("Please Fill Out All Necessary Field.");
        alertDialog.show();
        return false;
        }
}

}
