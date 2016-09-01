/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;

import java.util.ArrayList;

public class Recorder {
    private Game game = null;

    public Recorder() {
    }

    public Recorder(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * This method records a strike and saves the game state so that the action may be undone.
     *
     * @throws Exception
     */
    public void recordStrike() throws Exception {
        // if there are currently less than 2 strikes
        if (currentGameState().getStrikeCount() < 2) {
            currentPitcherStats().incrementNumPitches(); // update pitcher number of pitches
            currentBatterStats().incrementNumPitches(); // update batter number of pitches
            currentGameState().incrementStrikes(); // update game state number of strikes
            recordGameState(); // record game state
        }
    }

    /**
     * This method records a ball and saves the game state so that the action may be undone.
     * @throws Exception
     */
    public void recordBall() throws Exception {
        // If there are currently less than 3 balls
        if (currentGameState().getBallCount() < 3) {
            currentPitcherStats().incrementNumPitches(); // update pitcher
            currentBatterStats().incrementNumPitches(); // update batter
            currentGameState().incrementBalls(); // update game state number of balls
            recordGameState(); // record game state
        }
    }

    /**
     * This method records a single and saves the game state so that the action may be undone.
     * This method updates the stats for the pitcher and the batter, moves the batter to first base,
     * records the event in the score book, and changes the current batter to the next batter.
     */
    public void recordSingle() throws Exception {
        if(!isBaseOccupied(1)){
            currentGameState().incrementPitchCount(); // update game state pitch count
            currentPitcherStats().incrementSingles(); // update pitcher singles
            currentBatterStats().incrementSingles(); // update batter singles
            currentPitcherStats().incrementNumPitches(); // update pitcher number of pitches
            currentBatterStats().incrementNumPitches(); // update batter number of pitches
            recordLocation(); // record the location of the hit
            recordBatterEvent(new ScoringEvent(ScoringSymbol.SINGLE)); // record the event in the scorebook
            // TODO: 8/19/16 Need to figure out how to deal with the other base runners before scoring
            // TODO: 8/19/16 the single.
            currentGameState().setCurrRunnerFirstIndex(currentBatterIndex()); // set the index of the runner on first to the batter
            currentGameState().incrementHits(); // update game state hits
            recordGameState(); // record the game state
            nextBatter(); // next batter up
        } else {
            throw new Exception("First base is not empty. You must deal with the runner before recording the single.");
        }
    }

    /**
     * This method records a double and saves the game state so that the action may be undone.
     * This method updates the stats for the pitcher and the batter, moves the batter to second
     * base, records the event in the score book, and changes the current batter to the next batter.
     */
    public void recordDouble() throws Exception {
        // If first and second base are not occupied
        if(!isBaseOccupied(1) && !isBaseOccupied(2)){
            currentGameState().incrementPitchCount(); // update the game state pitch count
            currentPitcherStats().incrementDoubles(); // update the pitcher doubles
            currentBatterStats().incrementDoubles(); // update the batter doubles
            currentPitcherStats().incrementNumPitches(); // update the pitcher number of pitches
            currentBatterStats().incrementNumPitches(); // update the batter number of pitches
            recordLocation(); // record the location of the hit
            recordBatterEvent(new ScoringEvent(ScoringSymbol.DOUBLE)); // record the event in the scorebook
            // TODO: 8/19/16 Need to figure out how to deal with the other base runners before scoring
            // TODO: 8/19/16 the single.
            currentGameState().setCurrRunnerSecondIndex(currentBatterIndex()); // set the index of the runner on second to the batter
            currentGameState().incrementHits(); // update game state hits
            recordGameState(); // record the game state
            nextBatter(); // next batter up
        } else if(isBaseOccupied(2)){
            throw new Exception("Second base is not empty. You must deal with the base runner before recording the double.");
        } else {
            throw new Exception("First base is not empty. You must deal with the base runner before recording the double.");
        }
    }

    /**
     * This methods records a triple and saves the game stat so that the action may be undone. This
     * method updates the stats for the pitcher and the batter, moves the batter to third base,
     * records the event in the score book, and changes the current batter to the next batter.
     */
    public void recordTriple() throws Exception {
        // If the bases are empty
        if(!isBaseOccupied(1) && !isBaseOccupied(2) && !isBaseOccupied(3)){
            currentGameState().incrementPitchCount(); // update the game state pitch count
            currentPitcherStats().incrementTriples(); // update the pitcher triples
            currentBatterStats().incrementTriples(); // update the batter triples
            currentPitcherStats().incrementNumPitches(); // update the pitcher number of pitches
            currentBatterStats().incrementNumPitches();  // updat the batter number of pitches
            recordLocation(); // record the location of the hit
            recordBatterEvent(new ScoringEvent(ScoringSymbol.TRIPLE)); // record the event in the scorebook
            // TODO: 8/19/16 Need to figure out how to deal with the other base runners before scoring
            // TODO: 8/19/16 the single.
            currentGameState().setCurrRunnerThirdIndex(currentBatterIndex()); // set the index of the runner on third to the batter
            currentGameState().incrementHits(); // update game state hits
            recordGameState(); // record the game state
            nextBatter(); // next batter up
        } else {
            throw new Exception("The bases are not empty. You must deal with the baserunner(s) before you record the triple.");
        }

    }

    /**
     * This method records a home run and saves the game state so that the action may be undone.
     * This method update the stats for the pitcher and the batter, scores every runner that is
     * currently occupying a base and the batter himself, and changes the current batter to the
     * next batter.
     *
     * @param isBatterEarned This specifies whether the batter is considered an earned run.
     * @param isFirstEarned  This specifies whether the runner on first is considered an earned run.
     * @param isSecondEarned This specifies whether the runner on second is considered an earned run.
     * @param isThirdEarned  This specifies whether the runner on third is considered an earned run.
     * @throws Exception
     */
    public void recordHomeRun(boolean isBatterEarned, boolean isFirstEarned, boolean isSecondEarned,
                              boolean isThirdEarned) throws Exception {
        currentGameState().incrementPitchCount(); // update the game state pitch count
        currentPitcherStats().incrementHomeRuns(); // update the pitcher home runs
        currentBatterStats().incrementHomeRuns(); // update the batter home runs
        currentPitcherStats().incrementNumPitches(); // update the pitcher number of pitches
        currentBatterStats().incrementNumPitches(); // update the batter number of pitches
        currentBatter().getStats().getRunningStats().incrementRuns(); // update the batter number of runs by one
        recordLocation(); // record the location of the hit
        currentGameState().incrementHits(); // update the game state hits
        currentGameState().incrementRuns(); // update the game state runs
        // If batter is earned run
        if (isBatterEarned) {
            currentPitcherStats().incrementEarnedRuns(); // update the pitcher earned runs
        } else {
            currentPitcherStats().incrementRuns(); // update the pitcher runs
        }

        // shift the runner on third first, followed by runner on second, then first
        // this prevents any of the indexes of the base runners' from being overwritten and therefore lost

        // If there is a runner on third
        if (isBaseOccupied(3)) {
            currentRunnerOnThird().getStats().getRunningStats().incrementRuns(); // increment the runner on third's runs
            currentGameState().incrementRuns(); // increment game state's runs
            recordRunBattedIn(); // increment the rbis for the batter
            moveToNextBase(currentRunnerOnThirdIndex(), new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED)); // update the base runner's score box and move to next base
            // If it is an earned run
            if (isThirdEarned) {
                currentPitcherStats().incrementEarnedRuns(); // increment the pitcher's earned runs
            } else {
                currentPitcherStats().incrementRuns(); // increment the pitcher's runs
            }
        }
        // If there is a runner on second
        if (isBaseOccupied(2)) {
            currentRunnerOnSecond().getStats().getRunningStats().incrementRuns(); // increment the runner on second's runs
            currentGameState().incrementRuns(); // increment game state's runs
            recordRunBattedIn(); // increment the rbis for the batter
            // move the runner from second to third and from third to home
            moveToNextBase(currentRunnerOnSecondIndex(), new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED)); // update the base runner's score box and move to next base
            moveToNextBase(currentRunnerOnThirdIndex(), new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED)); // update the base runner's score box and move to next base
            // If it is an earned run
            if (isSecondEarned) {
                currentPitcherStats().incrementEarnedRuns(); // increment the pitcher's earned runs
            } else {
                currentPitcherStats().incrementRuns(); // increment the pitcher's runs
            }
        }
        // If there is a runner on first
        if (isBaseOccupied(1)) {
            currentRunnerOnFirst().getStats().getRunningStats().incrementRuns(); // increment the runner on first's runs
            currentGameState().incrementRuns(); // increment the game state's runs
            recordRunBattedIn(); // increment the rbis for the batter
            // move the runner from first to second, from second to third, and from third to home
            moveToNextBase(currentRunnerOnSecondIndex(), new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED)); // update the base runner's score box and move to next base
            moveToNextBase(currentRunnerOnSecondIndex(), new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED)); // update the base runner's score box and move to next base
            moveToNextBase(currentRunnerOnThirdIndex(), new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED)); // update the base runner's score box and move to next base
            // If it is an earned run
            if (isFirstEarned) {
                currentPitcherStats().incrementEarnedRuns(); // increment the pitcher's earned runs
            } else {
                currentPitcherStats().incrementRuns(); // increment the pitcher's runs
            }
        }
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.HOMERUN)); // record the batter's event
        recordGameState(); // record game state
        nextBatter(); // next batter up
    }

    /**
     * This method records a stolen base for the runner. It updates the pitcher's, catcher's, and
     * runner's stats and updates the score book as well.
     *
     * @param runnerIndex The index of the runner in his team's roster ArrayList.
     * @param earnedRun   This specifies if the runner is on third an if he steals home whether or not
     *                    he is to be considered an earned run.
     * @throws Exception
     */
    public void recordStolenBase(int runnerIndex, boolean earnedRun) throws Exception {
        Player runner = offensivePlayer(runnerIndex); // player object
        moveToNextBase(runnerIndex, new ScoringEvent(ScoringSymbol.STOLEN_BASE)); // move runner to next base and record event
        // If the runner is on third base
        if (runnerIndex == currentRunnerOnThirdIndex()) {
            // If the runner is an earned run
            if (earnedRun) {
                currentPitcherStats().incrementEarnedRuns(); // increment pitcher's earned runs
            } else {
                currentPitcherStats().incrementRuns(); // decrement pitcher's earned runs
            }
        }
        currentPitcherStats().incrementStolenBases(); // update pitcher's stolen bases
        currentCatcherStats().incrementStolenBases(); // update catcher's stolen bases
        runner.getStats().getRunningStats().incrementStolenBases(); // update runner's stolen bases
        recordGameState(); // record the game state
    }

    /**
     * This method records a run batted in for the current batter.
     */
    public void recordRunBattedIn() {
        currentBatterStats().incrementRbis(); // increment the current batter's rbis
    }

    /**
     * This method records a walk and then saves the game state so that the action may be undone.
     * This method updates the stats for the pitcher and the batter, updates the score book, and
     * updates the current batter to the next batter.
     * @throws Exception
     */
    public void recordWalk() throws Exception {
        // If first base is empty and there are three balls
        if (!isBaseOccupied(1) && currentGameState().getBallCount() == 3) {
            currentGameState().incrementPitchCount(); // increment the game state's pitch count
            currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
            currentBatterStats().incrementNumPitches(); // increment the batter's pitches
            currentPitcherStats().incrementWalks(); // increment the pitcher's walks
            currentBatterStats().incrementWalks(); // increment the batter's walks
            currentGameState().setCurrRunnerFirstIndex(currentBatterIndex()); // move the batter to first base
            currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.WALK)); // record the event
        } else if (isBaseOccupied(1)) {
            throw new Exception("First base is not empty. You must handle other base runners before you record the walk.");
        } else if (currentGameState().getBallCount() != 3) {
            throw new Exception("There must be three balls recorded before you can record a walk.");
        }
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

    /**
     * This method records an intentional walk and then saves the game state so that the action
     * may be undone. This method updates the stats for the pitcher and the batter, updates the
     * score book, and updates the current batter to the next batter.
     * @throws Exception
     */
    public void recordIntentionalWalk() throws Exception {
        // If first base is empty and there are three balls
        if (!isBaseOccupied(1) && currentGameState().getBallCount() == 3) {
            currentGameState().incrementPitchCount(); // increment the game state's pitch count
            currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
            currentBatterStats().incrementNumPitches(); // increment the batter's pitches
            currentPitcherStats().incrementIntenWalks(); // increment the pitcher's intentional walks
            currentBatterStats().incrementIntenWalks(); // increment the batter's intentional walks
            currentGameState().setCurrRunnerFirstIndex(currentBatterIndex()); // move the batter to first base
            currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.INTENTIONAL_WALK)); // record the event
        } else if (isBaseOccupied(1)) {
            throw new Exception("First base is not empty. You must handle other base runners before you record the intentional walk.");
        } else if (currentGameState().getBallCount() != 3) {
            throw new Exception("There must be three balls recorded before you can record a walk.");
        }
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

    /**
     * This method records an event where the catcher causes interference on the batter and the
     * batter is awarded first base.
     * @throws Exception
     */
    public void recordCatchersInterference() throws Exception {
        // If first base is not occupied
        if(!isBaseOccupied(1)){
            currentGameState().incrementPitchCount(); // increment the game state's pitch count
            currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
            currentBatterStats().incrementNumPitches(); // increment the batter's pitches
            currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent("2", ScoringSymbol.INTERFERENCE)); // record the event
            currentGameState().setCurrRunnerFirstIndex(currentBatterIndex());
        } else {
            throw new Exception("First base is not empty. You must handle the runner on first " +
                    "before you record the catcher's interference.");
        }
    }

    /**
     * This method records that a base runner was caught stealing and then saves the game state so
     * that the action may be undone. This method updates the stats for the pitcher, batter, and
     * catcher, records the event in the score book and updates the current batter to the next
     * batter.
     * @param runnerIndex The index of the runner in his team's roster ArrayList.
     * @param posInvolved The positions involved in recording the out.
     * @throws Exception
     */
    public void recordCaughtStealing(int runnerIndex, String posInvolved) throws Exception {
        Player runner = offensivePlayer(runnerIndex); // store the player object
        currentPitcherStats().incrementCaughtStealing(); // increment the pitcher's caught stealing
        currentCatcherStats().incrementCaughtStealing(); // increment the catcher's caught stealing
        runner.getStats().getRunningStats().incrementCaughtStealing(); // increment the runner's caught stealing
        // If the runner is on first base
        if (runnerIndex == currentRunnerOnFirstIndex()) {
            playerScorecardBox(runnerIndex, currentGameState().getInning()).setFirstToSecondScoringEvent(
                    new ScoringEvent(posInvolved, ScoringSymbol.CAUGHT_STEALING,
                            currentGameState().getNumOuts() + 1)); // record the caught stealing event
            currentGameState().setCurrRunnerFirstIndex(-1); // empty the base
            // If the runner is on second base
        } else if (runnerIndex == currentRunnerOnSecondIndex()) {
            playerScorecardBox(runnerIndex, currentGameState().getInning()).setSecondToThirdScoringEvent(
                    new ScoringEvent(posInvolved, ScoringSymbol.CAUGHT_STEALING,
                            currentGameState().getNumOuts() + 1)); // record the caught stealing event
            currentGameState().setCurrRunnerSecondIndex(-1); // empty the base
            // If the runner is on third base
        } else if (runnerIndex == currentRunnerOnThirdIndex()) {
            playerScorecardBox(runnerIndex, currentGameState().getInning()).setThirdToHomeScoringEvent(
                    new ScoringEvent(posInvolved, ScoringSymbol.CAUGHT_STEALING,
                            currentGameState().getNumOuts() + 1)); // record the caught stealing event
            currentGameState().setCurrRunnerThirdIndex(-1); // empty the base
        }
        recordOut(); // increment the number of outs
        recordGameState(); // record the game state
    }

    /**
     * This method records a looking strike out and saves the game state so that the action may be undone.
     * This method updates the stats for the pitcher, batter, and records a put out for the catcher.
     * It then updates the score book and updates the current batter to the next batter.
     * @throws Exception
     */
    public void recordStrikeOutLooking() throws Exception {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentPitcherStats().incrementStrikeOutLook(); // increment the pitcher's strike out lookings
        currentBatterStats().incrementStrikeOuts(); // increment the batter's strike outs
        currentCatcherStats().incrementPutOuts(); // increment the catcher's putouts
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.STRIKEOUT_LOOKING)); // record event in score book
        recordOut(); // record an out
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

    /**
     * This method records a dropped third strike where the strikeout is considered a looking
     * strike out and the runner advances to first base.
     * @throws Exception
     */
    public void recordDroppedStrikeOutLookingPB() throws Exception {
        if(!isBaseOccupied(1)){
            currentGameState().incrementPitchCount(); // increment the game state's pitch count
            currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
            currentBatterStats().incrementNumPitches(); // increment the batter's pitches
            currentPitcherStats().incrementStrikeOutLook(); // increment the pitcher's strike out lookings
            currentBatterStats().incrementStrikeOuts(); // increment the batter's strike outs
            currentCatcherStats().incrementPassedBalls(); // increment the catcher's passed balls
            currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.STRIKEOUT_LOOKING)); // record event in score book
            currentBatterScorecardBox().setHomeToFirstScoringEvent(new ScoringEvent(ScoringSymbol.PASSED_BALL)); // record passed ball and reached base
            currentGameState().setCurrRunnerFirstIndex(currentBatterIndex());
            recordGameState(); // record the game state
            nextBatter(); // next batter up
        } else {
            throw new Exception("First base is not empty. You must deal with the base runner on" +
                    "first before you record the dropped third strikeout.");
        }
    }

    /**
     * This method records a swinging strike out and saves the game state so that the action may be undone.
     * This method updates the stats for the pitcher, batter, and records a put out for the catcher.
     * It then updates the score book and updates the current batter to the next batter.
     * @throws Exception
     */
    public void recordStrikeOutSwinging() throws Exception {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentPitcherStats().incrementStrikeOutSwing(); // increment the pitcher's strike out swinging
        currentBatterStats().incrementStrikeOuts(); // increment the batter's strike outs
        currentCatcherStats().incrementPutOuts(); // increment the catcher's putouts
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.STRIKEOUT_SWINGING)); // record event in score book
        recordOut(); // record an out
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

    /**
     * This method records a dropped swinging third strike that is recorded as a passed ball to the catcher.
     * As a result the batter reaches first base.
     * @throws Exception
     */
    public void recordDroppedStrikeOutSwingingPB() throws Exception {
        if(!isBaseOccupied(1)){
            currentGameState().incrementPitchCount(); // increment the game state's pitch count
            currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
            currentBatterStats().incrementNumPitches(); // increment the batter's pitches
            currentPitcherStats().incrementStrikeOutSwing(); // increment the pitcher's strike out swinging
            currentBatterStats().incrementStrikeOuts(); // increment the batter's strike outs
            currentCatcherStats().incrementPassedBalls(); // increment the catcher's passed balls
            currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.STRIKEOUT_SWINGING)); // record event in score book
            currentBatterScorecardBox().setHomeToFirstScoringEvent(new ScoringEvent(ScoringSymbol.PASSED_BALL)); // record passed ball and reached base
            currentGameState().setCurrRunnerFirstIndex(currentBatterIndex());
            recordGameState(); // record the game state
            nextBatter(); // next batter up
        } else {
            throw new Exception("First base is not empty. You must deal with the base runner on" +
                    "first before you record the dropped third strikeout.");
        }
    }

    /**
     * This method records a dropped swinging third strike that is considered a wild pitch. As a
     * result the batter advances to first base.
     * @throws Exception
     */
    public void recordDroppedStrikeOutSwingingWP() throws Exception {
        if(!isBaseOccupied(1)){
            currentGameState().incrementPitchCount(); // increment the game state's pitch count
            currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
            currentBatterStats().incrementNumPitches(); // increment the batter's pitches
            currentPitcherStats().incrementStrikeOutSwing(); // increment the pitcher's strike out swinging
            currentBatterStats().incrementStrikeOuts(); // increment the batter's strike outs
            currentCatcherStats().incrementWpCatching(); // increment the catcher's wild pitches
            currentPitcherStats().incrementWildPitches(); // increment the pitcher's wild pitches
            currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.STRIKEOUT_SWINGING)); // record event in score book
            currentBatterScorecardBox().setHomeToFirstScoringEvent(new ScoringEvent(ScoringSymbol.WILD_PITCH)); // record passed ball and reached base
            currentGameState().setCurrRunnerFirstIndex(currentBatterIndex());
            recordGameState(); // record the game state
            nextBatter(); // next batter up
        } else {
            throw new Exception("First base is not empty. You must deal with the base runner on" +
                    "first before you record the dropped third strikeout.");
        }
    }

    /**
     * This method records a hit by pitch and saves the game state so that the action may be undone.
     * It updates the stats for the pitcher and the batter and updates the score book. It then
     * updates the current batter to the next batter.
     * @throws Exception
     */
    public void recordHitByPitch() throws Exception {
        // If first base is empty
        if (!isBaseOccupied(1)) {
            currentGameState().incrementPitchCount(); // increment the game state's pitch count
            currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
            currentBatterStats().incrementNumPitches(); // increment the batter's pitches
            currentPitcherStats().incrementHitBatsmen(); // increment the pitcher's walks
            currentBatterStats().incrementHitByPitch(); // increment the batter's walks
            currentGameState().setCurrRunnerFirstIndex(currentBatterIndex()); // move the batter to first base
            currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.HIT_BY_PITCH)); // record the event
            recordGameState(); // record the game state
            nextBatter(); // next batter up
        } else {
            throw new Exception("First base is not empty. You must handle other base runners before you record the hit by pitch.");
        }
    }

    /**
     * This method records a sacrifice bunt and saves the game state so that the action may be undone.
     * It update the stats for the pitcher and the batter and updates the scorebook. It then updates
     * the current batter to the next batter.
     * @param positionsInvolved This reflects the players that were involved in the sacrifice bunt.
     * @throws Exception
     */
    public void recordSacrificeBunt(String positionsInvolved) throws Exception {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentPitcherStats().incrementSacBunts(); // increment the pitcher's sac bunts
        currentBatterStats().incrementSacBunts(); // increment the batter's sac bunts
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(positionsInvolved,
                ScoringSymbol.SACRIFICE_BUNT, currentGameState().getNumOuts() + 1)); // record the event
        recordOut(); // increment the number of outs
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

    /**
     * This method records a sacrifice fly and saves the game state so that the action may be undone.
     * It updates the stats for the batter and the pitcher and also records the event in the score
     * book. It then updates the batter to the next batter.
     * @param positionsInvolved This reflects the players that were involved in the sacrifice fly.
     * @throws Exception
     */
    public void recordSacrificeFly(String positionsInvolved) throws Exception {
            currentGameState().incrementPitchCount(); // increment the game state's pitch count
            currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
            currentBatterStats().incrementNumPitches(); // increment the batter's pitches
            currentPitcherStats().incrementFlyOuts(); // increment the pitcher's fly outs
            currentBatterStats().incrementSacFlys(); // increment the batter's sac flys
            currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(positionsInvolved,
                    ScoringSymbol.SACRIFICE_FLY, currentGameState().getNumOuts() + 1)); // record the event
            recordOut(); // increment the number of outs
            recordGameState(); // record the game state
            nextBatter(); // next batter up
    }

    /**
     * This method only records the batter's half of the double play. It updates the stats for the
     * pitcher and the batter but only records the batter's out in the double play.
     *
     * @param positionsInvolved The positions involved in recording the double play
     * @throws Exception
     */
    public void recordBatterGroundBallDoublePlay(String positionsInvolved) throws Exception {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentPitcherStats().incrementInducedGBDPs(); // increment the pitcher's ground ball double plays
        currentBatterStats().incrementGroundBallDP(); // increment the batter's ground ball double plays
        // Set the batter's batter scoring event to double play and give the event the first out
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(positionsInvolved,
                ScoringSymbol.DOUBLE_PLAY, currentGameState().getNumOuts() + 1)); // record the event in the player scorecard box
        recordOut(); // increment the number of outs
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

    /**
     * This method records a fly ball double play. It increments the fly ball stats for both the
     * pitcher and the batter.
     * @param posInvolved The players involved in the fly ball double play.
     * @throws Exception
     */
    public void recordBatterFlyBallDoublePlay(String posInvolved) throws Exception {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentPitcherStats().incrementFlyOuts(); // increment the pitcher's fly outs
        currentBatterStats().incrementFlyOuts(); // increment the batter's fly outs
        // Set the batter's batter scoring event to double play and give the event the first out
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(posInvolved,
                ScoringSymbol.DOUBLE_PLAY, currentGameState().getNumOuts() + 1)); // record the event in the player scorecard box
        recordOut(); // increment the number of outs
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

    /**
     * This method records the batter's third of a ground ball triple play. The batter and pitcher's
     * ground ball double play stats are incremented as well.
     * @param positionsInvolved The positions involved in the ground ball triple play.
     * @throws Exception
     */
    public void recordBatterGroundBallTriplePlay(String positionsInvolved) throws Exception {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentPitcherStats().incrementInducedGBDPs(); // increment the pitcher's ground ball double plays
        currentBatterStats().incrementGroundBallDP(); // increment the batter's ground ball double plays
        // Set the batter's batter scoring event to double play and give the event the first out
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(positionsInvolved,
                ScoringSymbol.TRIPLE_PLAY, currentGameState().getNumOuts() + 1)); // record the event in the player scorecard box
        recordOut(); // increment the number of outs
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

    /**
     * This method records the batter's third of a fly ball triple play. The batter's and pitcher's
     * flyball stats are incremented.
     * @param posInvolved The positions involved in the fly ball triple play.
     * @throws Exception
     */
    public void recordBatterFlyBallTriplePlay(String posInvolved) throws Exception {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentPitcherStats().incrementFlyOuts(); // increment the pitcher's fly outs
        currentBatterStats().incrementFlyOuts(); // increment the batter's fly outs
        // Set the batter's batter scoring event to double play and give the event the first out
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(posInvolved,
                ScoringSymbol.TRIPLE_PLAY, currentGameState().getNumOuts() + 1)); // record the event in the player scorecard box
        recordOut(); // increment the number of outs
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

    /**
     * This method only handles the batter's half of the ground ball out. The runner's scoring must still be handled.
     * @param positionsInvolved The positions involved in recording the ground ball out.
     * @throws Exception
     * **/
    public void recordGroundBallOut(String positionsInvolved) throws Exception {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentPitcherStats().incrementGroundOuts(); // increment the pitcher's ground outs
        currentBatterStats().incrementGroundOuts(); // increment the batter's ground outs
        // Record the batter's batter scoring event
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(positionsInvolved,
                ScoringSymbol.GROUNDOUT, currentGameState().getNumOuts() + 1)); // record the event in the player scorecard box
        recordOut(); // increment the number of outs
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

    /**
     * This method only handles the batter's half of the fly out. The runner's scoring must still be handled.
     * @param positionsInvolved The positions involved in recording the fly out.
     * @throws Exception
     * **/
    public void recordFlyBallOut(String positionsInvolved) throws Exception {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentPitcherStats().incrementFlyOuts(); // increment the pitcher's ground outs
        currentBatterStats().incrementFlyOuts(); // increment the batter's ground outs
        // Record the batter's batter scoring event
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(positionsInvolved, ScoringSymbol.FLYOUT, currentGameState().getNumOuts() + 1));
        recordOut(); // increment the number of outs
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

    /**
     * This method handles the advancing the runner to the next base.
     *
     * @param runnerIndex The index of the player that is advancing.
     * @throws Exception
     */
    public void recordRunnerAdvanced(int runnerIndex) throws Exception {
        moveToNextBase(runnerIndex, new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
    }

    /**
     * This method handles the advancing of the runner to the next base due to an error.
     *
     * @param runnerIndex The index of the player that is advancing due to the error.
     * @param posInvolved The position(s) that committed the error(s).
     * @throws Exception
     */
    public void recordRunnerAdvancedError(int runnerIndex, String posInvolved) throws Exception {
        moveToNextBase(runnerIndex, new ScoringEvent(posInvolved, ScoringSymbol.ERROR));
    }

    /**
     * This method deals with the advancing of the runner to the next base due to interference.
     *
     * @param runnerIndex The index of the runner that is advancing due to interference.
     * @param posInvolved The position(s) involved in the interference.
     * @throws Exception
     */
    public void recordRunnerAdvancedInterference(int runnerIndex, String posInvolved) throws Exception {
        moveToNextBase(runnerIndex, new ScoringEvent(posInvolved, ScoringSymbol.RUNNER_ADVANCED));
    }

    /**
     * This method deals with the advancing of the runner to the next base due to a balk.
     *
     * @param runnerIndex The index of the runner that is advancing due to the balk.
     * @throws Exception
     */
    public void recordRunnerAdvancedBalk(int runnerIndex) throws Exception {
        moveToNextBase(runnerIndex, new ScoringEvent(ScoringSymbol.BALK));
    }

    /**
     * This method deals with the advancing of the runner to the next base due to a wild pitch.
     *
     * @param runnerIndex The index of the runner that is advancing due to the wild pitch.
     * @throws Exception
     */
    public void recordRunnerAdvancedWP(int runnerIndex) throws Exception {
        moveToNextBase(runnerIndex, new ScoringEvent(ScoringSymbol.WILD_PITCH));
    }

    /**
     * This method deals with the advancing of the runner to the next base due to a passed ball.
     *
     * @param runnerIndex The index of the runner that is advancing due to the passed ball.
     * @throws Exception
     */
    public void recordRunnerAdvancedPB(int runnerIndex) throws Exception {
        moveToNextBase(runnerIndex, new ScoringEvent(ScoringSymbol.PASSED_BALL));
    }

    /**
     * This method deals with the failure of the runner to advance to the next base.
     *
     * @param runnerIndex The index of the runner whose attempt to advance to the next base failed.
     * @throws Exception
     */
    public void recordRunnerOut(int runnerIndex) throws Exception {
        if (runnerIndex == currentRunnerOnFirstIndex()) {
            playerScorecardBox(runnerIndex,
                    currentGameState().getInning()).setFirstToSecondScoringEvent(
                    new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        } else if (runnerIndex == currentRunnerOnSecondIndex()) {
            playerScorecardBox(runnerIndex,
                    currentGameState().getInning()).setSecondToThirdScoringEvent(
                    new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        } else if (runnerIndex == currentRunnerOnThirdIndex()) {
            playerScorecardBox(runnerIndex,
                    currentGameState().getInning()).setThirdToHomeScoringEvent(
                    new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        } else {
            throw new Exception("The runner is not currently on any base.");
        }
    }

    /**
     * This method records a putout for the player that is currently in the position that is passed
     * as an argument.
     * @param pos The position of the player who made the put out.
     */
    public void recordPutOut(Position pos) {
        currentDefensivePlayer(pos).getStats().getFieldingStats().incrementPutOuts();
    }

    /**
     * This method records an assist for the player that is currently in the position that is
     * passed as an argument.
     * @param pos The position of the player who made the assist.
     */
    public void recordAssist(Position pos) {
        currentDefensivePlayer(pos).getStats().getFieldingStats().incrementAssists();
    }

    /**
     * This method records a wild pitch to the pitcher and catcher's stats.
     */
    public void recordWildPitch() {
        currentPitcherStats().incrementWildPitches();
        currentCatcherStats().incrementWpCatching();
        recordGameState();
    }

    /**
     * This method records a passed ball to the catcher's stats.
     */
    public void recordPassedBall() {
        currentCatcherStats().incrementPassedBalls();
        recordGameState();
    }

    /**
     * This method records a pick off of the base runner whose index is passed as an argument.
     * @param posInvolved The positions involved in recording the out.
     * @param runnerIndex The index of the base runner.
     * @throws Exception
     */
    public void recordRunnerPickOff(String posInvolved, int runnerIndex) throws Exception {
        currentPitcherStats().incrementPickOffs();
        if (runnerIndex == currentRunnerOnFirstIndex()) {
            playerScorecardBox(runnerIndex, currentGameState().getInning()).setFirstToSecondScoringEvent(
                    new ScoringEvent(posInvolved, ScoringSymbol.PICKED_OFF,
                            currentGameState().getNumOuts() + 1)); // record the picked off event
            currentGameState().setCurrRunnerFirstIndex(-1); // empty the base
        } else if (runnerIndex == currentRunnerOnSecondIndex()) {
            playerScorecardBox(runnerIndex, currentGameState().getInning()).setSecondToThirdScoringEvent(
                    new ScoringEvent(posInvolved, ScoringSymbol.PICKED_OFF,
                            currentGameState().getNumOuts() + 1)); // record the picked off event
            currentGameState().setCurrRunnerFirstIndex(-1); // empty the base
        } else if (runnerIndex == currentRunnerOnSecondIndex()) {
            playerScorecardBox(runnerIndex, currentGameState().getInning()).setThirdToHomeScoringEvent(
                    new ScoringEvent(posInvolved, ScoringSymbol.PICKED_OFF,
                            currentGameState().getNumOuts() + 1)); // record the picked off event
            currentGameState().setCurrRunnerFirstIndex(-1); // empty the base
        }
        recordOut(); // increment the number of outs
        recordGameState(); // record the game state
    }

    /**
     * This method records a pick off that is also considered a caught stealing event.
     * @param runnerIndex The index of the base runner that is picked off.
     * @param posInvolved The positions involved in recording the out.
     * @throws Exception
     */
    public void recordRunnerPickoffCaughtStealing(int runnerIndex, String posInvolved) throws Exception {
        currentPitcherStats().incrementPickOffs(); // Increment the pitcher's pick off stat
        Player runner = offensivePlayer(runnerIndex); // player object
        runner.getStats().getRunningStats().incrementCaughtStealing(); // Increment runner's caught stealing stat
        if (runnerIndex == currentRunnerOnFirstIndex()) {
            playerScorecardBox(runnerIndex, currentGameState().getInning()).setFirstToSecondScoringEvent(
                    new ScoringEvent(posInvolved, ScoringSymbol.CAUGHT_STEALING,
                            currentGameState().getNumOuts() + 1)); // record the caught stealing event
            currentGameState().setCurrRunnerFirstIndex(-1); // empty the base
        } else if (runnerIndex == currentRunnerOnSecondIndex()) {
            playerScorecardBox(runnerIndex, currentGameState().getInning()).setSecondToThirdScoringEvent(
                    new ScoringEvent(posInvolved, ScoringSymbol.CAUGHT_STEALING,
                            currentGameState().getNumOuts() + 1)); // record the caught stealing event
            currentGameState().setCurrRunnerFirstIndex(-1); // empty the base
        } else if (runnerIndex == currentRunnerOnSecondIndex()) {
            playerScorecardBox(runnerIndex, currentGameState().getInning()).setThirdToHomeScoringEvent(
                    new ScoringEvent(posInvolved, ScoringSymbol.CAUGHT_STEALING,
                            currentGameState().getNumOuts() + 1)); // record the caught stealing event
            currentGameState().setCurrRunnerFirstIndex(-1); // empty the base
        }
        recordOut(); // increment the number of outs
        recordGameState(); // record the game state
    }

    /**
     * This method records an unassisted play where the fielder fields a ground ball and then makes
     * an out.
     * @param position The position that records the out.
     * @throws Exception
     */
    public void recordUnassistedPutOut(String position) throws Exception {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentPitcherStats().incrementGroundOuts(); // increment ground outs
        currentBatterStats().incrementGroundOuts(); // increment ground outs
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(position, ScoringSymbol.UNASSISTED_PUTOUT, currentGameState().getNumOuts() + 1));
        recordOut();
        recordGameState();
        nextBatter();
    }

    /**
     * This method records a Fielder's Choice for the batter and updates the pitcher's and batter's
     * stats. It does not record an out.
     *
     * @param posInvolved The positions involved in the fielder's choice.
     * @throws Exception
     */
    public void recordFieldersChoice(String posInvolved) throws Exception {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentPitcherStats().incrementGroundOuts(); // increment ground outs
        currentBatterStats().incrementGroundOuts(); // increment ground outs
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(posInvolved, ScoringSymbol.FIELDERS_CHOICE));
        recordGameState();
        nextBatter();
    }

    public void recordBatterReachedOnError(String posInvolved) {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(posInvolved, ScoringSymbol.ERROR));
        currentGameState().setCurrRunnerFirstIndex(currentBatterIndex()); // move the batter to first base
        recordGameState();
        nextBatter();
    }

    /**
     * This method records runner interference. That is interference that the runner has caused and
     * in having done so is called out by the umpire.
     * @param runnerIndex The index of the runner that caused in the interference.
     * @param posInvolved The positions that are interfered with.
     * @throws Exception
     */
    public void recordRunnerInterference(int runnerIndex, String posInvolved) throws Exception {
        if (runnerIndex == currentRunnerOnFirstIndex()) {
            playerScorecardBox(runnerIndex, currentGameState().getInning()).setFirstToSecondScoringEvent(
                    new ScoringEvent(posInvolved, ScoringSymbol.INTERFERENCE,
                            currentGameState().getNumOuts() + 1)); // record the picked off event
            currentGameState().setCurrRunnerFirstIndex(-1); // empty the base
        } else if (runnerIndex == currentRunnerOnSecondIndex()) {
            playerScorecardBox(runnerIndex, currentGameState().getInning()).setSecondToThirdScoringEvent(
                    new ScoringEvent(posInvolved, ScoringSymbol.INTERFERENCE,
                            currentGameState().getNumOuts() + 1)); // record the picked off event
            currentGameState().setCurrRunnerFirstIndex(-1); // empty the base
        } else if (runnerIndex == currentRunnerOnSecondIndex()) {
            playerScorecardBox(runnerIndex, currentGameState().getInning()).setThirdToHomeScoringEvent(
                    new ScoringEvent(posInvolved, ScoringSymbol.INTERFERENCE,
                            currentGameState().getNumOuts() + 1)); // record the picked off event
            currentGameState().setCurrRunnerFirstIndex(-1); // empty the base
        }
        recordOut(); // increment the number of outs
        recordGameState(); // record the game state
    }

    /**
     * This method records interference that the batter causes and subsequently is called out.
     * @throws Exception
     */
    public void recordBatterInterference() throws Exception {
        currentGameState().incrementPitchCount(); // increment the game state's pitch count
        currentPitcherStats().incrementNumPitches(); // increment the pitcher's pitches
        currentBatterStats().incrementNumPitches(); // increment the batter's pitches
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent("2", ScoringSymbol.INTERFERENCE, currentGameState().getNumOuts() + 1));
        recordOut();
        recordGameState();
        nextBatter();
    }

    /**
     * This method records an out made on the field. It auto adjusts the half innings and innings.
     * @throws Exception
     */
    public void recordOut() throws Exception {
        currentPitcherStats().incrementNumOutsPitched();
        if (currentGameState().getNumOuts() < 3) {
            currentGameState().incrementOuts();
        } else {
            currentGameState().nextHalfInning();
        }
    }

    /**
     * This method finds the current home lineup.
     * @return A Lineup object that reflects the home team's players currently in the game.
     */
    public Lineup currentHomeLineup() {
        return getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getHomeLineup();
    }

    /**
     * This method finds the current away lineup.
     * @return A Lineup object that reflects the away team's players currently in the game.
     */
    public Lineup currentAwayLineup() {
        return getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getAwayLineup();
    }

    public Player homePlayerAtPos(Position pos) {
        int homePlayerIndex = currentHomeLineup().positionsRosterIndex(pos);
        return getGame().getHomeTeam().getRoster().get(homePlayerIndex);
    }

    public Player awayPlayerAtPos(Position pos) {
        int awayPlayerIndex = currentAwayLineup().positionsRosterIndex(pos);
        return getGame().getAwayTeam().getRoster().get(awayPlayerIndex);
    }

    public Player currentDefensivePlayer(Position pos) {
        if (currentGameState().isTop()) {
            return homePlayerAtPos(pos);
        }
        return awayPlayerAtPos(pos);
    }

    public Player currentHomeBatter() {
        return getGame().getHomeTeam().getRoster().get(currentGameState().getCurrHomeBatterIndex());
    }

    public Player currentAwayBatter() {
        return getGame().getAwayTeam().getRoster().get(currentGameState().getCurrAwayBatterIndex());
    }

    public Player currentBatter() {
        if (currentGameState().isTop()) {
            return currentAwayBatter();
        }
        return currentHomeBatter();
    }

    public int currentBatterIndex() {
        if (currentGameState().isTop()) {
            return currentGameState().getCurrAwayBatterIndex();
        }
        return currentGameState().getCurrHomeBatterIndex();
    }

    public Player previousBatter() {
        if (getGame().getGameStateList().get(getGame().getGameStateList().size() - 2).isTop()) {
            return getGame().getAwayTeam().getRoster().get(previousBatterIndex());
        }
        return getGame().getHomeTeam().getRoster().get(previousBatterIndex());
    }

    public int previousBatterIndex() {
        if (getGame().getGameStateList().get(getGame().getGameStateList().size() - 2).isTop()) {
            return getGame().getGameStateList().get(getGame().getGameStateList().size() - 2).getCurrAwayBatterIndex();
        }
        return getGame().getGameStateList().get(getGame().getGameStateList().size() - 2).getCurrHomeBatterIndex();
    }

    public Player currentPitcher() {
        if (currentGameState().isTop()) {
            return homePlayerAtPos(Position.PITCHER);
        }
        return awayPlayerAtPos(Position.PITCHER);
    }

    public Player currentCatcher() {
        if (currentGameState().isTop()) {
            return homePlayerAtPos(Position.CATCHER);
        }
        return awayPlayerAtPos(Position.CATCHER);
    }

    public int playerBattingOrderIndex(int playerIndex) {
        if (currentGameState().isTop()) {
            return getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getAwayLineup().getBattingOrderIndex(playerIndex);
        }
        return getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getHomeLineup().getBattingOrderIndex(playerIndex);
    }

    public int homePlayerIndex(Player homePlayer) {
        ArrayList<Player> roster = getGame().getHomeTeam().getRoster();
        for (int i = 0; i < roster.size(); i++) {
            if (roster.get(i).equals(homePlayer)) {
                return i;
            }
        }
        return -1;
    }

    public int awayPlayerIndex(Player awayPlayer) {
        ArrayList<Player> roster = getGame().getAwayTeam().getRoster();
        for (int i = 0; i < roster.size(); i++) {
            if (roster.get(i).equals(awayPlayer)) {
                return i;
            }
        }
        return -1;
    }

    public Player homePlayer(int playerIndex) {
        return getGame().getHomeTeam().getRoster().get(playerIndex);
    }

    public Player awayPlayer(int playerIndex) {
        return getGame().getAwayTeam().getRoster().get(playerIndex);
    }

    public Player offensivePlayer(int playerIndex) {
        if (currentGameState().isTop()) {
            return awayPlayer(playerIndex);
        }
        return homePlayer(playerIndex);
    }

    public int offensivePlayerIndex(Player player) {
        if (currentGameState().isTop()) {
            return awayPlayerIndex(player);
        }
        return homePlayerIndex(player);
    }

    public Player defensivePlayer(int playerIndex) {
        if (currentGameState().isTop()) {
            return homePlayer(playerIndex);
        }
        return awayPlayer(playerIndex);
    }

    public int defensivePlayerIndex(Player player) {
        if (currentGameState().isTop()) {
            return homePlayerIndex(player);
        }
        return awayPlayerIndex(player);
    }

    public ScorecardBox playerScorecardBox(int playerIndex, int inning) {
        return currentScorecard().playerScorecardBox(offensivePlayerIndex(offensivePlayer(playerIndex)), currentGameState().getInning());
    }

    public ScorecardBox currentBatterScorecardBox() {
        return currentScorecard().currentBatterScorecardBox();
    }

    public GameState currentGameState() {
        return getGame().getCurrentGameState();
    }

    public Scorecard currentScorecard() {
        return getGame().getScorecard();
    }

    public Player currentRunnerOnFirst() {
        if (currentGameState().isTop()) {
            return getGame().getAwayTeam().getRoster().get(currentGameState().getCurrRunnerFirstIndex());
        }
        return getGame().getHomeTeam().getRoster().get(currentGameState().getCurrRunnerFirstIndex());
    }

    public int currentRunnerOnFirstIndex() {
        return currentGameState().getCurrRunnerFirstIndex();
    }

    public Player currentRunnerOnSecond() {
        if (currentGameState().isTop()) {
            return getGame().getAwayTeam().getRoster().get(currentGameState().getCurrRunnerSecondIndex());
        }
        return getGame().getHomeTeam().getRoster().get(currentGameState().getCurrRunnerSecondIndex());
    }

    public int currentRunnerOnSecondIndex() {
        return currentGameState().getCurrRunnerSecondIndex();
    }

    public Player currentRunnerOnThird() {
        if (currentGameState().isTop()) {
            return getGame().getAwayTeam().getRoster().get(currentGameState().getCurrRunnerThirdIndex());
        }
        return getGame().getHomeTeam().getRoster().get(currentGameState().getCurrRunnerThirdIndex());
    }

    public int currentRunnerOnThirdIndex() {
        return currentGameState().getCurrRunnerThirdIndex();
    }

    public void nextBatter() {
        clearCount();
        currentGameState().nextBatter();
        currentScorecard().setCurrRow(currentScorecard().getCurrRow() + 1);
        currentScorecard().setCurrCol(currentGameState().getInning() - 1);
    }

    public void recordGameState() {
        getGame().newGameState();
    }

    public void recordBatterEvent(ScoringEvent event) {
        currentScorecard().currentBatterScorecardBox().setBatterScoringEvent(event);
    }

    public void clearCount() {
        currentGameState().clearCount();
    }

    /**
     * This method must be implemented after plateAppearanceFinished()
     *
     * @throws Exception
     */
    public void incrementOuts() throws Exception {
        currentGameState().incrementOuts();
    }

    public HittingStats currentBatterStats() {
        if (currentBatter().isSwitchHitter()) {
            if (currentPitcher().isThrowRight()) {
                return currentBatter().getStats().getHitStatsLeft();
            }
            if (currentPitcher().isThrowLeft()) {
                return currentBatter().getStats().getHitStatsRight();
            }
        }
        if (currentBatter().isBatRight()) {
            return currentBatter().getStats().getHitStatsRight();
        }
        return currentBatter().getStats().getHitStatsLeft();
    }

    public PitchingStats currentPitcherStats() {
        if (currentPitcher().isThrowRight()) {
            return currentPitcher().getStats().getPitchStatsRight();
        }
        return currentPitcher().getStats().getPitchStatsLeft();
    }

    public FieldingStats currentCatcherStats() {
        return currentCatcher().getStats().getFieldingStats();
    }

    public int currNumBaserunners() {
        int num = 0;
        if (isBaseOccupied(1)) {
            num++;
        } else if (isBaseOccupied(2)) {
            num++;
        } else if (isBaseOccupied(3)) {
            num++;
        }
        return num;
    }

    public boolean isBaseOccupied(int baseNumber) {
        switch (baseNumber) {
            case 1:
                return currentRunnerOnFirstIndex() != -1;
            case 2:
                return currentRunnerOnSecondIndex() != -1;
            case 3:
                return currentRunnerOnThirdIndex() != -1;
            case 4:
                return false;
            default:
                return true;
        }
    }

    public void moveToNextBase(int runnerIndex, ScoringEvent scoringEvent) throws Exception {
        // Record the GameState before the stolen base.

        // Advance the runner to the next base if it is not occupied.
        int base = 0;
        if (runnerIndex == currentRunnerOnFirstIndex()) {
            base = 1;
        } else if (runnerIndex == currentRunnerOnSecondIndex()) {
            base = 2;
        } else if (runnerIndex == currentRunnerOnThirdIndex()) {
            base = 3;
        } else {
            throw new Exception("The runner is not on any base.");
        }
        boolean isNextOccupied = isBaseOccupied(base + 1);
        if (!isNextOccupied) {
            ScorecardBox player = playerScorecardBox(runnerIndex, currentGameState().getInning());
            switch (base) {
                case 1:
                    currentGameState().setCurrRunnerFirstIndex(-1);
                    currentGameState().setCurrRunnerSecondIndex(runnerIndex);
                    player.setFirstToSecondScoringEvent(scoringEvent);
                    break;
                case 2:
                    currentGameState().setCurrRunnerSecondIndex(-1);
                    currentGameState().setCurrRunnerThirdIndex(runnerIndex);
                    player.setSecondToThirdScoringEvent(scoringEvent);
                    break;
                case 3:
                    currentGameState().setCurrRunnerThirdIndex(-1);
                    player.setThirdToHomeScoringEvent(scoringEvent);
                    currentGameState().incrementRuns();
                    break;
            }
            recordGameState();
        } else {
            throw new Exception("The next base is occupied. You must handle that base runner" +
                    " before you can handle this one.");
        }

    }

    public void recordLocation() {

    }
}
