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
        if (currentGameState().getStrikeCount() < 2) {
            currentPitcherStats().incrementNumPitches();
            currentBatterStats().incrementNumPitches();
            currentGameState().incrementStrikes();
            recordGameState();
        }
    }

    public void recordBall() throws Exception {
        if (currentGameState().getBallCount() < 3) {
            currentPitcherStats().incrementNumPitches();
            currentBatterStats().incrementNumPitches();
            currentGameState().incrementBalls();
            recordGameState();
        }
    }

    public void recordSingle() {
        currentGameState().incrementPitchCount();
        currentPitcherStats().incrementSingles();
        currentBatterStats().incrementSingles();
        currentPitcherStats().incrementNumPitches();
        currentBatterStats().incrementNumPitches();
        recordLocation();
        recordBatterEvent(new ScoringEvent(ScoringSymbol.SINGLE));
        // TODO: 8/19/16 Need to figure out how to deal with the other base runners before scoring
        // TODO: 8/19/16 the single.
        currentGameState().setCurrRunnerFirstIndex(currentBatterIndex());
        currentGameState().incrementHits();
        recordGameState();
        nextBatter();
    }

    public void recordDouble() {
        currentGameState().incrementPitchCount();
        currentPitcherStats().incrementDoubles();
        currentBatterStats().incrementDoubles();
        currentPitcherStats().incrementNumPitches();
        currentBatterStats().incrementNumPitches();
        recordLocation();
        recordBatterEvent(new ScoringEvent(ScoringSymbol.DOUBLE));
        // TODO: 8/19/16 Need to figure out how to deal with the other base runners before scoring
        // TODO: 8/19/16 the single.
        currentGameState().setCurrRunnerSecondIndex(currentBatterIndex());
        currentGameState().incrementHits();
        recordGameState();
        nextBatter();
    }

    public void recordTriple() {
        currentGameState().incrementPitchCount();
        currentPitcherStats().incrementTriples();
        currentBatterStats().incrementTriples();
        currentPitcherStats().incrementNumPitches();
        currentBatterStats().incrementNumPitches();
        recordLocation();
        recordBatterEvent(new ScoringEvent(ScoringSymbol.TRIPLE));
        // TODO: 8/19/16 Need to figure out how to deal with the other base runners before scoring
        // TODO: 8/19/16 the single.
        currentGameState().setCurrRunnerThirdIndex(currentBatterIndex());
        currentGameState().incrementHits();
        recordGameState();
        nextBatter();
    }

    public void recordHomeRun(boolean isBatterEarned, boolean isFirstEarned, boolean isSecondEarned, boolean isThirdEarned) {
        currentGameState().incrementPitchCount();
        currentPitcherStats().incrementHomeRuns();
        currentBatterStats().incrementHomeRuns();
        currentPitcherStats().incrementNumPitches();
        currentBatterStats().incrementNumPitches();
        currentBatter().getStats().getRunningStats().incrementRuns();
        recordLocation();
        currentGameState().incrementHits();
        currentGameState().incrementRuns();
        // If batter is earned run
        if (isBatterEarned) {
            currentPitcherStats().incrementEarnedRuns();
        } else {
            currentPitcherStats().incrementRuns();
        }

        // If there is a runner on third
        if (isBaseOccupied(3)) {
            currentRunnerOnThird().getStats().getRunningStats().incrementRuns();
            currentGameState().incrementRuns();
            recordRunBattedIn();
            moveToNextBase(currentRunnerOnThirdIndex(), new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
            // If it is an earned run
            if (isThirdEarned) {
                currentPitcherStats().incrementEarnedRuns();
            } else {
                currentPitcherStats().incrementRuns();
            }
        }
        // If there is a runner on second
        if (isBaseOccupied(2)) {
            currentRunnerOnSecond().getStats().getRunningStats().incrementRuns();
            currentGameState().incrementRuns();
            recordRunBattedIn();
            moveToNextBase(currentRunnerOnSecondIndex(), new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
            moveToNextBase(currentRunnerOnThirdIndex(), new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
            // If it is an earned run
            if (isSecondEarned) {
                currentPitcherStats().incrementEarnedRuns();
            } else {
                currentPitcherStats().incrementRuns();
            }
        }
        // If there is a runner on first
        if (isBaseOccupied(1)) {
            currentRunnerOnFirst().getStats().getRunningStats().incrementRuns();
            currentGameState().incrementRuns();
            recordRunBattedIn();
            moveToNextBase(currentRunnerOnSecondIndex(), new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
            moveToNextBase(currentRunnerOnSecondIndex(), new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
            moveToNextBase(currentRunnerOnThirdIndex(), new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
            // If it is an earned run
            if (isFirstEarned) {
                currentPitcherStats().incrementEarnedRuns();
            } else {
                currentPitcherStats().incrementRuns();
            }
        }
        currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.HOMERUN));
        recordGameState();
        nextBatter();
    }

    public void recordStolenBase(int runnerIndex, boolean earnedRun) {
        Player runner = offensivePlayer(runnerIndex);
        moveToNextBase(runnerIndex, new ScoringEvent(ScoringSymbol.STOLEN_BASE));
        if (runnerIndex == currentRunnerOnThirdIndex()) {
            if (earnedRun) {
                currentPitcherStats().incrementEarnedRuns();
            } else {
                currentPitcherStats().incrementRuns();
            }
        }
        currentPitcherStats().incrementStolenBases();
        currentCatcherStats().incrementStolenBases();
        runner.getStats().getRunningStats().incrementStolenBases();
        recordGameState();
    }

    public void recordRunBattedIn() {
        currentBatterStats().incrementRbis();
    }

    public void recordWalk() throws Exception {
        // If first base is empty
        if (!isBaseOccupied(1)) {
            currentPitcherStats().incrementWalks();
            currentBatterStats().incrementWalks();
            currentGameState().setCurrRunnerFirstIndex(currentBatterIndex());
            currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.WALK));
        } else {
            throw new Exception("First base is not empty. You must handle other base runners before you record the walk.");
        }
        recordGameState();
        nextBatter();
    }

    public void recordIntentionalWalk() throws Exception {
        // If first base is empty
        if (!isBaseOccupied(1)) {
            currentPitcherStats().incrementIntenWalks();
            currentBatterStats().incrementIntenWalks();
            currentGameState().setCurrRunnerFirstIndex(currentBatterIndex());
            currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.INTENTIONAL_WALK));
        } else {
            throw new Exception("First base is not empty. You must handle other base runners before you record the intentional walk.");
        }
        recordGameState();
        nextBatter();
    }

    public void recordCaughtStealing(int runnerIndex, String posInvolved) throws Exception {
        recordGameState();
        currentPitcherStats().incrementCaughtStealing();
        currentCatcherStats().incrementCaughtStealing();
        if (runnerIndex == currentGameState().getCurrRunnerFirstIndex()) {
            currentRunnerOnFirst().getStats().getRunningStats().incrementCaughtStealing();
            // Failed to advance
            currentScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(posInvolved, ScoringSymbol.CAUGHT_STEALING, currentGameState().getNumOuts() + 1));
        } else if (runnerIndex == currentGameState().getCurrRunnerSecondIndex()) {
            currentRunnerOnSecond().getStats().getRunningStats().incrementCaughtStealing();
            currentScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(posInvolved, ScoringSymbol.CAUGHT_STEALING, currentGameState().getNumOuts() + 1));
        } else if (runnerIndex == currentGameState().getCurrRunnerThirdIndex()) {
            currentRunnerOnThird().getStats().getRunningStats().incrementCaughtStealing();
            currentScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(posInvolved, ScoringSymbol.CAUGHT_STEALING, currentGameState().getNumOuts() + 1));
        }
        recordOut();
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
