package com.duxnort.baseballscorebook.Model;

/**
 * Created by matt on 8/12/16.
 */
public class LineupState {
    private Lineup homeLineup = null;
    private Lineup awayLineup = null;

    public LineupState() {
    }

    public Lineup getHomeLineup() {
        return homeLineup;
    }

    public void setHomeLineup(Lineup homeLineup) {
        this.homeLineup = homeLineup;
    }

    public Lineup getAwayLineup() {
        return awayLineup;
    }

    public void setAwayLineup(Lineup awayLineup) {
        this.awayLineup = awayLineup;
    }
}
