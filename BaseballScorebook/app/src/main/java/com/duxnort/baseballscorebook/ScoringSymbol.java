package com.duxnort.baseballscorebook;

/**
 * Created by matt on 8/10/16.
 */
public enum ScoringSymbol {
    SINGLE("Single", "1B"),
    DOUBLE("Double", "2B"),
    TRIPLE("Triple", "3B"),
    WALK("Walk", "BB"),
    ERROR("Error", "E"),
    FIELDERS_CHOICE("Fielder's Choice", "FC"),
    HIT_BY_PITCH("Hit By Pitch", "HBP"),
    HOMERUN("Home Run", "HR"),
    INTERFERENCE("Interference", "I"),
    INTENTIONAL_WALK("Intentional Walk", "IBB"),
    CAUGHT_STEALING("Caught Stealing", "CS"),
    DOUBLE_PLAY("Double Play", "DP"),
    FLYOUT("Fly Out", "F"),
    GROUNDOUT("Ground Out", "G"),
    FOULOUT("Foul Out", "FO"),
    STRIKEOUT_SWINGING("Strikeout Swinging", "K"),
    STRIKEOUT_LOOKING("Stirkeout Looking", "Kc"),
    LINEOUT("Line Out", "L"),
    SACRIFICE_FLY("Sacrifice Fly", "SF"),
    SACRIFICE_BUNT("Sacrifice Bunt", "SH"),
    TRIPLE_PLAY("Triple Play", "TP"),
    UNASSISTED_PUTOUT("Unassisted Putout", "U"),
    BALK("Balk", "BK"),
    PASSED_BALL("Passed Ball", "PB"),
    WILD_PITCH("Wild Pitch", "WP");

    private final String fullName;
    private final String scoringSymbol;

    ScoringSymbol(String fullName, String scoringSymbol) {
        this.scoringSymbol = scoringSymbol;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getScoringSymbol() {
        return scoringSymbol;
    }
}
