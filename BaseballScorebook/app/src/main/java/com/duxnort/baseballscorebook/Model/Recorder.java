/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;

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
        // Do not let their be a strike recorded if their are two strikes already
        if (getGame().getCurrentGameState().getStrikeCount() < 2) {
            // 1) Record a pitch to the pitch count in GameState
//            getGame().getCurrentGameState().incrementPitchCount();
            // 2) Record a pitch thrown for the pitcher
            getPitcherStats().incrementNumPitches();
            // 3) Record a pitch seen for the batter
            getBatterStats().incrementNumPitches();
            // 4) Record a strike in GameState
            getGame().getCurrentGameState().incrementStrikes();
            recordGameState();
        }
    }

    public void recordBall() throws Exception {
        // Do not let their be a ball recorded if their are three strikes already
        if (getGame().getCurrentGameState().getBallCount() < 3) {
            // 1) Record a pitch to the pitch count in GameState
//            getGame().getCurrentGameState().incrementPitchCount();
            // 2) Record a pitch thrown for the pitcher
            getPitcherStats().incrementNumPitches();
            // 3) Record a pitch seen for the batter
            getBatterStats().incrementNumPitches();
            // 4) Record a strike in GameState
            getGame().getCurrentGameState().incrementBalls();
            recordGameState();
        }
    }

    public void recordSingle() {
        getGame().getCurrentGameState().incrementPitchCount();
        // 2) Increment the singles stat for the pitcher.
        getPitcherStats().incrementSingles();
        // 3) Increment the singles stat for the batter.
        getBatterStats().incrementSingles();
        // 4) Increment the pitches thrown for pitcher.
        getPitcherStats().incrementNumPitches();
        // 5) Increment the pitches seen for the batter.
        getBatterStats().incrementNumPitches();
        // 6) Record the location of hit in the scorebox.
        // TODO: 8/19/16 Figure out how to record location
        // 7) Record the single in the scorebox.
        // TODO: 8/28/16  Fix the scorecard problem. Initilize the card with boxes.
//        getGame().getScorecard().recordBatterEvent(new ScoringEvent(ScoringSymbol.SINGLE));
        // 8) Update the Bases.
        // TODO: 8/19/16 Need to figure out how to deal with the other base runners before scoring
        // TODO: 8/19/16 the single.
        getGame().getCurrentGameState().setCurrRunnerFirstIndex(getCurrentBatterIndex());
        // 9) Update hits column.
        getGame().getCurrentGameState().incrementHits();
        // 10) Next batter(clearing the count should be implemented in the next batter method)
        recordGameState();
        nextBatter();
    }

    public void recordDouble() {
        // 1) Record the GameState just before the hit.
        getGame().getCurrentGameState().incrementPitchCount();

        // 2) Increment the singles stat for the pitcher.
        getPitcherStats().incrementDoubles();
        // 3) Increment the singles stat for the batter.
        getBatterStats().incrementDoubles();
        // 4) Increment the pitches thrown for pitcher.
        getPitcherStats().incrementNumPitches();
        // 5) Increment the pitches seen for the batter.
        getBatterStats().incrementNumPitches();
        // 6) Record the location of hit in the scorebox.
        // TODO: 8/19/16 Figure out how to record location
        // 7) Record the single in the scorebox.
        // TODO: 8/28/16  Fix the scorecard problem. Initilize the card with boxes.
//        getGame().getScorecard().recordBatterEvent(new ScoringEvent(ScoringSymbol.DOUBLE));
        // 8) Update the Bases.
        // TODO: 8/19/16 Need to figure out how to deal with the other base runners before scoring
        // TODO: 8/19/16 the single.
        getGame().getCurrentGameState().setCurrRunnerSecondIndex(getCurrentBatterIndex());
        // 9) Update hits column.
        getGame().getCurrentGameState().incrementHits();
        // 10) Next batter(clearing the count should be implemented in the next batter method)
        recordGameState();
        nextBatter();
    }

    public void recordTriple() {
        // 1) Record the GameState just before the hit.
        getGame().getCurrentGameState().incrementPitchCount();
        // 2) Increment the singles stat for the pitcher.
        getPitcherStats().incrementTriples();
        // 3) Increment the singles stat for the batter.
        getBatterStats().incrementTriples();
        // 4) Increment the pitches thrown for pitcher.
        getPitcherStats().incrementNumPitches();
        // 5) Increment the pitches seen for the batter.
        getBatterStats().incrementNumPitches();
        // 6) Record the location of hit in the scorebox.
        // TODO: 8/19/16 Figure out how to record location
        // 7) Record the single in the scorebox.
        // TODO: 8/28/16  Fix the scorecard problem. Initilize the card with boxes.
        // getGame().getScorecard().recordBatterEvent(new ScoringEvent(ScoringSymbol.TRIPLE));
        // 8) Update the Bases.
        // TODO: 8/19/16 Need to figure out how to deal with the other base runners before scoring
        // TODO: 8/19/16 the single.
        getGame().getCurrentGameState().setCurrRunnerThirdIndex(getCurrentBatterIndex());
        // 9) Update hits column.
        getGame().getCurrentGameState().incrementHits();
        // 10) Next batter(clearing the count should be implemented in the next batter method)
        recordGameState();
        nextBatter();
    }

    public void recordHomeRun(boolean isBatterEarned, boolean isFirstEarned, boolean isSecondEarned, boolean isThirdEarned) {
        // 1) Record the GameState just before the hit
        getGame().getCurrentGameState().incrementPitchCount();
        // 2) Increment the singles stat for the pitcher.
        getPitcherStats().incrementHomeRuns();
        // 3) Increment the singles stat for the batter.
        getBatterStats().incrementHomeRuns();
        // 4) Increment the pitches thrown for pitcher.
        getPitcherStats().incrementNumPitches();
        // 5) Increment the pitches seen for the batter.
        getBatterStats().incrementNumPitches();
        getCurrentBatter().getStats().getRunningStats().incrementRuns();
        // 6) Record the location of hit in the scorebox.
        // TODO: 8/19/16 Figure out how to record location
        // 7) Record the single in the scorebox.
        // TODO: 8/28/16  Fix the scorecard problem. Initilize the card with boxes.
//        getGame().getScorecard().recordBatterEvent(new ScoringEvent(ScoringSymbol.HOMERUN));
        // 8) Update the Bases.
        // TODO: 8/19/16 Need to figure out how to deal with the other base runners before scoring
        // TODO: 8/19/16 the single.
        // 9) Update hits column.
        getGame().getCurrentGameState().incrementHits();
        // 10) Update the runs column.
        for (int i = 0; i < getNumberOfBaserunners(); i++) {
            // Increment the score and RBIs
            getGame().getCurrentGameState().incrementScore();
            recordRunBattedIn();
        }
        // Update the runners' and pitcher's runs stat.
        if (getGame().getCurrentGameState().isTop()) {
            if (getGame().getCurrentGameState().getCurrRunnerFirstIndex() != -1) {
                getGame().getAwayTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerFirstIndex()).getStats().getRunningStats().incrementRuns();
                getGame().getCurrentGameState().incrementRuns();
                if (isFirstEarned) {
                    getPitcherStats().incrementEarnedRuns();
                } else {
                    getPitcherStats().incrementRuns();
                }
            }
            if (getGame().getCurrentGameState().getCurrRunnerSecondIndex() != -1) {
                getGame().getAwayTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerSecondIndex()).getStats().getRunningStats().incrementRuns();
                getGame().getCurrentGameState().incrementRuns();
                if (isSecondEarned) {
                    getPitcherStats().incrementEarnedRuns();
                } else {
                    getPitcherStats().incrementRuns();
                }
            }
            if (getGame().getCurrentGameState().getCurrRunnerThirdIndex() != -1) {
                getGame().getAwayTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerThirdIndex()).getStats().getRunningStats().incrementRuns();
                getGame().getCurrentGameState().incrementRuns();
                if (isThirdEarned) {
                    getPitcherStats().incrementEarnedRuns();
                } else {
                    getPitcherStats().incrementRuns();
                }
            }
        } else {
            if (getGame().getCurrentGameState().getCurrRunnerFirstIndex() != -1) {
                getGame().getHomeTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerFirstIndex()).getStats().getRunningStats().incrementRuns();
                getGame().getCurrentGameState().incrementRuns();
                if (isFirstEarned) {
                    getPitcherStats().incrementEarnedRuns();
                } else {
                    getPitcherStats().incrementRuns();

                }
            }
            if (getGame().getCurrentGameState().getCurrRunnerSecondIndex() != -1) {
                getGame().getHomeTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerSecondIndex()).getStats().getRunningStats().incrementRuns();
                getGame().getCurrentGameState().incrementRuns();
                if (isSecondEarned) {
                    getPitcherStats().incrementEarnedRuns();
                } else {
                    getPitcherStats().incrementRuns();
                }
            }
            if (getGame().getCurrentGameState().getCurrRunnerThirdIndex() != -1) {
                getGame().getHomeTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerThirdIndex()).getStats().getRunningStats().incrementRuns();
                getGame().getCurrentGameState().incrementRuns();
                if (isThirdEarned) {
                    getPitcherStats().incrementEarnedRuns();
                } else {
                    getPitcherStats().incrementRuns();
                }
            }
        }

        if (isBatterEarned) {
            getPitcherStats().incrementEarnedRuns();
        } else {
            getPitcherStats().incrementRuns();
        }
        getGame().getCurrentGameState().incrementRuns();
        // Clear all the base runners.
        getGame().getCurrentGameState().clearBaseRunners();
        // 10) Next batter(clearing the count should be implemented in the next batter method)
        recordGameState();
        nextBatter();
    }

    public void recordStolenBase(int runnerIndex, boolean earnedRun) {
        // Record the GameState before the stolen base.
        recordGameState();
        // Store the player
        Player runner;
        if (getGame().getCurrentGameState().isTop()) {
            runner = getGame().getAwayTeam().getRoster().get(runnerIndex);
        } else {
            runner = getGame().getHomeTeam().getRoster().get(runnerIndex);
        }
        // Advance the runner to the next base if it is not occupied.
        if (getGame().getCurrentGameState().getCurrRunnerThirdIndex() != runnerIndex) {
            moveToNextBase(runnerIndex, ScoringSymbol.STOLEN_BASE);
        } else {
            getGame().getScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.STOLEN_BASE));
            getGame().getCurrentGameState().clearRunnerOnThird();
            getGame().getCurrentGameState().incrementScore();
            runner.getStats().getRunningStats().incrementRuns();
            if (earnedRun) {
                getPitcherStats().incrementEarnedRuns();
            } else {
                getPitcherStats().incrementRuns();
            }
        }
        getPitcherStats().incrementStolenBases();
        getCatcherStats().incrementStolenBases();
        runner.getStats().getRunningStats().incrementStolenBases();
    }

    public void recordRunBattedIn() {
        getBatterStats().incrementRbis();
    }

    public void recordWalk(boolean earnedRun) {
        recordGameState();
        // Record stats for the pitcher
        getPitcherStats().incrementWalks();
        // Record stats for the batter
        getBatterStats().incrementWalks();
        // If the bases are loaded
        if (getGame().getCurrentGameState().getCurrRunnerThirdIndex() != -1 &&
                getGame().getCurrentGameState().getCurrRunnerSecondIndex() != -1 &&
                getGame().getCurrentGameState().getCurrRunnerFirstIndex() != -1) {
            getGame().getScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
            getGame().getCurrentGameState().incrementScore();
            getCurrentRunnerOnThird().getStats().getRunningStats().incrementRuns();
            getGame().getCurrentGameState().clearRunnerOnThird();
            recordRunBattedIn();
            if (earnedRun) {
                getPitcherStats().incrementEarnedRuns();
            } else {
                getPitcherStats().incrementRuns();
            }
        }
        // If there are runners on first and second
        if (getGame().getCurrentGameState().getCurrRunnerSecondIndex() != -1 &&
                getGame().getCurrentGameState().getCurrRunnerFirstIndex() != -1) {
            moveToNextBase(getGame().getCurrentGameState().getCurrRunnerSecondIndex(), ScoringSymbol.RUNNER_ADVANCED);
        }
        // If there is a runner on first
        if (getGame().getCurrentGameState().getCurrRunnerFirstIndex() != -1) {
            moveToNextBase(getGame().getCurrentGameState().getCurrRunnerFirstIndex(), ScoringSymbol.RUNNER_ADVANCED);
        }
        // If first base is empty
        moveToNextBase(getGame().getCurrentGameState().getCurrBatterIndex(), ScoringSymbol.WALK);

    }

    public void recordIntentionalWalk(boolean earnedRun) {
        recordGameState();
        // Record stats for the pitcher
        getPitcherStats().incrementIntenWalks();
        // Record stats for the batter
        getBatterStats().incrementIntenWalks();
        // If the bases are loaded
        if (getGame().getCurrentGameState().getCurrRunnerThirdIndex() != -1 &&
                getGame().getCurrentGameState().getCurrRunnerSecondIndex() != -1 &&
                getGame().getCurrentGameState().getCurrRunnerFirstIndex() != -1) {
            getGame().getScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
            getGame().getCurrentGameState().incrementScore();
            getCurrentRunnerOnThird().getStats().getRunningStats().incrementRuns();
            getGame().getCurrentGameState().clearRunnerOnThird();
            recordRunBattedIn();
            if (earnedRun) {
                getPitcherStats().incrementEarnedRuns();
            } else {
                getPitcherStats().incrementRuns();
            }
        }
        // If there are runners on first and second
        if (getGame().getCurrentGameState().getCurrRunnerSecondIndex() != -1 &&
                getGame().getCurrentGameState().getCurrRunnerFirstIndex() != -1) {
            moveToNextBase(getGame().getCurrentGameState().getCurrRunnerSecondIndex(), ScoringSymbol.RUNNER_ADVANCED);
        }
        // If there is a runner on first
        if (getGame().getCurrentGameState().getCurrRunnerFirstIndex() != -1) {
            moveToNextBase(getGame().getCurrentGameState().getCurrRunnerFirstIndex(), ScoringSymbol.RUNNER_ADVANCED);
        }
        // If first base is empty
        moveToNextBase(getGame().getCurrentGameState().getCurrBatterIndex(), ScoringSymbol.INTENTIONAL_WALK);
    }

    public void recordCaughtStealing(int runnerIndex, String posInvolved) throws Exception {
        recordGameState();
        getPitcherStats().incrementCaughtStealing();
        getCatcherStats().incrementCaughtStealing();
        if (runnerIndex == getGame().getCurrentGameState().getCurrRunnerFirstIndex()) {
            getCurrentRunnerOnFirst().getStats().getRunningStats().incrementCaughtStealing();
            // Failed to advance
            getGame().getScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(posInvolved, ScoringSymbol.CAUGHT_STEALING, getGame().getCurrentGameState().getNumOuts() + 1));
        } else if (runnerIndex == getGame().getCurrentGameState().getCurrRunnerSecondIndex()) {
            getCurrentRunnerOnSecond().getStats().getRunningStats().incrementCaughtStealing();
            getGame().getScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(posInvolved, ScoringSymbol.CAUGHT_STEALING, getGame().getCurrentGameState().getNumOuts() + 1));
        } else if (runnerIndex == getGame().getCurrentGameState().getCurrRunnerThirdIndex()) {
            getCurrentRunnerOnThird().getStats().getRunningStats().incrementCaughtStealing();
            getGame().getScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(posInvolved, ScoringSymbol.CAUGHT_STEALING, getGame().getCurrentGameState().getNumOuts() + 1));
        }
        recordOut();
    }

    public void recordStrikeOutLooking() throws Exception {
        recordGameState();
        getPitcherStats().incrementStrikeOutLook();
        getBatterStats().incrementStrikeOuts();
        getCatcherStats().incrementPutOuts();
        getGame().getScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.STRIKEOUT_LOOKING, getGame().getCurrentGameState().getNumOuts() + 1));
        recordOut();
    }

    public void recordStrikeOutSwinging() throws Exception {
        recordGameState();
        getPitcherStats().incrementStrikeOutSwing();
        getBatterStats().incrementStrikeOuts();
        getCatcherStats().incrementPutOuts();
        getGame().getScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.STRIKEOUT_SWINGING, getGame().getCurrentGameState().getNumOuts() + 1));
        recordOut();
    }

    public void recordHitByPitch(boolean earnedRun) {
        recordGameState();
        // Record stats for the pitcher
        getPitcherStats().incrementHitBatsmen();
        // Record stats for the batter
        getBatterStats().incrementHitByPitch();
        // If the bases are loaded
        if (getGame().getCurrentGameState().getCurrRunnerThirdIndex() != -1 &&
                getGame().getCurrentGameState().getCurrRunnerSecondIndex() != -1 &&
                getGame().getCurrentGameState().getCurrRunnerFirstIndex() != -1) {
            getGame().getScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_ADVANCED));
            getGame().getCurrentGameState().incrementScore();
            getCurrentRunnerOnThird().getStats().getRunningStats().incrementRuns();
            getGame().getCurrentGameState().clearRunnerOnThird();
            recordRunBattedIn();
            if (earnedRun) {
                getPitcherStats().incrementEarnedRuns();
            } else {
                getPitcherStats().incrementRuns();
            }
        }
        // If there are runners on first and second
        if (getGame().getCurrentGameState().getCurrRunnerSecondIndex() != -1 &&
                getGame().getCurrentGameState().getCurrRunnerFirstIndex() != -1) {
            moveToNextBase(getGame().getCurrentGameState().getCurrRunnerSecondIndex(), ScoringSymbol.RUNNER_ADVANCED);
        }
        // If there is a runner on first
        if (getGame().getCurrentGameState().getCurrRunnerFirstIndex() != -1) {
            moveToNextBase(getGame().getCurrentGameState().getCurrRunnerFirstIndex(), ScoringSymbol.RUNNER_ADVANCED);
        }
        // If first base is empty
        moveToNextBase(getGame().getCurrentGameState().getCurrBatterIndex(), ScoringSymbol.HIT_BY_PITCH);
    }

    public void recordSacrificeBunt(String positionsInvolved) throws Exception {
        recordGameState();
        getPitcherStats().incrementSacBunts();
        getBatterStats().incrementSacBunts();
        recordImpliedFieldingStats(positionsInvolved);
        getGame().getScorecard().currentBatterScorecardBox().setBatterScoringEvent(
                new ScoringEvent(positionsInvolved, ScoringSymbol.SACRIFICE_BUNT,
                        getGame().getCurrentGameState().getNumOuts() + 1));
        recordOut();
    }

    public void recordSacrificeFly(String positionsInvolved, boolean isEarnedRun) throws Exception {
        recordGameState();
        if (isEarnedRun) {
            getPitcherStats().incrementEarnedRuns();
        } else {
            getPitcherStats().incrementRuns();
        }
        getPitcherStats().incrementTotalNumBF();
        getBatterStats().incrementSacBunts();
        recordImpliedFieldingStats(positionsInvolved);
        getGame().getScorecard().currentBatterScorecardBox().setBatterScoringEvent(
                new ScoringEvent(positionsInvolved, ScoringSymbol.SACRIFICE_FLY,
                        getGame().getCurrentGameState().getNumOuts() + 1));
        recordOut();
    }

    public void recordRegularGroundBallDoublePlay(String positionsInvolved, int baseRunnerIndex, boolean wasBatterFirstOut) throws Exception {
        recordNonRegularGroundBallDoublePlay(positionsInvolved, positionsInvolved.charAt(positionsInvolved.length() - 2) + "", baseRunnerIndex, wasBatterFirstOut);
    }

    public void recordNonRegularGroundBallDoublePlay(String positionsInvolved, String firstPutout, int baseRunnerIndex, boolean wasBatterFirstOut) throws Exception {
        recordGameState();
        getPitcherStats().incrementInducedGBDPs();
        getBatterStats().incrementGroundBallDP();
        recordPutOut(Position.positionFromInt(Integer.parseInt(positionsInvolved.charAt(positionsInvolved.length() - 1) + "")));
        recordPutOut(Position.positionFromInt(Integer.parseInt(firstPutout)));
        for (int i = 0; i < positionsInvolved.length() - 1; i++) {
            recordAssist(Position.positionFromInt(Integer.parseInt(positionsInvolved.charAt(i) + "")));
        }
        if (wasBatterFirstOut) {
            getGame().getScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.DOUBLE_PLAY, getGame().getCurrentGameState().getNumOuts() + 1));
            //Record Second out at the base that the runner was heading to. Use runner index to find what base the runner is on.
            if (getGame().getCurrentGameState().getCurrRunnerThirdIndex() == baseRunnerIndex) {
                getGame().getScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 2));
            } else if (getGame().getCurrentGameState().getCurrRunnerSecondIndex() == baseRunnerIndex) {
                getGame().getScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 2));
            } else if (getGame().getCurrentGameState().getCurrRunnerFirstIndex() == baseRunnerIndex) {
                getGame().getScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 2));
            }
        } else {
            getGame().getScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.DOUBLE_PLAY, getGame().getCurrentGameState().getNumOuts() + 2));
            //Record Second out at the base that the runner was heading to. Use runner index to find what base the runner is on.
            if (getGame().getCurrentGameState().getCurrRunnerThirdIndex() == baseRunnerIndex) {
                getGame().getScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
            } else if (getGame().getCurrentGameState().getCurrRunnerSecondIndex() == baseRunnerIndex) {
                getGame().getScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
            } else if (getGame().getCurrentGameState().getCurrRunnerFirstIndex() == baseRunnerIndex) {
                getGame().getScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
            }
        }
        recordOut();
        recordOut();
    }

    public void recordGroundBallOut(String positionsInvolved) throws Exception {
        recordGameState();
        getPitcherStats().incrementGroundOuts();
        getBatterStats().incrementGroundOuts();
        recordImpliedFieldingStats(positionsInvolved);
        getGame().getScorecard().currentBatterScorecardBox().setBatterScoringEvent(
                new ScoringEvent(positionsInvolved, ScoringSymbol.GROUNDOUT,
                        getGame().getCurrentGameState().getNumOuts() + 1));
        recordOut();
    }

    public void recordFlyBallOut(String positionsInvolved) throws Exception {
        recordGameState();
        getPitcherStats().incrementGroundOuts();
        getBatterStats().incrementGroundOuts();
        recordImpliedFieldingStats(positionsInvolved);
        getGame().getScorecard().currentBatterScorecardBox().setBatterScoringEvent(
                new ScoringEvent(positionsInvolved, ScoringSymbol.FLYOUT,
                        getGame().getCurrentGameState().getNumOuts() + 1));
        recordOut();
    }

    public void recordImpliedFieldingStats(String positionsInvolved) {
        recordPutOut(Position.positionFromInt(Integer.parseInt(positionsInvolved.charAt(positionsInvolved.length() - 1) + "")));
        for (int i = 0; i < positionsInvolved.length() - 1; i++) {
            recordAssist(Position.positionFromInt(Integer.parseInt(positionsInvolved.charAt(i) + "")));
        }
    }

    public void recordPutOut(Position pos) {
        getCurrentDefensivePlayer(pos).getStats().getFieldingStats().incrementPutOuts();
    }

    public void recordAssist(Position pos) {
        getCurrentDefensivePlayer(pos).getStats().getFieldingStats().incrementAssists();
    }

    public void recordWildPitch() {
        getPitcherStats().incrementWildPitches();
        getCatcherStats().incrementWpCatching();
    }

    public void recordPassedBall() {
        getCatcherStats().incrementPassedBalls();
    }

    public void recordBalk() {
        getPitcherStats().incrementBalks();
    }

    public void recordPickOff(String positionsInvolved, int baseRunnerIndex) throws Exception {
        getPitcherStats().incrementPickOffs();
        recordImpliedFieldingStats(positionsInvolved);
        if (getGame().getCurrentGameState().getCurrRunnerThirdIndex() == baseRunnerIndex) {
            getGame().getScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(positionsInvolved, ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
        }
        recordOut();
    }

    public void recordUnassistedPutOut(Position pos) {
        recordPutOut(pos);
        // Record in scorebook as unassited.
    }

    public void recordFieldersChoice(String positionsInvolved, int runnerIndex) throws Exception {
        recordGameState();
        getPitcherStats().incrementGroundOuts();
        getBatterStats().incrementGroundOuts();
        recordImpliedFieldingStats(positionsInvolved);
        getGame().getScorecard().currentBatterScorecardBox().setBatterScoringEvent((new ScoringEvent(positionsInvolved, ScoringSymbol.FIELDERS_CHOICE)));
        if (runnerIndex == getGame().getCurrentGameState().getCurrRunnerThirdIndex()) {
            getGame().getScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
        } else if (runnerIndex == getGame().getCurrentGameState().getCurrRunnerSecondIndex()) {
            getGame().getScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
        } else if (runnerIndex == getGame().getCurrentGameState().getCurrRunnerFirstIndex()) {
            getGame().getScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
        }
        recordOut();
    }

    public void recordOffensiveInterference(int runnerIndex) throws Exception {
        recordGameState();
        if (runnerIndex == getGame().getCurrentGameState().getCurrRunnerThirdIndex()) {
            getGame().getScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
        } else if (runnerIndex == getGame().getCurrentGameState().getCurrRunnerSecondIndex()) {
            getGame().getScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
        } else if (runnerIndex == getGame().getCurrentGameState().getCurrRunnerFirstIndex()) {
            getGame().getScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
        } else if (runnerIndex == getGame().getCurrentGameState().getCurrBatterIndex()) {
            getGame().getScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
        }
        recordOut();
    }

    public void recordDefensiveInterference() {

    }

    public void recordCatchersInterference() {
        recordGameState();
        getCatcherStats().incrementErrors();
        getPitcherStats().incrementTotalNumBF();
        getBatterStats().incrementPlateApperance();
        getGame().getScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.INTERFERENCE));
    }

    public void recordFlyOutDoublePlay(String positionsInvolved, String firstPutout, int baseRunnerIndex) throws Exception {
        recordFlyBallOut(positionsInvolved);
        recordAssist(Position.positionFromInt(Integer.parseInt(positionsInvolved.charAt(0) + "")));
        for (int i = 1; i < positionsInvolved.length() - 1; i++) {
            recordAssist(Position.positionFromInt(Integer.parseInt(positionsInvolved.charAt(i) + "")));
        }

        getGame().getScorecard().currentBatterScorecardBox().setBatterScoringEvent(new ScoringEvent(ScoringSymbol.DOUBLE_PLAY, getGame().getCurrentGameState().getNumOuts()));
        //Record Second out at the base that the runner was heading to. Use runner index to find what base the runner is on.
        if (getGame().getCurrentGameState().getCurrRunnerThirdIndex() == baseRunnerIndex) {
            getGame().getScorecard().currentRunnerOnThirdScorecardBox().setThirdToHomeScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
        } else if (getGame().getCurrentGameState().getCurrRunnerSecondIndex() == baseRunnerIndex) {
            getGame().getScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
        } else if (getGame().getCurrentGameState().getCurrRunnerFirstIndex() == baseRunnerIndex) {
            getGame().getScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(ScoringSymbol.RUNNER_OUT, getGame().getCurrentGameState().getNumOuts() + 1));
        }

        recordOut();
    }

    public void recordGroundBallTriplePlay(String positionsInvolved, String firstPutout, int firstRunnerOutIndex, int secondRunnerOutIndex, int thirdRunnerOutIndex) {
        recordGameState();
        getPitcherStats().incrementInducedGBDPs();
        getBatterStats().incrementGroundBallDP();

    }

    public void recordOut() throws Exception {
        getPitcherStats().incrementNumOutsPitched();
        if (getGame().getCurrentGameState().getNumOuts() < 3) {
            getGame().getCurrentGameState().incrementOuts();
        } else {
            getGame().getCurrentGameState().nextHalfInning();
        }
    }

    public Lineup getCurrentHomeLineup() {
        return getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getHomeLineup();
    }

    public Lineup getCurrentAwayLineup() {
        return getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getAwayLineup();
    }

    public Player getHomePlayerAtPos(Position pos) {
        int homePlayerIndex = getCurrentHomeLineup().positionsRosterIndex(pos);
        return getGame().getHomeTeam().getRoster().get(homePlayerIndex);
    }

    public Player getAwayPlayerAtPos(Position pos) {
        int awayPlayerIndex = getCurrentAwayLineup().positionsRosterIndex(pos);
        return getGame().getAwayTeam().getRoster().get(awayPlayerIndex);
    }

    public Player getCurrentDefensivePlayer(Position pos) {
        if (getGame().getCurrentGameState().isTop()) {
            return getHomePlayerAtPos(pos);
        }
        return getAwayPlayerAtPos(pos);
    }

    public Player getCurrentHomeBatter() {
        return getGame().getHomeTeam().getRoster().get(getGame().getCurrentGameState().getCurrHomeBatterIndex());
    }

    public Player getCurrentAwayBatter() {
        return getGame().getAwayTeam().getRoster().get(getGame().getCurrentGameState().getCurrAwayBatterIndex());
    }

    public Player getCurrentBatter() {
        if (getGame().getCurrentGameState().isTop()) {
            return getCurrentAwayBatter();
        }
        return getCurrentHomeBatter();
    }

    public int getCurrentBatterIndex() {
        if (getGame().getCurrentGameState().isTop()) {
            return getGame().getCurrentGameState().getCurrAwayBatterIndex();
        }
        return getGame().getCurrentGameState().getCurrHomeBatterIndex();
    }

    public Player getPreviousBatter() {
        if (getGame().getGameStateList().get(getGame().getGameStateList().size() - 2).isTop()) {
            return getGame().getAwayTeam().getRoster().get(getPreviousBatterIndex());
        }
        return getGame().getAwayTeam().getRoster().get(getPreviousBatterIndex());
    }

    public int getPreviousBatterIndex() {
        if (getGame().getGameStateList().get(getGame().getGameStateList().size() - 2).isTop()) {
            return getGame().getGameStateList().get(getGame().getGameStateList().size() - 2).getCurrAwayBatterIndex();
        }
        return getGame().getGameStateList().get(getGame().getGameStateList().size() - 2).getCurrHomeBatterIndex();
    }

    public Player getCurrentPitcher() {
        if (getGame().getCurrentGameState().isTop()) {
            return getHomePlayerAtPos(Position.PITCHER);
        }
        return getAwayPlayerAtPos(Position.PITCHER);
    }

    public Player getCurrentCatcher() {
        if (getGame().getCurrentGameState().isTop()) {
            return getHomePlayerAtPos(Position.CATCHER);
        }
        return getAwayPlayerAtPos(Position.CATCHER);
    }

    public Player getCurrentRunnerOnFirst() {
        if (getGame().getCurrentGameState().isTop()) {
            return getGame().getAwayTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerFirstIndex());
        }
        return getGame().getHomeTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerFirstIndex());
    }

    public Player getCurrentRunnerOnSecond() {
        if (getGame().getCurrentGameState().isTop()) {
            return getGame().getAwayTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerSecondIndex());
        }
        return getGame().getHomeTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerSecondIndex());
    }

    public Player getCurrentRunnerOnThird() {
        if (getGame().getCurrentGameState().isTop()) {
            return getGame().getAwayTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerThirdIndex());
        }
        return getGame().getHomeTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerThirdIndex());
    }

    public void nextBatter() {
        clearCount();
        getGame().getCurrentGameState().nextBatter();
    }

    public void recordGameState() {
        getGame().newGameState();
    }

    public void plateAppearanceFinished() {
        recordGameState();
        clearCount();
    }

    public void clearCount() {
        getGame().getCurrentGameState().clearCount();
    }

    /**
     * This method must be implemented after plateAppearanceFinished()
     *
     * @throws Exception
     */
    public void incrementOuts() throws Exception {
        getGame().getCurrentGameState().incrementOuts();
    }

    public HittingStats getBatterStats() {
        if (getCurrentBatter().isSwitchHitter()) {
            if (getCurrentPitcher().isThrowRight()) {
                return getCurrentBatter().getStats().getHitStatsLeft();
            }
            if (getCurrentPitcher().isThrowLeft()) {
                return getCurrentBatter().getStats().getHitStatsRight();
            }
        }
        if (getCurrentBatter().isBatRight()) {
            return getCurrentBatter().getStats().getHitStatsRight();
        }
        return getCurrentBatter().getStats().getHitStatsLeft();
    }

    public PitchingStats getPitcherStats() {
        if (getCurrentPitcher().isThrowRight()) {
            return getCurrentPitcher().getStats().getPitchStatsRight();
        }
        return getCurrentPitcher().getStats().getPitchStatsLeft();
    }

    public FieldingStats getCatcherStats() {
        return getCurrentCatcher().getStats().getFieldingStats();
    }

    public int getNumberOfBaserunners() {
        return 0;
    }

    public boolean isNextBaseOccupied(int baseNumber) {
        switch (baseNumber) {
            case 0:
                return getGame().getCurrentGameState().getCurrRunnerFirstIndex() != -1;
            case 1:
                return getGame().getCurrentGameState().getCurrRunnerSecondIndex() != -1;
            case 2:
                return getGame().getCurrentGameState().getCurrRunnerThirdIndex() != -1;
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
        if (getGame().getCurrentGameState().getCurrRunnerFirstIndex() == runnerIndex) {
            currBase = 1;
        } else if (getGame().getCurrentGameState().getCurrRunnerSecondIndex() == runnerIndex) {
            currBase = 2;
        }
        if (!isNextBaseOccupied(currBase) && currBase != 3) {
            switch (currBase) {
                case 0:
                    getGame().getScorecard().currentBatterScorecardBox().setHomeToFirstScoringEvent(new ScoringEvent(symbol));
                    getGame().getCurrentGameState().setCurrRunnerFirstIndex(runnerIndex);
                    nextBatter();
                case 1:
                    getGame().getScorecard().currentRunnerOnFirstScorecardBox().setFirstToSecondScoringEvent(new ScoringEvent(symbol));
                    getGame().getCurrentGameState().setCurrRunnerSecondIndex(runnerIndex);
                    getGame().getCurrentGameState().clearRunnerOnFirst();
                    break;
                case 2:
                    getGame().getScorecard().currentRunnerOnSecondScorecardBox().setSecondToThirdScoringEvent(new ScoringEvent(symbol));
                    getGame().getCurrentGameState().setCurrRunnerThirdIndex(runnerIndex);
                    getGame().getCurrentGameState().clearRunnerOnSecond();
                    break;
                default:
                    break;
            }
        }
    }
}
