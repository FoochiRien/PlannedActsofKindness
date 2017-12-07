package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import plannedactsofkindness.org.plannedactsofkindness.R;

public class template extends Activity  {
    Spinner rSpinner1;
    Spinner rSpinner2;

    String greedingFromSpinner1;
    String signOffFromSpinner2;

    EditText fromName;
    EditText fromEmail;
    EditText toName;
    EditText toEmail;

    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);

        rSpinner1 = (Spinner) findViewById(R.id.spinner1);
        rSpinner2 = (Spinner) findViewById(R.id.spinner2);

        fromName = (EditText) findViewById(R.id.fromName);
        fromEmail = (EditText) findViewById(R.id.fromEmail);

        toName = (EditText) findViewById(R.id.toName);
        toEmail = (EditText) findViewById(R.id.toEmail);



        ArrayAdapter<CharSequence> greedingAdapter = ArrayAdapter.createFromResource(this,
                R.array.greeding_array, android.R.layout.simple_spinner_item);
        greedingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> signoffAdapter = ArrayAdapter.createFromResource(this,
                R.array.sign_off_array, android.R.layout.simple_dropdown_item_1line);
        signoffAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        rSpinner1.setAdapter(greedingAdapter);
        rSpinner2.setAdapter(signoffAdapter);

        ImageButton viewDemoButton = (ImageButton) findViewById(R.id.viewDemoButton);

        alertDialog = new AlertDialog.Builder(this).create();

        rSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                greedingFromSpinner1 = (String.valueOf(rSpinner1.getSelectedItem()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        rSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                signOffFromSpinner2 = (String.valueOf(rSpinner2.getSelectedItem()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        viewDemoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewDemo();
            }
        });

    }

    private void viewDemo(){
        if(fromName.getText().toString().isEmpty()|| fromEmail.getText().toString().isEmpty() || toName.getText().toString().isEmpty() || toEmail.getText().toString().isEmpty()){
            alertDialog.setTitle("Field Error");
            alertDialog.setMessage("Please Fill Out All Necessary Field.");
            alertDialog.show();
        }else {
            String from_name = fromName.getText().toString();
            String from_email = fromEmail.getText().toString();
            String to_name = toName.getText().toString();
            String to_email = toEmail.getText().toString();

            String greeding = greedingFromSpinner1 + " " + to_name;
            if (greedingFromSpinner1.equals("Just their name!"))
                greeding = to_name;

            String signoff = signOffFromSpinner2;
            if (signOffFromSpinner2.equals("Just my name!"))
                signoff = "";

            Intent i = new Intent(template.this, DemoEmail.class);
            i.putExtra("toEmail", to_email);
            i.putExtra("fromEmail", from_email);
            i.putExtra("greeding", greeding);
            i.putExtra("signoff", signoff);
            i.putExtra("senderName", from_name);
            startActivity(i);
        }
    }
    }



