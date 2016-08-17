package com.duxnort.baseballscorebook.Model;

public class Lineup {
    private final int ROWS = 10;
    private final int COLS = 2;
    private int[][] lineup = new int[COLS][ROWS];

    public Lineup() {
    }

    public int[][] getLineup() {
        return lineup;
    }
    // 0, 0 is the Designated Hitter at in
    public void setLineup(int[][] lineup) {
        this.lineup = lineup;
    }

    public void designatedHitterIndex() {

    }

    public int positionsRosterIndex(Position pos){
        return getLineup()[0][pos.getScoreNum()];
    }

    public int getBattingOrderPosition(Position pos){
        return 0; // Not finished...
    }

    // Maybe do a position array and a batting order array for each...
}
