/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.View.Fragment;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.duxnort.baseballscorebook.R;
import com.duxnort.baseballscorebook.Model.ScoringSymbol;

public class BatterRetiredFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private Button btnFoulOut, btnFlyOut, btnSwinging, btnLooking, btnGroundOut, btnLineOut,
            btnUnassisted, btnSacFly, btnSacBunt, btnDoublePlay, btnTriplePlay, btnDroppedLook,
            btnDroppedSwing, btnWildSwing;


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
        btnDroppedLook = (Button) rootView.findViewById(R.id.btnDroppedLook);
        btnDroppedSwing = (Button) rootView.findViewById(R.id.btnDroppedSwing);
        btnWildSwing = (Button) rootView.findViewById(R.id.btnWildSwing);

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

        if (mListener.getNumBaserunners() > 0) {
            btnSacBunt.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            btnSacBuntOnClick();
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
            if (mListener.getNumOuts() < 2) {
                btnDoublePlay.setOnClickListener(
                        new View.OnClickListener() {
                            public void onClick(View v) {
                                btnDoublePlayOnClick();
                            }
                        }
                );
            } else {
                btnDoublePlay.setTextColor(Color.BLACK);
            }

        } else {
            btnSacBunt.setTextColor(Color.BLACK);
            btnSacFly.setTextColor(Color.BLACK);
            btnDoublePlay.setTextColor(Color.BLACK);
        }
        if (mListener.getNumBaserunners() > 1) {
            btnTriplePlay.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            btnTriplePlayOnClick();
                        }
                    }
            );
        } else {
            btnTriplePlay.setTextColor(Color.BLACK);
        }
        if (mListener.getNumStrikes() > 1) {
            btnDroppedLook.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            btnDroppedLookOnClick();
                        }
                    }
            );
            btnDroppedSwing.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            btnDroppedSwingOnClick();
                        }
                    }
            );
            btnWildSwing.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            btnWildSwingOnClick();
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
        } else {
            btnDroppedLook.setTextColor(Color.BLACK);
            btnDroppedSwing.setTextColor(Color.BLACK);
            btnWildSwing.setTextColor(Color.BLACK);
            btnSwinging.setTextColor(Color.BLACK);
            btnLooking.setTextColor(Color.BLACK);
        }


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
        btnDroppedLook.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnDroppedLookOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnDroppedLook.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnDroppedSwing.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnDroppedSwingOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnDroppedSwing.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnWildSwing.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnWildSwingOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnWildSwing.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
    }

    private void btnFoulOutOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.FOULOUT);
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnFoulOutOnTouch() {
        btnFoulOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnFlyOutOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.FLYOUT);
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnFlyOutOnTouch() {
        btnFlyOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnSwingingOnClick() {
        mListener.loadFragment(new AtBatFragment());
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnSwingingOnTouch() {
        btnSwinging.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnLookingOnClick() {
        mListener.loadFragment(new AtBatFragment());
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnLookingOnTouch() {
        btnLooking.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnGroundOutOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.GROUNDOUT);
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnGroundOutOnTouch() {
        btnGroundOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnLineOutOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.LINEOUT);
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnLineOutOnTouch() {
        btnLineOut.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnUnassistedOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.UNASSISTED_PUTOUT);
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnUnassistedOnTouch() {
        btnUnassisted.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnSacFlyOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.SACRIFICE_FLY);
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnSacFlyOnTouch() {
        btnSacFly.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnSacBuntOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.SACRIFICE_BUNT);
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnSacBuntOnTouch() {
        btnSacBunt.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnDoublePlayOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.DOUBLE_PLAY);
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnDoublePlayOnTouch() {
        btnDoublePlay.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnTriplePlayOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.TRIPLE_PLAY);
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnTriplePlayOnTouch() {
        btnTriplePlay.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnDroppedLookOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.STRIKEOUT_LOOKING);
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnDroppedLookOnTouch() {
        btnDroppedLook.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnDroppedSwingOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.STRIKEOUT_SWINGING);
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnDroppedSwingOnTouch() {
        btnDroppedSwing.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnWildSwingOnClick() {
        mListener.loadFragment(new FieldersRetiredFragment(), ScoringSymbol.STRIKEOUT_SWINGING);
        mListener.incrementOuts();
        mListener.incrementPitchCount();
    }

    private void btnWildSwingOnTouch() {
        btnWildSwing.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    public interface OnFragmentInteractionListener {
        void loadFragment(Fragment frag, ScoringSymbol scoringSymbol);

        void loadFragment(Fragment frag);

        int getNumStrikes();

        int getNumBaserunners();

        void incrementOuts();

        void incrementPitchCount();

        int getNumOuts();
    }
}
