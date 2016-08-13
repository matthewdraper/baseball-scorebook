package com.duxnort.baseballscorebook.Model;

public class OverallStats {
    private HittingStats hitStatsRight = null;
    private HittingStats hitStatsLeft = null;
    private PitchingStats pitchStatsRight = null;
    private PitchingStats pitchStatsLeft = null;
    private FieldingStats fieldingStats = null;

    public OverallStats() {
    }

    public OverallStats(HittingStats hitStatsRight, HittingStats hitStatsLeft,
                        PitchingStats pitchStatsRight, PitchingStats pitchStatsLeft,
                        FieldingStats fieldingStats) {
        this.hitStatsRight = hitStatsRight;
        this.hitStatsLeft = hitStatsLeft;
        this.pitchStatsRight = pitchStatsRight;
        this.pitchStatsLeft = pitchStatsLeft;
        this.fieldingStats = fieldingStats;
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

    public PitchingStats calcOverallPitchingStats() {
        return null;
    }

    public HittingStats calcOverallHittingStats() {
        return null;
    }
}
