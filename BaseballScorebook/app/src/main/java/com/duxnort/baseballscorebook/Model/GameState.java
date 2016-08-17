package com.duxnort.baseballscorebook.Model;

public class GameState {
    private final int NUM_BATTERS = 9;
    private int ballCount = 0;
    private int strikeCount = 0;
    private int numOuts = 0;
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

    // copy constructor
    public GameState(GameState gameState){
        setBallCount(gameState.getBallCount());
        setStrikeCount(gameState.getStrikeCount());
        setHomePitchCount(gameState.getHomePitchCount());
        setAwayPitchCount(gameState.getAwayPitchCount());
        setTop(gameState.isTop());
        setInning(gameState.getInning());
        setLineupStateIndex(gameState.getLineupStateIndex());
        setCurrHomeBatterIndex(gameState.getCurrHomeBatterIndex());
        setCurrAwayBatterIndex(gameState.getCurrAwayBatterIndex());
        setCurrRunnerFirstIndex(gameState.getCurrRunnerFirstIndex());
        setCurrRunnerSecondIndex(gameState.getCurrRunnerSecondIndex());
        setCurrRunnerThirdIndex(gameState.getCurrRunnerThirdIndex());
        setHomeScore(gameState.getHomeScore());
        setAwayScore(gameState.getAwayScore());
        setHomeHits(gameState.getHomeHits());
        setAwayHits(gameState.getAwayHits());
        setHomeErrors(gameState.getHomeErrors());
        setAwayErrors(gameState.getAwayErrors());
    }


    public int getBallCount() {
        return ballCount;
    }

    private void setBallCount(int ballCount) {
        this.ballCount = ballCount;
    }

    public void incrementBalls() throws Exception {
        if(getBallCount() < 3){
            setBallCount(getBallCount() + 1);
        } else {
            throw new Exception("Cannot have four balls. Must handle walk.");
        }
    }

    public void decrementBalls() throws Exception {
        if(getBallCount() > 0){
            setBallCount(getBallCount() - 1);
        } else {
            throw new Exception("Cannot have negative balls.");
        }
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    private void setStrikeCount(int strikeCount) {
        this.strikeCount = strikeCount;
    }

    public void incrementStrikes() throws Exception {
        if(getStrikeCount() < 2){
            setStrikeCount(getStrikeCount() + 1);
        } else {
            throw new Exception("Cannot have three strikes. Must handle strikeout.");
        }
    }

    public void decrementStrikes() throws Exception {
        if(getStrikeCount() > 0){
            setStrikeCount(getStrikeCount() - 1);
        } else {
            throw new Exception("Cannot have negative strikes.");
        }
    }

    public int getNumOuts() {
        return numOuts;
    }

    public void setNumOuts(int numOuts) {
        this.numOuts = numOuts;
    }

    public void incrementOuts() throws Exception {
        if(getNumOuts() < 3){
            setNumOuts(getNumOuts() + 1);
        } else {
            throw new Exception("Cannot have more than 3 outs in a half inning.");
        }
        // Checks if there is three outs and increments inning appropriately.
        incrementInning();
    }

    public void decrementOuts() throws Exception {
        if(getNumOuts() > 0){
            setNumOuts(getNumOuts() - 1);
        } else {
            throw new Exception("Cannot have negative outs.");
        }
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

    public void incrementInning() {
        if(!isTop() && getNumOuts() == 3){
            setInning(getInning() + 1);
            setTop(true);
            clearCount();
            setNumOuts(0);
        } else if(isTop() && getNumOuts() == 3){
            setTop(false);
            clearCount();
            setNumOuts(0);
        }
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

    public void nextBatter(){
        if(isTop()){
            setCurrAwayBatterIndex((getCurrAwayBatterIndex() + 1) % NUM_BATTERS);
        } else {
            setCurrHomeBatterIndex((getCurrHomeBatterIndex() + 1) % NUM_BATTERS);
        }
    }

    public void clearCount(){
        setBallCount(0);
        setStrikeCount(0);
    }
}
