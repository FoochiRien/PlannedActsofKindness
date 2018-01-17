package plannedactsofkindness.org.plannedactsofkindness.activity_karma_club;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import plannedactsofkindness.org.plannedactsofkindness.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Karma_Reward_Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Karma_Reward_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
/*This fragment has no logic, the purpose is to display information found no the xml and strings.xml */

public class Karma_Reward_Fragment extends Fragment {


    private OnFragmentInteractionListener mListener;

    public Karma_Reward_Fragment() {
        // Required empty public constructor
    }


    public static Karma_Reward_Fragment newInstance() {
        Karma_Reward_Fragment karma_reward_fragment = new Karma_Reward_Fragment();

        return karma_reward_fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_karma__reward, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
