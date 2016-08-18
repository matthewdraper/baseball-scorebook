/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by matt on 8/18/16.
 */
public class FieldingStatsTest {

    @Test
    public void testIncrementGames() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementGames();
        }
        assertEquals(inc, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testDecrementGames() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementGames();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            f.decrementGames();
        }
        assertEquals(inc - dec, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testIncrementGamesStarted() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementGamesStarted();
        }
        assertEquals(0, f.getGames());
        assertEquals(inc, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testDecrementGamesStarted() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementGamesStarted();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            f.decrementGamesStarted();
        }
        assertEquals(0, f.getGames());
        assertEquals(inc - dec, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testIncrementOutInField() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementOutInField();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(inc, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testDecrementOutInField() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementOutInField();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            f.decrementOutInField();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(inc - dec, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testIncrementPutOuts() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementPutOuts();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(inc, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testDecrementPutOuts() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementPutOuts();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            f.decrementPutOuts();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(inc - dec, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testIncrementAssists() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementAssists();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(inc, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testDecrementAssists() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementAssists();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            f.decrementAssists();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(inc - dec, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testIncrementErrors() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementErrors();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(inc, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testDecrementErrors() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementErrors();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            f.decrementErrors();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(inc - dec, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testIncrementStolenBases() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementStolenBases();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(inc, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testDecrementStolenBases() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementStolenBases();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            f.decrementStolenBases();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(inc - dec, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testIncrementCaughtStealing() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementCaughtStealing();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(inc, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testDecrementCaughtStealing() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementCaughtStealing();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            f.decrementCaughtStealing();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(inc - dec, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testIncrementPassedBalls() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementPassedBalls();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(inc, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testDecrementPassedBalls() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementPassedBalls();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            f.decrementPassedBalls();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(inc - dec, f.getPassedBalls());
        assertEquals(0, f.getWpCatching());
    }

    @Test
    public void testIncrementWpCatching() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementWpCatching();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(inc, f.getWpCatching());
    }

    @Test
    public void testDecrementWpCatching() throws Exception {
        FieldingStats f = new FieldingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            f.incrementWpCatching();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            f.decrementWpCatching();
        }
        assertEquals(0, f.getGames());
        assertEquals(0, f.getGamesStarted());
        assertEquals(0, f.getOutInField());
        assertEquals(0, f.getPutOuts());
        assertEquals(0, f.getAssists());
        assertEquals(0, f.getErrors());
        assertEquals(0, f.getStolenBases());
        assertEquals(0, f.getCaughtStealing());
        assertEquals(0, f.getPassedBalls());
        assertEquals(inc - dec, f.getWpCatching());
    }

    private FieldingStats initializeFieldingStat(){
        int games = 4;
        int gamesStarted = 4;
        int outInField = 46;
        int putOuts = 2;
        int assists = 3;
        int errors = 2;
        int stolenBases = 2;
        int caughtStealing = 2;
        int passedBalls = 2;
        int wpCatching = 2;
        return new FieldingStats( games,  gamesStarted,  outInField,  putOuts,  assists,
         errors,  stolenBases,  caughtStealing,  passedBalls,
         wpCatching);
    }

    @Test
    public void testCalcInnings() throws Exception {
        FieldingStats f = initializeFieldingStat();
        assertEquals("15.1", f.calcInnings());
    }

    @Test
    public void testCalcTotalChances() throws Exception {
        FieldingStats f = initializeFieldingStat();
        assertEquals(7, f.calcTotalChances());
    }

    @Test
    public void testCalcStolenBasePct() throws Exception {
        FieldingStats f = initializeFieldingStat();
        assertEquals((double)2 / (double)4 , f.calcStolenBasePct());
    }

    @Test
    public void testCalcFieldingPct() throws Exception {
        FieldingStats f = initializeFieldingStat();
        assertEquals(((double)5 / (double)7), f.calcFieldingPct());
    }

    @Test
    public void testCalcRangeFactor() throws Exception {
        FieldingStats f = initializeFieldingStat();
        assertEquals(((double)5 / ((double)46 / (double)3)), f.calcRangeFactor());
    }
}