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

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(int gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public int getOutInField() {
        return outInField;
    }

    public void setOutInField(int outInField) {
        this.outInField = outInField;
    }

    public int getPutOuts() {
        return putOuts;
    }

    public void setPutOuts(int putOuts) {
        this.putOuts = putOuts;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getErrors() {
        return errors;
    }

    public void setErrors(int errors) {
        this.errors = errors;
    }

    public int getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    public int getPassedBalls() {
        return passedBalls;
    }

    public void setPassedBalls(int passedBalls) {
        this.passedBalls = passedBalls;
    }

    public int getWpCatching() {
        return wpCatching;
    }

    public void setWpCatching(int wpCatching) {
        this.wpCatching = wpCatching;
    }

    public String calcInnings() {
        return null;
    }

    public int calcTotalChances() {
        return 0;
    }

    public double calcStolenBasePct() {
        return 0;
    }

    public double calcFieldingPct() {
        return 0;
    }

    public double calcRangeFactor() {
        return 0;
    }
}
