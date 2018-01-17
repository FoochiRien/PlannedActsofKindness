package plannedactsofkindness.org.plannedactsofkindness;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import plannedactsofkindness.org.plannedactsofkindness.activity_karma_club.KarmaClubActivity;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Planned Acts of Kindness");
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        final NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.drawer_karma_club){
                    startActivity(new Intent(HomeActivity.this, KarmaClubActivity.class));
                }
                else if (id == R.id.drawer_aboutpak){}
                else if (id == R.id.drawer_getinvolved){}
                else if (id == R.id.drawer_supportpak){}
                return false;
            }
        });

        Button dailypak = (Button) findViewById(R.id.home_dailypak);
        Button karmaclub = (Button) findViewById(R.id.home_karmaclub);
        Button joinpak = (Button) findViewById(R.id.home_join);
        Button invitetopak = (Button) findViewById(R.id.home_invite);
        Button prsnofwk = (Button) findViewById(R.id.home_prsnofwk);
        Button causeofmnth = (Button) findViewById(R.id.home_causeofmnth);
        Button getinvolved = (Button) findViewById(R.id.home_getinvlvd);

        dailypak.setOnClickListener(this);
        karmaclub.setOnClickListener(this);
        joinpak.setOnClickListener(this);
        invitetopak.setOnClickListener(this);
        prsnofwk.setOnClickListener(this);
        causeofmnth.setOnClickListener(this);
        getinvolved.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_dailypak:
                //todo add Join link
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setTitle("Coming Soon")
                        .setMessage("To launch Daily PAK's we need 100,000 members. Help us make it happen." +
                                "Join today.")
                        .show();
                break;
            case R.id.home_karmaclub:
                startActivity(new Intent(HomeActivity.this, KarmaClubActivity.class));
                break;
            case R.id.home_join:
                //todo to form
                break;
            case R.id.home_invite:
                //todo to form
                break;
            case R.id.home_prsnofwk:
                //todo add join link
                AlertDialog.Builder builder1 = new AlertDialog.Builder(HomeActivity.this);
                builder1.setTitle("Coming Soon")
                        .setMessage("To launch Daily PAK's we need 100,000 members. Help us make it happen." +
                                "Join today.")
                        .show();
                break;
            case R.id.home_causeofmnth:
                //todo add join link
                AlertDialog.Builder builder2 = new AlertDialog.Builder(HomeActivity.this);
                builder2.setTitle("Coming Soon")
                        .setMessage("To launch Daily PAK's we need 100,000 members. Help us make it happen." +
                                "Join today.")
                        .show();
                break;
            case R.id.home_getinvlvd:
                //todo activity for getting involved
                break;
            default:
            return;
        }
    }


}


