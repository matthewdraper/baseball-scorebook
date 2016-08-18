/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by matt on 8/18/16.
 */
public class RunningStatsTest {

    @Test
    public void testIncrementRuns() throws Exception {
        RunningStats r = new RunningStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            r.incrementRuns();
        }
        assertEquals(inc, r.getRuns());
        assertEquals(0, r.getStolenBases());
        assertEquals(0, r.getCaughtStealing());
    }

    @Test
    public void testDecrementRuns() throws Exception {
        RunningStats r = new RunningStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            r.incrementRuns();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            r.decrementRuns();
        }
        assertEquals(inc - dec, r.getRuns());
        assertEquals(0, r.getStolenBases());
        assertEquals(0, r.getCaughtStealing());
    }

    @Test
    public void testIncrementStolenBases() throws Exception {
        RunningStats r = new RunningStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            r.incrementStolenBases();
        }
        assertEquals(0, r.getRuns());
        assertEquals(inc, r.getStolenBases());
        assertEquals(0, r.getCaughtStealing());
    }

    @Test
    public void testDecrementStolenBases() throws Exception {
        RunningStats r = new RunningStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            r.incrementStolenBases();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            r.decrementStolenBases();
        }
        assertEquals(0, r.getRuns());
        assertEquals(inc - dec, r.getStolenBases());
        assertEquals(0, r.getCaughtStealing());
    }

    @Test
    public void testIncrementCaughtStealing() throws Exception {
        RunningStats r = new RunningStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            r.incrementCaughtStealing();
        }
        assertEquals(0, r.getRuns());
        assertEquals(0, r.getStolenBases());
        assertEquals(inc, r.getCaughtStealing());
    }

    @Test
    public void testDecrementCaughtStealing() throws Exception {
        RunningStats r = new RunningStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            r.incrementCaughtStealing();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            r.decrementCaughtStealing();
        }
        assertEquals(0, r.getRuns());
        assertEquals(0, r.getStolenBases());
        assertEquals(inc - dec, r.getCaughtStealing());
    }
}