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

    }

    public void recordBall() throws Exception {

    }

    public void recordHit() {
        GameState gs = getGame().getCurrentGameState();
        if(gs.isTop()){
            gs.setAwayHits(gs.getAwayHits() + 1);
        }
        gs.setHomeHits(gs.getHomeHits() + 1);
    }

    public void recordSingle() {
        recordGameState();
        getPitcherStats().incrementSingles();
        getBatterStats().incrementSingles();
        clearCount();
        recordHit();
    }

    public void recordDouble() {
        recordGameState();
        getPitcherStats().incrementDoubles();
        getBatterStats().incrementDoubles();
        clearCount();
        recordHit();
    }

    public void recordTriple(){
        recordGameState();
        getPitcherStats().incrementTriples();
        getBatterStats().incrementTriples();
        clearCount();
        recordHit();
    }

    public void recordHomeRun(){
        recordGameState();
        getPitcherStats().incrementHomeRuns();
        getBatterStats().incrementHomeRuns();
        for(int i = getNumberOfBaserunners(); i > 0; i--){

        }
        clearCount();
        recordHit();
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

    public Player getCurrentBatter(){
        if(getGame().getCurrentGameState().isTop()){
            return getCurrentAwayBatter();
        }
        return getCurrentHomeBatter();
    }

    public Player getCurrentPitcher(){
        if(getGame().getCurrentGameState().isTop()){
            return getGame().getHomeTeam().getRoster().get(getCurrentHomeLineup().positionsRosterIndex(Position.PITCHER));
        }
        return getGame().getAwayTeam().getRoster().get(getCurrentAwayLineup().positionsRosterIndex(Position.PITCHER));
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
        getGame().getCurrentGameState().nextBatter();
    }

    public void recordGameState(){
        getGame().newGameState();
    }

    public void plateAppearanceFinished(){
        recordGameState();
        clearCount();
    }

    public void clearCount(){
        getGame().getCurrentGameState().clearCount();
    }

    /**
     * This method must be implemented after plateAppearanceFinished()
     * @throws Exception
     */
    public void incrementOuts() throws Exception {
        getGame().getCurrentGameState().incrementOuts();
    }

    public HittingStats getBatterStats(){
        if(getCurrentBatter().isSwitchHitter()){
            if(getCurrentPitcher().isThrowRight()){
                return getCurrentBatter().getStats().getHitStatsLeft();
            }
            if(getCurrentPitcher().isThrowLeft()){
                return getCurrentBatter().getStats().getHitStatsRight();
            }
        }
            if(getCurrentBatter().isBatRight()){
                return getCurrentBatter().getStats().getHitStatsRight();
            }
        return getCurrentBatter().getStats().getHitStatsLeft();
    }

    public PitchingStats getPitcherStats(){
        if(getCurrentPitcher().isThrowRight()){
            return getCurrentPitcher().getStats().getPitchStatsRight();
        }
        return getCurrentPitcher().getStats().getPitchStatsLeft();
    }

    public int getNumberOfBaserunners(){

    }
}
