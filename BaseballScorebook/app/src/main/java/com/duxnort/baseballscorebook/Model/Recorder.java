/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;

/**
 * Created by matt on 8/12/16.
 */
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
        GameState gs = getGame().getCurrentGameState();
        if(gs.getStrikeCount() < 3){
            gs.setStrikeCount(gs.getStrikeCount() + 1);
            if(gs.isTop()){
                gs.setHomePitchCount(gs.getHomePitchCount() + 1);
            } else {
                gs.setAwayPitchCount(gs.getAwayPitchCount() + 1);
            }
        } else {
            throw new Exception("Too many strikes.");
        }
    }

    public void recordBall() throws Exception {
        GameState gs = getGame().getCurrentGameState();
        if(gs.getBallCount() < 4){
            gs.setBallCount(gs.getBallCount() + 1);
            if(gs.isTop()){
                gs.setHomePitchCount(gs.getHomePitchCount() + 1);
            } else {
                gs.setAwayPitchCount(gs.getAwayPitchCount() + 1);
            }
        } else {
            throw new Exception("Too many balls.");
        }
    }

    public void recordHit() {
        GameState gs = getGame().getCurrentGameState();
        if(gs.isTop()){
            gs.setAwayHits(gs.getAwayHits() + 1);
        } else {
            gs.setHomeHits(gs.getHomeHits() + 1);
        }
    }

    public void recordSingle() {
        GameState gs = getGame().getCurrentGameState(); // Gets the current game state

        // If it is the top of the inning
        if(gs.isTop()){
            // Gets the current awayBatter from the away team
            Lineup homeLineup = getGame().getLineupStatesList().get(
                    getGame().getCurrLineupStateIndex()).getHomeLineup();
            int homePitcherIndex = homeLineup.positionsRosterIndex(Position.PITCHER);
            Player homePitcher = getGame().getHomeTeam().getRoster().get(homePitcherIndex);
            Player awayBatter = getGame().getAwayTeam().getRoster().get(gs.getCurrAwayBatterIndex());
            // If the home pitcher is right handed..
            if(homePitcher.isThrowRight()){
                // If the away batter is a switch hitter or is left handed...
                if(awayBatter.isSwitchHitter() || awayBatter.isBatLeft()){
                    // Get Batter's Left handed stats
                    HittingStats batterLeftStats = awayBatter.getStats().getHitStatsLeft();
                    // Increment at bats
                    batterLeftStats.incrementAtBats();
                    // Increment singles
                    batterLeftStats.incrementSingles();
                } else if(awayBatter.isBatRight()) { // Else if the batter is right handed...
                    // Get Batter's Left handed stats
                    HittingStats batterRightStats = awayBatter.getStats().getHitStatsRight();
                    // Increment at bats
                    batterRightStats.incrementAtBats();
                    // Increment singles
                    batterRightStats.incrementSingles();
                }
                // Record Right Handed Pitcher stats...
                PitchingStats pitcherRightStats = homePitcher.getStats().getPitchStatsRight();
                pitcherRightStats.incrementAtBats();
                pitcherRightStats.incrementTotalNumBF();
                pitcherRightStats.incrementNumPitches();
                pitcherRightStats.incrementSingles();
            }

            if(homePitcher.isThrowLeft()){
                if(awayBatter.isSwitchHitter() || awayBatter.isBatRight()){
                    // Get Batter's Right handed stats
                    HittingStats batterRightStats = awayBatter.getStats().getHitStatsRight();
                    // Increment at bats
                    batterRightStats.incrementAtBats();
                    // Increment singles
                    batterRightStats.incrementSingles();
                } else if(awayBatter.isBatLeft()) { // Else if the batter is Left handed...
                    // Get Batter's Left handed stats
                    HittingStats batterLeftStats = awayBatter.getStats().getHitStatsLeft();
                    // Increment at bats
                    batterLeftStats.incrementAtBats();
                    // Increment singles
                    batterLeftStats.incrementSingles();
                }
                // Record Left Handed Pitcher stats...
                PitchingStats pitcherLeftStats = homePitcher.getStats().getPitchStatsLeft();
                pitcherLeftStats.incrementAtBats();
                pitcherLeftStats.incrementTotalNumBF();
                pitcherLeftStats.incrementNumPitches();
                pitcherLeftStats.incrementSingles();
            }
            // It is the bottom half of the inning...
        } else {
            // Gets the current awayBatter from the away team
            Lineup awayLineup = getGame().getLineupStatesList().get(
                    getGame().getCurrLineupStateIndex()).getAwayLineup();
            int awayPitcherIndex = awayLineup.positionsRosterIndex(Position.PITCHER);
            Player awayPitcher = getGame().getAwayTeam().getRoster().get(awayPitcherIndex);
            Player homeBatter = getGame().getHomeTeam().getRoster().get(gs.getCurrHomeBatterIndex());
            // If the home pitcher is right handed..
            if(awayPitcher.isThrowRight()){
                // If the away batter is a switch hitter or is left handed...
                if(homeBatter.isSwitchHitter() || homeBatter.isBatLeft()){
                    // Get Batter's Left handed stats
                    HittingStats batterLeftStats = homeBatter.getStats().getHitStatsLeft();
                    // Increment at bats
                    batterLeftStats.incrementAtBats();
                    // Increment singles
                    batterLeftStats.incrementSingles();
                } else if(homeBatter.isBatRight()) { // Else if the batter is right handed...
                    // Get Batter's Left handed stats
                    HittingStats batterRightStats = homeBatter.getStats().getHitStatsRight();
                    // Increment at bats
                    batterRightStats.incrementAtBats();
                    // Increment singles
                    batterRightStats.incrementSingles();
                }
                // Record Right Handed Pitcher stats...
                PitchingStats pitcherRightStats = awayPitcher.getStats().getPitchStatsRight();
                pitcherRightStats.incrementAtBats();
                pitcherRightStats.incrementTotalNumBF();
                pitcherRightStats.incrementNumPitches();
                pitcherRightStats.incrementSingles();
            }

            if(awayPitcher.isThrowLeft()){
                if(homeBatter.isSwitchHitter() || homeBatter.isBatRight()){
                    // Get Batter's Right handed stats
                    HittingStats batterRightStats = homeBatter.getStats().getHitStatsRight();
                    // Increment at bats
                    batterRightStats.incrementAtBats();
                    // Increment singles
                    batterRightStats.incrementSingles();
                } else if(homeBatter.isBatLeft()) { // Else if the batter is Left handed...
                    // Get Batter's Left handed stats
                    HittingStats batterLeftStats = homeBatter.getStats().getHitStatsLeft();
                    // Increment at bats
                    batterLeftStats.incrementAtBats();
                    // Increment singles
                    batterLeftStats.incrementSingles();
                }
                // Record Left Handed Pitcher stats...
                PitchingStats pitcherLeftStats = awayPitcher.getStats().getPitchStatsLeft();
                pitcherLeftStats.incrementAtBats();
                pitcherLeftStats.incrementTotalNumBF();
                pitcherLeftStats.incrementNumPitches();
                pitcherLeftStats.incrementSingles();
            }
        }
    }

    public void recordDouble() {
        GameState gs = getGame().getCurrentGameState();
    }

    public void recordTriple(){
        GameState gs = getGame().getCurrentGameState();
    }

    public void recordHomeRun(){
        GameState gs = getGame().getCurrentGameState();
    }

    public void recordStolenBase(){
        GameState gs = getGame().getCurrentGameState();
    }

    public void recordRunScored(){
        GameState gs = getGame().getCurrentGameState();
    }

    public void recordRunBattedIn(){

    }

    public void recordWalk(){

    }

    public void recordIntentionalWalk(){

    }

    public void recordCaughtStealing(){

    }

    public void recordStrikeOutLooking(){

    }

    public void recordStrikeOutSwinging(){

    }

    public void recordHitByPitch(){

    }

    public void recordSacrificeBunt(){

    }

    public void recordSacrificeFly(){

    }

    public void recordGroundBallDoublePlay(){

    }

    public void recordGroundBallOut(){

    }

    public void recordFlyBallOut(){

    }

    public void recordAtBat(){

    }

    public void recordBatterFaced(){

    }

    public void recordPlateAppearance(){

    }

    public void recordPutOut(){

    }

    public void recordAssist(){

    }

    public void recordWildPitch(){

    }

    public void recordPassedBall(){

    }

    public void recordBalk(){

    }

    public void recordPickOff(){

    }

    public void recordUnassistedPutOut(){

    }

    public void recordFieldersChoice(){

    }

    public void recordInterference(){

    }

    public void recordDoublePlay(){

    }

    public void recordTriplePlay(){

    }

    public Lineup getCurrentHomeLineup(){
        return getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getHomeLineup();
    }

    public Lineup getCurrentAwayLineup(){
        return getGame().getLineupStatesList().get(getGame().getCurrLineupStateIndex()).getAwayLineup();
    }

    public Player getHomePlayerAtPos(Position pos){
        int homePlayerIndex = getCurrentHomeLineup().positionsRosterIndex(pos);
        return getGame().getHomeTeam().getRoster().get(homePlayerIndex);
    }

    public Player getAwayPlayerAtPos(Position pos){
        int awayPlayerIndex = getCurrentAwayLineup().positionsRosterIndex(pos);
        return getGame().getAwayTeam().getRoster().get(awayPlayerIndex);
    }

    public Player getCurrentHomeBatter(){
        return getGame().getHomeTeam().getRoster().get(getGame().getCurrentGameState().getCurrHomeBatterIndex());
    }

    public Player getCurrentAwayBatter(){
        return getGame().getAwayTeam().getRoster().get(getGame().getCurrentGameState().getCurrAwayBatterIndex());
    }

    public Player getCurrentRunnerOnFirst(){
        if(getGame().getCurrentGameState().isTop()){
            return getGame().getAwayTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerFirstIndex());
        }
        return getGame().getHomeTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerFirstIndex());
    }

    public Player getCurrentRunnerOnSecond(){
        if(getGame().getCurrentGameState().isTop()){
            return getGame().getAwayTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerSecondIndex());
        }
        return getGame().getHomeTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerSecondIndex());
    }

    public Player getCurrentRunnerOnThird(){
        if(getGame().getCurrentGameState().isTop()){
            return getGame().getAwayTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerThirdIndex());
        }
        return getGame().getHomeTeam().getRoster().get(getGame().getCurrentGameState().getCurrRunnerThirdIndex());
    }

    public void nextBatter(){

    }

    public void newGameState(){
        // Copy current game state then add it to the game's gamestate array list and then shift the curr
    }
}
