package com.duxnort.baseballscorebook;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class RecordGameActivity extends AppCompatActivity implements
        ScoreboardFragment.OnFragmentInteractionListener,
        AtBatFragment.OnFragmentInteractionListener,
        RunnerFragment.OnFragmentInteractionListener,
        BatterRetiredFragment.OnFragmentInteractionListener,
        ReachedBaseFragment.OnFragmentInteractionListener,
        FieldersRetiredFragment.OnFragmentInteractionListener {

    private int strikeCount = 0;
    private int ballCount = 0;
    private int pitchCount = 0;
    private int outCount = 0;
    private int innNum = 1;
    private int runsHome = 0;
    private int runsAway = 0;
    private boolean isTop = true;
    private boolean isBottom = false;
    private Button btnFirstBase, btnSecondBase, btnThirdBase, btnNextPlayer, btnPrevPlayer, btnSubstitute;
    private RunnerFragment r1, r2, r3;
    private AtBatFragment ab;
    private Fragment[] fragmentsArr;
    private int currFragIndex = 0;
    private ScoringSymbol scoringSymbol;
    private int baseRunners = 0;
    private boolean isFirstBaseOccupied = false;
    private boolean isSecondBaseOccupied = false;
    private boolean isThirdBaseOccupied = false;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


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
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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
        if (strikeCount != 2) {
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
    public int getNumOuts() {
        return this.outCount;
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

    @Override
    public void advanceBaseRunner() {

    }

    @Override
    public void stolenBase() {

    }

    @Override
    public void caughtStealing() {
        incrementOuts();
    }

    @Override
    public void undoLastAction() {

    }

    @Override
    public void incrementScore() {
        ScoreboardFragment scoreboard = (ScoreboardFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        baseRunners--;
        if (isTop == true && isBottom == false) {
            runsAway++;
            scoreboard.setTxtRunsAway(Integer.toString(runsAway));
        } else if (isBottom == true && isTop == false) {
            runsHome++;
            scoreboard.setTxtRunsHome(Integer.toString(runsHome));
        }
    }

    @Override
    public void incrementBaserunners() {
        baseRunners++;
    }

    private void substitute() {

    }

    private void incrementStrikeCount() {
        if (strikeCount < 2) {
            strikeCount++;
        } else if (strikeCount == 2) {
            incrementOuts();
            strikeCount = 0;
        }
    }

    private void incrementBallCount() {
        if (ballCount < 3) {
            ballCount++;
        } else {
            ballCount = 0;
            strikeCount = 0;
            ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
            // Update the strike lights
            scoreboard.setStrikeLights(strikeCount);
        }
    }

    private void incrementOutCount() {
        strikeCount = 0;
        ballCount = 0;
        if (outCount < 2) {
            outCount++;
        } else {
            outCount = 0;
            baseRunners = 0;
            nextHalfInning();
        }
    }

    private void nextHalfInning() {
        if (isTop == true) {
            setBottomInning();
        } else {
            innNum++;
            setTopInning();
            setInnNum();
        }
    }

    private void setInnNum() {
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        scoreboard.setTxtInnNum(Integer.toString(innNum));
    }

    private void setTopInning() {
        isTop = true;
        isBottom = false;
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        scoreboard.setTxtInnTopVisible();
        scoreboard.setTxtInnBotHidden();
    }

    private void setBottomInning() {
        isTop = false;
        isBottom = true;
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        scoreboard.setTxtInnTopHidden();
        scoreboard.setTxtInnBotVisible();
    }

    private void setPitchCount(int num) {
        ScoreboardFragment scoreboard = (ScoreboardFragment) getSupportFragmentManager().findFragmentById(R.id.fragScoreboard);
        scoreboard.setTxtPitchCountNum(Integer.toString(num));
    }

    private void initializeButtons() {
        btnNextPlayer = (Button) findViewById(R.id.btnNextPlayer);
        btnPrevPlayer = (Button) findViewById(R.id.btnPrevPlayer);
        btnFirstBase = (Button) findViewById(R.id.btnFirstBase);
        btnFirstBase.setAlpha(0);
        btnSecondBase = (Button) findViewById(R.id.btnSecondBase);
        btnSecondBase.setAlpha(0);
        btnThirdBase = (Button) findViewById(R.id.btnThirdBase);
        btnThirdBase.setAlpha(0);
        btnSubstitute = (Button) findViewById(R.id.btnSubstitute);


        initializeOnTouchListeners();
        initializeOnClickListeners();

    }

    private void initializeOnClickListeners() {
        btnNextPlayer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnNextPlayerOnClick();
            }
        });

        btnPrevPlayer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnPrevPlayerOnClick();
            }
        });

        btnFirstBase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnFirstBaseOnClick();
            }
        });

        btnSecondBase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnSecondBaseOnClick();
            }
        });

        btnThirdBase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnThirdBaseOnClick();
            }
        });

        btnSubstitute.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnSubstituteOnClick();
            }
        });
    }

    private void initializeOnTouchListeners() {
        btnNextPlayer.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnNextPlayerOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnNextPlayer.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.blue_rounded));
                return false;
            }
        });
        btnPrevPlayer.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnPrevPlayerOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnPrevPlayer.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.blue_rounded));
                return false;
            }
        });
        btnSubstitute.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnSubstituteOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnSubstitute.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.white_rounded));
                return false;
            }
        });
    }

    private void incrementCurrFragIndex() {
        if (currFragIndex < 3) {
            currFragIndex++;
        } else if (currFragIndex >= 3) {
            currFragIndex = 0;
        }
    }

    private void decrementCurrFragIndex() {
        if (currFragIndex > 0) {
            currFragIndex--;
        } else if (currFragIndex <= 0) {
            currFragIndex = 3;
        }
    }

    // Need to edit this method and change it from next players fragment to a method that takes
    // a int as a parameter to determine which baserunner is selected.
    private void switchToPlayerFragment() {
        switch (currFragIndex) {
            case 0:
                btnFirstBase.setBackground(ContextCompat.getDrawable(this, R.drawable.baserunner));
                btnSecondBase.setBackground(ContextCompat.getDrawable(this, R.drawable.baserunner));
                btnThirdBase.setBackground(ContextCompat.getDrawable(this, R.drawable.baserunner));
                break;
            case 1:
                btnFirstBase.setBackground(ContextCompat.getDrawable(this, R.drawable.baserunner_selected));
                btnSecondBase.setBackground(ContextCompat.getDrawable(this, R.drawable.baserunner));
                btnThirdBase.setBackground(ContextCompat.getDrawable(this, R.drawable.baserunner));
                break;
            case 2:
                btnFirstBase.setBackground(ContextCompat.getDrawable(this, R.drawable.baserunner));
                btnSecondBase.setBackground(ContextCompat.getDrawable(this, R.drawable.baserunner_selected));
                btnThirdBase.setBackground(ContextCompat.getDrawable(this, R.drawable.baserunner));
                break;
            case 3:
                btnFirstBase.setBackground(ContextCompat.getDrawable(this, R.drawable.baserunner));
                btnSecondBase.setBackground(ContextCompat.getDrawable(this, R.drawable.baserunner));
                btnThirdBase.setBackground(ContextCompat.getDrawable(this, R.drawable.baserunner_selected));
                break;
            default:
                break;
        }
        loadFragment(fragmentsArr[currFragIndex]);
    }

    private void btnNextPlayerOnClick() {
        incrementCurrFragIndex();
        switchToPlayerFragment();
    }

    private void btnNextPlayerOnTouch() {
        btnNextPlayer.setBackground(ContextCompat.getDrawable(this, R.drawable.blue_rounded_pressed));
    }

    private void btnPrevPlayerOnClick() {
        decrementCurrFragIndex();
        switchToPlayerFragment();
    }

    private void btnPrevPlayerOnTouch() {
        btnPrevPlayer.setBackground(ContextCompat.getDrawable(this, R.drawable.blue_rounded_pressed));
    }

    private void btnFirstBaseOnClick() {
        currFragIndex = 1;
        switchToPlayerFragment();
    }

    private void btnFirstBaseOnTouch() {
        // Fill with graphical events
    }

    private void btnSecondBaseOnClick() {
        currFragIndex = 2;
        switchToPlayerFragment();
    }

    private void btnSecondBaseOnTouch() {
        // Fill with graphical events
    }

    private void btnThirdBaseOnClick() {
        currFragIndex = 3;
        switchToPlayerFragment();
    }

    private void btnThirdBaseOnTouch() {
        // Fill with graphical events
    }

    private void btnSubstituteOnClick() {
        substitute();
    }

    private void btnSubstituteOnTouch() {
        btnSubstitute.setBackground(ContextCompat.getDrawable(this, R.drawable.white_rounded_pressed));
    }

    public void initializePlayerFragments() {
        ab = new AtBatFragment();
        r1 = new RunnerFragment();
        r2 = new RunnerFragment();
        r3 = new RunnerFragment();
        fragmentsArr = new Fragment[]{ab, r1, r2, r3};
    }

    // Initialize the first fragment into the Activity
    public void loadFragment(Fragment frag) {
        FragmentTransaction fragTransaction = getFragmentManager().beginTransaction();
        fragTransaction.replace(R.id.containerEvents, frag, "fragment" + frag);
        fragTransaction.commit();
    }

    @Override
    public int getNumStrikes() {
        return this.strikeCount;
    }

    @Override
    public int getNumBaserunners() {
        return this.baseRunners;
    }

    @Override
    public void loadFragment(Fragment frag, ScoringSymbol scoringSymbol) {
        this.scoringSymbol = scoringSymbol;
        loadFragment(frag);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "RecordGame Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.duxnort.baseballscorebook/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "RecordGame Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.duxnort.baseballscorebook/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }


    @Override
    public ScoringSymbol getScoringSymbol() {
        return this.scoringSymbol;
    }

    @Override
    public void setFirstBaseOccupied(boolean isOccupied) {
        isFirstBaseOccupied = isOccupied;
        if (isFirstBaseOccupied) {
            btnFirstBase.setAlpha(1);
        } else {
            btnFirstBase.setAlpha(0);
        }
    }

    @Override
    public void setSecondBaseOccupied(boolean isOccupied) {
        isSecondBaseOccupied = isOccupied;
        if (isSecondBaseOccupied) {
            btnSecondBase.setAlpha(1);
        } else {
            btnSecondBase.setAlpha(0);
        }
    }

    @Override
    public void setThirdBaseOccupied(boolean isOccupied) {
        isThirdBaseOccupied = isOccupied;
        if (isThirdBaseOccupied) {
            btnThirdBase.setAlpha(1);
        } else {
            btnThirdBase.setAlpha(0);
        }
    }
}
