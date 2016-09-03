package com.duxnort.baseballscorebook.Model;

public class PitchingStats {
    private int wins = 0;
    private int losses = 0;
    private int games = 0;
    private int gamesStarted = 0;
    private int saves = 0;
    private int saveOpps = 0;
    private int numOutsPitched = 0;
    private int singles = 0;
    private int doubles = 0;
    private int triples = 0;
    private int sacBunts = 0;
    private int runs = 0;
    private int earnedRuns = 0;
    private int homeRuns = 0;
    private int walks = 0;
    private int strikeOutSwing = 0;
    private int strikeOutLook = 0;
    private int completeGames = 0;
    private int shutOuts = 0;
    private int hitBatsmen = 0;
    private int intenWalks = 0;
    private int gamesFinished = 0;
    private int holds = 0;
    private int inducedGBDPs = 0;
    private int groundOuts = 0;
    private int flyOuts = 0;
    private int wildPitches = 0;
    private int balks = 0;
    private int stolenBases = 0;
    private int caughtStealing = 0;
    private int pickOffs = 0;
    private int totalNumBF = 0;
    private int numPitches = 0;
    private int atBats = 0;


    public PitchingStats() {
    }

    public PitchingStats(int wins, int losses, int games, int gamesStarted, int saves, int saveOpps,
                         int numOutsPitched, int singles, int doubles, int triples, int sacBunts,
                         int runs, int earnedRuns, int homeRuns, int walks, int strikeOutSwing,
                         int strikeOutLook, int completeGames, int shutOuts, int hitBatsmen,
                         int intenWalks, int gamesFinished, int holds, int inducedGBDPs,
                         int groundOuts, int flyOuts, int wildPitches, int balks, int stolenBases,
                         int caughtStealing, int pickOffs, int totalNumBF, int numPitches,
                         int atBats) {
        this.wins = wins;
        this.losses = losses;
        this.games = games;
        this.gamesStarted = gamesStarted;
        this.saves = saves;
        this.saveOpps = saveOpps;
        this.numOutsPitched = numOutsPitched;
        this.singles = singles;
        this.doubles = doubles;
        this.triples = triples;
        this.sacBunts = sacBunts;
        this.runs = runs;
        this.earnedRuns = earnedRuns;
        this.homeRuns = homeRuns;
        this.walks = walks;
        this.strikeOutSwing = strikeOutSwing;
        this.strikeOutLook = strikeOutLook;
        this.completeGames = completeGames;
        this.shutOuts = shutOuts;
        this.hitBatsmen = hitBatsmen;
        this.intenWalks = intenWalks;
        this.gamesFinished = gamesFinished;
        this.holds = holds;
        this.inducedGBDPs = inducedGBDPs;
        this.groundOuts = groundOuts;
        this.flyOuts = flyOuts;
        this.wildPitches = wildPitches;
        this.balks = balks;
        this.stolenBases = stolenBases;
        this.caughtStealing = caughtStealing;
        this.pickOffs = pickOffs;
        this.totalNumBF = totalNumBF;
        this.numPitches = numPitches;
        this.atBats = atBats;
    }

    public int getWins() {
        return wins;
    }

    private void setWins(int wins) {
        this.wins = wins;
    }

    public void incrementWins() {
        setWins(getWins() + 1);
    }

    public void decrementWins() throws Exception {
        if(getWins() > 0){
            setWins(getWins() - 1);
        } else {
            throw new Exception("Cannot have negative Wins.");
        }
    }

    public int getLosses() {
        return losses;
    }

    private void setLosses(int losses) {
        this.losses = losses;
    }

    public void incrementLosses(){
        setLosses(getLosses() + 1);
    }

