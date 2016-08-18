/*
 * Copyright (c) 2016. This file and any source code contained in this project are solely owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

public class PitchingStatsTest {

    @Test
    public void testIncrementWins() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementWins();
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
    public void testIncrementGames() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementGames();
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
    public void testIncrementGamesStarted() throws Exception {
        PitchingStats p = new PitchingStats();
        int inc = 50;
        for(int i = 0; i < inc; i++){
            p.incrementGamesStarted();
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
        assertEquals(0, p.getBalks());
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
        assertEquals(0, p.getBalks());
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
        assertEquals(0, p.getStolenBases());
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
        assertEquals(0, p.getStolenBases());
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
        assertEquals(0, p.getCaughtStealing());
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
        assertEquals(0, p.getCaughtStealing());
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
        assertEquals(0, p.getPickOffs());
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
        assertEquals(0, p.getPickOffs());
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
        assertEquals(0, p.getTotalNumBF());
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
        assertEquals(0, p.getTotalNumBF());
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
        assertEquals(0, p.getNumPitches());
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
        assertEquals(0, p.getNumPitches());
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
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
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
        assertEquals(0, p.getTotalNumBF());
        assertEquals(0, p.getNumPitches());
        assertEquals(0, p.getAtBats());
    }

    @Test
    public void testCalcEarnedRunAvg() throws Exception {

    }

    @Test
    public void testCalcInningsPitched() throws Exception {

    }

    @Test
    public void testCalcStrikeOuts() throws Exception {

    }

    @Test
    public void testCalcAverage() throws Exception {

    }

    @Test
    public void testCalcWHIP() throws Exception {

    }

    @Test
    public void testCalcWinPct() throws Exception {

    }

    @Test
    public void testCalcGOAO() throws Exception {

    }

    @Test
    public void testCalcOBP() throws Exception {

    }

    @Test
    public void testCalcSlugPct() throws Exception {

    }

    @Test
    public void testCalcOBPS() throws Exception {

    }

    @Test
    public void testCalcKsPerNine() throws Exception {

    }

    @Test
    public void testCalcWalksPerNine() throws Exception {

    }

    @Test
    public void testCalcHitsPerNine() throws Exception {

    }

    @Test
    public void testCalcKBB() throws Exception {

    }

    @Test
    public void testCalcPIP() throws Exception {

    }

    @Test
    public void testCalcHits() throws Exception {

    }
}