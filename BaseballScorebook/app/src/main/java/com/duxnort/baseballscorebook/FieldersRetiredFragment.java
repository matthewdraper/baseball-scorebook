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

    }

    private void btnCatcherOnTouch() {

    }

    private void btnPitcherOnClick() {

    }

    private void btnPitcherOnTouch() {

    }

    private void btnFirstBaseOnClick() {

    }

    private void btnFirstBaseOnTouch() {

    }

    private void btnSecondBaseOnClick() {

    }

    private void btnSecondBaseOnTouch() {

    }

    private void btnShortStopOnClick() {

    }

    private void btnShortStopOnTouch() {

    }

    private void btnThirdBaseOnClick() {

    }

    private void btnThirdBaseOnTouch() {

    }

    private void btnLeftFieldOnClick() {

    }

    private void btnLeftFieldOnTouch() {

    }

    private void btnCenterFieldOnClick() {

    }

    private void btnCenterFieldOnTouch() {

    }

    private void btnRightFieldOnClick() {

    }

    private void btnRightFieldOnTouch() {

    }

    private void btnDeleteOnClick() {

    }

    private void btnDeleteOnTouch() {

    }

    private void btnDoneOnClick() {

    }

    private void btnDoneOnTouch() {

    }

    private void setTxtEnterPositions(String text) {

    }

    private void setTxtOutType(String text) {

    }

    private void setTxtPositions(String text) {

    }

    private String getTxtPositions() {
        return null;
    }

    private void appendPosition(String position) {

    }

    public interface OnFragmentInteractionListener {

    }
}
