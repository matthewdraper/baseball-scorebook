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
import android.widget.TextView;

public class FieldersRetiredFragment extends Fragment {
    private OnFragmentInteractionListener mListener;

    private Button btnCatcher, btnPitcher, btnFirstBase, btnSecondBase, btnShortStop, btnThirdBase,
            btnLeftField, btnCenterField, btnRightField, btnDelete, btnDone;

    private ScoringSymbol scoringSymbol;

    private TextView txtEnterPositions, txtOutType, txtPositions;

    public FieldersRetiredFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_fielders_retired, container, false);
        initializeButtons(rootView);
        initializeText(rootView);
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

    private void initializeScoringSymbol() {
        scoringSymbol = mListener.getScoringSymbol();
    }

    private void initializeButtons(View rootView) {
        btnCatcher = (Button) rootView.findViewById(R.id.btnCatcher);
        btnPitcher = (Button) rootView.findViewById(R.id.btnPitcher);
        btnFirstBase = (Button) rootView.findViewById(R.id.btnFirstBase);
        btnSecondBase = (Button) rootView.findViewById(R.id.btnSecondBase);
        btnShortStop = (Button) rootView.findViewById(R.id.btnShortStop);
        btnThirdBase = (Button) rootView.findViewById(R.id.btnThirdBase);
        btnLeftField = (Button) rootView.findViewById(R.id.btnLeftField);
        btnCenterField = (Button) rootView.findViewById(R.id.btnCenterField);
        btnRightField = (Button) rootView.findViewById(R.id.btnRightField);
        btnDelete = (Button) rootView.findViewById(R.id.btnDelete);
        btnDone = (Button) rootView.findViewById(R.id.btnDone);

        initializeOnTouchListeners();
        initializeOnClickListeners();
    }

    private void initializeText(View rootView) {
        txtPositions = (TextView) rootView.findViewById(R.id.txtPositions);
        txtOutType = (TextView) rootView.findViewById(R.id.txtOutType);
        txtEnterPositions = (TextView) rootView.findViewById(R.id.txtEnterPositions);
        setTxtPositions("");
        initializeScoringSymbol();
        setTxtOutType(scoringSymbol.getScoringSymbol());
    }

    private void initializeOnClickListeners() {
        btnCatcher.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnCatcherOnClick();
                    }
                }
        );
        btnPitcher.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnPitcherOnClick();
                    }
                }
        );
        btnFirstBase.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnFirstBaseOnClick();
                    }
                }
        );
        btnSecondBase.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnSecondBaseOnClick();
                    }
                }
        );
        btnShortStop.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnShortStopOnClick();
                    }
                }
        );
        btnThirdBase.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnThirdBaseOnClick();
                    }
                }
        );
        btnLeftField.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnLeftFieldOnClick();
                    }
                }
        );
        btnCenterField.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnCenterFieldOnClick();
                    }
                }
        );
        btnRightField.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnRightFieldOnClick();
                    }
                }
        );
        btnDelete.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnDeleteOnClick();
                    }
                }
        );
        btnDone.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnDoneOnClick();
                    }
                }
        );
    }

    private void initializeOnTouchListeners() {
        btnCatcher.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnCatcherOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnCatcher.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnPitcher.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnPitcherOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnPitcher.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnFirstBase.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnFirstBaseOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnFirstBase.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnSecondBase.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnSecondBaseOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnSecondBase.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnShortStop.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnShortStopOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnShortStop.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnThirdBase.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnThirdBaseOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnThirdBase.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnLeftField.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnLeftFieldOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnLeftField.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnCenterField.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnCenterFieldOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnCenterField.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnRightField.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnRightFieldOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnRightField.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnDelete.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnDeleteOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnDelete.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
        btnDone.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnDoneOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnDone.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded));
                return false;
            }
        });
    }

    private void btnCatcherOnClick() {
        appendPosition(Position.CATCHER);
    }

    private void btnCatcherOnTouch() {
        btnCatcher.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnPitcherOnClick() {
        appendPosition(Position.PITCHER);
    }

    private void btnPitcherOnTouch() {
        btnPitcher.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnFirstBaseOnClick() {
        appendPosition(Position.FIRSTBASE);
    }

    private void btnFirstBaseOnTouch() {
        btnFirstBase.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnSecondBaseOnClick() {
        appendPosition(Position.SECONDBASE);
    }

    private void btnSecondBaseOnTouch() {
        btnSecondBase.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnShortStopOnClick() {
        appendPosition(Position.SHORTSTOP);
    }

    private void btnShortStopOnTouch() {
        btnShortStop.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnThirdBaseOnClick() {
        appendPosition(Position.THIRDBASE);
    }

    private void btnThirdBaseOnTouch() {
        btnThirdBase.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnLeftFieldOnClick() {
        appendPosition(Position.LEFTFIELD);
    }

    private void btnLeftFieldOnTouch() {
        btnLeftField.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnCenterFieldOnClick() {
        appendPosition(Position.CENTERFIELD);
    }

    private void btnCenterFieldOnTouch() {
        btnCenterField.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnRightFieldOnClick() {
        appendPosition(Position.RIGHTFIELD);
    }

    private void btnRightFieldOnTouch() {
        btnRightField.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnDeleteOnClick() {
        removePosition();
    }

    private void btnDeleteOnTouch() {
        btnDelete.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void btnDoneOnClick() {

    }

    private void btnDoneOnTouch() {
        btnDone.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.black_rounded_pressed));
    }

    private void setTxtEnterPositions(String text) {

    }

    private void setTxtOutType(String text) {
        txtOutType.setText(text.concat(" "));
    }

    private void setTxtPositions(String text) {
        txtPositions.setText(text);
    }

    private String getTxtPositions() {
        return txtPositions.getText().toString();
    }

    private void appendPosition(Position position) {
        String dash = "-";
        String text = getTxtPositions();
        //// TODO: 8/10/16 Fix this messy code 
        if (getTxtPositions().equalsIgnoreCase("")) {
            setTxtPositions(text.concat(Integer.toString(position.getScoreNum())));
        } else if (text.length() == 1 && !text.equalsIgnoreCase(Integer.toString(position.getScoreNum()))
                && (scoringSymbol.equals(ScoringSymbol.GROUNDOUT)
                || scoringSymbol.equals(ScoringSymbol.SACRIFICE_BUNT)
                || scoringSymbol.equals(ScoringSymbol.DOUBLE_PLAY)
                || scoringSymbol.equals(ScoringSymbol.TRIPLE_PLAY)
                || scoringSymbol.equals(ScoringSymbol.STRIKEOUT_LOOKING)
                || scoringSymbol.equals(ScoringSymbol.STRIKEOUT_SWINGING))) {
            setTxtPositions(text.concat(dash.concat(Integer.toString(position.getScoreNum()))));
        } else if (!Integer.toString(position.getScoreNum()).equalsIgnoreCase(Character.toString(text.charAt(text.length() - 1)))
                && (scoringSymbol.equals(ScoringSymbol.GROUNDOUT)
                || scoringSymbol.equals(ScoringSymbol.SACRIFICE_BUNT)
                || scoringSymbol.equals(ScoringSymbol.DOUBLE_PLAY)
                || scoringSymbol.equals(ScoringSymbol.TRIPLE_PLAY)
                || scoringSymbol.equals(ScoringSymbol.STRIKEOUT_LOOKING)
                || scoringSymbol.equals(ScoringSymbol.STRIKEOUT_SWINGING))) {
            setTxtPositions(text.concat(dash.concat(Integer.toString(position.getScoreNum()))));
        }

    }

    private void removePosition() {
        if (getTxtPositions().length() > 1) {
            setTxtPositions(getTxtPositions().substring(0, getTxtPositions().length() - 2));
        } else {
            setTxtPositions("");
        }
    }

    public interface OnFragmentInteractionListener {
        ScoringSymbol getScoringSymbol();
    }
}
