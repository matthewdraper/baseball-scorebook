package com.duxnort.baseballscorebook.Model;

public class HittingStats {
    private int games = 0;
    private int atBats = 0;
    private int runs = 0;
    private int singles = 0;
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
            throw new Exception("Cannot have negative Games.");
        }
    }

    public int getAtBats() {
        return atBats;
    }

    private void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public void incrementAtBats() {
        setAtBats(getAtBats() + 1);
    }

    public void decrementAtBats() throws Exception {
        if(getAtBats() > 0){
            setAtBats(getAtBats() - 1);
        } else {
            throw new Exception("Cannot have negative At Bats.");
        }
    }

    public int getRuns() {
        return runs;
    }

    private void setRuns(int runs) {
        this.runs = runs;
    }

    public void incrementRuns(){
        setRuns(getRuns() + 1);
    }

    public void decrementRuns() throws Exception {
        if(getRuns() > 0){
            setRuns(getRuns() - 1);
        } else {
            throw new Exception("Cannot have negative Runs.");
        }
    }

    public int getSingles() {
        return singles;
    }

    private void setSingles(int singles) {
        this.singles = singles;
    }

    public void incrementSingles(){
        setSingles(getSingles() + 1);
    }

    public void decrementSingles() throws Exception {
        if(getSingles() > 0){
            setSingles(getSingles() - 1);
        } else {
            throw new Exception("Cannot have negative Singles.");
        }
    }

    public int getDoubles() {
        return doubles;
    }

    private void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public void incrementDoubles() {
        setDoubles(getDoubles() + 1);
    }

    public void decrementDoubles() throws Exception {
        if(getDoubles() > 0){
            setDoubles(getDoubles() - 1);
        } else {
            throw new Exception("Cannot have negative Doubles");
        }
    }

    public int getTriples() {
        return triples;
    }

    private void setTriples(int triples) {
        this.triples = triples;
    }

    public void incrementTriple(){
        setTriples(getTriples() + 1);
    }

    public void decrementTriples() throws Exception {
        if(getTriples() > 0){
            setTriples(getTriples() - 1);
        } else {
            throw new Exception("Cannot have negative Triples");
        }
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    private void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public void incrementHomeRuns() {
        setHomeRuns(getHomeRuns() + 1);
    }

    public void decrementHomeRuns() throws Exception {
        if(getHomeRuns() > 0){
            setHomeRuns(getHomeRuns() - 1);
        } else {
            throw new Exception("Cannot have negative Home Runs.");
        }
    }

    public int getRbis() {
        return rbis;
    }

    private void setRbis(int rbis) {
        this.rbis = rbis;
    }

    public void incrementRbis(){
        setRbis(getRbis() + 1);
    }

    public void decrementRbis() throws Exception {
        if(getRbis() > 0){
            setRbis(getRbis() - 1);
        } else {
            throw new Exception("Cannot have negative RBIs.");
        }
    }

    public int getWalks() {
        return walks;
    }

    private void setWalks(int walks) {
        this.walks = walks;
    }

    public void incrementWalks(){
        setWalks(getWalks() + 1);
    }

    public void decrementWalks() throws Exception {
        if(getWalks() > 0){
            setWalks(getWalks() - 1);
        } else {
            throw new Exception("Cannot have negative Walks.");
        }
    }

    public int getStrikeOuts() {
        return strikeOuts;
    }

    private void setStrikeOuts(int strikeOuts) {
        this.strikeOuts = strikeOuts;
    }

    public void incrementStrikeOuts(){
        setStrikeOuts(getStrikeOuts() + 1);
    }

    public void decrementStrikeOuts() throws Exception {
        if(getStrikeOuts() > 0) {
            setStrikeOuts(getStrikeOuts() - 1);
        } else {
            throw new Exception("Cannot have negative Strike Outs.");
        }
    }

    public int getStolenBases() {
        return stolenBases;
    }

    private void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public void incrementStolenBases() {
        setStolenBases(getStolenBases() + 1);
    }

    public void decrementStolenBases() throws Exception {
        if(getStolenBases() > 0){
            setStolenBases(getStolenBases() - 1);
        } else {
            throw new Exception("Cannot have negative Stolen Bases.");
        }
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    private void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    public void incrementCaughtStealing() {
        setCaughtStealing(getCaughtStealing() + 1);
    }

    public void decrementCaughtStealing() throws Exception {
        if(getCaughtStealing() > 0){
            setCaughtStealing(getCaughtStealing() - 1);
        } else {
            throw new Exception("Cannot have negative Caught Stealing.");
        }
    }

    public int getIntenWalks() {
        return intenWalks;
    }

    private void setIntenWalks(int intenWalks) {
        this.intenWalks = intenWalks;
    }

    public void incrementIntenWalks() {
        setIntenWalks(getIntenWalks() + 1);
    }

    public void decrementIntenWalks() throws Exception {
        if(getIntenWalks() > 0){
            setIntenWalks(getIntenWalks() - 1);
        } else {
            throw new Exception("Cannot have negative Intentional Walks.");
        }
    }

    public int getHitByPitch() {
        return hitByPitch;
    }

    private void setHitByPitch(int hitByPitch) {
        this.hitByPitch = hitByPitch;
    }

    public void incrementHitByPitch() {
        setHitByPitch(getHitByPitch() + 1);
    }

    public void decrementHitByPitch() throws Exception {
        if(getHitByPitch() > 0){
            setHitByPitch(getHitByPitch() - 1);
        } else {
            throw new Exception("Cannot have negative Hit By Pitches.");
        }
    }

    public int getSacBunts() {
        return sacBunts;
    }

    private void setSacBunts(int sacBunts) {
        this.sacBunts = sacBunts;
    }

    public void incrementSacBunts(){
        setSacBunts(getSacBunts() + 1);
    }

    public void decrementSacBunts() throws Exception {
        if(getSacBunts() > 0){
            setSacBunts(getSacBunts() - 1);
        } else {
            throw new Exception("Cannot have negative Sacrifice Bunts");
        }
    }

    public int getSacFlys() {
        return sacFlys;
    }

    private void setSacFlys(int sacFlys) {
        this.sacFlys = sacFlys;
    }

    public void incrementSacFlys(){
        setSacFlys(getSacFlys() + 1);
    }

    public void decrementSacFlys() throws Exception {
        if(getSacFlys() > 0){
            setSacFlys(getSacFlys() - 1);
        } else {
            throw new Exception("Cannot have negative Sacrifice Flys.");
        }
    }

    public int getGroundBallDP() {
        return groundBallDP;
    }

    private void setGroundBallDP(int groundBallDP) {
        this.groundBallDP = groundBallDP;
    }

    public void incrementGroundBallDP() {
        setGroundBallDP(getGroundBallDP() + 1);
    }

    public void decrementGroundBallDP() throws Exception {
        if(getGroundBallDP() > 0) {
            setGroundBallDP(getGroundBallDP() - 1);
        } else {
            throw new Exception("Cannot have negative Ground Ball Double Plays.");
        }
    }

    public int getGroundOuts() {
        return groundOuts;
    }

    private void setGroundOuts(int groundOuts) {
        this.groundOuts = groundOuts;
    }

    public void incrementGroundOuts() {
        setGroundOuts(getGroundOuts() + 1);
    }

    public void decrementGroundOuts() throws Exception {
        if(getGroundOuts() > 0){
            setGroundOuts(getGroundOuts() - 1);
        } else {
            throw new Exception("Cannot have negative Ground Outs.");
        }
    }

    public int getFlyOuts() {
        return flyOuts;
    }

    private void setFlyOuts(int flyOuts) {
        this.flyOuts = flyOuts;
    }

    public void incrementFlyOuts() {
        setFlyOuts(getFlyOuts() + 1);
    }

    public void decrementFlyOuts() throws Exception {
        if(getFlyOuts() > 0){
            setFlyOuts(getFlyOuts() - 1);
        } else {
            throw new Exception("Cannot have negative Fly Outs.");
        }
    }

    public int getNumPitches() {
        return numPitches;
    }

    private void setNumPitches(int numPitches) {
        this.numPitches = numPitches;
    }

    public void incrementNumPitches() {
        setNumPitches(getNumPitches() + 1);
    }

    public void decrementNumPitches() throws Exception {
        if(getNumPitches() > 0){
            setNumPitches(getNumPitches() - 1);
        } else {
            throw new Exception("Cannot have negative Number of Pitches(Batter).");
        }
    }

    public double calcBattingAvg() {
        return ((double) calcHits()) / ((double) getAtBats());
    }

    public double calcOnBasePct() {
        return ((double) calcHits() + (double) getWalks() + (double) getIntenWalks() + (double) getHitByPitch()) / ((double) calcPlateApps() - (double) getSacBunts());
    }

    public double calcSlugPct() {
        return ((double) calcTotalBases()) / (double) getAtBats();
    }

    public double calcOBPS() {
        return calcOnBasePct() + calcSlugPct();
    }

    public int calcTotalBases() {
        return ((getSingles()) + (getDoubles() * 2) + (getTriples() * 3) + (getHomeRuns() * 4));
    }

    public int calcXBH() {
        return getDoubles() + getTriples() + getHomeRuns(); // More efficient than subtracting singles from hits.
    }

    public double calcGOAO() {
        return ((double) getGroundOuts()) / ((double) getFlyOuts());
    }

    public int calcPlateApps() {
        return getAtBats() + getWalks() + getIntenWalks() + getHitByPitch() + getSacBunts() + getSacFlys();
    }

    public int calcHits() {
        return getSingles() + getDoubles() + getTriples() + getHomeRuns();
    }

}
