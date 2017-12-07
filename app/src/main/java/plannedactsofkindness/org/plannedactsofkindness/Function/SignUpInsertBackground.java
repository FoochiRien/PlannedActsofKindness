package plannedactsofkindness.org.plannedactsofkindness.Function;

/**
 * Created by pkkwilliam on 5/3/17.
 */

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by pkkwilliam on 5/2/17.
 */

public class SignUpInsertBackground extends AsyncTask<String, Void, String>{

    Context context;
    AlertDialog alertDialog;


    public SignUpInsertBackground(Context context){
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {
        String type = params[0];
        String login_url = "http://karmaincorporated.com/mobile_application_folder/16thingsAndroidInsert.php";
        if(type.equals("login")){
            try {
                String first = params[1];
                String last = params[2];
                String nickname = params[3];
                String city = params[4];
                String state = params[5];
                String country = params[6];
                String email = params[7];
                String phone = params[8];
                String facebook = params[9];
                String twitter = params[10];
                String otherSocialMedia = params[11];
                String longQuestion1 = params[12];
                String longQuestion2 = params[13];
                String longQuestion3 = params[14];
                String longQuestion4 = params[15];
                String longQuestion5 = params[16];
                String longQuestion6 = params[17];
                URL url = new URL(login_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();

                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));

                String post_data = URLEncoder.encode("first","UTF-8")+"="+URLEncoder.encode(first,"UTF-8")+"&"+
                        URLEncoder.encode("last","UTF-8")+"="+URLEncoder.encode(last,"UTF-8")+"&"+
                        URLEncoder.encode("nickname","UTF-8")+"="+URLEncoder.encode(nickname,"UTF-8")+"&"+
                        URLEncoder.encode("city","UTF-8")+"="+URLEncoder.encode(city,"UTF-8")+"&"+
                        URLEncoder.encode("state","UTF-8")+"="+URLEncoder.encode(state,"UTF-8")+"&"+
                        URLEncoder.encode("country","UTF-8")+"="+URLEncoder.encode(country,"UTF-8")+"&"+
                        URLEncoder.encode("email","UTF-8")+"="+URLEncoder.encode(email,"UTF-8")+"&"+
                        URLEncoder.encode("phone","UTF-8")+"="+URLEncoder.encode(phone,"UTF-8")+"&"+
                        URLEncoder.encode("facebook","UTF-8")+"="+URLEncoder.encode(facebook,"UTF-8")+"&"+
                        URLEncoder.encode("twitter","UTF-8")+"="+URLEncoder.encode(twitter,"UTF-8")+"&"+
                        URLEncoder.encode("other_social_media","UTF-8")+"="+URLEncoder.encode(otherSocialMedia,"UTF-8")+"&"+
                        URLEncoder.encode("long_question1","UTF-8")+"="+URLEncoder.encode(longQuestion1,"UTF-8")+"&"+
                        URLEncoder.encode("long_question2","UTF-8")+"="+URLEncoder.encode(longQuestion2,"UTF-8")+"&"+
                        URLEncoder.encode("long_question3","UTF-8")+"="+URLEncoder.encode(longQuestion3,"UTF-8")+"&"+
                        URLEncoder.encode("long_question4","UTF-8")+"="+URLEncoder.encode(longQuestion4,"UTF-8")+"&"+
                        URLEncoder.encode("long_question5","UTF-8")+"="+URLEncoder.encode(longQuestion5,"UTF-8")+"&"+
                        URLEncoder.encode("long_question6","UTF-8")+"="+URLEncoder.encode(longQuestion6,"UTF-8");


                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();

                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String result ="";
                String line;

                while((line = bufferedReader.readLine()) != null){
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();

                return result;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        alertDialog.setMessage(result);
        alertDialog.show();

        //super.onPostExecute(aVoid);
    }

    @Override
    protected void onPreExecute() {
        alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("SIGNUP STATUS");

        //super.onPreExecute();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
