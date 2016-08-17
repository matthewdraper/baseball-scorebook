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
        nextBatter();
    }

    public void recordDouble() {
        recordGameState();
        getPitcherStats().incrementDoubles();
        getBatterStats().incrementDoubles();
        clearCount();
        recordHit();
        nextBatter();
    }

    public void recordTriple(){
        recordGameState();
        getPitcherStats().incrementTriples();
        getBatterStats().incrementTriples();
        clearCount();
        recordHit();
        nextBatter();
    }

    public void recordHomeRun(){
        recordGameState();
        getPitcherStats().incrementHomeRuns();
        getBatterStats().incrementHomeRuns();
        // Have to manually record whether or not any existing base runners were earned or unearned
        // runs.
        clearCount();
        recordHit();
        recordRunScored(getCurrentBatter(), true);
        nextBatter();
    }

    public void recordStolenBase(Player baseRunner){
        recordGameState();
        baseRunner.getStats().getRunningStats().incrementStolenBases();
        getPitcherStats().incrementStolenBases();
        getCatcherStats().incrementStolenBases();
    }

    public void recordRunScored(Player baseRunner, Boolean isEarnedRun){
        recordGameState();
        baseRunner.getStats().getRunningStats().incrementRuns();
        getGame().getCurrentGameState().incrementRuns();

        if(isEarnedRun == true){
            recordEarnedRun();
        } else {
            getPitcherStats().incrementRuns();
        }
    }

    /**
     * This method should only be used to describe when a base runner scores.
     */
    public void recordRunBattedIn(){
        getBatterStats().incrementRbis();
    }

    private void recordEarnedRun(){
        getPitcherStats().incrementEarnedRuns();
    }

    public void recordWalk(){
        recordGameState();
        getPitcherStats().incrementWalks();
        getBatterStats().incrementWalks();
        clearCount();
        nextBatter();
    }

    public void recordIntentionalWalk(){
        recordGameState();
        getPitcherStats().incrementIntenWalks();
        getBatterStats().incrementIntenWalks();
        clearCount();
        nextBatter();
    }

    public void recordCaughtStealing(Player baseRunner){
        recordGameState();
        baseRunner.getStats().getRunningStats().incrementCaughtStealing();
        getPitcherStats().incrementCaughtStealing();
        getCatcherStats().incrementCaughtStealing();
    }

    public void recordStrikeOutLooking() throws Exception {
        recordGameState();
        getPitcherStats().incrementStrikeOutLook();
        getBatterStats().incrementStrikeOuts();
        incrementOuts();
        clearCount();
        nextBatter();
    }

    public void recordStrikeOutSwinging() throws Exception {
        recordGameState();
        getPitcherStats().incrementStrikeOutLook();
        getBatterStats().incrementStrikeOuts();
        incrementOuts();
        clearCount();
        nextBatter();
    }

    public void recordHitByPitch(){
        recordGameState();
        getPitcherStats().incrementHitBatsmen();
        getBatterStats().incrementHitByPitch();
        clearCount();
        nextBatter();
    }

    public void recordSacrificeBunt(String positionsInvolved) throws Exception {
        recordGameState();
        getPitcherStats().incrementSacBunts();
        getBatterStats().incrementSacBunts();
        incrementOuts();
        // Record fielding stats here.
        clearCount();
        nextBatter();
    }

    public void recordSacrificeFly(String positionsInvolved, boolean isEarnedRun) throws Exception {
        recordGameState();
        getPitcherStats().incrementTotalNumBF();
        getBatterStats().incrementSacFlys();
        incrementOuts();
        if(isEarnedRun){
            getPitcherStats().incrementEarnedRuns();
        } else {
            getPitcherStats().incrementRuns();
        }
        // todo: Record fielding stats here.

        clearCount();
        nextBatter();
    }

    public void recordGroundBallDoublePlay(String positionsInvolved) throws Exception {
        recordGameState();
        getPitcherStats().incrementInducedGBDPs();
        getBatterStats().incrementGroundBallDP();
        incrementOuts();
        incrementOuts();
        // todo: Record fielding stats here.

        clearCount();
        nextBatter();
    }

    public void recordGroundBallOut(String positionsInvolved) throws Exception {
        recordGameState();
        getPitcherStats().incrementGroundOuts();
        getBatterStats().incrementGroundOuts();
        incrementOuts();
        // todo: Record fielding stats here.

        clearCount();
        nextBatter();
    }

    public void recordFlyBallOut(String positionsInvolved) throws Exception {
        recordGameState();
        getPitcherStats().incrementFlyOuts();
        getBatterStats().incrementFlyOuts();
        incrementOuts();
        // todo: Record fielding stats here.

        clearCount();
        nextBatter();
    }

    public void recordPutOut(Position pos){
        getCurrentDefensivePlayer(pos).getStats().getFieldingStats().incrementPutOuts();
    }

    public void recordAssist(Position pos){
        getCurrentDefensivePlayer(pos).getStats().getFieldingStats().incrementAssists();
    }

    public void recordWildPitch(){
        getPitcherStats().incrementWildPitches();
        getCatcherStats().incrementWpCatching();
    }

    public void recordPassedBall(){
        getCatcherStats().incrementPassedBalls();
    }

    public void recordBalk(){
        getPitcherStats().incrementBalks();
    }

    public void recordPickOff() throws Exception {
        getPitcherStats().incrementPickOffs();
        incrementOuts();
        // todo: Record fielding stats here.

        clearCount();
        nextBatter();
    }

    public void recordUnassistedPutOut(Position pos){
        recordPutOut(pos);
        // Record in scorebook as unassited.
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

    public Player getCurrentDefensivePlayer(Position pos){
        if(getGame().getCurrentGameState().isTop()){
           return getHomePlayerAtPos(pos);
        }
        return getAwayPlayerAtPos(pos);
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
            return getHomePlayerAtPos(Position.PITCHER);
        }
        return getAwayPlayerAtPos(Position.PITCHER);
    }

    public Player getCurrentCatcher(){
        if(getGame().getCurrentGameState().isTop()){
            return getHomePlayerAtPos(Position.CATCHER);
        }
        return  getAwayPlayerAtPos(Position.CATCHER);
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

    public FieldingStats getCatcherStats(){
        return getCurrentCatcher().getStats().getFieldingStats();
    }

    public int getNumberOfBaserunners(){
        return 0;
    }
}
