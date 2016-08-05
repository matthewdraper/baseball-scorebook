package com.duxnort.baseballscorebook;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainMenuFragment extends Fragment {

    private static Button btnRecordGame;
    private static Button btnCreateTeam;
    private static Button btnSettings;
    private static Button btnHelp;

    private OnFragmentInteractionListener mListener;

    public MainMenuFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Assign the fragment to a view
        View rootView = inflater.inflate(R.layout.fragment_main_menu, container, false);
        initializeButtons(rootView);

        return rootView;
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

    public void initializeButtons(View rootView) {
        btnRecordGame = (Button) rootView.findViewById(R.id.button_record_game);
        btnCreateTeam = (Button) rootView.findViewById(R.id.button_create_team);
        btnSettings = (Button) rootView.findViewById(R.id.button_settings);
        btnHelp = (Button) rootView.findViewById(R.id.button_help);

        initializeOnTouchListeners();
        initializeOnClickListeners();

    }

    /**
     * This sets the onClickListener for every button in the UI. The onClickListener
     * is in charge of the action that the button needs to take when it is pressed. This
     * does not take into account the length of time it is pressed. It simply determines
     * if the button was clicked or not.
     */
    private void initializeOnClickListeners() {

        btnRecordGame.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnRecordGameClicked();
                    }
                }
        );

        btnCreateTeam.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnCreateTeamClicked();
                    }
                }
        );

        btnSettings.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnSettingsClicked();
                    }
                }
        );

        btnHelp.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnHelpClicked();
                    }
                }
        );

    }

    /**
     * This sets the onTouchListeners for every button in the UI. The onTouchListeners
     * constantly poll the button to see if it is being pressed. This method will take
     * effect as long as the button is being pressed.
     */
    private void initializeOnTouchListeners() {

        btnRecordGame.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // If the button is down run the method associated
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnRecordGameOnTouch();
                    // If the button is up run the method associated
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnRecordGame.setBackground(ContextCompat.getDrawable(getContext(),
                            R.drawable.mainmenu));
                return false;
            }
        });

        btnCreateTeam.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // If the button is down run the method associated
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnCreateTeamOnTouch();
                    // If the button is up run the method associated
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnCreateTeam.setBackground(ContextCompat.getDrawable(getContext(),
                            R.drawable.mainmenu));
                return false;
            }
        });

        btnSettings.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // If the button is down run the method associated
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnSettingsOnTouch();
                    // If the button is up run the method associated
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnSettings.setBackground(ContextCompat.getDrawable(getContext(),
                            R.drawable.mainmenu));
                return false;
            }
        });

        btnHelp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // If the button is down run the method associated
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnHelpOnTouch();
                    // If the button is up run the method associated
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnHelp.setBackground(ContextCompat.getDrawable(getContext(),
                            R.drawable.mainmenu));
                return false;
            }
        });

    }

    /**
     * This method is in charge of handling the logical events that are supposed to take place
     * when the Record Game button is clicked.
     */
    private void btnRecordGameClicked() {
        // These lines allow for the button to start a new activity
        Intent intent = new Intent(getActivity(), RecordGameSetupActivity.class);
        startActivity(intent);
    }

    /**
     * This method is in charge of changing the Record Game button's background image of
     * the button to a "pressed" image.
     */
    private void btnRecordGameOnTouch() {
        btnRecordGame.setBackground(ContextCompat.getDrawable(getContext(),
                R.drawable.mainmenu_pressed));
    }

    /**
     * This method is in charge of handling the logical events that are supposed to take place
     * when the Create Team button is clicked.
     */
    private void btnCreateTeamClicked() {
        // These lines allow for the button to start a new activity
        Intent intent = new Intent(getActivity(), CreateTeamActivity.class);
        startActivity(intent);
    }

    /**
     * This method is in charge of changing the Create Team button's background image of
     * the button to a "pressed" image.
     */
    private void btnCreateTeamOnTouch() {
        btnCreateTeam.setBackground(ContextCompat.getDrawable(getContext(),
                R.drawable.mainmenu_pressed));
    }

    /**
     * This method is in charge of handling the logical events that are supposed to take place
     * when the Settings button is clicked.
     */
    private void btnSettingsClicked() {
        // These lines allow for the button to start a new activity
        Intent intent = new Intent(getActivity(), SettingsActivity.class);
        startActivity(intent);
    }

    /**
     * This method is in charge of changing the Settings button's background image of
     * the button to a "pressed" image.
     */
    private void btnSettingsOnTouch() {
        btnSettings.setBackground(ContextCompat.getDrawable(getContext(),
                R.drawable.mainmenu_pressed));
    }

    /**
     * This method is in charge of handling the logical events that are supposed to take place
     * when the Help button is clicked.
     */
    private void btnHelpClicked() {
        // These lines allow for the button to start a new activity
        Intent intent = new Intent(getActivity(), HelpActivity.class);
        startActivity(intent);
    }

    /**
     * This method is in charge of changing the Help button's background image of
     * the button to a "pressed" image.
     */
    private void btnHelpOnTouch() {
        btnHelp.setBackground(ContextCompat.getDrawable(getContext(),
                R.drawable.mainmenu_pressed));
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
    }
}
