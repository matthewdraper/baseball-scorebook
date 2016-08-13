package com.duxnort.baseballscorebook.Model;

public class GameState {
    private int ballCount = 0;
    private int strikeCount = 0;
    private int homePitchCount = 0;
    private int awayPitchCount = 0;
    private boolean isTop = true;
    private int inning = 1;
    private int lineupStateIndex = 0;
    private int currHomeBatterIndex = 0;
    private int currAwayBatterIndex = 0;
    private int currRunnerFirstIndex = -1;
    private int currRunnerSecondIndex = -1;
    private int currRunnerThirdIndex = -1;
    private int homeScore = 0;
    private int awayScore = 0;
    private int homeHits = 0;
    private int awayHits = 0;
    private int homeErrors = 0;
    private int awayErrors = 0;

    public GameState() {
    }

    public int getBallCount() {
        return ballCount;
    }

    public void setBallCount(int ballCount) {
        this.ballCount = ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public void setStrikeCount(int strikeCount) {
        this.strikeCount = strikeCount;
    }

    public int getHomePitchCount() {
        return homePitchCount;
    }

    public void setHomePitchCount(int pitchCount) {
        this.homePitchCount = pitchCount;
    }

    public int getAwayPitchCount() {
        return awayPitchCount;
    }

    public void setAwayPitchCount(int pitchCount) {
        this.awayPitchCount = pitchCount;
    }

    public boolean isTop() {
        return isTop;
    }

    public void setTop(boolean top) {
        isTop = top;
    }

    public int getInning() {
        return inning;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }

    public int getLineupStateIndex() {
        return lineupStateIndex;
    }

    public void setLineupStateIndex(int lineupStateIndex) {
        this.lineupStateIndex = lineupStateIndex;
    }

    public int getCurrHomeBatterIndex() {
        return currHomeBatterIndex;
    }

    public void setCurrHomeBatterIndex(int currHomeBatterIndex) {
        this.currHomeBatterIndex = currHomeBatterIndex;
    }

    public int getCurrAwayBatterIndex() {
        return currAwayBatterIndex;
    }

    public void setCurrAwayBatterIndex(int currAwayBatterIndex) {
        this.currAwayBatterIndex = currAwayBatterIndex;
    }

    public int getCurrRunnerFirstIndex() {
        return currRunnerFirstIndex;
    }

    public void setCurrRunnerFirstIndex(int currRunnerFirstIndex) {
        this.currRunnerFirstIndex = currRunnerFirstIndex;
    }

    public int getCurrRunnerSecondIndex() {
        return currRunnerSecondIndex;
    }

    public void setCurrRunnerSecondIndex(int currRunnerSecondIndex) {
        this.currRunnerSecondIndex = currRunnerSecondIndex;
    }

    public int getCurrRunnerThirdIndex() {
        return currRunnerThirdIndex;
    }

    public void setCurrRunnerThirdIndex(int currRunnerThirdIndex) {
        this.currRunnerThirdIndex = currRunnerThirdIndex;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public int getHomeHits() {
        return homeHits;
    }

    public void setHomeHits(int homeHits) {
        this.homeHits = homeHits;
    }

    public int getAwayHits() {
        return awayHits;
    }

    public void setAwayHits(int awayHits) {
        this.awayHits = awayHits;
    }

    public int getHomeErrors() {
        return homeErrors;
    }

    public void setHomeErrors(int homeErrors) {
        this.homeErrors = homeErrors;
    }

    public int getAwayErrors() {
        return awayErrors;
    }

    public void setAwayErrors(int awayErrors) {
        this.awayErrors = awayErrors;
    }
}
