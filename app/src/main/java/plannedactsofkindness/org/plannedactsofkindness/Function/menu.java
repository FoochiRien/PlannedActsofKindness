package plannedactsofkindness.org.plannedactsofkindness.Function;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import plannedactsofkindness.org.plannedactsofkindness.R;
import plannedactsofkindness.org.plannedactsofkindness.UI.CauseOfTheMonth;
import plannedactsofkindness.org.plannedactsofkindness.UI.ContactUs;
import plannedactsofkindness.org.plannedactsofkindness.UI.Credit;
import plannedactsofkindness.org.plannedactsofkindness.UI.DemoEmail;
import plannedactsofkindness.org.plannedactsofkindness.UI.Donations;
import plannedactsofkindness.org.plannedactsofkindness.UI.HowKarmaWork;
import plannedactsofkindness.org.plannedactsofkindness.UI.KarmaPage;
import plannedactsofkindness.org.plannedactsofkindness.UI.KarmaReward;
import plannedactsofkindness.org.plannedactsofkindness.UI.Karma_Page_2;
import plannedactsofkindness.org.plannedactsofkindness.UI.KarmicConstitution;
import plannedactsofkindness.org.plannedactsofkindness.UI.MainActivity;
import plannedactsofkindness.org.plannedactsofkindness.UI.PersonOfTheWeek;
import plannedactsofkindness.org.plannedactsofkindness.UI.ShopAndSupport;
import plannedactsofkindness.org.plannedactsofkindness.UI.SocialResponsibility;
import plannedactsofkindness.org.plannedactsofkindness.UI.TShirtAndAppeal;
import plannedactsofkindness.org.plannedactsofkindness.UI.TheWorldIsEnding;
import plannedactsofkindness.org.plannedactsofkindness.UI.ThinkYouHaveWhatItTakes;
import plannedactsofkindness.org.plannedactsofkindness.UI.TodaysDailyPAK;
import plannedactsofkindness.org.plannedactsofkindness.UI.Volunteer;
import plannedactsofkindness.org.plannedactsofkindness.UI.kidCanDoOrg;
import plannedactsofkindness.org.plannedactsofkindness.UI.template;

/**
 * Created by pkkwilliam on 5/11/17.
 */

public class menu {

    //todo menu
    Context context;
    public menu(Context context){
        this.context = context;
    }

    public void switchActivity(MenuItem item){
        switch (item.getItemId()){
            case R.id.Home:{
                Intent i = new Intent(context,MainActivity.class);
                context.startActivity(i);
                break;
            }
            case R.id.TheWorldIsEnging: {
                Intent i = new Intent(context, TheWorldIsEnding.class);
                context.startActivity(i);
                break;
            }
            case R.id.TheKarmicConstitution: {
                Intent i = new Intent(context, KarmicConstitution.class);
                context.startActivity(i);
                break;
            }
            case R.id.ContactUs:{
                Intent i = new Intent(context,ContactUs.class);
                context.startActivity(i);
                break;
            }
            case R.id.TodaysDailyPak:{
                Intent i = new Intent(context,TodaysDailyPAK.class);
                context.startActivity(i);
                break;
            }
            case R.id.CreateAndSendInvitation:{
                Intent i = new Intent(context, template.class);
                context.startActivity(i);
                break;
            }
            case R.id.TheKarmaClub:{
                Intent i = new Intent(context,KarmaPage.class);
                context.startActivity(i);
                break;
            }
            case R.id.KarmaClubLevels:{
                Intent i = new Intent(context,HowKarmaWork.class);
                context.startActivity(i);
                break;
            }
            case R.id.KarmaClubRewards:{
                Intent i = new Intent(context,KarmaReward.class);
                context.startActivity(i);
                break;
            }
            case R.id.SocialResponsibilityAndYou:{
                Intent i = new Intent(context,SocialResponsibility.class);
                context.startActivity(i);
                break;
            }
            case R.id.VolunteerPrograms:{
                Intent i = new Intent(context,Volunteer.class);
                context.startActivity(i);
                break;
            }
            case R.id.Donations:{
                Intent i = new Intent(context,Donations.class);
                context.startActivity(i);
                break;
            }
            case R.id.PersonoftheWeek:{
                Intent i = new Intent(context,PersonOfTheWeek.class);
                context.startActivity(i);
                break;
            }
            case R.id.CauseOfTheMonth:{
                Intent i = new Intent(context,CauseOfTheMonth.class);
                context.startActivity(i);
                break;
            }
            case R.id.SixTeenThingsKidsCando:{
                Intent i = new Intent(context,kidCanDoOrg.class);
                context.startActivity(i);
                break;
            }
            case R.id.TShirtAndApparel:{
                Intent i = new Intent(context,TShirtAndAppeal.class);
                context.startActivity(i);
                break;
            }
            case R.id.Credit:{
                Intent i = new Intent(context,Credit.class);
                context.startActivity(i);
                break;
            }
            case R.id.ShopAndSupport:{
                Intent i = new Intent(context,ShopAndSupport.class);
                context.startActivity(i);
                break;
            }
            default:{
                System.out.print("default");
            }
        }
    }
}
