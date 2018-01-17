package plannedactsofkindness.org.plannedactsofkindness.activity_karma_club;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import plannedactsofkindness.org.plannedactsofkindness.Helpers.ShareToSM;
import plannedactsofkindness.org.plannedactsofkindness.HomeActivity;
import plannedactsofkindness.org.plannedactsofkindness.R;

public class KarmaClubActivity extends AppCompatActivity implements Karma_Welcome_Fragment.OnFragmentInteractionListener,
Karma_Constitution_Fragment.OnFragmentInteractionListener, Karma_Levels_Fragment.OnFragmentInteractionListener,
Karma_Reward_Fragment.OnFragmentInteractionListener {

    KarmaClubPagerAdapter mKarmaClubPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karma_club);

        /* Setup page for Karma Club Activity*/

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_karmaclub);
        mKarmaClubPagerAdapter = new KarmaClubPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mKarmaClubPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.karmaclub_tablayout);
        tabLayout.setupWithViewPager(viewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Planned Acts of Kindness");
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(false);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.toolbar_home:
                startActivity(new Intent(KarmaClubActivity.this, HomeActivity.class));
                finish();
                return true;
            case R.id.toolbar_share:
                String aboutKclub = "I found this great community called PAK. Check out thier website http://www.plannedactsofkindness.org/thekarmaclub/karmaclub/";
                ShareToSM.share(KarmaClubActivity.this ,aboutKclub);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }


    @Override
    public void onFragmentInteraction() {

    }
}
