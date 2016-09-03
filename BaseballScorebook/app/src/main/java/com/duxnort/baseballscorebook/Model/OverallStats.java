package com.duxnort.baseballscorebook.Model;

public class OverallStats {
    // Only hitStatsRight contain baserunning stats.
    private HittingStats hitStatsRight = new HittingStats();
    private HittingStats hitStatsLeft = new HittingStats();
    private PitchingStats pitchStatsRight = new PitchingStats();
    private PitchingStats pitchStatsLeft = new PitchingStats();
    private FieldingStats fieldingStats = new FieldingStats();
    private RunningStats runningStats = new RunningStats();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OverallStats that = (OverallStats) o;

        if (hitStatsRight != null ? !hitStatsRight.equals(that.hitStatsRight) : that.hitStatsRight != null)
            return false;
        if (hitStatsLeft != null ? !hitStatsLeft.equals(that.hitStatsLeft) : that.hitStatsLeft != null)
            return false;
        if (pitchStatsRight != null ? !pitchStatsRight.equals(that.pitchStatsRight) : that.pitchStatsRight != null)
            return false;
        if (pitchStatsLeft != null ? !pitchStatsLeft.equals(that.pitchStatsLeft) : that.pitchStatsLeft != null)
            return false;
        if (fieldingStats != null ? !fieldingStats.equals(that.fieldingStats) : that.fieldingStats != null)
            return false;
        return runningStats != null ? runningStats.equals(that.runningStats) : that.runningStats == null;

    }

    @Override
    public int hashCode() {
        int result = hitStatsRight != null ? hitStatsRight.hashCode() : 0;
        result = 31 * result + (hitStatsLeft != null ? hitStatsLeft.hashCode() : 0);
        result = 31 * result + (pitchStatsRight != null ? pitchStatsRight.hashCode() : 0);
        result = 31 * result + (pitchStatsLeft != null ? pitchStatsLeft.hashCode() : 0);
        result = 31 * result + (fieldingStats != null ? fieldingStats.hashCode() : 0);
        result = 31 * result + (runningStats != null ? runningStats.hashCode() : 0);
        return result;
    }
}
