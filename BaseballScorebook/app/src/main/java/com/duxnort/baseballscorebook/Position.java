package com.duxnort.baseballscorebook;


public enum Position {
    DESIGNATED_HITTER("Designate Hitter", "DH", 0),
    CATCHER("Catcher", "C", 1),
    PITCHER("Pitcher", "P", 2),
    FIRSTBASE("First Base", "1B", 3),
    SECONDBASE("Second Base", "2B", 4),
    THIRDBASE("Third Base", "3B", 5),
    SHORTSTOP("Shortstop", "SS", 6),
    LEFTFIELD("Left Field", "LF", 7),
    CENTERFIELD("Center Field", "CF", 8),
    RIGHTFIELD("Right Field", "RF", 9);

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
}