    public void decrementLossses() throws Exception {
        if(getLosses() > 0){
            setLosses(getLosses() - 1);
        } else {
            throw new Exception("Cannot have negative Losses.");
        }
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
            throw new Exception("Cannot have negative games.");
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
            throw new Exception("Cannot have negative Games Started.");
        }
    }

    public int getSaves() {
        return saves;
    }

    private void setSaves(int saves) {
        this.saves = saves;
    }

    public void incrementSaves() {
        setSaves(getSaves() + 1);
    }

    public void decrementSaves() throws Exception {
        if(getSaves() > 0){
            setSaves(getSaves() - 1);
        } else {
            throw new Exception("Cannot have negative Saves.");
        }
    }

    public int getSaveOpps() {
        return saveOpps;
    }

    private void setSaveOpps(int saveOpps) {
        this.saveOpps = saveOpps;
    }

    public void incrementSaveOpps(){
        setSaveOpps(getSaveOpps() + 1);
    }

    public void decrementSaveOpps() throws Exception {
        if(getSaveOpps() > 0){
            setSaveOpps(getSaveOpps() - 1);
        } else {
            throw new Exception("Cannot have negative Save Opportunities.");
        }
    }

    public int getNumOutsPitched() {
        return numOutsPitched;
    }

    private void setNumOutsPitched(int numOutsPitched) {
        this.numOutsPitched = numOutsPitched;
    }

    public void incrementNumOutsPitched(){
        setNumOutsPitched(getNumOutsPitched() + 1);
    }

    public void decrementNumOutsPitched() throws Exception {
        if(getNumOutsPitched() > 0){
            setNumOutsPitched(getNumOutsPitched() - 1);
        } else {
            throw new Exception("Cannot have negative Number of Outs Pitchd.");
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
            throw new Exception("Cannot have negative Singles(Pitcher).");
        }
    }

    public int getDoubles() {
        return doubles;
    }

    private void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public void incrementDoubles(){
        setDoubles(getDoubles() + 1);
        incrementAtBats();
    }

    public void decrementDoubles() throws Exception {
        if(getDoubles() > 0){
            setDoubles(getDoubles() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negative Doubles(Pitcher).");
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
            throw new Exception("Cannot have negative Triples(Pitcher).");
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
        incrementTotalNumBF();
    }

    public void decrementSacBunts() throws Exception {
        if(getSacBunts() > 0){
            setSacBunts(getSacBunts() - 1);
            decrementTotalNumBF();
        } else {
            throw new Exception("Cannot have negative Sacrifice Bunts(Pitcher).");
        }
    }

    public int getRuns() {
        return runs;
    }

    private void setRuns(int runs) {
        this.runs = runs;
    }

    public void incrementRuns() {
        setRuns(getRuns() + 1);
    }

    public void decrementRuns() throws Exception {
        if(getRuns() > 0){
            setRuns(getRuns() - 1);
        } else {
            throw new Exception("Cannot have negative Runs(Pitcher).");
        }
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    private void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public void incrementEarnedRuns(){
        setEarnedRuns(getEarnedRuns() + 1);
        incrementRuns();
    }

    public void decrementEarnedRuns() throws Exception {
        if(getEarnedRuns() > 0){
            setEarnedRuns(getEarnedRuns() - 1);
            decrementRuns();
        } else {
            throw new Exception("Cannot have negative Earned Runs(Pitcher).");
        }
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    private void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public void incrementHomeRuns(){
        setHomeRuns(getHomeRuns() + 1);
        incrementAtBats();
    }

    public void decrementHomeRuns() throws Exception {
        if(getHomeRuns() > 0){
            setHomeRuns(getHomeRuns() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negative Home Runs(Pitcher).");
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
        incrementTotalNumBF();
    }

    public void decrementWalks() throws Exception {
        if(getWalks() > 0){
            setWalks(getWalks() - 1);
            decrementTotalNumBF();
        } else {
            throw new Exception("Cannot have negaitve Walks(Pitcher)");
        }
    }

    public int getStrikeOutSwing() {
        return strikeOutSwing;
    }

    private void setStrikeOutSwing(int strikeOutSwing) {
        this.strikeOutSwing = strikeOutSwing;
    }

    public void incrementStrikeOutSwing() {
        setStrikeOutSwing(getStrikeOutSwing() + 1);
        incrementAtBats();
    }

    public void decrementStrikeOutSwing() throws Exception {
        if(getStrikeOutSwing() > 0){
            setStrikeOutSwing(getStrikeOutSwing() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negative Swinging Strike Outs(Pitcher).");
        }
    }

    public int getStrikeOutLook() {
        return strikeOutLook;
    }

    private void setStrikeOutLook(int strikeOutLook) {
        this.strikeOutLook = strikeOutLook;
    }

    public void incrementStrikeOutLook(){
        setStrikeOutLook(getStrikeOutLook() + 1);
        incrementAtBats();
    }

    public void decrementStrikeOutLook() throws Exception {
        if(getStrikeOutLook() > 0){
            setStrikeOutLook(getStrikeOutLook() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negaitve Looking Strike Outs(Pitcher),");
        }
    }

    public int getCompleteGames() {
        return completeGames;
    }

    private void setCompleteGames(int completeGames) {
        this.completeGames = completeGames;
    }

    public void incrementCompleteGames(){
        setCompleteGames(getCompleteGames() + 1);
    }

    public void decrementCompleteGames() throws Exception {
        if(getCompleteGames() > 0){
            setCompleteGames(getCompleteGames() - 1);
        } else {
            throw new Exception("Cannot have negative Complete Games(Pitcher).");
        }
    }

    public int getShutOuts() {
        return shutOuts;
    }

    private void setShutOuts(int shutOuts) {
        this.shutOuts = shutOuts;
    }

    public void incrementShutOuts(){
        setShutOuts(getShutOuts() + 1);
    }

    public void decrementShutOuts() throws Exception {
        if(getShutOuts() > 0){
            setShutOuts(getShutOuts() - 1);
        } else {
            throw new Exception("Cannot have negative Shut Outs(Pitcher).");
        }
    }

    public int getHitBatsmen() {
        return hitBatsmen;
    }

    private void setHitBatsmen(int hitBatsmen) {
        this.hitBatsmen = hitBatsmen;
    }

    public void incrementHitBatsmen() {
        setHitBatsmen(getHitBatsmen() + 1);
        incrementTotalNumBF();
    }

    public void decrementHitBatsmen() throws Exception {
        if(getHitBatsmen() > 0){
            setHitBatsmen(getHitBatsmen() - 1);
            decrementTotalNumBF();
        } else {
            throw new Exception("Cannot have negative Hit Batsmen(Pitcher).");
        }
    }

    public int getIntenWalks() {
        return intenWalks;
    }

    private void setIntenWalks(int intenWalks) {
        this.intenWalks = intenWalks;
    }

    public void incrementIntenWalks(){
        setIntenWalks(getIntenWalks() + 1);
        incrementTotalNumBF();
    }

    public void decrementIntenWalks() throws Exception {
        if(getIntenWalks() > 0){
            setIntenWalks(getIntenWalks() - 1);
            decrementTotalNumBF();
        } else {
            throw new Exception("Cannot have negative Intentional Walks(Pitcher).");
        }
    }

    public int getGamesFinished() {
        return gamesFinished;
    }

    private void setGamesFinished(int gamesFinished) {
        this.gamesFinished = gamesFinished;
    }

    public void incrementGamesFinished(){
        setGamesFinished(getGamesFinished() + 1);
    }

    public void decrementGamesFinished() throws Exception {
        if(getGamesFinished() > 0){
            setGamesFinished(getGamesFinished() - 1);
        } else {
            throw new Exception("Cannot have negative Games Finished(Pitcher).");
        }
    }

    public int getHolds() {
        return holds;
    }

    private void setHolds(int holds) {
        this.holds = holds;
    }

    public void incrementHolds() {
        setHolds(getHolds() + 1);
    }

    public void decrementHolds() throws Exception {
        if(getHolds() > 0){
            setHolds(getHolds() - 1);
        } else {
            throw new Exception("Cannot have negative Holds(Pitcher).");
        }
    }

    public int getInducedGBDPs() {
        return inducedGBDPs;
    }

    private void setInducedGBDPs(int inducedGBDPs) {
        this.inducedGBDPs = inducedGBDPs;
    }

    public void incrementInducedGBDPs() {
        setInducedGBDPs(getInducedGBDPs() + 1);
//        incrementGroundOuts();
        incrementAtBats();
    }

    public void decrementInducedGBDPs() throws Exception {
        if(getInducedGBDPs() > 0){
            setInducedGBDPs(getInducedGBDPs() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negative Induced Ground Ball Double Plays(Pitcher).");
        }
    }

    public int getGroundOuts() {
        return groundOuts;
    }

    private void setGroundOuts(int groundOuts) {
        this.groundOuts = groundOuts;
    }

    public void incrementGroundOuts(){
        setGroundOuts(getGroundOuts() + 1);
        incrementAtBats();
    }

    public void decrementGroundOuts() throws Exception {
        if(getGroundOuts() > 0){
            setGroundOuts(getGroundOuts() - 1);
            decrementAtBats();
        } else {
            throw new Exception("Cannot have negative Ground Outs(Pitcher).");
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
            throw new Exception("Cannot have negative Fly Outs(Pitcher).");
        }
    }

    public int getWildPitches() {
        return wildPitches;
    }

    private void setWildPitches(int wildPitches) {
        this.wildPitches = wildPitches;
    }

    public void incrementWildPitches(){
        setWildPitches(getWildPitches() + 1);
    }

    public void decrementWildPitches() throws Exception {
        if(getWildPitches() > 0){
            setWildPitches(getWildPitches() - 1);
        } else {
            throw new Exception("Cannot have negative Wild Pitches(Pitcher).");
        }
    }

    public int getBalks() {
        return balks;
    }

    private void setBalks(int balks) {
        this.balks = balks;
    }

    public void incrementBalks(){
        setBalks(getBalks() + 1);
    }

    public void decrementBalks() throws Exception {
        if(getBalks() > 0){
            setBalks(getBalks() - 1);
        } else {
            throw new Exception("Cannot have negative Balks(Pitcher).");
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
            throw new Exception("Cannot have negative Stolen Bases(Pitcher).");
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
            throw new Exception("Cannot have negative Caught Stealings(Pitcher).");
        }
    }

    public int getPickOffs() {
        return pickOffs;
    }

    private void setPickOffs(int pickOffs) {
        this.pickOffs = pickOffs;
    }

    public void incrementPickOffs(){
        setPickOffs(getPickOffs() + 1);
    }

    public void decrementPickOffs() throws Exception {
        if(getPickOffs() > 0){
            setPickOffs(getPickOffs() - 1);
        } else {
            throw new Exception("Cannot have negative Pickoffs(Pitcher).");
        }
    }

    public int getTotalNumBF() {
        return totalNumBF;
    }

    private void setTotalNumBF(int totalNumBF) {
        this.totalNumBF = totalNumBF;
    }

    public void incrementTotalNumBF() {
        setTotalNumBF(getTotalNumBF() + 1);
    }

    public void decrementTotalNumBF() throws Exception {
        if(getTotalNumBF() > 0){
        setTotalNumBF(getTotalNumBF() - 1);
        } else {
            throw new Exception("Cannot have negatvie Batters Faced(Pitcher).");
        }
    }

    public int getNumPitches() {
        return numPitches;
    }

    private void setNumPitches(int numPitches) {
        this.numPitches = numPitches;
    }

    public void incrementNumPitches(){
        setNumPitches(getNumPitches() + 1);
    }

    public void decrementNumPitches() throws Exception {
        if(getNumPitches() > 0){
            setNumPitches(getNumPitches() - 1);
        } else {
            throw new Exception("Cannot have negative Number of Pitches(Pitcher).");
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
        incrementTotalNumBF();
    }

    public void decrementAtBats() throws Exception {
        if(getAtBats() > 0){
            setAtBats(getAtBats() - 1);
            decrementTotalNumBF();
        } else {
            throw new Exception("Cannot have negative At Bats(Pitcher).");
        }
    }

    public double calcEarnedRunAvg() throws Exception {
        if(getNumOutsPitched() < 1){
            throw new Exception("Cannot calculate ERA with less than 1 out pitched.");
        }
        return ((9 * (double) getEarnedRuns()) / ((double) getNumOutsPitched() / 3));
    }

    public String calcInningsPitched() {
        return Integer.toString(getNumOutsPitched() / 3).concat(".").concat(Integer.toString(getNumOutsPitched() % 3));
    }

    public int calcStrikeOuts() {
        return getStrikeOutLook() + getStrikeOutSwing();
    }

    public double calcAverage() throws Exception {
        if(getAtBats() < 1){
            throw new Exception("Cannot calculate Batting Average Against with less than 1 at bat.");
        }
        return (double) calcHits() / (double) getAtBats();
    }

    public double calcWHIP() throws Exception {
        if(getNumOutsPitched() < 1){
            throw new Exception("Cannot calculate WHIP with less than 1 out pitched.");
        }
        return ((double) calcHits() + (double) getWalks() + (double) getIntenWalks()) / ((double) getNumOutsPitched() / 3);
    }

    public double calcWinPct() throws Exception {
        if((getWins() + getLosses()) < 1){
            throw new Exception("Cannot calculate Win % with no wins or losses");
        }
        return ((double) getWins()) / ((double) getWins() + (double) getLosses());
    }

    public double calcGOAO() throws Exception {
        if(getFlyOuts() < 1){
            throw new Exception("Cannot calculate GO_AO with no fly outs.");
        }
        return ((double) getGroundOuts() + (double) getInducedGBDPs()) / ((double) getFlyOuts());
    }

    public double calcOBP() throws Exception {
        if((getTotalNumBF() - getSacBunts()) < 1){
            throw new Exception("Cannot calculate OBP when number of batters faced minus sac bunts is less than 1.");
        }
        return ((double) calcHits() + (double) getWalks() + (double) getIntenWalks() + (double) getHitBatsmen()) / ((double) getTotalNumBF() - (double) getSacBunts());
    }

    public double calcSlugPct() throws Exception {
        if(getAtBats() < 1){
            throw new Exception("Cannot calculate Slugging % when number of at bats is less than 1.");
        }
        return ((double) getSingles() + (2 * (double) getDoubles()) + (3 * (double) getTriples()) + (4 * (double) getHomeRuns())) / (double) getAtBats();
    }

    public double calcOBPS() throws Exception {
        return calcOBP() + calcSlugPct();
    }

    public double calcKsPerNine() throws Exception {
        if(getNumOutsPitched() < 1){
            throw new Exception("Cannot calculate K's per 9 with less than 1 out pitched.");
        }
        return (((double) calcStrikeOuts()) / ((double) getNumOutsPitched() / (double)3)) * (double)9;
    }

    public double calcWalksPerNine() throws Exception {
        if(getNumOutsPitched() < 1){
            throw new Exception(("Cannot calculate BB's per 9 with less than 1 out pitched."));
        }
        return (((double) getWalks() + (double) getIntenWalks()) / ((double) getNumOutsPitched() / (double)3)) * (double)9;
    }

    public double calcHitsPerNine() throws Exception {
        if(getNumOutsPitched() < 1){
            throw new Exception(("Cannot calculate Hits per 9 with less than 1 out pitched."));
        }
        return (((double) calcHits()) / ((double) getNumOutsPitched() / 3)) * 9;
    }

    public double calcKBB() throws Exception {
        if(getWalks() < 1){
            throw new Exception("Cannot calculate K's per BB with less than 1 walk.");
        }
        return ((double) calcStrikeOuts()) / (((double) getWalks() + (double) getIntenWalks()));
    }

    public double calcPIP() throws Exception {
        if(getNumOutsPitched() < 1){
            throw new Exception("Cannot calculate Pitches per Inning Pitched(PIP) with no outs pitched.");
        }
        return ((double) getNumPitches()) / ((double) getNumOutsPitched() / (double)3);
    }

    public int calcHits() {
        return getSingles() + getDoubles() + getTriples() + getHomeRuns();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PitchingStats that = (PitchingStats) o;

        if (wins != that.wins) return false;
        if (losses != that.losses) return false;
        if (games != that.games) return false;
        if (gamesStarted != that.gamesStarted) return false;
        if (saves != that.saves) return false;
        if (saveOpps != that.saveOpps) return false;
        if (numOutsPitched != that.numOutsPitched) return false;
        if (singles != that.singles) return false;
        if (doubles != that.doubles) return false;
        if (triples != that.triples) return false;
        if (sacBunts != that.sacBunts) return false;
        if (runs != that.runs) return false;
        if (earnedRuns != that.earnedRuns) return false;
        if (homeRuns != that.homeRuns) return false;
        if (walks != that.walks) return false;
        if (strikeOutSwing != that.strikeOutSwing) return false;
        if (strikeOutLook != that.strikeOutLook) return false;
        if (completeGames != that.completeGames) return false;
        if (shutOuts != that.shutOuts) return false;
        if (hitBatsmen != that.hitBatsmen) return false;
        if (intenWalks != that.intenWalks) return false;
        if (gamesFinished != that.gamesFinished) return false;
        if (holds != that.holds) return false;
        if (inducedGBDPs != that.inducedGBDPs) return false;
        if (groundOuts != that.groundOuts) return false;
        if (flyOuts != that.flyOuts) return false;
        if (wildPitches != that.wildPitches) return false;
        if (balks != that.balks) return false;
        if (stolenBases != that.stolenBases) return false;
        if (caughtStealing != that.caughtStealing) return false;
        if (pickOffs != that.pickOffs) return false;
        if (totalNumBF != that.totalNumBF) return false;
        if (numPitches != that.numPitches) return false;
        return atBats == that.atBats;

    }

    @Override
    public int hashCode() {
        int result = wins;
        result = 31 * result + losses;
        result = 31 * result + games;
        result = 31 * result + gamesStarted;
        result = 31 * result + saves;
        result = 31 * result + saveOpps;
        result = 31 * result + numOutsPitched;
        result = 31 * result + singles;
        result = 31 * result + doubles;
        result = 31 * result + triples;
        result = 31 * result + sacBunts;
        result = 31 * result + runs;
        result = 31 * result + earnedRuns;
        result = 31 * result + homeRuns;
        result = 31 * result + walks;
        result = 31 * result + strikeOutSwing;
        result = 31 * result + strikeOutLook;
        result = 31 * result + completeGames;
        result = 31 * result + shutOuts;
        result = 31 * result + hitBatsmen;
        result = 31 * result + intenWalks;
        result = 31 * result + gamesFinished;
        result = 31 * result + holds;
        result = 31 * result + inducedGBDPs;
        result = 31 * result + groundOuts;
        result = 31 * result + flyOuts;
        result = 31 * result + wildPitches;
        result = 31 * result + balks;
        result = 31 * result + stolenBases;
        result = 31 * result + caughtStealing;
        result = 31 * result + pickOffs;
        result = 31 * result + totalNumBF;
        result = 31 * result + numPitches;
        result = 31 * result + atBats;
        return result;
    }
}
