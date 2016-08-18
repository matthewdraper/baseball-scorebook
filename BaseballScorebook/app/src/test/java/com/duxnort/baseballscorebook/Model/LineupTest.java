/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineupTest {

    private int[] initializeArr(){
        int[] battingOrder = new int[10];
        battingOrder[0] = 23;
        battingOrder[1] = 12;
        battingOrder[2] = 8;
        battingOrder[3] = 4;
        battingOrder[4] = 21;
        battingOrder[5] = 14;
        battingOrder[6] = 5;
        battingOrder[7] = 9;
        battingOrder[8] = 10;
        battingOrder[9] = 17;
        return battingOrder;
    }

    @Test
    public void testPositionsRosterIndex() throws Exception {
        Lineup l = new Lineup();
        int[] battingOrder = initializeArr();
        l.setBattingArr(battingOrder);
        assertEquals(14, l.getBattingArrPosition(5));
        assertEquals(17, l.getBattingArrPosition(9));
        assertEquals(23, l.getBattingArrPosition(0));
    }

    @Test
    public void testGetBattingArrPosition() throws Exception {
        Lineup l = new Lineup();
        int[] defensiveOrder = initializeArr();
        l.setDefensiveArr(defensiveOrder);
        assertEquals(14, l.positionsRosterIndex(Position.THIRDBASE));
        assertEquals(23, l.positionsRosterIndex(Position.DESIGNATED_HITTER));
        assertEquals(17, l.positionsRosterIndex(Position.RIGHTFIELD));
    }
}