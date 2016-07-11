/*
    Just finished working on btnCreateTeamClicked() method. I need to implement the other
    btn******Clicked() methods and then clean up the onCreateView() method by initializing
    all the buttons in the initializeButtons() method. Also need to work on a shit ton of
    new activities for the UI.
 */

package com.duxnort.baseballscorebook;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainMenuFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MainMenuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainMenuFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static Button btnRecordGame;
    private static Button btnCreateTeam;
    private static Button btnSettings;
    private static Button btnHelp;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public MainMenuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainMenuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainMenuFragment newInstance(String param1, String param2) {
        MainMenuFragment fragment = new MainMenuFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
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

//    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }

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

    public void initializeButtons(View rootView){
        btnRecordGame = (Button) rootView.findViewById(R.id.button_record_game);
        btnCreateTeam = (Button) rootView.findViewById(R.id.button_create_team);
        btnSettings =  (Button) rootView.findViewById(R.id.button_settings);
        btnHelp = (Button) rootView.findViewById(R.id.button_help);

        btnRecordGame.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        btnRecordGameClicked(v);
                    }
                }
        );

        btnCreateTeam.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        btnCreateTeamClicked(v);
                    }
                }
        );

        btnSettings.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        btnSettingsClicked(v);
                    }
                }
        );

        btnHelp.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        btnHelpClicked(v);
                    }
                }
        );
    }

    public void btnRecordGameClicked(View v){
        // These lines allow for the button to start a new activity
        Intent intent = new Intent(getActivity(), RecordGameSetupActivity.class);
        startActivity(intent);
    }

    public void btnCreateTeamClicked(View v){
        // These lines allow for the button to start a new activity
        Intent intent = new Intent(getActivity(), CreateTeamActivity.class);
        startActivity(intent);
    }

    public void btnSettingsClicked(View v){
        // These lines allow for the button to start a new activity
        Intent intent = new Intent(getActivity(), SettingsActivity.class);
        startActivity(intent);
    }

    public void btnHelpClicked(View v){
        // These lines allow for the button to start a new activity
        Intent intent = new Intent(getActivity(), HelpActivity.class);
        startActivity(intent);
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
