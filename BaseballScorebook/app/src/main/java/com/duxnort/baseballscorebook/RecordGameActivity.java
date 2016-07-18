package com.duxnort.baseballscorebook;

import android.app.Fragment;
import android.app.FragmentTransaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RecordGameActivity extends AppCompatActivity implements
        ScoreboardFragment.OnFragmentInteractionListener,
        AtBatFragment.OnFragmentInteractionListener,
        RunnerFragment.OnFragmentInteractionListener{

    public int strikeCount = 0;
    public int ballCount = 0;
    public int pitchCount = 0;
    public int outCount = 0;
    public int innNum = 1;
    public boolean isTop = true;
    public boolean isBottom = false;
    public Button btnSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_game);
        setInnNum();
        setTopInning();
        initializeFragment();
        initializeButtons();
    }

    @Override
    public void incrementStrikes() {
        // Increment the strike count
        incrementStrikeCount();
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        // Update the strike lights
        scoreboard.setStrikeLights(strikeCount);
    }

    @Override
    public void incrementFoulStrikes() {
        // Depending on the strike count increment the strike count
        if(strikeCount != 2){
            incrementStrikeCount();
        }
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        // and update the strike lights if necessary.
        scoreboard.setStrikeLights(strikeCount);
    }

    @Override
    public void incrementBalls() {
        // Increment the ball count
        incrementBallCount();
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        // Update the ball lights
        scoreboard.setBallLights(ballCount);
    }

    @Override
    public void incrementPitchCount() {
        // Increment the pitch count
        pitchCount++;
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        // Update the scoreboard pitch count
        scoreboard.setTxtPitchCountNum(Integer.toString(pitchCount));
    }

    @Override
    public void incrementOuts() {
        // Increment the out count
        incrementOutCount();
        strikeCount = 0;
        ballCount = 0;
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        // Update the out count lights
        scoreboard.setStrikeLights(strikeCount);
        scoreboard.setBallLights(ballCount);
        scoreboard.setOutLights(outCount);
    }

    private void incrementStrikeCount(){
        if(strikeCount < 2){
            strikeCount++;
        } else if(strikeCount == 2){
            incrementOuts();
            strikeCount = 0;
        }
    }

    private void incrementBallCount(){
        if(ballCount < 3){
            ballCount++;
        } else {
            ballCount = 0;
            strikeCount = 0;
            ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
            // Update the strike lights
            scoreboard.setStrikeLights(strikeCount);
        }
    }

    private void incrementOutCount(){
        strikeCount = 0;
        ballCount = 0;
        if(outCount < 2){
            outCount++;
        } else {
            outCount = 0;
            nextHalfInning();
        }
    }

    private void nextHalfInning(){
        if(isTop == true){
            setBottomInning();
        } else {
            innNum++;
            setTopInning();
            setInnNum();
        }
    }

    private void setInnNum(){
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        scoreboard.setTxtInnNum(Integer.toString(innNum));
    }

    private void setTopInning(){
        isTop = true;
        isBottom = false;
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        scoreboard.setTxtInnTopVisible();
        scoreboard.setTxtInnBotHidden();
    }

    private void setBottomInning(){
        isTop = false;
        isBottom = true;
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        scoreboard.setTxtInnTopHidden();
        scoreboard.setTxtInnBotVisible();
    }

    private void initializeButtons(){
        btnSwitch = (Button) findViewById(R.id.btnSwitch);

        btnSwitch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                btnSwitchOnClick();
            }
        });

    }

    private void btnSwitchOnClick(){
        // Create new fragment and transaction
        Fragment newFragment = new RunnerFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack if needed
        transaction.replace(R.id.containerEvents, newFragment);
        transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();
    }

    private void initializeFragment(){
        Fragment atBatFrag = new AtBatFragment();
        FragmentTransaction fragTransaction = getFragmentManager().beginTransaction();

        fragTransaction.add(R.id.containerEvents, atBatFrag , "fragment" + atBatFrag);
        fragTransaction.commit();

    }
}
