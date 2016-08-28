package com.duxnort.baseballscorebook.Model;

/**
 * Created by root on 8/28/16.
 */
public class Scorebook {
    private Scorecard homeScorecard = new Scorecard();
    private Scorecard awayScorecard = new Scorecard();

    public Scorebook() {
    }

    public Scorecard getHomeScorecard() {
        return homeScorecard;
    }

    public void setHomeScorecard(Scorecard homeScorecard) {
        this.homeScorecard = homeScorecard;
    }

    public Scorecard getAwayScorecard() {
        return awayScorecard;
    }

    public void setAwayScorecard(Scorecard awayScorecard) {
        this.awayScorecard = awayScorecard;
    }
}
