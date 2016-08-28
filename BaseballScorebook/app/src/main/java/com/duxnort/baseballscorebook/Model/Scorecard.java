package com.duxnort.baseballscorebook.Model;

import java.util.ArrayList;

public class Scorecard {
    private final int BO_LENGTH = 9;
    private ArrayList[][] scoreBoxes = new ArrayList[BO_LENGTH][12];

    public Scorecard() {
    }

    public Scorecard(ArrayList[][] scoreBoxes) {
        this.scoreBoxes = scoreBoxes;
    }

    public ArrayList[][] getScoreBoxes() {
        return scoreBoxes;
    }

    public void setScoreBoxes(ArrayList[][] scoreBoxes) {
        this.scoreBoxes = scoreBoxes;
    }

    public ScorecardBox currentBatterScorecardBox() {
        // TODO: 8/19/16 Fill out method
        return null;
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

    public void initializeScoreBoxes() {
        for (int i = 0; i < BO_LENGTH; i++) {
            for (int j = 0; j < 12; j++) {
//                ScorecardBox[][] s = getScoreBoxes();
//                .add(new ScorecardBox());
//                setScoreBoxes(getScoreBoxes()[i][j].add(new ScorecardBox()));
            }
        }
    }
}
