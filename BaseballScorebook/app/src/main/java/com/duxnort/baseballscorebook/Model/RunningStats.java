/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;

/**
 * Created by matt on 8/17/16.
 */
public class RunningStats {
    private int runs = 0;
    private int stolenBases = 0;
    private int caughtStealing = 0;

    public RunningStats() {
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
            throw new Exception("Cannot have negative Runs(Batter).");
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
            throw new Exception("Cannot have negative Stolen Bases(Batter).");
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
            throw new Exception("Cannot have negative Caught Stealing(Batter).");
        }
    }
}
