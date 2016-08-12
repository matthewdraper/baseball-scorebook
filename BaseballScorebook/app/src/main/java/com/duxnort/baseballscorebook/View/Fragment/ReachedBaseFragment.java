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

public class ReachedBaseFragment extends Fragment {

    private Button btnSingle, btnDouble, btnTriple, btnHomeRun, btnInterference, btnError,
            btnFieldersChoice, btnHitByPitch, btnIntWalk, btnWalk, btnDroppedSwing, btnDroppedLook,
            btnWildSwing, btnGroundRule;

    private OnFragmentInteractionListener mListener;

    public ReachedBaseFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_reached_base, container, false);
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
        btnSingle = (Button) rootView.findViewById(R.id.btnSingle);
        btnDouble = (Button) rootView.findViewById(R.id.btnDouble);
        btnTriple = (Button) rootView.findViewById(R.id.btnTriple);
        btnHomeRun = (Button) rootView.findViewById(R.id.btnHomeRun);
        btnInterference = (Button) rootView.findViewById(R.id.btnInterference);
        btnError = (Button) rootView.findViewById(R.id.btnError);
        btnFieldersChoice = (Button) rootView.findViewById(R.id.btnFieldersChoice);
        btnHitByPitch = (Button) rootView.findViewById(R.id.btnHitByPitch);
        btnIntWalk = (Button) rootView.findViewById(R.id.btnIntWalk);
        btnWalk = (Button) rootView.findViewById(R.id.btnWalk);
        btnDroppedSwing = (Button) rootView.findViewById(R.id.btnDroppedSwing);
        btnDroppedLook = (Button) rootView.findViewById(R.id.btnDroppedLook);
        btnWildSwing = (Button) rootView.findViewById(R.id.btnWildSwing);
        btnGroundRule = (Button) rootView.findViewById(R.id.btnGroundRule);

        initializeOnTouchListeners();
        initializeOnClickListeners();
    }

    private void initializeOnClickListeners() {
        btnSingle.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnSingleOnClick();
                    }
                }
        );
        btnDouble.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnDoubleOnClick();
                    }
                }
        );
        btnTriple.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnTripleOnClick();
                    }
                }
        );
        btnHomeRun.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnHomeRunOnClick();
                    }
                }
        );
        btnInterference.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnInterferenceOnClick();
                    }
                }
        );
        btnError.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnErrorOnClick();
                    }
                }
        );
        btnHitByPitch.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnHitByPitchOnClick();
                    }
                }
        );
        btnIntWalk.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnIntWalkOnClick();
                    }
                }
        );
        btnWalk.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnWalkOnClick();
                    }
                }
        );
        btnGroundRule.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnGroundRuleOnClick();
                    }
                }
        );
        if (mListener.getNumBaserunners() > 0) {
            btnFieldersChoice.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            btnFieldersChoiceOnClick();
                        }
                    }
            );
        } else {
            btnFieldersChoice.setTextColor(Color.BLACK);
        }

        if (mListener.getNumStrikes() > 1) {
            btnDroppedSwing.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            btnDroppedSwingOnClick();
                        }
                    }
            );
            btnDroppedLook.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            btnDroppedLookOnClick();
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
        } else {
            btnDroppedSwing.setTextColor(Color.BLACK);
            btnDroppedLook.setTextColor(Color.BLACK);
            btnWildSwing.setTextColor(Color.BLACK);
        }
    }

    private void initializeOnTouchListeners() {
        btnSingle.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnSingleOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnSingle.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnDouble.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnDoubleOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnDouble.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnTriple.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnTripleOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnTriple.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnHomeRun.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnHomeRunOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnHomeRun.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnInterference.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnInterferenceOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnInterference.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnError.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnErrorOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnError.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnFieldersChoice.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnFieldersChoiceOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnFieldersChoice.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnHitByPitch.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnHitByPitchOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnHitByPitch.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnIntWalk.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnIntWalkOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnIntWalk.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnWalk.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnWalkOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnWalk.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
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
        btnGroundRule.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnGroundRuleOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnGroundRule.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
    }

    private void btnSingleOnClick() {
        mListener.setFirstBaseOccupied(true);
        mListener.incrementBaserunners();
    }

    private void btnSingleOnTouch() {
        btnSingle.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnDoubleOnClick() {
        mListener.setSecondBaseOccupied(true);
        mListener.incrementBaserunners();
    }

    private void btnDoubleOnTouch() {
        btnDouble.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnTripleOnClick() {
        mListener.setThirdBaseOccupied(true);
        mListener.incrementBaserunners();
    }

    private void btnTripleOnTouch() {
        btnTriple.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnHomeRunOnClick() {
        for (int i = 0; i <= mListener.getNumBaserunners() + 1; i++) {
            mListener.incrementScore();
        }
        mListener.setFirstBaseOccupied(false);
        mListener.setSecondBaseOccupied(false);
        mListener.setThirdBaseOccupied(false);
    }

    private void btnHomeRunOnTouch() {
        btnHomeRun.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnInterferenceOnClick() {
        mListener.setFirstBaseOccupied(true);
        mListener.incrementBaserunners();
    }

    private void btnInterferenceOnTouch() {
        btnInterference.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnErrorOnClick() {
        mListener.setFirstBaseOccupied(true);
        mListener.incrementBaserunners();
    }

    private void btnErrorOnTouch() {
        btnError.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnFieldersChoiceOnClick() {
        mListener.setFirstBaseOccupied(true);
    }

    private void btnFieldersChoiceOnTouch() {
        btnFieldersChoice.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnHitByPitchOnClick() {
        mListener.setFirstBaseOccupied(true);
        mListener.incrementBaserunners();
    }

    private void btnHitByPitchOnTouch() {
        btnHitByPitch.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnIntWalkOnClick() {
        mListener.setFirstBaseOccupied(true);
        mListener.incrementBaserunners();
    }

    private void btnIntWalkOnTouch() {
        btnIntWalk.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnWalkOnClick() {
        mListener.setFirstBaseOccupied(true);
        mListener.incrementBaserunners();
    }

    private void btnWalkOnTouch() {
        btnWalk.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnDroppedSwingOnClick() {
        mListener.setFirstBaseOccupied(true);
        mListener.incrementBaserunners();
    }

    private void btnDroppedSwingOnTouch() {
        btnDroppedSwing.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnDroppedLookOnClick() {
        mListener.setFirstBaseOccupied(true);
        mListener.incrementBaserunners();
    }

    private void btnDroppedLookOnTouch() {
        btnDroppedLook.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnWildSwingOnClick() {
        mListener.setFirstBaseOccupied(true);
        mListener.incrementBaserunners();
    }

    private void btnWildSwingOnTouch() {
        btnWildSwing.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnGroundRuleOnClick() {
        mListener.setFirstBaseOccupied(true);
        mListener.incrementBaserunners();
    }

    private void btnGroundRuleOnTouch() {
        btnGroundRule.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    public interface OnFragmentInteractionListener {
        void setFirstBaseOccupied(boolean isOccupied);

        void setSecondBaseOccupied(boolean isOccupied);

        void setThirdBaseOccupied(boolean isOccupied);

        int getNumStrikes();

        int getNumBaserunners();

        void incrementScore();

        void incrementBaserunners();
    }
}
