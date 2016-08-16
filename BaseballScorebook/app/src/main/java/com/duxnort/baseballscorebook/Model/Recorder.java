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
            // Gets the current batter from the away team
            // Holy method chaining...
            Player batter = getGame().getAwayTeam().getRoster().get(gs.getCurrAwayBatterIndex());
            // If the batter is a switch hitter see what hand the pitcher is.
            if(batter.isSwitchHitter()){
                Lineup homeLineup = getGame().getLineupStatesList().get(
                        getGame().getCurrLineupStateIndex()).getHomeLineup();
                int homePitcherIndex = homeLineup.positionsRosterIndex(Position.PITCHER);
                Player homePitcher = getGame().getHomeTeam().getRoster().get(homePitcherIndex);
                // If the pitcher is right handed the batter must bat from the left side
                if(homePitcher.isThrowRight()){
//                    batter.getStats().getHitStatsLeft().setSingles(batter.getStats().getHitStatsLeft().getSingles() + 1);
//                    homePitcher.getStats().getPitchStatsRight().setSingles(homePitcher.getStats().getPitchStatsRight().getSingles() + 1);
                }
            } else {
                if(batter.isBatRight()){

                }
                if(batter.isBatLeft()){

                }
            }
        } else {
            gs.setAwayPitchCount(gs.getAwayPitchCount() + 1);
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
}