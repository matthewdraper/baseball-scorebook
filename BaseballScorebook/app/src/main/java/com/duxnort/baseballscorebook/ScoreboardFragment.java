package com.duxnort.baseballscorebook;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ScoreboardFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ScoreboardFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScoreboardFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private TextView txtHome, txtAway, txtRunsHome, txtRunsAway, txtHitsHome, txtHitsAway,
            txtErrorsHome, txtErrorsAway, txtInnNum, txtInnTop, txtInnBot, txtPitchCountNum;

    private ImageView imgBall1, imgBall2, imgBall3, imgStrike1, imgStrike2, imgOut1, imgOut2;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ScoreboardFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ScoreboardFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ScoreboardFragment newInstance(String param1, String param2) {
        ScoreboardFragment fragment = new ScoreboardFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_scoreboard, container, false);
        initializeImageViews(rootView);
        initializeTextViews(rootView);
        // Inflate the layout for this fragment
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

    private void initializeTextViews(View rootView){
        txtHome = (TextView) rootView.findViewById(R.id.txtHome);
        txtAway = (TextView) rootView.findViewById(R.id.txtAway);
        txtRunsHome = (TextView) rootView.findViewById(R.id.txtRunsHome);
        txtRunsAway = (TextView) rootView.findViewById(R.id.txtRunsAway);
        txtHitsHome = (TextView) rootView.findViewById(R.id.txtHitsHome);
        txtHitsAway = (TextView) rootView.findViewById(R.id.txtHitsAway);
        txtErrorsHome = (TextView) rootView.findViewById(R.id.txtErrorsHome);
        txtErrorsAway = (TextView) rootView.findViewById(R.id.txtErrorsAway);
        txtInnNum = (TextView) rootView.findViewById(R.id.txtInnNum);
        txtInnTop = (TextView) rootView.findViewById(R.id.txtInnTop);
        txtInnBot = (TextView) rootView.findViewById(R.id.txtInnBot);
        txtPitchCountNum = (TextView) rootView.findViewById(R.id.txtPitchCountNum);
    }

    private void initializeImageViews(View rootView){
        imgBall1 = (ImageView) rootView.findViewById(R.id.imgBall1);
        imgBall2 = (ImageView) rootView.findViewById(R.id.imgBall2);
        imgBall3 = (ImageView) rootView.findViewById(R.id.imgBall3);
        imgStrike1 = (ImageView) rootView.findViewById(R.id.imgStrike1);
        imgStrike2 = (ImageView) rootView.findViewById(R.id.imgStrike2);
        imgOut1 = (ImageView) rootView.findViewById(R.id.imgOut1);
        imgOut2 = (ImageView) rootView.findViewById(R.id.imgOut2);
    }

    public void setTxtHomeText(String text){
        txtHome.setText(text);
    }

    public void setTxtAwayText(String text){
        txtAway.setText(text);
    }

    public void setTxtRunsHome(String num){
        txtRunsHome.setText(num);
    }

    public void setTxtRunsAway(String num){
        txtRunsAway.setText(num);
    }

    public void setTextHitsHome(String num){
        txtHitsHome.setText(num);
    }

    public void setTextHitsAway(String num){
        txtHitsAway.setText(num);
    }

    public void setTxtErrorsHome(String num){
        txtErrorsHome.setText(num);
    }

    public void setTxtErrorsAway(String num){
        txtErrorsAway.setText(num);
    }

    public void setTxtInnNum(String num){
        txtInnNum.setText(num);
    }

    public void setTxtInnTopVisible(){
        txtInnTop.setAlpha(1);
    }

    public void setTxtInnTopHidden(){
        txtInnTop.setAlpha(0);
    }

    public void setTxtInnBotVisible(){
        txtInnBot.setAlpha(1);
    }

    public void setTxtInnBotHidden(){
        txtInnBot.setAlpha(0);
    }

    public void setTxtPitchCountNum(String num){
        txtPitchCountNum.setText(num);
    }

    public void setBallLights(int num){
        switch (num){
            case 0:
                imgBall1.setImageResource(R.drawable.lights_off);
                imgBall2.setImageResource(R.drawable.lights_off);
                imgBall3.setImageResource(R.drawable.lights_off);
                break;
            case 1:
                imgBall1.setImageResource(R.drawable.lights_on);
                imgBall2.setImageResource(R.drawable.lights_off);
                imgBall3.setImageResource(R.drawable.lights_off);
                break;
            case 2:
                imgBall1.setImageResource(R.drawable.lights_on);
                imgBall2.setImageResource(R.drawable.lights_on);
                imgBall3.setImageResource(R.drawable.lights_off);
                break;
            case 3:
                imgBall1.setImageResource(R.drawable.lights_on);
                imgBall2.setImageResource(R.drawable.lights_on);
                imgBall3.setImageResource(R.drawable.lights_on);
                break;
            default:
                imgBall1.setImageResource(R.drawable.lights_off);
                imgBall2.setImageResource(R.drawable.lights_off);
                imgBall3.setImageResource(R.drawable.lights_off);
                break;
        }
    }

    public void setStrikeLights(int num){
        switch (num){
            case 0:
                imgStrike1.setImageResource(R.drawable.lights_off);
                imgStrike2.setImageResource(R.drawable.lights_off);
                break;
            case 1:
                imgStrike1.setImageResource(R.drawable.lights_on);
                imgStrike2.setImageResource(R.drawable.lights_off);
                break;
            case 2:
                imgStrike1.setImageResource(R.drawable.lights_on);
                imgStrike2.setImageResource(R.drawable.lights_on);
                break;
            default:
                imgStrike1.setImageResource(R.drawable.lights_off);
                imgStrike2.setImageResource(R.drawable.lights_off);
                break;
        }
    }

    public void setOutLights(int num){
        switch (num){
            case 0:
                imgOut1.setImageResource(R.drawable.lights_off);
                imgOut2.setImageResource(R.drawable.lights_off);
                break;
            case 1:
                imgOut1.setImageResource(R.drawable.lights_on);
                imgOut2.setImageResource(R.drawable.lights_off);
                break;
            case 2:
                imgOut1.setImageResource(R.drawable.lights_on);
                imgOut2.setImageResource(R.drawable.lights_on);
                break;
            default:
                imgOut1.setImageResource(R.drawable.lights_off);
                imgOut2.setImageResource(R.drawable.lights_off);
                break;
        }
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
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
    }
}
