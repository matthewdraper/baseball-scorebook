package com.duxnort.baseballscorebook.Model;

public class OverallStats {
    // Only hitStatsRight contain baserunning stats.
    private HittingStats hitStatsRight = null;
    private HittingStats hitStatsLeft = null;
    private PitchingStats pitchStatsRight = null;
    private PitchingStats pitchStatsLeft = null;
    private FieldingStats fieldingStats = null;
    private RunningStats runningStats = null;

    public OverallStats() {
    }

    public OverallStats(HittingStats hitStatsRight, HittingStats hitStatsLeft,
                        PitchingStats pitchStatsRight, PitchingStats pitchStatsLeft,
                        FieldingStats fieldingStats, RunningStats runningStats) {
        this.hitStatsRight = hitStatsRight;
        this.hitStatsLeft = hitStatsLeft;
        this.pitchStatsRight = pitchStatsRight;
        this.pitchStatsLeft = pitchStatsLeft;
        this.fieldingStats = fieldingStats;
        this.runningStats = runningStats;
    }

    public HittingStats getHitStatsRight() {
        return hitStatsRight;
    }

    public void setHitStatsRight(HittingStats hitStatsRight) {
        this.hitStatsRight = hitStatsRight;
    }

    public HittingStats getHitStatsLeft() {
        return hitStatsLeft;
    }

    public void setHitStatsLeft(HittingStats hitStatsLeft) {
        this.hitStatsLeft = hitStatsLeft;
    }

    public PitchingStats getPitchStatsRight() {
        return pitchStatsRight;
    }

    public void setPitchStatsRight(PitchingStats pitchStatsRight) {
        this.pitchStatsRight = pitchStatsRight;
    }

    public PitchingStats getPitchStatsLeft() {
        return pitchStatsLeft;
    }

    public void setPitchStatsLeft(PitchingStats pitchStatsLeft) {
        this.pitchStatsLeft = pitchStatsLeft;
    }

    public FieldingStats getFieldingStats() {
        return fieldingStats;
    }

    public void setFieldingStats(FieldingStats fieldingStats) {
        this.fieldingStats = fieldingStats;
    }

    public RunningStats getRunningStats() {
        return runningStats;
    }

    public void setRunningStats(RunningStats runningStats) {
        this.runningStats = runningStats;
    }

    public PitchingStats calcOverallPitchingStats() {
        return null;
    }

    public HittingStats calcOverallHittingStats() {
        return null;
    }
}
