package com.duxnort.baseballscorebook.Model;

public class HittingStats {
    private int games = 0;
    private int atBats = 0;
    private int singles = 0;
    private int doubles = 0;
    private int triples = 0;
    private int homeRuns = 0;
    private int rbis = 0;
    private int walks = 0;
    private int strikeOuts = 0;
    private int intenWalks = 0;
    private int hitByPitch = 0;
    private int sacBunts = 0;
    private int sacFlys = 0;
    private int groundBallDP = 0;
    private int groundOuts = 0;
    private int flyOuts = 0;
    private int numPitches = 0;
    private int plateAppearance = 0;

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
            throw new Exception("Cannot have negative Games(Batter).");
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
        incrementPlateApperance();
    }

    public void decrementAtBats() throws Exception {
        if(getAtBats() > 0){
            setAtBats(getAtBats() - 1);
        } else {
            throw new Exception("Cannot have negative At Bats(Batter).");
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
        incrementAtBats();
    }

    public void decrementSingles() throws Exception {
        if(getSingles() > 0){
            setSingles(getSingles() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negative Singles(Batter).");
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
        incrementAtBats();
    }

    public void decrementDoubles() throws Exception {
        if(getDoubles() > 0){
            setDoubles(getDoubles() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negative Doubles(Batter).");
        }
    }

    public int getTriples() {
        return triples;
    }

    private void setTriples(int triples) {
        this.triples = triples;
    }

    public void incrementTriples(){
        setTriples(getTriples() + 1);
        incrementAtBats();
    }

    public void decrementTriples() throws Exception {
        if(getTriples() > 0){
            setTriples(getTriples() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negative Triples(Batter).");
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
        incrementRbis();
        incrementAtBats();
    }

    public void decrementHomeRuns() throws Exception {
        if(getHomeRuns() > 0){
            setHomeRuns(getHomeRuns() - 1);
            decrementAtBats();
            decrementRbis();
        } else {
            throw new Exception("Cannot have negative Home Runs(Batter).");
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
            throw new Exception("Cannot have negative RBIs(Batter).");
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
        incrementPlateApperance();
    }

    public void decrementWalks() throws Exception {
        if(getWalks() > 0){
            setWalks(getWalks() - 1);
        } else {
            throw new Exception("Cannot have negative Walks(Batter).");
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
        incrementAtBats();
    }

    public void decrementStrikeOuts() throws Exception {
        if(getStrikeOuts() > 0) {
            setStrikeOuts(getStrikeOuts() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negative Strike Outs(Batter).");
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
        incrementPlateApperance();
    }

    public void decrementIntenWalks() throws Exception {
        if(getIntenWalks() > 0){
            setIntenWalks(getIntenWalks() - 1);
        } else {
            throw new Exception("Cannot have negative Intentional Walks(Batter).");
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
        incrementPlateApperance();
    }

    public void decrementHitByPitch() throws Exception {
        if(getHitByPitch() > 0){
            setHitByPitch(getHitByPitch() - 1);
        } else {
            throw new Exception("Cannot have negative Hit By Pitches(Batter).");
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
        incrementPlateApperance();
    }

    public void decrementSacBunts() throws Exception {
        if(getSacBunts() > 0){
            setSacBunts(getSacBunts() - 1);
        } else {
            throw new Exception("Cannot have negative Sacrifice Bunts(Batter).");
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
        incrementRbis();
        incrementPlateApperance();
    }

    public void decrementSacFlys() throws Exception {
        if(getSacFlys() > 0){
            setSacFlys(getSacFlys() - 1);
            decrementRbis();
        } else {
            throw new Exception("Cannot have negative Sacrifice Flys(Batter).");
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
        incrementGroundOuts();
        incrementAtBats();
    }

    public void decrementGroundBallDP() throws Exception {
        if(getGroundBallDP() > 0) {
            setGroundBallDP(getGroundBallDP() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negative Ground Ball Double Plays(Batter).");
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
        incrementAtBats();
    }

    public void decrementGroundOuts() throws Exception {
        if(getGroundOuts() > 0){
            setGroundOuts(getGroundOuts() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negative Ground Outs(Batter).");
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
        incrementAtBats();
    }

    public void decrementFlyOuts() throws Exception {
        if(getFlyOuts() > 0){
            setFlyOuts(getFlyOuts() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negative Fly Outs(Batter).");
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

    public int getPlateAppearance() {
        return plateAppearance;
    }

    private void setPlateAppearance(int plateAppearance) {
        this.plateAppearance = plateAppearance;
    }

    public void incrementPlateApperance(){
        setPlateAppearance(getPlateAppearance() + 1);
    }

    public double calcBattingAvg() throws Exception {
        if(getAtBats() < 1){
            throw new Exception("Cannot calculate Batting Average with less than 1 at bat.");
        }
        return ((double) calcHits()) / ((double) getAtBats());
    }

    public double calcOnBasePct() throws Exception {
        if((getPlateAppearance() - getSacBunts()) < 1){
            throw new Exception("Cannot calculate On Base % if plate appearances minus number of sacrifice bunts is less than 1.");
        }
        return ((double) calcHits() + (double) getWalks() + (double) getIntenWalks() + (double) getHitByPitch()) / ((double) getPlateAppearance() - (double) getSacBunts());
    }

    public double calcSlugPct() throws Exception {
        if(getAtBats() < 1){
            throw new Exception("Cannot calculate Batting Average with less than 1 at bat.");
        }
        return ((double) calcTotalBases()) / (double) getAtBats();
    }

    public double calcOBPS() throws Exception {
        return calcOnBasePct() + calcSlugPct();
    }

    public int calcTotalBases() {
        return ((getSingles()) + (getDoubles() * 2) + (getTriples() * 3) + (getHomeRuns() * 4));
    }

    public int calcXBH() {
        return getDoubles() + getTriples() + getHomeRuns(); // More efficient than subtracting singles from hits.
    }

    public double calcGOAO() throws Exception {
        if(getFlyOuts() < 1){
            throw new Exception("Cannot calculate GO_AO with less than 1 fly out.");
        }
        return ((double) getGroundOuts()) / ((double) getFlyOuts());
    }


    public int calcHits() {
        return (getSingles() + getDoubles() + getTriples() + getHomeRuns());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HittingStats that = (HittingStats) o;

        if (games != that.games) return false;
        if (atBats != that.atBats) return false;
        if (singles != that.singles) return false;
        if (doubles != that.doubles) return false;
        if (triples != that.triples) return false;
        if (homeRuns != that.homeRuns) return false;
        if (rbis != that.rbis) return false;
        if (walks != that.walks) return false;
        if (strikeOuts != that.strikeOuts) return false;
        if (intenWalks != that.intenWalks) return false;
        if (hitByPitch != that.hitByPitch) return false;
        if (sacBunts != that.sacBunts) return false;
        if (sacFlys != that.sacFlys) return false;
        if (groundBallDP != that.groundBallDP) return false;
        if (groundOuts != that.groundOuts) return false;
        if (flyOuts != that.flyOuts) return false;
        if (numPitches != that.numPitches) return false;
        return plateAppearance == that.plateAppearance;

    }

    @Override
    public int hashCode() {
        int result = games;
        result = 31 * result + atBats;
        result = 31 * result + singles;
        result = 31 * result + doubles;
        result = 31 * result + triples;
        result = 31 * result + homeRuns;
        result = 31 * result + rbis;
        result = 31 * result + walks;
        result = 31 * result + strikeOuts;
        result = 31 * result + intenWalks;
        result = 31 * result + hitByPitch;
        result = 31 * result + sacBunts;
        result = 31 * result + sacFlys;
        result = 31 * result + groundBallDP;
        result = 31 * result + groundOuts;
        result = 31 * result + flyOuts;
        result = 31 * result + numPitches;
        result = 31 * result + plateAppearance;
        return result;
    }
}
