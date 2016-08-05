package com.duxnort.baseballscorebook;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
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

    }

    private void initializeOnTouchListeners() {

    }

    private void btnOutOnClick() {

    }

    private void btnOutOnTouch() {

    }

    private void btnScoredOnClick() {

    }

    private void btnScoredOnTouch() {

    }

    private void btnAdvancedOnClick() {

    }

    private void btnAdvancedOnTouch() {

    }

    private void btnStolenBaseOnClick() {

    }

    private void btnStolenBaseOnTouch() {

    }

    private void btnCaughtStealingOnClick() {

    }

    private void btnCaughtStealingOnTouch() {

    }

    private void btnUndoOnClick() {

    }

    private void btnUndoOnTouch() {

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
    }
}
