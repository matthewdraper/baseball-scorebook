package com.duxnort.baseballscorebook.Model;

public class Scorecard {
    private final int BO_LENGTH = 9;
    private final int INN = 50;
    private ScorecardBox[][] scoreBoxes = new ScorecardBox[9][50];
    private int currRow = 0;
    private int currCol = 0;

    public Scorecard() {
        initializeScorecard();
    }

    public Scorecard(ScorecardBox[][] scoreBoxes) {
        this.scoreBoxes = scoreBoxes;
    }

    public ScorecardBox[][] getScoreBoxes() {
        return scoreBoxes;
    }

    public void setScoreBoxes(ScorecardBox[][] scoreBoxes) {
        this.scoreBoxes = scoreBoxes;
    }

    public int getCurrRow() {
        return currRow;
    }

    public void setCurrRow(int currRow) {
        this.currRow = currRow;
    }

    public int getCurrCol() {
        return currCol;
    }

    public void setCurrCol(int currCol) {
        this.currCol = currCol;
    }

    public void addScoreBox(ScorecardBox scorecardBox) {
        if (getCurrRow() < BO_LENGTH - 1) {
            ScorecardBox[][] sc = getScoreBoxes();
            sc[getCurrRow()][getCurrCol()] = scorecardBox;
            setScoreBoxes(sc);
            setCurrRow(getCurrRow() + 1);
        } else {
            setCurrRow(0);
            setCurrCol(getCurrCol() + 1);
        }
    }

    public ScorecardBox currentBatterScorecardBox() {
        return getScoreBoxes()[getCurrRow()][getCurrCol()];
    }

    public ScorecardBox playerScorecardBox(int boIndex, int inning) {
        return getScoreBoxes()[boIndex][inning - 1];
    }

    public ScorecardBox currentRunnerOnFirstScorecardBox() {
        // TODO: 8/19/16 Fill out method
        return null;
    }

    public ScorecardBox currentRunnerOnSecondScorecardBox() {
        // TODO: 8/19/16 Fill out method
        return null;
    }

    public ScorecardBox currentRunnerOnThirdScorecardBox() {
        // TODO: 8/19/16 Fill out method
        return null;
    }

    public void recordBatterEvent(ScoringEvent batterEvent){
        ScorecardBox batterBox = currentBatterScorecardBox();
        batterBox.setBatterScoringEvent(batterEvent);
        addScoreBox(batterBox);
    }

    public void recordRunnerOnFirstEvent(ScoringEvent rofEvent){
        ScorecardBox runnerBox = currentRunnerOnFirstScorecardBox();
        runnerBox.setFirstToSecondScoringEvent(rofEvent);
    }

    public void recordRunnerOnSecondEvent(ScoringEvent rosEvent){
        ScorecardBox runnerBox = currentRunnerOnSecondScorecardBox();
        runnerBox.setFirstToSecondScoringEvent(rosEvent);
    }

    public void recordRunnerOnThirdEvent(ScoringEvent rotEvent){
        ScorecardBox runnerBox = currentRunnerOnThirdScorecardBox();
        runnerBox.setFirstToSecondScoringEvent(rotEvent);
    }

    public void initializeScorecard() {
        ScorecardBox[][] sc = getScoreBoxes();
        for (int i = 0; i < BO_LENGTH; i++) {
            for (int j = 0; j < INN; j++) {
                sc[i][j] = new ScorecardBox();
            }
        }
    }

}
