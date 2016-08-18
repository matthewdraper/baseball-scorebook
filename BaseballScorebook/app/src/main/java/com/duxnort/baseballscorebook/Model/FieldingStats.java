package com.duxnort.baseballscorebook.Model;

public class FieldingStats {
    private int games = 0;
    private int gamesStarted = 0;
    private int outInField = 0;
    private int putOuts = 0;
    private int assists = 0;
    private int errors = 0;
    private int stolenBases = 0;
    private int caughtStealing = 0;
    private int passedBalls = 0;
    private int wpCatching = 0;

    public FieldingStats() {
    }

    public FieldingStats(int games, int gamesStarted, int outInField, int putOuts, int assists,
                         int errors, int stolenBases, int caughtStealing, int passedBalls,
                         int wpCatching) {
        this.games = games;
        this.gamesStarted = gamesStarted;
        this.outInField = outInField;
        this.putOuts = putOuts;
        this.assists = assists;
        this.errors = errors;
        this.stolenBases = stolenBases;
        this.caughtStealing = caughtStealing;
        this.passedBalls = passedBalls;
        this.wpCatching = wpCatching;
    }

    public int getGames() {
        return games;
    }

    private void setGames(int games) {
        this.games = games;
    }

    public void incrementGames(){
        setGames(getGames() + 1);
    }

    public void decrementGames() throws Exception {
        if(getGames() > 0){
            setGames(getGames() - 1);
        } else {
            throw new Exception("Cannot have negative Games(Fielder).");
        }
    }

    public int getGamesStarted() {
        return gamesStarted;
    }

    private void setGamesStarted(int gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public void incrementGamesStarted(){
        setGamesStarted(getGamesStarted() + 1);
    }

    public void decrementGamesStarted() throws Exception {
        if(getGamesStarted() > 0){
            setGamesStarted(getGamesStarted() - 1);
        } else {
            throw new Exception("Cannot have negative Games Started(Fielder).");
        }
    }

    public int getOutInField() {
        return outInField;
    }

    private void setOutInField(int outInField) {
        this.outInField = outInField;
    }

    public void incrementOutInField(){
        setOutInField(getOutInField() + 1);
    }

    public void decrementOutInField() throws Exception {
        if(getOutInField() > 0){
            setOutInField(getOutInField() - 1);
        } else {
            throw new Exception("Cannot have negative Outs In Field(Fielder).");
        }
    }

    public int getPutOuts() {
        return putOuts;
    }

    private void setPutOuts(int putOuts) {
        this.putOuts = putOuts;
    }

    public void incrementPutOuts(){
        setPutOuts(getPutOuts() + 1);
    }

    public void decrementPutOuts() throws Exception {
        if(getPutOuts() > 0){
            setPutOuts(getPutOuts() - 1);
        } else {
            throw new Exception("Cannot have negative Put Outs(Fielder).");
        }
    }

    public int getAssists() {
        return assists;
    }

    private void setAssists(int assists) {
        this.assists = assists;
    }

    public void incrementAssists(){
        setAssists(getAssists() + 1);
    }

    public void decrementAssists() throws Exception {
        if(getAssists() > 0){
            setAssists(getAssists() - 1);
        } else {
            throw new Exception("Cannot have negative Assists(Fielder)");
        }
    }

    public int getErrors() {
        return errors;
    }

    private void setErrors(int errors) {
        this.errors = errors;
    }

    public void incrementErrors(){
        setErrors(getErrors() + 1);
    }

    public void decrementErrors() throws Exception {
        if(getErrors() > 0){
            setErrors(getErrors() - 1);
        } else {
            throw new Exception("Cannot have negative Errors(Fielder)");
        }
    }

    public int getStolenBases() {
        return stolenBases;
    }

    private void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public void incrementStolenBases(){
        setStolenBases(getStolenBases() + 1);
    }

    public void decrementStolenBases() throws Exception {
        if(getStolenBases() > 0){
            setStolenBases(getStolenBases() - 1);
        } else {
            throw new Exception("Cannot have negative Stolen Bases(Fielder).");
        }
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    private void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    public void incrementCaughtStealing(){
        setCaughtStealing(getCaughtStealing() + 1);
    }

    public void decrementCaughtStealing() throws Exception {
        if(getCaughtStealing() > 0){
            setCaughtStealing(getCaughtStealing() - 1);
        } else {
            throw new Exception("Cannot have negative Caught Stealings(Fielder).");
        }
    }

    public int getPassedBalls() {
        return passedBalls;
    }

    private void setPassedBalls(int passedBalls) {
        this.passedBalls = passedBalls;
    }

    public void incrementPassedBalls() {
        setPassedBalls(getPassedBalls() + 1);
    }

    public void decrementPassedBalls() throws Exception {
        if(getPassedBalls() > 0){
            setPassedBalls(getPassedBalls() - 1);
        } else {
            throw new Exception("Cannot have negative Passed Balls(Fielder).");
        }
    }

    public int getWpCatching() {
        return wpCatching;
    }

    private void setWpCatching(int wpCatching) {
        this.wpCatching = wpCatching;
    }

    public void incrementWpCatching(){
        setWpCatching(getWpCatching() + 1);
    }

    public void decrementWpCatching() throws Exception {
        if(getWpCatching() > 0){
            setWpCatching(getWpCatching() - 1);
        } else {
            throw new Exception("Cannot have negative Wild Pitches(Fielder).");
        }
    }

    public String calcInnings() {
        return Integer.toString(getOutInField() / 3).concat(".").concat(Integer.toString(getOutInField() % 3));
    }

    public int calcTotalChances() {
        return getAssists() + getPutOuts() + getErrors();
    }

    public double calcStolenBasePct() throws Exception {
        if((getStolenBases() + getCaughtStealing()) < 1){
            throw new Exception("Cannnot calculate Total Chances with no stolen bases and no caught stealings.");
        }
        return ((double) getStolenBases()) / ((double) getStolenBases() + (double) getCaughtStealing());
    }

    public double calcFieldingPct() throws Exception {
        if((getPutOuts() + getAssists() + getErrors()) < 1){
            throw new Exception("Cannot calculate Fielding Pct with no put outs, no assists, and no errors.");
        }
        return ((double) getPutOuts() + (double) getAssists()) / ((double) getPutOuts() + (double) getAssists() + (double) getErrors());
    }

    public double calcRangeFactor() throws Exception {
        if(getOutInField() < 1){
            throw new Exception("Cannot calculate Range Factor with less than one outs in the field.");
        }
        return ((double) getPutOuts() + (double) getAssists()) / ((double) getOutInField() / 3);
    }
}
