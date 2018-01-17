package plannedactsofkindness.org.plannedactsofkindness.Helpers;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Admin on 1/14/18.
 */

public class ShareToSM {

    public static void share(Context context, String infotoshare){

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);

        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, infotoshare);

        context.startActivity(intent);
    }

}

