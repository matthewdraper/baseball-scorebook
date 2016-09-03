package com.duxnort.baseballscorebook.Model;

import java.util.ArrayList;

public class Game {
    private ArrayList<GameState> gameStateList = null;
    private ArrayList<LineupState> lineupStatesList = null;
    private int currGameStateIndex = 0;
    private int currLineupStateIndex = 0;
    private Team homeTeam = null;
    private Team awayTeam = null;
    private ArrayList<Umpire> umpireList = null;
    private String fieldName = null;
    private Scorebook scorebook = null;
    // TODO: 8/18/16 Need to implement some sort of date API at some point.

    public Game() {
    }

    public Game(ArrayList<GameState> gameStateList, ArrayList<LineupState> lineupStatesList,
                int currGameStateIndex, int currLineupStateIndex, Team homeTeam, Team awayTeam,
                ArrayList<Umpire> umpireList, String fieldName) {
        this.gameStateList = gameStateList;
        this.lineupStatesList = lineupStatesList;
        this.currGameStateIndex = currGameStateIndex;
        this.currLineupStateIndex = currLineupStateIndex;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.umpireList = umpireList;
        this.fieldName = fieldName;
    }

    public ArrayList<GameState> getGameStateList() {
        return gameStateList;
    }

    public void setGameStateList(ArrayList<GameState> gameStateList) {
        this.gameStateList = gameStateList;
    }

    public ArrayList<LineupState> getLineupStatesList() {
        return lineupStatesList;
    }

    public void setLineupStatesList(ArrayList<LineupState> lineupStatesList) {
        this.lineupStatesList = lineupStatesList;
    }

    public int getCurrGameStateIndex() {
        return currGameStateIndex;
    }

    public void setCurrGameStateIndex(int currGameStateIndex) {
        this.currGameStateIndex = currGameStateIndex;
    }

    public int getCurrLineupStateIndex() {
        return currLineupStateIndex;
    }

    public void setCurrLineupStateIndex(int currLineupStateIndex) {
        this.currLineupStateIndex = currLineupStateIndex;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public ArrayList<Umpire> getUmpireList() {
        return umpireList;
    }

    public void setUmpireList(ArrayList<Umpire> umpireList) {
        this.umpireList = umpireList;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public GameState getCurrentGameState(){
        return getGameStateList().get(getCurrGameStateIndex());
    }

    public Scorebook getScorebook() {
        return scorebook;
    }

    public void setScorebook(Scorebook scorebook) {
        this.scorebook = scorebook;
    }

    public Scorecard getHomeScorecard() {
        return getScorebook().getHomeScorecard();
    }

    public Scorecard getAwayScorecard() {
        return getScorebook().getAwayScorecard();
    }

    public Scorecard getScorecard() {
        if (getCurrentGameState().isTop()) {
            return getAwayScorecard();
        }
        return getHomeScorecard();
    }

    public void newGameState(){
        getGameStateList().add(copyGameState());
        setCurrGameStateIndex(getCurrGameStateIndex() + 1);
    }

    public GameState copyGameState(){
        return new GameState(getCurrentGameState());
    }
    

}
