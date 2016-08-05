package com.duxnort.baseballscorebook;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AtBatFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AtBatFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AtBatFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    // Buttons for the UI
    private Button btnReachedBase, btnStrike, btnBall, btnFoul, btnRetired;

    private OnFragmentInteractionListener mListener;

    public AtBatFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AtBatFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AtBatFragment newInstance(String param1, String param2) {
        AtBatFragment fragment = new AtBatFragment();
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
        View rootView =  inflater.inflate(R.layout.fragment_at_bat, container, false);
        // Inflate the layout for this fragment
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

    private void initializeButtons(View rootView){
        btnReachedBase = (Button) rootView.findViewById(R.id.btnReachedBase);
        btnBall = (Button) rootView.findViewById(R.id.btnBall);
        btnStrike  = (Button) rootView.findViewById(R.id.btnStrike);
        btnFoul = (Button) rootView.findViewById(R.id.btnFoul);
        btnRetired = (Button) rootView.findViewById(R.id.btnRetired);

        initializeOnTouchListeners();
        initializeOnClickListeners();
    }

    /**
     *  This sets the onClickListener for every button in the UI. The onClickListener
     *  is in charge of the action that the button needs to take when it is pressed. This
     *  does not take into account the length of time it is pressed. It simply determines
     *  if the button was clicked or not.
     */
    private void initializeOnClickListeners(){
        btnReachedBase.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        btnReachedBaseOnClick();
                        startActivity(new Intent(getActivity(), ActionSelectionActivity.class));
                    }
                }
        );

        btnRetired.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        btnRetiredOnClick();
                    }
                }
        );

        btnStrike.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        btnStrikeOnClick();
                    }
                }
        );

        btnFoul.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        btnFoulOnClick();
                    }
                }
        );

        btnBall.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        btnBallOnClick();
                    }
                }
        );
    }

    /**
     * This sets the onTouchListeners for every button in the UI. The onTouchListeners
     * constantly poll the button to see if it is being pressed. This method will take
     * effect as long as the button is being pressed.
     */
    private void initializeOnTouchListeners(){
        btnReachedBase.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnReachedBaseOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnReachedBase.setBackground(getResources().getDrawable(R.drawable.blue_rounded));
                return false;
            }
        });

        btnRetired.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnRetiredOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnRetired.setBackground(getResources().getDrawable(R.drawable.red_rounded));
                return false;
            }
        });

        btnStrike.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnStrikeOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnStrike.setBackground(getResources().getDrawable(R.drawable.yellow_rounded));
                return false;
            }
        });

        btnFoul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnFoulOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnFoul.setBackground(getResources().getDrawable(R.drawable.orange_rounded));
                return false;
            }
        });

        btnBall.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnBallOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnBall.setBackground(getResources().getDrawable(R.drawable.pink_rounded));
                return false;
            }
        });
    }

    /**
     * This method is in charge of handling a batter reaching base.
     */
    private void btnReachedBaseOnClick(){

    }

    /**
     * This method is in charge of changing the Reached Base button's background image of
     * the button to a "pressed" image.
     */
    private void btnReachedBaseOnTouch(){
        btnReachedBase.setBackground(getResources().getDrawable(R.drawable.blue_rounded_pressed));
    }

    private void btnRetiredOnClick(){
        // Calls the method(s) that must be implemented by the activity
        // that this fragment is used in.
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    /**
     * This method is in charge of changing the Retired button's background image of
     * the button to a "pressed" image.
     */
    private void btnRetiredOnTouch(){
        btnRetired.setBackground(getResources().getDrawable(R.drawable.red_rounded_pressed));
    }

    private void btnStrikeOnClick(){
        // Calls the method(s) that must be implemented by the activity
        // that this fragment is used in.
        mListener.incrementPitchCount();
        mListener.incrementStrikes();
    }

    /**
     * This method is in charge of changing the Retired button's background image of
     * the button to a "pressed" image.
     */
    private void btnStrikeOnTouch(){
        btnStrike.setBackground(getResources().getDrawable(R.drawable.yellow_rounded_pressed));
    }

    private void btnFoulOnClick(){
        // Calls the method(s) that must be implemented by the activity
        // that this fragment is used in.
        mListener.incrementPitchCount();
        mListener.incrementFoulStrikes();
    }

    /**
     * This method is in charge of changing the Foul button's background image of
     * the button to a "pressed" image.
     */
    private void btnFoulOnTouch(){
        btnFoul.setBackground(getResources().getDrawable(R.drawable.orange_rounded_pressed));
    }

    private void btnBallOnClick(){
        // Calls the method(s) that must be implemented by the activity
        // that this fragment is used in.
        mListener.incrementPitchCount();
        mListener.incrementBalls();
    }

    /**
     * This method is in charge of changing the Ball button's background image of
     * the button to a "pressed" image.
     */
    private void btnBallOnTouch(){
        btnBall.setBackground(getResources().getDrawable(R.drawable.pink_rounded_pressed));
    }

    /**
     * This interface must be implemented by any class that wishes to include this
     * fragment. It must implements all of the method stubs detailedby this interface.
     */
    public interface OnFragmentInteractionListener {
        // These methods must be implemented by whatever activity implements
        // this interface (which also means uses this fragment)

        // Increment the strike count
        void incrementStrikes();
        // Increment the strike count based on a foul ball
        void incrementFoulStrikes();
        // Increment the ball count
        void incrementBalls();
        // Increment the pitch count
        void incrementPitchCount();
        // Increment the out count
        void incrementOuts();
    }
}
