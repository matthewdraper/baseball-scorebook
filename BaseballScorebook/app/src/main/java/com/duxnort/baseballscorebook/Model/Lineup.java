package com.duxnort.baseballscorebook.Model;

public class Lineup {
    private final int PLAYERS_PLAYING = 10;
    private int[][] lineup = new int[PLAYERS_PLAYING][2];

    public Lineup() {
    }

    public int[][] getLineup() {
        return lineup;
    }

    public void setLineup(int[][] lineup) {
        this.lineup = lineup;
    }
}
