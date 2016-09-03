package com.duxnort.baseballscorebook.Model;

import java.util.Arrays;

public class Lineup {
    public static final int NUM_PLAYERS = 10;
    public static final int NUM_BATTERS = 9;
    private int[] defensiveArr = new int[NUM_PLAYERS];
    private int[] battingArr = new int[NUM_PLAYERS];

    public Lineup() {
    }

    public int[] getDefensiveArr() {
        return defensiveArr;
    }

    public void setDefensiveArr(int[] defensiveArr) {
        this.defensiveArr = defensiveArr;
    }

    public int[] getBattingArr() {
        return battingArr;
    }

    public void setBattingArr(int[] battingOrder) {
        this.battingArr = battingOrder;
    }

    public int positionsRosterIndex(Position pos){
        return getDefensiveArr()[pos.getScoreNum()];
    }

    /**
     * This method takes a position in the batting order and returns the index of the player
     * in the Team's roster ArrayList.
     * @param spot
     * @return Index of the player in the team roster ArrayList.
     */

    public int getBattingArrPosition(int spot){
        return  getBattingArr()[spot];
    }

    public int getBattingOrderIndex(int playerIndex) {
        int index = 0;
        while (index < NUM_BATTERS) {
            if (battingArr[index] == playerIndex) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lineup lineup = (Lineup) o;

        if (!Arrays.equals(defensiveArr, lineup.defensiveArr)) return false;
        return Arrays.equals(battingArr, lineup.battingArr);

    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(defensiveArr);
        result = 31 * result + Arrays.hashCode(battingArr);
        return result;
    }
}
