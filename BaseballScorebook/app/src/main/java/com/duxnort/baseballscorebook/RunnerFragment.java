package com.duxnort.baseballscorebook;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class RunnerFragment extends Fragment {

    private Button btnOut, btnScored, btnAdvanced, btnStolenBase, btnCaughtStealing, btnUndo;

    private OnFragmentInteractionListener mListener;

    public RunnerFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_runner, container, false);
        initializeButtons(rootView);
        return rootView;
    }

    private void initializeButtons(View rootView) {
        btnOut = (Button) rootView.findViewById(R.id.btnOut);
        btnScored = (Button) rootView.findViewById(R.id.btnScored);
        btnAdvanced = (Button) rootView.findViewById(R.id.btnAdvanced);
        btnStolenBase = (Button) rootView.findViewById(R.id.btnStolenBase);
        btnCaughtStealing = (Button) rootView.findViewById(R.id.btnCaughtStealing);
        btnUndo = (Button) rootView.findViewById(R.id.btnUndo);

        initializeOnTouchListeners();
        initializeOnClickListeners();
    }

    private void initializeOnClickListeners() {
        btnOut.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnOutOnClick();
                    }
                }
        );
        btnScored.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnScoredOnClick();
                    }
                }
        );
        btnAdvanced.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnAdvancedOnClick();
                    }
                }
        );
        btnStolenBase.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnStolenBaseOnClick();
                    }
                }
        );
        btnCaughtStealing.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnCaughtStealingOnClick();
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

    private void initializeOnTouchListeners() {
        btnOut.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnOutOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.red_rounded));
                return false;
            }
        });

        btnScored.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnScoredOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnScored.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.orange_rounded));
                return false;
            }
        });

        btnAdvanced.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnAdvancedOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnAdvanced.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.green_rounded));
                return false;
            }
        });

        btnStolenBase.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnStolenBaseOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnStolenBase.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.purple_rounded));
                return false;
            }
        });

        btnCaughtStealing.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnCaughtStealingOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnCaughtStealing.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
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

    private void btnOutOnClick() {
        mListener.incrementOuts();
    }

    private void btnOutOnTouch() {
        btnOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.red_rounded_pressed));
    }

    private void btnScoredOnClick() {
        mListener.incrementScore();
    }

    private void btnScoredOnTouch() {
        btnScored.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.orange_rounded_pressed));
    }

    private void btnAdvancedOnClick() {
        mListener.advanceBaseRunner();
    }

    private void btnAdvancedOnTouch() {
        btnAdvanced.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.green_rounded_pressed));
    }

    private void btnStolenBaseOnClick() {
        mListener.stolenBase();
    }

    private void btnStolenBaseOnTouch() {
        btnStolenBase.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.purple_rounded_pressed));
    }

    private void btnCaughtStealingOnClick() {
        mListener.caughtStealing();
    }

    private void btnCaughtStealingOnTouch() {
        btnCaughtStealing.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnUndoOnClick() {
        mListener.undoLastAction();
    }

    private void btnUndoOnTouch() {
        btnUndo.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.white_rounded_pressed));
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

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        //void onFragmentInteraction(Uri uri);
        void undoLastAction();

        void incrementScore();

        void incrementOuts();

        void advanceBaseRunner();

        void stolenBase();

        void caughtStealing();
    }
}
