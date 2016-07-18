package com.duxnort.baseballscorebook;

import android.app.Fragment;
import android.app.FragmentTransaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class RecordGameActivity extends AppCompatActivity implements
        ScoreboardFragment.OnFragmentInteractionListener,
        AtBatFragment.OnFragmentInteractionListener,
        RunnerFragment.OnFragmentInteractionListener{

    private  int strikeCount = 0;
    private  int ballCount = 0;
    private  int pitchCount = 0;
    private  int outCount = 0;
    private  int innNum = 1;
    private  boolean isTop = true;
    private  boolean isBottom = false;
    private  Button btnFirstBase, btnSecondBase, btnThirdBase, btnNextPlayer, btnPrevPlayer;
    private  RunnerFragment r1, r2, r3;
    private  AtBatFragment ab;
    private  Fragment[] fragmentsArr;
    private int currFragIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_game);
        setInnNum();
        setTopInning();
        setPitchCount(0);

        initializePlayerFragments();

        loadFragment(ab); // This sets the fragment in to be displayed since
                              // in order to switch fragments it cannot be declared in the XML
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

    private void setPitchCount(int num){
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        scoreboard.setTxtPitchCountNum(Integer.toString(num));
    }

    private void initializeButtons(){
        btnNextPlayer = (Button) findViewById(R.id.btnNextPlayer);
        btnPrevPlayer = (Button) findViewById(R.id.btnPrevPlayer);
        btnFirstBase = (Button) findViewById(R.id.btnFirstBase);
        btnSecondBase = (Button) findViewById(R.id.btnSecondBase);
        btnThirdBase = (Button) findViewById(R.id.btnThirdBase);


        btnNextPlayer.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                nextPlayersFragment();
            }
        });

        btnPrevPlayer.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                prevPlayersFragment();
            }
        });

        btnFirstBase.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                currFragIndex = 1;
                loadFragment(fragmentsArr[currFragIndex]);
                btnFirstBase.setBackground(getResources().getDrawable(R.drawable.baserunner_selected));
                btnSecondBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnThirdBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
            }
        });

        btnSecondBase.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                currFragIndex = 2;
                loadFragment(fragmentsArr[currFragIndex]);
                btnFirstBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnSecondBase.setBackground(getResources().getDrawable(R.drawable.baserunner_selected));
                btnThirdBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
            }
        });

        btnThirdBase.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                currFragIndex = 3;
                loadFragment(fragmentsArr[currFragIndex]);
                btnFirstBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnSecondBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnThirdBase.setBackground(getResources().getDrawable(R.drawable.baserunner_selected));
            }
        });

    }

    private void nextPlayersFragment(){
        if(currFragIndex < 3){
            currFragIndex++;
        } else if(currFragIndex == 3){
            currFragIndex = 0;
        }
        switch (currFragIndex){
            case 0:
                btnFirstBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnSecondBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnThirdBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                break;
            case 1:
                btnFirstBase.setBackground(getResources().getDrawable(R.drawable.baserunner_selected));
                btnSecondBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnThirdBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                break;
            case 2:
                btnFirstBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnSecondBase.setBackground(getResources().getDrawable(R.drawable.baserunner_selected));
                btnThirdBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                break;
            case 3:
                btnFirstBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnSecondBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnThirdBase.setBackground(getResources().getDrawable(R.drawable.baserunner_selected));
                break;
            default:
                break;
        }
        loadFragment(fragmentsArr[currFragIndex]);
    }

    private void prevPlayersFragment(){
        if(currFragIndex > 0){
            currFragIndex--;
        } else if(currFragIndex == 0){
            currFragIndex = 3;
        }
        loadFragment(fragmentsArr[currFragIndex]);
        switch (currFragIndex){
            case 0:
                btnFirstBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnSecondBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnThirdBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                break;
            case 1:
                btnFirstBase.setBackground(getResources().getDrawable(R.drawable.baserunner_selected));
                btnSecondBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnThirdBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                break;
            case 2:
                btnFirstBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnSecondBase.setBackground(getResources().getDrawable(R.drawable.baserunner_selected));
                btnThirdBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                break;
            case 3:
                btnFirstBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnSecondBase.setBackground(getResources().getDrawable(R.drawable.baserunner));
                btnThirdBase.setBackground(getResources().getDrawable(R.drawable.baserunner_selected));
                break;
            default:
                break;
        }
    }

    public void initializePlayerFragments(){
        ab = new AtBatFragment();
        r1 = new RunnerFragment();
        r2 = new RunnerFragment();
        r3 = new RunnerFragment();
        fragmentsArr = new Fragment[]{ab, r1, r2, r3};
    }

    // Initialize the first fragment into the Activity
    private void loadFragment(Fragment frag){
        FragmentTransaction fragTransaction = getFragmentManager().beginTransaction();
        fragTransaction.replace(R.id.containerEvents, frag , "fragment" + frag);
        fragTransaction.commit();

    }
}
