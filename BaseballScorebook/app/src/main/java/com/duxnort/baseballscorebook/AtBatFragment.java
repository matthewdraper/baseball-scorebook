package com.duxnort.baseballscorebook;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AtBatFragment extends Fragment {

    // Buttons for the UI
    private Button btnReachedBase, btnStrike, btnBall, btnFoul, btnRetired, btnUndo;

    private OnFragmentInteractionListener mListener;

    public AtBatFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_at_bat, container, false);
        // Inflate the layout for this fragment
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

    /**
     * This sets initializes all the buttons that are definied in the XML layout file
     * and sets their actions.
     *
     * @param rootView
     */
    private void initializeButtons(View rootView) {
        btnReachedBase = (Button) rootView.findViewById(R.id.btnReachedBase);
        btnBall = (Button) rootView.findViewById(R.id.btnBall);
        btnStrike = (Button) rootView.findViewById(R.id.btnStrike);
        btnFoul = (Button) rootView.findViewById(R.id.btnFoul);
        btnRetired = (Button) rootView.findViewById(R.id.btnRetired);
        btnUndo = (Button) rootView.findViewById(R.id.btnUndo);

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
        btnReachedBase.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnReachedBaseOnClick();
                        startActivity(new Intent(getActivity(), ActionSelectionActivity.class));
                    }
                }
        );

        btnRetired.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnRetiredOnClick();
                    }
                }
        );

        btnStrike.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnStrikeOnClick();
                    }
                }
        );

        btnFoul.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnFoulOnClick();
                    }
                }
        );

        btnBall.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnBallOnClick();
                    }
                }
        );

        btnUndo.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnUndoOnClick();
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
        btnReachedBase.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnReachedBaseOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnReachedBase.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.blue_rounded));
                return false;
            }
        });

        btnRetired.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnRetiredOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnRetired.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.red_rounded));
                return false;
            }
        });

        btnStrike.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnStrikeOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnStrike.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.yellow_rounded));
                return false;
            }
        });

        btnFoul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnFoulOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnFoul.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.orange_rounded));
                return false;
            }
        });

        btnBall.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnBallOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnBall.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.pink_rounded));
                return false;
            }
        });

        btnUndo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnUndoOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnUndo.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.white_rounded));
                return false;
            }
        });
    }

    /**
     * This method is in charge of handling a batter reaching base.
     */
    private void btnReachedBaseOnClick() {

    }

    /**
     * This method is in charge of changing the Reached Base button's background image of
     * the button to a "pressed" image.
     */
    private void btnReachedBaseOnTouch() {
        btnReachedBase.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.blue_rounded_pressed));
    }

    private void btnRetiredOnClick() {
        // Calls the method(s) that must be implemented by the activity
        // that this fragment is used in.
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    /**
     * This method is in charge of changing the Retired button's background image of
     * the button to a "pressed" image.
     */
    private void btnRetiredOnTouch() {
        btnRetired.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.red_rounded_pressed));
    }

    private void btnStrikeOnClick() {
        // Calls the method(s) that must be implemented by the activity
        // that this fragment is used in.
        mListener.incrementPitchCount();
        mListener.incrementStrikes();
    }

    /**
     * This method is in charge of changing the Retired button's background image of
     * the button to a "pressed" image.
     */
    private void btnStrikeOnTouch() {
        btnStrike.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.yellow_rounded_pressed));
    }

    private void btnFoulOnClick() {
        // Calls the method(s) that must be implemented by the activity
        // that this fragment is used in.
        mListener.incrementPitchCount();
        mListener.incrementFoulStrikes();
    }

    /**
     * This method is in charge of changing the Foul button's background image of
     * the button to a "pressed" image.
     */
    private void btnFoulOnTouch() {
        btnFoul.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.orange_rounded_pressed));
    }

    private void btnBallOnClick() {
        // Calls the method(s) that must be implemented by the activity
        // that this fragment is used in.
        mListener.incrementPitchCount();
        mListener.incrementBalls();
    }

    /**
     * This method is in charge of changing the Ball button's background image of
     * the button to a "pressed" image.
     */
    private void btnBallOnTouch() {
        btnBall.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.pink_rounded_pressed));
    }

    private void btnUndoOnClick() {
        mListener.undoLastAction();
    }

    private void btnUndoOnTouch() {
        btnUndo.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.white_rounded_pressed));
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

        void undoLastAction();
    }
}
