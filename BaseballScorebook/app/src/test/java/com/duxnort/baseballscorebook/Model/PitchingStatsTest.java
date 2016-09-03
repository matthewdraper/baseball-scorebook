/*
 * Copyright (c) 2016. This file and any source code contained in this project are solely owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PitchingStatsTest {

    @Test
    public void testIncrementWins() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementWins();
        }
        assertEquals(inc, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementWins() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementWins();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementWins();
        }
        assertEquals(inc - dec, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementLosses() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementLosses();
        }
        assertEquals(0, p.getWins());
        assertEquals(inc, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementLossses() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementLosses();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementLossses();
        }
        assertEquals(0, p.getWins());
        assertEquals(inc - dec, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementGames() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementGames();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(inc, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementGames() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementGames();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementGames();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(inc - dec, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementGamesStarted() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementGamesStarted();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(inc, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementGamesStarted() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementGamesStarted();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementGamesStarted();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(inc - dec, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementSaves() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementSaves();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(inc, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementSaves() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementSaves();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementSaves();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(inc - dec, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementSaveOpps() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementSaveOpps();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(inc, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementSaveOpps() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementSaveOpps();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementSaveOpps();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(inc - dec, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }


    @Test
    public void testIncrementNumOutsPitched() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementNumOutsPitched();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(inc, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementNumOutsPitched() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementNumOutsPitched();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementNumOutsPitched();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(inc - dec, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementSingles() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementSingles();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(inc, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc, p.getAtBats());
    }

    @Test
    public void testDecrementSingles() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementSingles();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementSingles();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(inc - dec, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc - dec, p.getAtBats());
    }

    @Test
    public void testIncrementDoubles() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementDoubles();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(inc, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc, p.getAtBats());
    }

    @Test
    public void testDecrementDoubles() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementDoubles();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementDoubles();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(inc - dec, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc - dec, p.getAtBats());
    }

    @Test
    public void testIncrementTriples() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementTriples();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(inc, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc, p.getAtBats());
    }

    @Test
    public void testDecrementTriples() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementTriples();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementTriples();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(inc - dec, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc - dec, p.getAtBats());
    }

    @Test
    public void testIncrementSacBunts() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementSacBunts();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(inc, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementSacBunts() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementSacBunts();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementSacBunts();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(inc - dec, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementRuns() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementRuns();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(inc, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementRuns() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementRuns();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementRuns();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(inc - dec, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementEarnedRuns() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementEarnedRuns();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(inc, p.getRuns());
        assertEquals(inc, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementEarnedRuns() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementEarnedRuns();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementEarnedRuns();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(inc - dec, p.getRuns());
        assertEquals(inc - dec, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementHomeRuns() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementHomeRuns();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(inc, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc, p.getAtBats());
    }

    @Test
    public void testDecrementHomeRuns() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementHomeRuns();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementHomeRuns();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(inc - dec, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc - dec, p.getAtBats());
    }

    @Test
    public void testIncrementWalks() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementWalks();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(inc, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementWalks() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementWalks();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementWalks();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(inc - dec, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementStrikeOutSwing() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementStrikeOutSwing();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(inc, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc, p.getAtBats());
    }

    @Test
    public void testDecrementStrikeOutSwing() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementStrikeOutSwing();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementStrikeOutSwing();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(inc - dec, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc - dec, p.getAtBats());
    }

    @Test
    public void testIncrementStrikeOutLook() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementStrikeOutLook();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(inc, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc, p.getAtBats());
    }

    @Test
    public void testDecrementStrikeOutLook() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementStrikeOutLook();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementStrikeOutLook();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(inc - dec, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc - dec, p.getAtBats());
    }

    @Test
    public void testIncrementCompleteGames() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementCompleteGames();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(inc, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementCompleteGames() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementCompleteGames();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementCompleteGames();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(inc - dec, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementShutOuts() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++) {
            p.incrementShutOuts();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(inc, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementShutOuts() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++) {
            p.incrementShutOuts();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementShutOuts();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(inc - dec, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementHitBatsmen() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementHitBatsmen();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(inc, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementHitBatsmen() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementHitBatsmen();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementHitBatsmen();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(inc - dec, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementIntenWalks() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementIntenWalks();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(inc, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementIntenWalks() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementIntenWalks();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementIntenWalks();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(inc - dec, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementGamesFinished() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementGamesFinished();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(inc, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementGamesFinished() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementGamesFinished();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementGamesFinished();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(inc - dec, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementHolds() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementHolds();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(inc, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementHolds() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementHolds();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementHolds();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(inc - dec, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementInducedGBDPs() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementInducedGBDPs();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(inc, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc, p.getAtBats());
    }

    @Test
    public void testDecrementInducedGBDPs() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementInducedGBDPs();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementInducedGBDPs();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(inc - dec, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc - dec, p.getAtBats());
    }

    @Test
    public void testIncrementGroundOuts() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementGroundOuts();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(inc, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc, p.getAtBats());
    }

    @Test
    public void testDecrementGroundOuts() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementGroundOuts();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementGroundOuts();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(inc - dec, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc - dec, p.getAtBats());
    }

    @Test
    public void testIncrementFlyOuts() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementFlyOuts();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(inc, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc, p.getAtBats());
    }

    @Test
    public void testDecrementFlyOuts() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementFlyOuts();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementFlyOuts();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(inc - dec, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc - dec, p.getAtBats());
    }

    @Test
    public void testIncrementWildPitches() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementWildPitches();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(inc, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementWildPitches() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementWildPitches();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementWildPitches();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(inc - dec, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementBalks() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementBalks();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(inc, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementBalks() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementBalks();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementBalks();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(inc - dec, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementStolenBases() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementStolenBases();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(inc, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementStolenBases() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementStolenBases();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementStolenBases();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(inc - dec, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementCaughtStealing() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementCaughtStealing();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(inc, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementCaughtStealing() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementCaughtStealing();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementCaughtStealing();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(inc - dec, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementPickOffs() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementPickOffs();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(inc, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementPickOffs() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementPickOffs();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementPickOffs();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(inc - dec, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementTotalNumBF() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementTotalNumBF();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementTotalNumBF() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementTotalNumBF();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementTotalNumBF();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementNumPitches() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementNumPitches();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(inc, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testDecrementNumPitches() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementNumPitches();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementNumPitches();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(0, p.getTotalNumBF());
        assertEquals(inc - dec, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testIncrementAtBats() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementAtBats();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc, p.getAtBats());
    }

    @Test
    public void testDecrementAtBats() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementAtBats();
        }
        int dec = 25;
        for(int i = 0; i < dec; i++){
            p.decrementAtBats();
        }
        assertEquals(0, p.getWins());
        assertEquals(0, p.getLosses());
        assertEquals(0, p.getGames());
        assertEquals(0, p.getGamesStarted());
        assertEquals(0, p.getSaves());
        assertEquals(0, p.getSaveOpps());
        assertEquals(0, p.getNumOutsPitched());
        assertEquals(0, p.getSingles());
        assertEquals(0, p.getDoubles());
        assertEquals(0, p.getTriples());
        assertEquals(0, p.getSacBunts());
        assertEquals(0, p.getRuns());
        assertEquals(0, p.getEarnedRuns());
        assertEquals(0, p.getHomeRuns());
        assertEquals(0, p.getWalks());
        assertEquals(0, p.getStrikeOutSwing());
        assertEquals(0, p.getStrikeOutLook());
        assertEquals(0, p.getCompleteGames());
        assertEquals(0, p.getShutOuts());
        assertEquals(0, p.getHitBatsmen());
        assertEquals(0, p.getIntenWalks());
        assertEquals(0, p.getGamesFinished());
        assertEquals(0, p.getHolds());
        assertEquals(0, p.getInducedGBDPs());
        assertEquals(0, p.getGroundOuts());
        assertEquals(0, p.getFlyOuts());
        assertEquals(0, p.getWildPitches());
        assertEquals(0, p.getBalks());
        assertEquals(0, p.getStolenBases());
        assertEquals(0, p.getCaughtStealing());
        assertEquals(0, p.getPickOffs());
        assertEquals(inc - dec, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(inc - dec, p.getAtBats());
    }

    private PitchingStats initializePitchingStats() {
        int wins = 6;
        int losses = 10;
        int games = 22;
        int gamesStarted = 7;
        int saves = 2;
        int saveOpps = 3;
        int numOutsPitched = 502;
        int singles = 34;
        int doubles = 22;
        int triples = 6;
        int sacBunts = 3;
        int runs = 16;
        int earnedRuns = 7;
        int homeRuns = 3;
        int walks = 19;
        int strikeOutSwing = 28;
        int strikeOutLook = 18;
        int completeGames = 1;
        int shutOuts = 1;
        int hitBatsmen = 3;
        int intenWalks = 2;
        int gamesFinished = 2;
        int holds = 1;
        int inducedGBDPs = 5;
        int groundOuts = 6;
        int flyOuts = 7;
        int wildPitches = 4;
        int balks = 1;
        int stolenBases = 2;
        int caughtStealing = 3;
        int pickOffs = 2;
        int totalNumBF = 153;
        int numPitches = 2030;
        int atBats = 130;

        return new PitchingStats( wins,  losses,  games,  gamesStarted,  saves,  saveOpps,
         numOutsPitched,  singles,  doubles,  triples,  sacBunts,
         runs,  earnedRuns,  homeRuns,  walks,  strikeOutSwing,
         strikeOutLook,  completeGames,  shutOuts,  hitBatsmen,
         intenWalks,  gamesFinished,  holds,  inducedGBDPs,
         groundOuts,  flyOuts,  wildPitches,  balks,  stolenBases,
         caughtStealing,  pickOffs,  totalNumBF,  numPitches,
         atBats);
    }

    @Test
    public void testCalcEarnedRunAvg() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(((double)63 / ((double)502 / (double)3)), p.calcEarnedRunAvg());
    }

    @Test
    public void testCalcInningsPitched() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals("167.1", p.calcInningsPitched());
    }

    @Test
    public void testCalcStrikeOuts() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(46, p.calcStrikeOuts());
    }

    @Test
    public void testCalcAverage() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(((double)65 / (double)130) , p.calcAverage());
    }

    @Test
    public void testCalcWHIP() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(((double)86 / ((double)502/(double)3)), p.calcWHIP());
    }

    @Test
    public void testCalcWinPct() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(((double)6 / (double)16), p.calcWinPct());
    }

    @Test
    public void testCalcGOAO() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(((double)11 / (double)7), p.calcGOAO());
    }

    @Test
    public void testCalcOBP() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(((double)89 / (double)150), p.calcOBP());
    }

    @Test
    public void testCalcSlugPct() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(((double)108 / (double)130), p.calcSlugPct());
    }

    @Test
    public void testCalcOBPS() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals((((double)89 / (double)150) + ((double)108 / (double)130)), p.calcOBPS());
    }

    @Test
    public void testCalcKsPerNine() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(((double)46 / (((double)502) / (double) 3) * ((double)9)), p.calcKsPerNine());
    }

    @Test
    public void testCalcWalksPerNine() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(((double)21 / (((double)502) / (double) 3) * ((double)9)), p.calcWalksPerNine());
    }

    @Test
    public void testCalcHitsPerNine() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(((double)65 / (((double)502) / (double) 3) * ((double)9)), p.calcHitsPerNine());
    }

    @Test
    public void testCalcKBB() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(((double)46 / (double)21), p.calcKBB());
    }

    @Test
    public void testCalcPIP() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(((double)2030 / (((double)502) / (double) 3)), p.calcPIP());
    }

    @Test
    public void testCalcHits() throws Exception {
        PitchingStats p = initializePitchingStats();
        Assert.assertEquals(65, p.calcHits());
    }
}