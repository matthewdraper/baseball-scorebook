/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;

import java.util.ArrayList;

public class ScoringEvent {
    private String positionsInvolved = null;
    private ScoringSymbol scoringSymbol = null;
    private ArrayList<Integer> putOuts = null;
    private ArrayList<Integer> assists = null;

    public ScoringEvent() {
    }

    public ScoringEvent(ScoringSymbol scoringSymbol) {
        this.scoringSymbol = scoringSymbol;
    }

    public ScoringEvent(String positionsInvolved, ScoringSymbol scoringSymbol) {
        this.positionsInvolved = positionsInvolved;
        this.scoringSymbol = scoringSymbol;
    }

    public ScoringEvent(String positionsInvolved, ScoringSymbol scoringSymbol,
                        ArrayList<Integer> putOuts, ArrayList<Integer> assists) {
        this.positionsInvolved = positionsInvolved;
        this.scoringSymbol = scoringSymbol;
        this.putOuts = putOuts;
        this.assists = assists;
    }

    public String getPositionsInvolved() {
        return positionsInvolved;
    }

    public void setPositionsInvolved(String positionsInvolved) {
        this.positionsInvolved = positionsInvolved;
    }

    public ScoringSymbol getScoringSymbol() {
        return scoringSymbol;
    }

    public void setScoringSymbol(ScoringSymbol scoringSymbol) {
        this.scoringSymbol = scoringSymbol;
    }

    public ArrayList<Integer> getPutOuts() {
        return putOuts;
    }

    public void setPutOuts(ArrayList<Integer> putOuts) {
        this.putOuts = putOuts;
    }

    public ArrayList<Integer> getAssists() {
        return assists;
    }

    public void setAssists(ArrayList<Integer> assists) {
        this.assists = assists;
    }
}
