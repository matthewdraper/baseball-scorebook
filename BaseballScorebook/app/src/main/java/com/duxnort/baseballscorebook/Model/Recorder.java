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
        recordBatterEvent(new ScoringEvent(ScoringSymbol.HOMERUN));
        currentGameState().incrementHits();
        for (int i = 0; i < currentNumberOfBaserunners(); i++) {
            // Increment the score and RBIs
            currentGameState().incrementScore();
            recordRunBattedIn();
        }
        // Update the runners' and pitcher's runs stat.
        if (currentGameState().isTop()) {
            if (currentGameState().getCurrRunnerFirstIndex() != -1) {
                getGame().getAwayTeam().getRoster().get(currentGameState().getCurrRunnerFirstIndex()).getStats().getRunningStats().incrementRuns();
                currentGameState().incrementRuns();
                if (isFirstEarned) {
                    currentPitcherStats().incrementEarnedRuns();
                } else {
                    currentPitcherStats().incrementRuns();
                }
            }
            if (currentGameState().getCurrRunnerSecondIndex() != -1) {
                getGame().getAwayTeam().getRoster().get(currentGameState().getCurrRunnerSecondIndex()).getStats().getRunningStats().incrementRuns();
                currentGameState().incrementRuns();
                if (isSecondEarned) {
                    currentPitcherStats().incrementEarnedRuns();
                } else {
                    currentPitcherStats().incrementRuns();
                }
            }
            if (currentGameState().getCurrRunnerThirdIndex() != -1) {
                getGame().getAwayTeam().getRoster().get(currentGameState().getCurrRunnerThirdIndex()).getStats().getRunningStats().incrementRuns();
                currentGameState().incrementRuns();
                if (isThirdEarned) {
                    currentPitcherStats().incrementEarnedRuns();
                } else {
                    currentPitcherStats().incrementRuns();
                }
            }
        } else {
            if (currentGameState().getCurrRunnerFirstIndex() != -1) {
                getGame().getHomeTeam().getRoster().get(currentGameState().getCurrRunnerFirstIndex()).getStats().getRunningStats().incrementRuns();
                currentGameState().incrementRuns();
                if (isFirstEarned) {
                    currentPitcherStats().incrementEarnedRuns();
                } else {
                    currentPitcherStats().incrementRuns();

                }
            }
            if (currentGameState().getCurrRunnerSecondIndex() != -1) {
                getGame().getHomeTeam().getRoster().get(currentGameState().getCurrRunnerSecondIndex()).getStats().getRunningStats().incrementRuns();
                currentGameState().incrementRuns();
                if (isSecondEarned) {
                    currentPitcherStats().incrementEarnedRuns();
                } else {
                    currentPitcherStats().incrementRuns();
                }
            }
            if (currentGameState().getCurrRunnerThirdIndex() != -1) {
                getGame().getHomeTeam().getRoster().get(currentGameState().getCurrRunnerThirdIndex()).getStats().getRunningStats().incrementRuns();
                currentGameState().incrementRuns();
                if (isThirdEarned) {
                    currentPitcherStats().incrementEarnedRuns();
                } else {
                    currentPitcherStats().incrementRuns();
                }
            }
        }
        if (isBatterEarned) {
            currentPitcherStats().incrementEarnedRuns();
        } else {
            currentPitcherStats().incrementRuns();
        }
        currentGameState().incrementRuns();
        // Clear all the base runners.
        currentGameState().clearBaseRunners();
        // 10) Next batter(clearing the count should be implemented in the next batter method)
        recordGameState();
        nextBatter();
    }

    public void recordStolenBase(int runnerIndex, boolean earnedRun) {
        // Record the GameState before the stolen base.
        recordGameState();
        // Store the player
        Player runner;
        int runnerBatOrdPos = 0;
        if (currentGameState().isTop()) {
            runner = getGame().getAwayTeam().getRoster().get(runnerIndex);
            runnerBatOrdPos = getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getAwayLineup().getBattingOrderIndex(runnerIndex);
        } else {
            runner = getGame().getHomeTeam().getRoster().get(runnerIndex);
            runnerBatOrdPos = getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getHomeLineup().getBattingOrderIndex(runnerIndex);
        }
        // Advance the runner to the next base if it is not occupied.
        if (currentGameState().getCurrRunnerThirdIndex() != runnerIndex) {
            moveToNextBase(runnerIndex, ScoringSymbol.STOLEN_BASE);
        } else {
            currentScorecard().playerScorecardBox(runnerBatOrdPos, currentGameState().getInning()).setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.STOLEN_BASE));
            currentGameState().clearRunnerOnThird();
            currentGameState().incrementScore();
            runner.getStats().getRunningStats().incrementRuns();
            if (earnedRun) {
                currentPitcherStats().incrementEarnedRuns();
            } else {
                currentPitcherStats().incrementRuns();
            }
        }
        currentPitcherStats().incrementStolenBases();
        currentCatcherStats().incrementStolenBases();
        runner.getStats().getRunningStats().incrementStolenBases();
    }

    public void recordRunBattedIn() {
        currentBatterStats().incrementRbis();
    }

    public void recordWalk(boolean earnedRun) {
        recordGameState();
        // Record stats for the pitcher
        currentPitcherStats().incrementWalks();
        // Record stats for the batter
        currentBatterStats().incrementWalks();
        int boIndex = playerBattingOrderIndex(currentRunnerOnThirdIndex());
        // If the bases are loaded
        if (currentGameState().getCurrRunnerThirdIndex() != -1 &&
                currentGameState().getCurrRunnerSecondIndex() != -1 &&
                currentGameState().getCurrRunnerFirstIndex() != -1) {
            currentScorecard().playerScorecardBox(boIndex, currentGameState().getInning()).setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
            currentGameState().incrementScore();
            currentRunnerOnThird().getStats().getRunningStats().incrementRuns();
            currentGameState().clearRunnerOnThird();
            recordRunBattedIn();
            if (earnedRun) {
                currentPitcherStats().incrementEarnedRuns();
            } else {
                currentPitcherStats().incrementRuns();
            }
        }
        // If there are runners on first and second
        if (currentGameState().getCurrRunnerSecondIndex() != -1 &&
                currentGameState().getCurrRunnerFirstIndex() != -1) {
            moveToNextBase(currentGameState().getCurrRunnerSecondIndex(), ScoringSymbol.RUNNER_ADVANCED);
        }
        // If there is a runner on first
        if (currentGameState().getCurrRunnerFirstIndex() != -1) {
            moveToNextBase(currentGameState().getCurrRunnerFirstIndex(), ScoringSymbol.RUNNER_ADVANCED);
        }
        // If first base is empty
        moveToNextBase(currentGameState().getCurrBatterIndex(), ScoringSymbol.WALK);

    }

    public void recordIntentionalWalk(boolean earnedRun) {
        recordGameState();
        // Record stats for the pitcher
        currentPitcherStats().incrementIntenWalks();
        // Record stats for the batter
        currentBatterStats().incrementIntenWalks();
        int boIndex = -1;
        if (currentGameState().isTop()) {
            boIndex = getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getAwayLineup().getBattingOrderIndex(currentRunnerOnThirdIndex());
        } else {
            boIndex = getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getHomeLineup().getBattingOrderIndex(currentRunnerOnThirdIndex());
        }
        // If the bases are loaded
        if (currentGameState().getCurrRunnerThirdIndex() != -1 &&
                currentGameState().getCurrRunnerSecondIndex() != -1 &&
                currentGameState().getCurrRunnerFirstIndex() != -1) {
            currentScorecard().playerScorecardBox(boIndex, currentGameState().getInning()).setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
            currentGameState().incrementScore();
            currentRunnerOnThird().getStats().getRunningStats().incrementRuns();
            currentGameState().clearRunnerOnThird();
            recordRunBattedIn();
            if (earnedRun) {
                currentPitcherStats().incrementEarnedRuns();
            } else {
                currentPitcherStats().incrementRuns();
            }
        }
        // If there are runners on first and second
        if (currentGameState().getCurrRunnerSecondIndex() != -1 &&
                currentGameState().getCurrRunnerFirstIndex() != -1) {
            moveToNextBase(currentGameState().getCurrRunnerSecondIndex(), ScoringSymbol.RUNNER_ADVANCED);
        }
        // If there is a runner on first
        if (currentGameState().getCurrRunnerFirstIndex() != -1) {
            moveToNextBase(currentGameState().getCurrRunnerFirstIndex(), ScoringSymbol.RUNNER_ADVANCED);
        }
        // If first base is empty
        moveToNextBase(currentGameState().getCurrBatterIndex(), ScoringSymbol.INTENTIONAL_WALK);
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
        recordGameState();
        // Record stats for the pitcher
        currentPitcherStats().incrementHitBatsmen();
        // Record stats for the batter
        currentBatterStats().incrementHitByPitch();
        // If the bases are loaded
        if (currentGameState().getCurrRunnerThirdIndex() != -1 &&
                currentGameState().getCurrRunnerSecondIndex() != -1 &&
                currentGameState().getCurrRunnerFirstIndex() != -1) {
            currentScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
            currentGameState().incrementScore();
            currentRunnerOnThird().getStats().getRunningStats().incrementRuns();
            currentGameState().clearRunnerOnThird();
            recordRunBattedIn();
            if (earnedRun) {
                currentPitcherStats().incrementEarnedRuns();
            } else {
                currentPitcherStats().incrementRuns();
            }
        }
        // If there are runners on first and second
        if (currentGameState().getCurrRunnerSecondIndex() != -1 &&
                currentGameState().getCurrRunnerFirstIndex() != -1) {
            moveToNextBase(currentGameState().getCurrRunnerSecondIndex(), ScoringSymbol.RUNNER_ADVANCED);
        }
        // If there is a runner on first
        if (currentGameState().getCurrRunnerFirstIndex() != -1) {
            moveToNextBase(currentGameState().getCurrRunnerFirstIndex(), ScoringSymbol.RUNNER_ADVANCED);
        }
        // If first base is empty
        moveToNextBase(currentGameState().getCurrBatterIndex(), ScoringSymbol.HIT_BY_PITCH);
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
        return getGame().getAwayTeam().getRoster().get(previousBatterIndex());
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

    public boolean isNextBaseOccupied(int baseNumber) {
        switch (baseNumber) {
            case 0:
                return currentGameState().getCurrRunnerFirstIndex() != -1;
            case 1:
                return currentGameState().getCurrRunnerSecondIndex() != -1;
            case 2:
                return currentGameState().getCurrRunnerThirdIndex() != -1;
            case 3:
                return false;
            default:
                return true;
        }
    }

    public void moveToNextBase(int runnerIndex, ScoringSymbol symbol) {
        // Record the GameState before the stolen base.
        recordGameState();
        // Advance the runner to the next base if it is not occupied.
        int currBase = 0;
        if (currentGameState().getCurrRunnerFirstIndex() == runnerIndex) {
            currBase = 1;
        } else if (currentGameState().getCurrRunnerSecondIndex() == runnerIndex) {
            currBase = 2;
        }
        if (!isNextBaseOccupied(currBase) && currBase != 3) {
            switch (currBase) {
                case 0:
                    currentScorecard().currentBatterScorecardBox().setHomeToFirstScoringEvent(new ScoringEvent(symbol));
                    currentGameState().setCurrRunnerFirstIndex(runnerIndex);
                    nextBatter();
                case 1:
                    currentScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(symbol));
                    currentGameState().setCurrRunnerSecondIndex(runnerIndex);
                    currentGameState().clearRunnerOnFirst();
                    break;
                case 2:
                    currentScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(symbol));
                    currentGameState().setCurrRunnerThirdIndex(runnerIndex);
                    currentGameState().clearRunnerOnSecond();
                    break;
                default:
                    break;
            }
        }
    }

    public void recordLocation() {

    }
}
