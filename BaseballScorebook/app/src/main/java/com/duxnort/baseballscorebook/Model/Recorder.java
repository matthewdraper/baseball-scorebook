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

    public void recordStrike() throws Exception {
        // if there are currently less than 2 strikes
        if (currentGameState().getStrikeCount() < 2) {
            currentPitcherStats().incrementNumPitches(); // update pitcher number of pitches
            currentBatterStats().incrementNumPitches(); // update batter number of pitches
            currentGameState().incrementStrikes(); // update game state number of strikes
            recordGameState(); // record game state
        }
    }

    public void recordBall() throws Exception {
        // If there are currently less than 3 balls
        if (currentGameState().getBallCount() < 3) {
            currentPitcherStats().incrementNumPitches(); // update pitcher
            currentBatterStats().incrementNumPitches(); // update batter
            currentGameState().incrementBalls(); // update game state number of balls
            recordGameState(); // record game state
        }
    }

    public void recordSingle() {
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
    }

    public void recordDouble() {
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
    }

    public void recordTriple() {
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
    }

    public void recordHomeRun(boolean isBatterEarned, boolean isFirstEarned, boolean isSecondEarned, boolean isThirdEarned) {
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

    public void recordStolenBase(int runnerIndex, boolean earnedRun) {
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

    public void recordRunBattedIn() {
        currentBatterStats().incrementRbis(); // increment the current batter's rbis
    }

    public void recordWalk() throws Exception {
        // If first base is empty
        if (!isBaseOccupied(1)) {
            currentPitcherStats().incrementWalks(); // increment the pitcher's walks
            currentBatterStats().incrementWalks(); // increment the batter's walks
            currentGameState().setCurrRunnerFirstIndex(currentBatterIndex()); // move the batter to first base
            currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.WALK)); // record the event
        } else {
            throw new Exception("First base is not empty. You must handle other base runners before you record the walk.");
        }
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

    public void recordIntentionalWalk() throws Exception {
        // If first base is empty
        if (!isBaseOccupied(1)) {
            currentPitcherStats().incrementIntenWalks(); // increment the pitcher's intentional walks
            currentBatterStats().incrementIntenWalks(); // increment the batter's intentional walks
            currentGameState().setCurrRunnerFirstIndex(currentBatterIndex()); // move the batter to first base
            currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.INTENTIONAL_WALK)); // record the event
        } else {
            throw new Exception("First base is not empty. You must handle other base runners before you record the intentional walk.");
        }
        recordGameState(); // record the game state
        nextBatter(); // next batter up
    }

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
        currentGameState().incrementOuts(); // increment the number of outs
        recordGameState(); // record the game state
    }

    public void recordStrikeOutLooking() throws Exception {
        recordGameState();
        currentPitcherStats().incrementStrikeOutLook();
        currentBatterStats().incrementStrikeOuts();
        currentCatcherStats().incrementPutOuts();
        currentScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.STRIKEOUT_LOOKING, currentGameState().getNumOuts() + 1));
        recordOut();
    }

    public void recordStrikeOutSwinging() throws Exception {
        recordGameState();
        currentPitcherStats().incrementStrikeOutSwing();
        currentBatterStats().incrementStrikeOuts();
        currentCatcherStats().incrementPutOuts();
        currentScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.STRIKEOUT_SWINGING, currentGameState().getNumOuts() + 1));
        recordOut();
    }

    public void recordHitByPitch(boolean earnedRun) {
//        recordGameState();
//        // Record stats for the pitcher
//        currentPitcherStats().incrementHitBatsmen();
//        // Record stats for the batter
//        currentBatterStats().incrementHitByPitch();
//        // If the bases are loaded
//        if (currentGameState().getCurrRunnerThirdIndex() != -1 &&
//                currentGameState().getCurrRunnerSecondIndex() != -1 &&
//                currentGameState().getCurrRunnerFirstIndex() != -1) {
//            currentScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
//            currentGameState().incrementScore();
//            currentRunnerOnThird().getStats().getRunningStats().incrementRuns();
//            currentGameState().clearRunnerOnThird();
//            recordRunBattedIn();
//            if (earnedRun) {
//                currentPitcherStats().incrementEarnedRuns();
//            } else {
//                currentPitcherStats().incrementRuns();
//            }
//        }
//        // If there are runners on first and second
//        if (currentGameState().getCurrRunnerSecondIndex() != -1 &&
//                currentGameState().getCurrRunnerFirstIndex() != -1) {
//            moveToNextBase(currentGameState().getCurrRunnerSecondIndex(), ScoringSymbol.RUNNER_ADVANCED);
//        }
//        // If there is a runner on first
//        if (currentGameState().getCurrRunnerFirstIndex() != -1) {
//            moveToNextBase(currentGameState().getCurrRunnerFirstIndex(), ScoringSymbol.RUNNER_ADVANCED);
//        }
//        // If first base is empty
//        moveToNextBase(currentGameState().getCurrBatterIndex(), ScoringSymbol.HIT_BY_PITCH);
    }

    public void recordSacrificeBunt(String positionsInvolved) throws Exception {

        currentPitcherStats().incrementSacBunts();
        currentBatterStats().incrementSacBunts();
        recordImpliedFieldingStats(positionsInvolved);
        currentScorecard().currentBatterScorecardBox().setBatterScoringEvent(
                new ScoringEvent(positionsInvolved, ScoringSymbol.SACRIFICE_BUNT,
                        currentGameState().getNumOuts() + 1));
        recordOut();
        recordGameState();
    }

    public void recordSacrificeFly(String positionsInvolved, boolean isEarnedRun) throws Exception {

        if (isEarnedRun) {
            currentPitcherStats().incrementEarnedRuns();
        } else {
            currentPitcherStats().incrementRuns();
        }
        currentPitcherStats().incrementTotalNumBF();
        currentBatterStats().incrementSacBunts();
        recordImpliedFieldingStats(positionsInvolved);
        currentScorecard().currentBatterScorecardBox().setBatterScoringEvent(
                new ScoringEvent(positionsInvolved, ScoringSymbol.SACRIFICE_FLY,
                        currentGameState().getNumOuts() + 1));
        recordOut();
        recordLocation();
        recordGameState();
    }

    public void recordRegularGroundBallDoublePlay(String positionsInvolved, int baseRunnerIndex, boolean wasBatterFirstOut) throws Exception {
        recordNonRegularGroundBallDoublePlay(positionsInvolved, positionsInvolved.charAt(positionsInvolved.length() - 2) + "", baseRunnerIndex, wasBatterFirstOut);
    }

    public void recordNonRegularGroundBallDoublePlay(String positionsInvolved, String firstPutout, int baseRunnerIndex, boolean wasBatterFirstOut) throws Exception {
        recordGameState();
        currentPitcherStats().incrementInducedGBDPs();
        currentBatterStats().incrementGroundBallDP();
        recordPutOut(Position.positionFromInt(Integer.parseInt(positionsInvolved.charAt(positionsInvolved.length() - 1) + "")));
        recordPutOut(Position.positionFromInt(Integer.parseInt(firstPutout)));
        for (int i = 0; i < positionsInvolved.length() - 1; i++) {
            recordAssist(Position.positionFromInt(Integer.parseInt(positionsInvolved.charAt(i) + "")));
        }
        if (wasBatterFirstOut) {
            currentScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.DOUBLE_PLAY, currentGameState().getNumOuts() + 1));
            //Record Second out at the base that the runner was heading to. Use runner index to find what base the runner is on.
            if (currentGameState().getCurrRunnerThirdIndex() == baseRunnerIndex) {
                currentScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 2));
            } else if (currentGameState().getCurrRunnerSecondIndex() == baseRunnerIndex) {
                currentScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 2));
            } else if (currentGameState().getCurrRunnerFirstIndex() == baseRunnerIndex) {
                currentScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 2));
            }
        } else {
            currentScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.DOUBLE_PLAY, currentGameState().getNumOuts() + 2));
            //Record Second out at the base that the runner was heading to. Use runner index to find what base the runner is on.
            if (currentGameState().getCurrRunnerThirdIndex() == baseRunnerIndex) {
                currentScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
            } else if (currentGameState().getCurrRunnerSecondIndex() == baseRunnerIndex) {
                currentScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
            } else if (currentGameState().getCurrRunnerFirstIndex() == baseRunnerIndex) {
                currentScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
            }
        }
        recordOut();
        recordOut();
    }

    public void recordGroundBallOut(String positionsInvolved) throws Exception {
        currentPitcherStats().incrementGroundOuts();
        currentBatterStats().incrementGroundOuts();
        recordImpliedFieldingStats(positionsInvolved);
        currentScorecard().currentBatterScorecardBox().setBatterScoringEvent(
                new ScoringEvent(positionsInvolved, ScoringSymbol.GROUNDOUT,
                        currentGameState().getNumOuts() + 1));
        recordOut();
        recordLocation();
        recordGameState();
    }

    public void recordFlyBallOut(String positionsInvolved) throws Exception {
        currentPitcherStats().incrementGroundOuts();
        currentBatterStats().incrementGroundOuts();
        recordImpliedFieldingStats(positionsInvolved);
        currentScorecard().currentBatterScorecardBox().setBatterScoringEvent(
                new ScoringEvent(positionsInvolved, ScoringSymbol.FLYOUT,
                        currentGameState().getNumOuts() + 1));
        recordOut();
        recordLocation();
        recordGameState();
    }

    public void recordImpliedFieldingStats(String positionsInvolved) {
        recordPutOut(Position.positionFromInt(Integer.parseInt(positionsInvolved.charAt(positionsInvolved.length() - 1) + "")));
        for (int i = 0; i < positionsInvolved.length() - 1; i++) {
            recordAssist(Position.positionFromInt(Integer.parseInt(positionsInvolved.charAt(i) + "")));
        }
    }

    public void recordPutOut(Position pos) {
        currentDefensivePlayer(pos).getStats().getFieldingStats().incrementPutOuts();
    }

    public void recordAssist(Position pos) {
        currentDefensivePlayer(pos).getStats().getFieldingStats().incrementAssists();
    }

    public void recordWildPitch() {
        currentPitcherStats().incrementWildPitches();
        currentCatcherStats().incrementWpCatching();
    }

    public void recordPassedBall() {
        currentCatcherStats().incrementPassedBalls();
    }

    public void recordBalk() {
        currentPitcherStats().incrementBalks();
    }

    public void recordPickOff(String positionsInvolved, int baseRunnerIndex) throws Exception {
        currentPitcherStats().incrementPickOffs();
        recordImpliedFieldingStats(positionsInvolved);
        if (currentGameState().getCurrRunnerThirdIndex() == baseRunnerIndex) {
            currentScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(positionsInvolved, ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        }
        recordOut();
    }

    public void recordUnassistedPutOut(Position pos) {
        recordPutOut(pos);
        // Record in scorebook as unassited.
    }

    public void recordFieldersChoice(String positionsInvolved, int runnerIndex) throws Exception {
        recordGameState();
        currentPitcherStats().incrementGroundOuts();
        currentBatterStats().incrementGroundOuts();
        recordImpliedFieldingStats(positionsInvolved);
        currentScorecard().currentBatterScorecardBox().setBatterScoringEvent((new ScoringEvent(positionsInvolved, ScoringSymbol.FIELDERS_CHOICE)));
        if (runnerIndex == currentGameState().getCurrRunnerThirdIndex()) {
            currentScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        } else if (runnerIndex == currentGameState().getCurrRunnerSecondIndex()) {
            currentScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        } else if (runnerIndex == currentGameState().getCurrRunnerFirstIndex()) {
            currentScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        }
        recordOut();
    }

    public void recordOffensiveInterference(int runnerIndex) throws Exception {
        recordGameState();
        if (runnerIndex == currentGameState().getCurrRunnerThirdIndex()) {
            currentScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        } else if (runnerIndex == currentGameState().getCurrRunnerSecondIndex()) {
            currentScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        } else if (runnerIndex == currentGameState().getCurrRunnerFirstIndex()) {
            currentScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        } else if (runnerIndex == currentGameState().getCurrBatterIndex()) {
            currentScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        }
        recordOut();
    }

    public void recordDefensiveInterference() {

    }

    public void recordCatchersInterference() {
        recordGameState();
        currentCatcherStats().incrementErrors();
        currentPitcherStats().incrementTotalNumBF();
        currentBatterStats().incrementPlateApperance();
        currentScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.INTERFERENCE));
    }

    public void recordFlyOutDoublePlay(String positionsInvolved, String firstPutout, int baseRunnerIndex) throws Exception {
        recordFlyBallOut(positionsInvolved);
        recordAssist(Position.positionFromInt(Integer.parseInt(positionsInvolved.charAt(0) + "")));
        for (int i = 1; i < positionsInvolved.length() - 1; i++) {
            recordAssist(Position.positionFromInt(Integer.parseInt(positionsInvolved.charAt(i) + "")));
        }

        currentScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.DOUBLE_PLAY, currentGameState().getNumOuts()));
        //Record Second out at the base that the runner was heading to. Use runner index to find what base the runner is on.
        if (currentGameState().getCurrRunnerThirdIndex() == baseRunnerIndex) {
            currentScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        } else if (currentGameState().getCurrRunnerSecondIndex() == baseRunnerIndex) {
            currentScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        } else if (currentGameState().getCurrRunnerFirstIndex() == baseRunnerIndex) {
            currentScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, currentGameState().getNumOuts() + 1));
        }

        recordOut();
    }

    public void recordGroundBallTriplePlay(String positionsInvolved, String firstPutout, int firstRunnerOutIndex, int secondRunnerOutIndex, int thirdRunnerOutIndex) {
        recordGameState();
        currentPitcherStats().incrementInducedGBDPs();
        currentBatterStats().incrementGroundBallDP();

    }

    public void recordOut() throws Exception {
        currentPitcherStats().incrementNumOutsPitched();
        if (currentGameState().getNumOuts() < 3) {
            currentGameState().incrementOuts();
        } else {
            currentGameState().nextHalfInning();
        }
    }

    public Lineup currentHomeLineup() {
        return getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getHomeLineup();
    }

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

    public int currentNumberOfBaserunners() {
        return 0;
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

    public void moveToNextBase(int runnerIndex, ScoringEvent scoringEvent) {
        // Record the GameState before the stolen base.

        // Advance the runner to the next base if it is not occupied.
        int base = 0;
        if (runnerIndex == currentRunnerOnFirstIndex()) {
            base = 1;
        } else if (runnerIndex == currentRunnerOnSecondIndex()) {
            base = 2;
        } else if (runnerIndex == currentRunnerOnThirdIndex()) {
            base = 3;
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
                    break;
            }
        }

        recordGameState();
    }

    public void recordLocation() {

    }
}
