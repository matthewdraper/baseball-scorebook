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

    public GameState(int ballCount, int strikeCount, int numOuts, int homePitchCount,
                     int awayPitchCount, boolean isTop, int inning, int lineupStateIndex,
                     int currHomeBatterIndex, int currAwayBatterIndex, int currRunnerFirstIndex,
                     int currRunnerSecondIndex, int currRunnerThirdIndex, int homeScore,
                     int awayScore, int homeHits, int awayHits, int homeErrors, int awayErrors) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
        this.numOuts = numOuts;
        this.homePitchCount = homePitchCount;
        this.awayPitchCount = awayPitchCount;
        this.isTop = isTop;
        this.inning = inning;
        this.lineupStateIndex = lineupStateIndex;
        this.currHomeBatterIndex = currHomeBatterIndex;
        this.currAwayBatterIndex = currAwayBatterIndex;
        this.currRunnerFirstIndex = currRunnerFirstIndex;
        this.currRunnerSecondIndex = currRunnerSecondIndex;
        this.currRunnerThirdIndex = currRunnerThirdIndex;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.homeHits = homeHits;
        this.awayHits = awayHits;
        this.homeErrors = homeErrors;
        this.awayErrors = awayErrors;
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
            incrementPitchCount();
        } else {
            throw new Exception("Cannot have four balls. Must handle walk.");
        }
    }

    public void decrementBalls() throws Exception {
        if(getBallCount() > 0){
            setBallCount(getBallCount() - 1);
            decrementPitchCount();
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
            incrementPitchCount();
        } else {
            throw new Exception("Cannot have three strikes. Must handle strikeout.");
        }
    }

    public void decrementStrikes() throws Exception {
        if(getStrikeCount() > 0){
            setStrikeCount(getStrikeCount() - 1);
            decrementPitchCount();
        } else {
            throw new Exception("Cannot have negative strikes.");
        }
    }

    public int getNumOuts() {
        return numOuts;
    }

    private void setNumOuts(int numOuts) {
        this.numOuts = numOuts;
    }

    public void incrementOuts() throws Exception {
        if(getNumOuts() < 3){
            setNumOuts(getNumOuts() + 1);
        } else if(getNumOuts() > 3){
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

    private void setHomePitchCount(int pitchCount) {
        this.homePitchCount = pitchCount;
    }

    private void incrementHomePitchCount(){
        setHomePitchCount(getHomePitchCount() + 1);
    }

    private void decrementHomePitchCount() throws Exception {
        if(getHomePitchCount() > 0){
            setHomePitchCount(getHomePitchCount() - 1);
        } else {
            throw new Exception("Cannot have negative home pitch count.");
        }
    }

    public int getAwayPitchCount() {
        return awayPitchCount;
    }

    private void setAwayPitchCount(int pitchCount) {
        this.awayPitchCount = pitchCount;
    }

    private void incrementAwayPitchCount(){
        setAwayPitchCount(getAwayPitchCount() + 1);
    }

    private void decrementAwayPitchCount() throws Exception {
        if(getAwayPitchCount() > 0){
            setAwayPitchCount(getAwayPitchCount() - 1);
        } else {
            throw new Exception("Cannot have negative away pitch count.");
        }
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

    private void setInning(int inning) {
        this.inning = inning;
    }

    public void nextHalfInning(){
        if(isTop()){
            setTop(false);
            clearOuts();
            clearBaseRunners();
        } else {
            incrementInning();
            setTop(true);
            clearOuts();
            clearBaseRunners();
        }
    }

    public void incrementInning() {
        setInning(getInning() + 1);
    }

    public void decrementInning() {
        /* TODO: 8/18/16 The decrementInning method has no way of restoring the previous pitch count
           todo: outs. Probably won't need the decrement methods though since I'm saving all the
           todo: game states in an array list.
         */

        if(isTop() && getNumOuts() == 0){
            setInning(getInning() - 1);
            setTop(false);
            clearCount();
            setNumOuts(2);
        } else if(!isTop() && getNumOuts() == 0){
            setTop(true);
            clearCount();
            setNumOuts(2);
        }
    }

    public int getLineupStateIndex() {
        return lineupStateIndex;
    }

    private void setLineupStateIndex(int lineupStateIndex) {
        this.lineupStateIndex = lineupStateIndex;
    }

    public void incrementLineupStateIndex(){
        setLineupStateIndex(getLineupStateIndex() + 1);
    }

    public void decrementLineupStateIndex() throws Exception {
        if(getLineupStateIndex() > 0){
            setLineupStateIndex(getLineupStateIndex() - 1);
        } else {
            throw new Exception("Cannot have negative LineupState index.");
        }
    }

    public int getCurrHomeBatterIndex() {
        return currHomeBatterIndex;
    }

    private void setCurrHomeBatterIndex(int currHomeBatterIndex) {
        this.currHomeBatterIndex = currHomeBatterIndex;
    }

    private void incrementCurrHomeBatterIndex(){
        setCurrHomeBatterIndex((getCurrHomeBatterIndex() + 1) % 9);
    }

    private void decrementCurrHomeBatterIndex(){
        setCurrHomeBatterIndex((getCurrHomeBatterIndex() - 1) % 9);
    }

    public int getCurrAwayBatterIndex() {
        return currAwayBatterIndex;
    }

    private void setCurrAwayBatterIndex(int currAwayBatterIndex) {
        this.currAwayBatterIndex = currAwayBatterIndex;
    }

    private void incrementCurrAwayBatterIndex(){
        setCurrAwayBatterIndex((getCurrAwayBatterIndex() + 1) % 9);
    }

    private void decrementCurrAwayBatterIndex(){
        setCurrAwayBatterIndex((getCurrAwayBatterIndex() - 1) % 9);
    }

    public int getCurrRunnerFirstIndex() {
        return currRunnerFirstIndex;
    }

    public void setCurrRunnerFirstIndex(int currRunnerFirstIndex) {
        this.currRunnerFirstIndex = currRunnerFirstIndex;
    }

    public void clearRunnerOnFirst(){
        setCurrRunnerFirstIndex(-1);
    }

    public int getCurrRunnerSecondIndex() {
        return currRunnerSecondIndex;
    }

    public void setCurrRunnerSecondIndex(int currRunnerSecondIndex) {
        this.currRunnerSecondIndex = currRunnerSecondIndex;
    }

    public void clearRunnerOnSecond(){
        setCurrRunnerSecondIndex(-1);
    }

    public int getCurrRunnerThirdIndex() {
        return currRunnerThirdIndex;
    }

    public void setCurrRunnerThirdIndex(int currRunnerThirdIndex) {
        this.currRunnerThirdIndex = currRunnerThirdIndex;
    }

    public void clearRunnerOnThird(){
        setCurrRunnerThirdIndex(-1);
    }

    public void clearBaseRunners(){
        clearRunnerOnFirst();
        clearRunnerOnSecond();
        clearRunnerOnThird();
    }

    public int getHomeScore() {
        return homeScore;
    }

    private void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    private void incrementHomeScore(){
        setHomeScore(getHomeScore() + 1);
    }

    private void decrementHomeScore() throws Exception {
        if(getHomeScore() > 0){
            setHomeScore(getHomeScore() - 1);
        } else {
            throw new Exception("Cannot have negative home score.");
        }
    }

    public int getAwayScore() {
        return awayScore;
    }

    private void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    private void incrementAwayScore(){
        setAwayScore(getAwayScore() + 1);
    }

    private void decrementAwayScore() throws Exception {
        if(getAwayScore() > 0){
            setAwayScore(getAwayScore() - 1);
        } else {
            throw new Exception("Cannot have negative away score.");
        }
    }

    public int getHomeHits() {
        return homeHits;
    }

    private void setHomeHits(int homeHits) {
        this.homeHits = homeHits;
    }

    private void incrementHomeHits(){
        setHomeHits(getHomeHits() + 1);
    }

    private void decrementHomeHits() throws Exception {
        if(getHomeHits() > 0){
            setHomeHits(getHomeHits() - 1);
        } else {
            throw new Exception("Cannot have negative home hits.");
        }
    }

    public int getAwayHits() {
        return awayHits;
    }

    private void setAwayHits(int awayHits) {
        this.awayHits = awayHits;
    }

    private void incrementAwayHits(){
        setAwayHits(getAwayHits() + 1);
    }

    private void decrementAwayHits() throws Exception {
        if(getAwayHits() > 0){
            setAwayHits(getAwayHits() - 1);
        } else {
            throw new Exception("Cannot have negative away hits.");
        }
    }

    public int getHomeErrors() {
        return homeErrors;
    }

    private void setHomeErrors(int homeErrors) {
        this.homeErrors = homeErrors;
    }

    private void incrementHomeErrors(){
        setHomeErrors(getHomeErrors() + 1);
    }

    private void decrementHomeErrors() throws Exception {
        if(getHomeErrors() > 0){
            setHomeErrors(getHomeErrors() - 1);
        } else {
            throw new Exception("Cannot have negative home errors.");
        }
    }

    public int getAwayErrors() {
        return awayErrors;
    }

    private void setAwayErrors(int awayErrors) {
        this.awayErrors = awayErrors;
    }

    private void incrementAwayErrors(){
        setAwayErrors(getAwayErrors() + 1);
    }

    private void decrementAwayErrors() throws Exception {
        if(getAwayErrors() > 0){
            setAwayErrors(getAwayErrors() - 1);
        } else {
            throw new Exception("Cannot have negative away errors.");
        }
    }

    public void nextBatter(){
        if(isTop()){
            incrementCurrAwayBatterIndex();
        } else {
            incrementCurrHomeBatterIndex();
        }
    }

    public void clearCount(){
        setBallCount(0);
        setStrikeCount(0);
    }

    public void clearOuts(){
        setNumOuts(0);
    }

    public void incrementRuns(){
        if(isTop()){
            setAwayScore(getAwayScore() + 1);
        } else {
            setHomeScore(getHomeScore() + 1);
        }
    }

    public void decrementRuns() throws Exception {
        if(isTop()){
            if(getAwayScore() > 0){
                setAwayScore(getAwayScore() - 1);
            } else {
                throw new Exception("Cannot have negative away tean runs.");
            }
        } else {
            if(getHomeScore() > 0){
                setHomeScore(getHomeScore() - 1);
            } else {
                throw new Exception("Cannot have negative home team runs.");
            }
        }
    }

    public int getPitchCount(){
        if(isTop()){
            return getHomePitchCount();
        } else {
            return  getAwayPitchCount();
        }
    }

    public void incrementPitchCount(){
        if(isTop()){
            incrementHomePitchCount();
        } else {
            incrementAwayPitchCount();
        }
    }

    public void decrementPitchCount() throws Exception {
        if(isTop()){
            decrementHomePitchCount();
        } else {
            decrementAwayPitchCount();
        }
    }

    public void incrementScore(){
        if(isTop()){
            incrementAwayScore();
        } else {
            incrementHomeScore();
        }
    }

    public void decrementScore() throws Exception {
        if(isTop()){
            decrementAwayScore();
        } else {
            decrementHomeScore();
        }
    }

    public void incrementHits(){
        if(isTop()){
            incrementAwayHits();
        } else {
            incrementHomeHits();
        }
    }

    public void decrementHits() throws Exception {
        if(isTop()){
            decrementAwayHits();
        } else {
            decrementHomeHits();
        }
    }

    public void incrementErrors(){
        if(isTop()){
            incrementHomeErrors();
        } else {
            incrementAwayErrors();
        }
    }

    public void decrementErrors() throws Exception {
        if(isTop()){
            decrementHomeErrors();
        } else {
            decrementAwayErrors();
        }
    }

    public int getCurrBatterIndex(){
        if(isTop()){
            return getCurrAwayBatterIndex();
        } else {
            return getCurrHomeBatterIndex();
        }
    }
}
