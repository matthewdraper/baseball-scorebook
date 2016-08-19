package com.duxnort.baseballscorebook.Model;

/**
 * Created by matt on 8/12/16.
 */
public class ScorecardBox {
    private int balls = 0;
    private int strikes = 0;
    private int outNumber = 0;
    private int homeToFirstBaseLine = 0;
    private int firstToSecondBaseLine = 0;
    private int secondToThirdBaseLine = 0;
    private int thirdToHomeBaseLine = 0;
    private boolean hasScored = false;
    private ScoringEvent batterScoringEvent = null;
    private ScoringEvent homeToFirstScoringEvent = null;
    private ScoringEvent firstToSecondScoringEvent = null;
    private ScoringEvent secondToThirdScoringEvent = null;
    private ScoringEvent thirdToHomeScoringEvent = null;

    public ScorecardBox() {
    }

    public ScorecardBox(int balls, int strikes, int outNumber, int homeToFirstBaseLine,
                        int firstToSecondBaseLine, int secondToThirdBaseLine,
                        int thirdToHomeBaseLine, boolean hasScored, ScoringEvent batterScoringEvent,
                        ScoringEvent homeToFirstScoringEvent,
                        ScoringEvent firstToSecondScoringEvent,
                        ScoringEvent secondToThirdScoringEvent,
                        ScoringEvent thirdToHomeScoringEvent) {
        this.balls = balls;
        this.strikes = strikes;
        this.outNumber = outNumber;
        this.homeToFirstBaseLine = homeToFirstBaseLine;
        this.firstToSecondBaseLine = firstToSecondBaseLine;
        this.secondToThirdBaseLine = secondToThirdBaseLine;
        this.thirdToHomeBaseLine = thirdToHomeBaseLine;
        this.hasScored = hasScored;
        this.batterScoringEvent = batterScoringEvent;
        this.homeToFirstScoringEvent = homeToFirstScoringEvent;
        this.firstToSecondScoringEvent = firstToSecondScoringEvent;
        this.secondToThirdScoringEvent = secondToThirdScoringEvent;
        this.thirdToHomeScoringEvent = thirdToHomeScoringEvent;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public int getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(int outNumber) {
        this.outNumber = outNumber;
    }

    public int getHomeToFirstBaseLine() {
        return homeToFirstBaseLine;
    }

    public void setHomeToFirstBaseLine(int homeToFirstBaseLine) {
        this.homeToFirstBaseLine = homeToFirstBaseLine;
    }

    public int getFirstToSecondBaseLine() {
        return firstToSecondBaseLine;
    }

    public void setFirstToSecondBaseLine(int firstToSecondBaseLine) {
        this.firstToSecondBaseLine = firstToSecondBaseLine;
    }

    public int getSecondToThirdBaseLine() {
        return secondToThirdBaseLine;
    }

    public void setSecondToThirdBaseLine(int secondToThirdBaseLine) {
        this.secondToThirdBaseLine = secondToThirdBaseLine;
    }

    public int getThirdToHomeBaseLine() {
        return thirdToHomeBaseLine;
    }

    public void setThirdToHomeBaseLine(int thirdToHomeBaseLine) {
        this.thirdToHomeBaseLine = thirdToHomeBaseLine;
    }

    public boolean isHasScored() {
        return hasScored;
    }

    public void setHasScored(boolean hasScored) {
        this.hasScored = hasScored;
    }

    public ScoringEvent getBatterScoringEvent() {
        return batterScoringEvent;
    }

    public void setBatterScoringEvent(ScoringEvent batterScoringEvent) {
        this.batterScoringEvent = batterScoringEvent;
    }

    public ScoringEvent getHomeToFirstScoringEvent() {
        return homeToFirstScoringEvent;
    }

    public void setHomeToFirstScoringEvent(ScoringEvent homeToFirstScoringEvent) {
        this.homeToFirstScoringEvent = homeToFirstScoringEvent;
    }

    public ScoringEvent getFirstToSecondScoringEvent() {
        return firstToSecondScoringEvent;
    }

    public void setFirstToSecondScoringEvent(ScoringEvent firstToSecondScoringEvent) {
        this.firstToSecondScoringEvent = firstToSecondScoringEvent;
    }

    public ScoringEvent getSecondToThirdScoringEvent() {
        return secondToThirdScoringEvent;
    }

    public void setSecondToThirdScoringEvent(ScoringEvent secondToThirdScoringEvent) {
        this.secondToThirdScoringEvent = secondToThirdScoringEvent;
    }

    public ScoringEvent getThirdToHomeScoringEvent() {
        return thirdToHomeScoringEvent;
    }

    public void setThirdToHomeScoringEvent(ScoringEvent thirdToHomeScoringEvent) {
        this.thirdToHomeScoringEvent = thirdToHomeScoringEvent;
    }
}
