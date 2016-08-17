package com.duxnort.baseballscorebook.Model;

import java.util.ArrayList;
import java.util.Date;

public class Game {
    private ArrayList<GameState> gameStateList = null;
    private ArrayList<LineupState> lineupStatesList = null;
    private int currGameStateIndex = 0;
    private int currLineupStateIndex = 0;
    private Team homeTeam = null;
    private Team awayTeam = null;
    private Date startTime = null;
    private Date endTime = null;
    private ArrayList<Umpire> umpireList = null;
    private String fieldName = null;

    public Game() {
    }

    public Game(ArrayList<GameState> gameStateList, ArrayList<LineupState> lineupStatesList,
                int currGameStateIndex, int currLineupStateIndex, Team homeTeam, Team awayTeam,
                Date startTime, Date endTime, ArrayList<Umpire> umpireList, String fieldName) {
        this.gameStateList = gameStateList;
        this.lineupStatesList = lineupStatesList;
        this.currGameStateIndex = currGameStateIndex;
        this.currLineupStateIndex = currLineupStateIndex;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.startTime = startTime;
        this.endTime = endTime;
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

    private int getCurrGameStateIndex() {
        return currGameStateIndex;
    }

    private void setCurrGameStateIndex(int currGameStateIndex) {
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public void newGameState(){
        getGameStateList().add(copyGameState());
        setCurrGameStateIndex(getCurrGameStateIndex() + 1);
    }

    public GameState copyGameState(){
        return new GameState(getCurrentGameState());
    }
    

}
