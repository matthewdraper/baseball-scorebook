package com.duxnort.baseballscorebook;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ScoreboardFragment extends Fragment {

    private TextView txtHome, txtAway, txtRunsHome, txtRunsAway, txtHitsHome, txtHitsAway,
            txtErrorsHome, txtErrorsAway, txtInnNum, txtInnTop, txtInnBot, txtPitchCountNum;

    private ImageView imgBall1, imgBall2, imgBall3, imgStrike1, imgStrike2, imgOut1, imgOut2;

    private OnFragmentInteractionListener mListener;

    public ScoreboardFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

    private void initializeTextViews(View rootView) {
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

    private void initializeImageViews(View rootView) {
        imgBall1 = (ImageView) rootView.findViewById(R.id.imgBall1);
        imgBall2 = (ImageView) rootView.findViewById(R.id.imgBall2);
        imgBall3 = (ImageView) rootView.findViewById(R.id.imgBall3);
        imgStrike1 = (ImageView) rootView.findViewById(R.id.imgStrike1);
        imgStrike2 = (ImageView) rootView.findViewById(R.id.imgStrike2);
        imgOut1 = (ImageView) rootView.findViewById(R.id.imgOut1);
        imgOut2 = (ImageView) rootView.findViewById(R.id.imgOut2);
    }

    public void setTxtHomeText(String text) {
        txtHome.setText(text);
    }

    public void setTxtAwayText(String text) {
        txtAway.setText(text);
    }

    public void setTxtRunsHome(String num) {
        txtRunsHome.setText(num);
    }

    public void setTxtRunsAway(String num) {
        txtRunsAway.setText(num);
    }

    public void setTextHitsHome(String num) {
        txtHitsHome.setText(num);
    }

    public void setTextHitsAway(String num) {
        txtHitsAway.setText(num);
    }

    public void setTxtErrorsHome(String num) {
        txtErrorsHome.setText(num);
    }

    public void setTxtErrorsAway(String num) {
        txtErrorsAway.setText(num);
    }

    public void setTxtInnNum(String num) {
        txtInnNum.setText(num);
    }

    public void setTxtInnTopVisible() {
        txtInnTop.setAlpha(1);
    }

    public void setTxtInnTopHidden() {
        txtInnTop.setAlpha(0);
    }

    public void setTxtInnBotVisible() {
        txtInnBot.setAlpha(1);
    }

    public void setTxtInnBotHidden() {
        txtInnBot.setAlpha(0);
    }

    public void setTxtPitchCountNum(String num) {
        txtPitchCountNum.setText(num);
    }

    public void setBallLights(int num) {
        switch (num) {
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

    public void setStrikeLights(int num) {
        switch (num) {
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

    public void setOutLights(int num) {
        switch (num) {
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

    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
    }
}
