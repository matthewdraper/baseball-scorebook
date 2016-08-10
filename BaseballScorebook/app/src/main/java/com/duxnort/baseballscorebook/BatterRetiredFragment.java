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

public class BatterRetiredFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private Button btnFoulOut, btnFlyOut, btnSwinging, btnLooking, btnGroundOut, btnLineOut,
            btnUnassisted, btnSacFly, btnSacBunt, btnDoublePlay, btnTriplePlay;


    public BatterRetiredFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_batter_retired, container, false);
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

    private void initializeButtons(View rootView) {
        btnFoulOut = (Button) rootView.findViewById(R.id.btnFoulOut);
        btnFlyOut = (Button) rootView.findViewById(R.id.btnFlyOut);
        btnSwinging = (Button) rootView.findViewById(R.id.btnSwinging);
        btnLooking = (Button) rootView.findViewById(R.id.btnLooking);
        btnGroundOut = (Button) rootView.findViewById(R.id.btnGroundOut);
        btnLineOut = (Button) rootView.findViewById(R.id.btnLineOut);
        btnUnassisted = (Button) rootView.findViewById(R.id.btnUnassisted);
        btnSacFly = (Button) rootView.findViewById(R.id.btnSacFly);
        btnSacBunt = (Button) rootView.findViewById(R.id.btnSacBunt);
        btnDoublePlay = (Button) rootView.findViewById(R.id.btnDoublePlay);
        btnTriplePlay = (Button) rootView.findViewById(R.id.btnTriplePlay);

        initializeOnTouchListeners();
        initializeOnClickListeners();
    }

    private void initializeOnClickListeners() {
        btnFoulOut.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnFoulOutOnClick();
                    }
                }
        );
        btnFlyOut.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnFlyOutOnClick();
                    }
                }
        );
        btnSwinging.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnSwingingOnClick();
                    }
                }
        );
        btnLooking.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnLookingOnClick();
                    }
                }
        );
        btnGroundOut.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnGroundOutOnClick();
                    }
                }
        );
        btnLineOut.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnLineOutOnClick();
                    }
                }
        );
        btnUnassisted.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnUnassistedOnClick();
                    }
                }
        );
        btnSacFly.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnSacFlyOnClick();
                    }
                }
        );
        btnSacBunt.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnSacBuntOnClick();
                    }
                }
        );
        btnDoublePlay.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnDoublePlayOnClick();
                    }
                }
        );
        btnTriplePlay.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnTriplePlayOnClick();
                    }
                }
        );
    }

    private void initializeOnTouchListeners() {
        btnFoulOut.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnFoulOutOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnFoulOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnFlyOut.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnFlyOutOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnFlyOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnSwinging.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnSwingingOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnSwinging.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnLooking.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnLookingOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnLooking.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnGroundOut.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnGroundOutOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnGroundOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnLineOut.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnLineOutOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnLineOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnUnassisted.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnUnassistedOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnUnassisted.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnSacFly.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnSacFlyOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnSacFly.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnSacBunt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnSacBuntOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnSacBunt.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnDoublePlay.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnDoublePlayOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnDoublePlay.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnTriplePlay.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnTriplePlayOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnTriplePlay.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
    }

    private void btnFoulOutOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.FOULOUT);
    }

    private void btnFoulOutOnTouch() {
        btnFoulOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnFlyOutOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.FLYOUT);
    }

    private void btnFlyOutOnTouch() {
        btnFlyOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnSwingingOnClick() {

    }

    private void btnSwingingOnTouch() {
        btnSwinging.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnLookingOnClick() {

    }

    private void btnLookingOnTouch() {
        btnLooking.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnGroundOutOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.GROUNDOUT);
    }

    private void btnGroundOutOnTouch() {
        btnGroundOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnLineOutOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.LINEOUT);
    }

    private void btnLineOutOnTouch() {
        btnLineOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnUnassistedOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.UNASSISTED_PUTOUT);
    }

    private void btnUnassistedOnTouch() {
        btnUnassisted.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnSacFlyOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.SACRIFICE_FLY);
    }

    private void btnSacFlyOnTouch() {
        btnSacFly.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnSacBuntOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.SACRIFICE_BUNT);
    }

    private void btnSacBuntOnTouch() {
        btnSacBunt.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnDoublePlayOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.DOUBLE_PLAY);
    }

    private void btnDoublePlayOnTouch() {
        btnDoublePlay.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnTriplePlayOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.TRIPLE_PLAY);
    }

    private void btnTriplePlayOnTouch() {
        btnTriplePlay.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    public interface OnFragmentInteractionListener {
        void loadFragment(Fragment frag, ScoringSymbol scoringSymbol);
    }
}
