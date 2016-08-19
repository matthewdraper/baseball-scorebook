/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;


public enum Position {
    DESIGNATED_HITTER("Designate Hitter", "DH", 0),
    PITCHER("Pitcher", "P", 1),
    CATCHER("Catcher", "C", 2),
    FIRSTBASE("First Base", "1B", 3),
    SECONDBASE("Second Base", "2B", 4),
    THIRDBASE("Third Base", "3B", 5),
    SHORTSTOP("Shortstop", "SS", 6),
    LEFTFIELD("Left Field", "LF", 7),
    CENTERFIELD("Center Field", "CF", 8),
    RIGHTFIELD("Right Field", "RF", 9),
    NONE("None", "NA", 10);

    private final String fullName;
    private final String abbrev;
    private final int scoreNum;

    Position(String fullName, String abbrev, int scoreNum) {
        this.fullName = fullName;
        this.scoreNum = scoreNum;
        this.abbrev = abbrev;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public int getScoreNum() {
        return scoreNum;
    }

    public static Position positionFromInt(int pos){
        switch (pos){
            case 0:
                return Position.DESIGNATED_HITTER;
            case 1:
                return Position.PITCHER;
            case 2:
                return Position.CATCHER;
            case 3:
                return Position.FIRSTBASE;
            case 4:
                return Position.SECONDBASE;
            case 5:
                return Position.THIRDBASE;
            case 6:
                return Position.SHORTSTOP;
            case 7:
                return Position.LEFTFIELD;
            case 8:
                return Position.CENTERFIELD;
            case 9:
                return Position.RIGHTFIELD;
            default:
                return Position.NONE;
        }
    }
}
