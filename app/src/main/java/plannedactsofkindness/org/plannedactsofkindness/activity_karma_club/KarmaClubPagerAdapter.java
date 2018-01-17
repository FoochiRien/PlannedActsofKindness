package plannedactsofkindness.org.plannedactsofkindness.activity_karma_club;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Admin on 1/15/18.
 */

/* Displays the karma club information. Text comes from the strings.xml. no data is passed.*/
public class KarmaClubPagerAdapter extends FragmentPagerAdapter {


    public KarmaClubPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return Karma_Welcome_Fragment.newInstance();
            case 1:
                return Karma_Constitution_Fragment.newInstance();
            case 2:
                return Karma_Levels_Fragment.newInstance();
            case 3:
                return Karma_Reward_Fragment.newInstance();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {return 4; }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                return "Welcome to Karma Club";
            case 1:
                return "Karmic Constitution";
            case 2:
                return "Karma Levels";
            case 3:
                return "Karma Reward";
            default:
                return null;
        }

    }
}
