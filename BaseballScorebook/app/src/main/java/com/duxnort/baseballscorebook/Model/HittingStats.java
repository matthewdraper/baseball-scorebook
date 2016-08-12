package com.duxnort.baseballscorebook.Model;

public class HittingStats {
    private int games = 0;
    private int atBats = 0;
    private int runs = 0;
    private int hits = 0;
    private int doubles = 0;
    private int triples = 0;
    private int homeRuns = 0;
    private int rbis = 0;
    private int walks = 0;
    private int strikeOuts = 0;
    private int stolenBases = 0;
    private int caughtStealing = 0;
    private int intenWalks = 0;
    private int hitByPitch = 0;
    private int sacBunts = 0;
    private int sacFlys = 0;
    private int groundBallDP = 0;
    private int groundOuts = 0;
    private int flyOuts = 0;
    private int numPitches = 0;

    public HittingStats() {
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getRbis() {
        return rbis;
    }

    public void setRbis(int rbis) {
        this.rbis = rbis;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getStrikeOuts() {
        return strikeOuts;
    }

    public void setStrikeOuts(int strikeOuts) {
        this.strikeOuts = strikeOuts;
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

    public int getIntenWalks() {
        return intenWalks;
    }

    public void setIntenWalks(int intenWalks) {
        this.intenWalks = intenWalks;
    }

    public int getHitByPitch() {
        return hitByPitch;
    }

    public void setHitByPitch(int hitByPitch) {
        this.hitByPitch = hitByPitch;
    }

    public int getSacBunts() {
        return sacBunts;
    }

    public void setSacBunts(int sacBunts) {
        this.sacBunts = sacBunts;
    }

    public int getSacFlys() {
        return sacFlys;
    }

    public void setSacFlys(int sacFlys) {
        this.sacFlys = sacFlys;
    }

    public int getGroundBallDP() {
        return groundBallDP;
    }

    public void setGroundBallDP(int groundBallDP) {
        this.groundBallDP = groundBallDP;
    }

    public int getGroundOuts() {
        return groundOuts;
    }

    public void setGroundOuts(int groundOuts) {
        this.groundOuts = groundOuts;
    }

    public int getFlyOuts() {
        return flyOuts;
    }

    public void setFlyOuts(int flyOuts) {
        this.flyOuts = flyOuts;
    }

    public int getNumPitches() {
        return numPitches;
    }

    public void setNumPitches(int numPitches) {
        this.numPitches = numPitches;
    }

    public double calcBattingAvg() {
        return 0;
    }

    public double calcOnBasePct() {
        return 0;
    }

    public double calcSlugPct() {
        return 0;
    }

    public double calcOBPS() {
        return 0;
    }

    public double calcTotalBases() {
        return 0;
    }

    public double calcXBH() {
        return 0;
    }

    public double calcGOAO() {
        return 0;
    }

    public double calcPlateApps() {
        return 0;
    }
}
