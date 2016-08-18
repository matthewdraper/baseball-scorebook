/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

public class HittingStatsTest {

    @Test
    public void testGetGames() throws Exception {
        HittingStats h = new HittingStats();
        int num = 53;
        for(int i = 0; i < num; i++){
            h.incrementGames();
        }
        Assert.assertEquals(num, h.getGames());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
    }

    @Test
    public void testIncrementGames() throws Exception {
        HittingStats h = new HittingStats();
        int num = 25;
        for(int i = 0; i < num; i++){
            h.incrementGames();
        }
        Assert.assertEquals(num, h.getGames());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
    }

    @Test
    public void testDecrementGames() throws Exception {
        HittingStats h = new HittingStats();
        int num = 30;
        for(int i = 0; i < num; i++){
            h.incrementGames();
        }
        int dec = 5;
        for(int i = 0; i < dec; i++){
            h.decrementGames();
        }
        Assert.assertEquals(num - dec, h.getGames());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
    }

    @Test
    public void testGetAtBats() throws Exception {
        HittingStats h = new HittingStats();
        int num = 20;
        for(int i = 0; i < num; i++){
            h.incrementAtBats();
        }
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testIncrementAtBats() throws Exception {
        HittingStats h = new HittingStats();
        int num = 72;
        for(int i = 0; i < num; i++){
            h.incrementAtBats();
        }
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testDecrementAtBats() throws Exception {
        HittingStats h = new HittingStats();
        int num = 20;
        for(int i = 0; i < num; i++){
            h.incrementAtBats();
        }
        int dec = 15;
        for(int i = 0; i < dec; i++){
            h.decrementAtBats();
        }
        Assert.assertEquals(num - dec, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testGetSingles() throws Exception {
        HittingStats h = new HittingStats();
        int num = 13;
        for(int i = 0; i < num; i++){
            h.incrementSingles();
        }
        Assert.assertEquals(num, h.getSingles());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testIncrementSingles() throws Exception {
        HittingStats h = new HittingStats();
        int num = 53;
        for(int i = 0; i < num; i++){
            h.incrementSingles();
        }
        Assert.assertEquals(num, h.getSingles());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testDecrementSingles() throws Exception {
        HittingStats h = new HittingStats();
        int num = 53;
        for(int i = 0; i < num; i++){
            h.incrementSingles();
        }
        int dec = 22;
        for(int i = 0; i < dec; i++){
            h.decrementSingles();
        }
        Assert.assertEquals(num - dec, h.getSingles());
        Assert.assertEquals(num - dec, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testGetDoubles() throws Exception {
        HittingStats h = new HittingStats();
        int num = 19;
        for(int i = 0; i < num; i++){
            h.incrementDoubles();
        }
        Assert.assertEquals(num, h.getDoubles());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testIncrementDoubles() throws Exception {
        HittingStats h = new HittingStats();
        int num = 79;
        for(int i = 0; i < num; i++){
            h.incrementDoubles();
        }
        Assert.assertEquals(num, h.getDoubles());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testDecrementDoubles() throws Exception {
        HittingStats h = new HittingStats();
        int num = 19;
        for(int i = 0; i < num; i++){
            h.incrementDoubles();
        }
        int dec = 12;
        for(int i = 0; i < dec; i++){
            h.decrementDoubles();
        }
        Assert.assertEquals(num - dec, h.getDoubles());
        Assert.assertEquals(num - dec, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testGetTriples() throws Exception {
        HittingStats h = new HittingStats();
        int num = 99;
        for(int i = 0; i < num; i++){
            h.incrementTriples();
        }
        Assert.assertEquals(num, h.getTriples());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testIncrementTriples() throws Exception {
        HittingStats h = new HittingStats();
        int num = 9;
        for(int i = 0; i < num; i++){
            h.incrementTriples();
        }
        Assert.assertEquals(num, h.getTriples());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testDecrementTriples() throws Exception {
        HittingStats h = new HittingStats();
        int num = 9;
        for(int i = 0; i < num; i++){
            h.incrementTriples();
        }
        int dec = 5;
        for(int i = 0; i < dec; i++){
            h.decrementTriples();
        }
        Assert.assertEquals(num - dec, h.getTriples());
        Assert.assertEquals(num - dec, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testGetHomeRuns() throws Exception {
        HittingStats h = new HittingStats();
        int num = 61;
        for(int i = 0; i < num; i++){
            h.incrementHomeRuns();
        }
        Assert.assertEquals(num, h.getHomeRuns());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(num, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testIncrementHomeRuns() throws Exception {
        HittingStats h = new HittingStats();
        int num = 11;
        for(int i = 0; i < num; i++){
            h.incrementHomeRuns();
        }
        Assert.assertEquals(num, h.getHomeRuns());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(num, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testDecrementHomeRuns() throws Exception {
        HittingStats h = new HittingStats();
        int num = 61;
        for(int i = 0; i < num; i++){
            h.incrementHomeRuns();
        }
        int dec = 33;
        for(int i = 0; i < dec; i++){
            h.decrementHomeRuns();
        }
        Assert.assertEquals(num - dec, h.getHomeRuns());
        Assert.assertEquals(num - dec, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(num - dec, h.getRbis());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getWalks());
        Assert.assertEquals(0, h.getGames());
    }

    @Test
    public void testGetRbis() throws Exception {
        HittingStats h = new HittingStats();
        int num = 21;
        for(int i = 0; i < num; i++){
            h.incrementRbis();
        }
        Assert.assertEquals(num, h.getRbis());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
    }

    @Test
    public void testIncrementRbis() throws Exception {
        HittingStats h = new HittingStats();
        int num = 8;
        for(int i = 0; i < num; i++){
            h.incrementRbis();
        }
        Assert.assertEquals(num, h.getRbis());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
    }

    @Test
    public void testDecrementRbis() throws Exception {
        HittingStats h = new HittingStats();
        int num = 31;
        for(int i = 0; i < num; i++){
            h.incrementRbis();
        }
        int dec = 2;
        for(int i = 0; i < dec; i++){
            h.decrementRbis();
        }
        Assert.assertEquals(num - dec, h.getRbis());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getWalks());
    }

    @Test
    public void testGetWalks() throws Exception {
        HittingStats h = new HittingStats();
        int num = 55;
        for(int i = 0; i < num; i++){
            h.incrementWalks();
        }
        Assert.assertEquals(num, h.getWalks());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
    }

    @Test
    public void testIncrementWalks() throws Exception {
        HittingStats h = new HittingStats();
        int num = 81;
        for(int i = 0; i < num; i++){
            h.incrementWalks();
        }
        Assert.assertEquals(num, h.getWalks());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
    }

    @Test
    public void testDecrementWalks() throws Exception {
        HittingStats h = new HittingStats();
        int num = 81;
        for(int i = 0; i < num; i++){
            h.incrementWalks();
        }
        int dec = 22;
        for(int i = 0; i < dec; i++){
            h.decrementWalks();
        }
        Assert.assertEquals(num - dec, h.getWalks());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
    }

    @Test
    public void testGetStrikeOuts() throws Exception {
        HittingStats h = new HittingStats();
        int num = 101;
        for(int i = 0; i < num; i++){
            h.incrementStrikeOuts();
        }
        Assert.assertEquals(num, h.getStrikeOuts());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
    }

    @Test
    public void testIncrementStrikeOuts() throws Exception {
        HittingStats h = new HittingStats();
        int num = 11;
        for(int i = 0; i < num; i++){
            h.incrementStrikeOuts();
        }
        Assert.assertEquals(num, h.getStrikeOuts());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
    }

    @Test
    public void testDecrementStrikeOuts() throws Exception {
        HittingStats h = new HittingStats();
        int num = 101;
        for(int i = 0; i < num; i++){
            h.incrementStrikeOuts();
        }
        int dec = 39;
        for(int i = 0; i < dec; i++){
            h.decrementStrikeOuts();
        }
        Assert.assertEquals(num - dec, h.getStrikeOuts());
        Assert.assertEquals(num - dec, h.getAtBats());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
    }

    @Test
    public void testGetIntenWalks() throws Exception {
        HittingStats h = new HittingStats();
        int num = 29;
        for(int i = 0; i < num; i++){
            h.incrementIntenWalks();
        }
        Assert.assertEquals(num, h.getIntenWalks());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
    }

    @Test
    public void testIncrementIntenWalks() throws Exception {
        HittingStats h = new HittingStats();
        int num = 11;
        for(int i = 0; i < num; i++){
            h.incrementIntenWalks();
        }
        Assert.assertEquals(num, h.getIntenWalks());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
    }

    @Test
    public void testDecrementIntenWalks() throws Exception {
        HittingStats h = new HittingStats();
        int num = 11;
        for(int i = 0; i < num; i++){
            h.incrementIntenWalks();
        }
        int dec = 1;
        for(int i = 0; i < dec; i++){
            h.decrementIntenWalks();
        }
        Assert.assertEquals(num - dec, h.getIntenWalks());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
    }

    @Test
    public void testGetHitByPitch() throws Exception {
        HittingStats h = new HittingStats();
        int num = 190;
        for(int i = 0; i < num; i++){
            h.incrementHitByPitch();
        }
        Assert.assertEquals(num, h.getHitByPitch());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getIntenWalks());
    }

    @Test
    public void testIncrementHitByPitch() throws Exception {
        HittingStats h = new HittingStats();
        int num = 122;
        for(int i = 0; i < num; i++){
            h.incrementHitByPitch();
        }
        Assert.assertEquals(num, h.getHitByPitch());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getIntenWalks());
    }

    @Test
    public void testDecrementHitByPitch() throws Exception {
        HittingStats h = new HittingStats();
        int num = 190;
        for(int i = 0; i < num; i++){
            h.incrementHitByPitch();
        }
        int dec = 99;
        for(int i = 0; i < dec; i++){
            h.decrementHitByPitch();
        }
        Assert.assertEquals(num - dec, h.getHitByPitch());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getIntenWalks());
    }

    @Test
    public void testGetSacBunts() throws Exception {
        HittingStats h = new HittingStats();
        int num = 111;
        for(int i = 0; i < num; i++){
            h.incrementSacBunts();
        }
        Assert.assertEquals(num, h.getSacBunts());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
    }

    @Test
    public void testIncrementSacBunts() throws Exception {
        HittingStats h = new HittingStats();
        int num = 151;
        for(int i = 0; i < num; i++){
            h.incrementSacBunts();
        }
        Assert.assertEquals(num, h.getSacBunts());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
    }

    @Test
    public void testDecrementSacBunts() throws Exception {
        HittingStats h = new HittingStats();
        int num = 151;
        for(int i = 0; i < num; i++){
            h.incrementSacBunts();
        }
        int dec = 49;
        for(int i = 0; i < dec; i++){
            h.decrementSacBunts();
        }
        Assert.assertEquals(num - dec, h.getSacBunts());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
    }

    @Test
    public void testGetSacFlys() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementSacFlys();
        }
        Assert.assertEquals(num, h.getSacFlys());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(num, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
    }

    @Test
    public void testIncrementSacFlys() throws Exception {
        HittingStats h = new HittingStats();
        int num = 31;
        for(int i = 0; i < num; i++){
            h.incrementSacFlys();
        }
        Assert.assertEquals(num, h.getSacFlys());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(num, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
    }

    @Test
    public void testDecrementSacFlys() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementSacFlys();
        }
        int dec = 11;
        for(int i = 0; i < dec; i++){
            h.decrementSacFlys();
        }
        Assert.assertEquals(num - dec, h.getSacFlys());
        Assert.assertEquals(0, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(num - dec, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
    }

    @Test
    public void testGetGroundBallDP() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementGroundBallDP();
        }
        Assert.assertEquals(num, h.getGroundBallDP());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
    }

    @Test
    public void testIncrementGroundBallDP() throws Exception {
        HittingStats h = new HittingStats();
        int num = 12;
        for(int i = 0; i < num; i++){
            h.incrementGroundBallDP();
        }
        Assert.assertEquals(num, h.getGroundBallDP());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
    }

    @Test
    public void testDecrementGroundBallDP() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementGroundBallDP();
        }
        int dec = 11;
        for(int i = 0; i < dec; i++){
            h.decrementGroundBallDP();
        }
        Assert.assertEquals(num - dec, h.getGroundBallDP());
        Assert.assertEquals(num - dec, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
    }

    @Test
    public void testGetGroundOuts() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementGroundOuts();
        }
        Assert.assertEquals(num, h.getGroundOuts());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getGroundBallDP());
    }

    @Test
    public void testIncrementGroundOuts() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementGroundOuts();
        }
        Assert.assertEquals(num, h.getGroundOuts());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getGroundBallDP());
    }

    @Test
    public void testDecrementGroundOuts() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementGroundOuts();
        }
        int dec = 11;
        for(int i = 0; i < dec; i++){
            h.decrementGroundOuts();
        }
        Assert.assertEquals(num - dec, h.getGroundOuts());
        Assert.assertEquals(num - dec, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getGroundBallDP());
    }

    @Test
    public void testGetFlyOuts() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementFlyOuts();
        }
        Assert.assertEquals(num, h.getFlyOuts());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getGroundOuts());
    }

    @Test
    public void testIncrementFlyOuts() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementFlyOuts();
        }
        Assert.assertEquals(num, h.getFlyOuts());
        Assert.assertEquals(num, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getGroundOuts());
    }

    @Test
    public void testDecrementFlyOuts() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementFlyOuts();
        }
        int dec = 11;
        for(int i = 0; i < dec; i++){
            h.decrementFlyOuts();
        }
        Assert.assertEquals(num - dec, h.getFlyOuts());
        Assert.assertEquals(num - dec, h.getAtBats());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getNumPitches());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getGroundOuts());
    }

    @Test
    public void testGetNumPitches() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementNumPitches();
        }
        Assert.assertEquals(num, h.getNumPitches());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getAtBats());
    }

    @Test
    public void testIncrementNumPitches() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementNumPitches();
        }
        Assert.assertEquals(num, h.getNumPitches());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getAtBats());
    }

    @Test
    public void testDecrementNumPitches() throws Exception {
        HittingStats h = new HittingStats();
        int num = 121;
        for(int i = 0; i < num; i++){
            h.incrementNumPitches();
        }
        int dec = 11;
        for(int i = 0; i < dec; i++){
            h.decrementNumPitches();
        }
        Assert.assertEquals(num - dec, h.getNumPitches());
        Assert.assertEquals(0, h.getHomeRuns());
        Assert.assertEquals(0, h.getStrikeOuts());
        Assert.assertEquals(0, h.getSingles());
        Assert.assertEquals(0, h.getTriples());
        Assert.assertEquals(0, h.getGames());
        Assert.assertEquals(0, h.getRbis());
        Assert.assertEquals(0, h.getDoubles());
        Assert.assertEquals(0, h.getIntenWalks());
        Assert.assertEquals(0, h.getHitByPitch());
        Assert.assertEquals(0, h.getSacBunts());
        Assert.assertEquals(0, h.getSacFlys());
        Assert.assertEquals(0, h.getGroundBallDP());
        Assert.assertEquals(0, h.getGroundOuts());
        Assert.assertEquals(0, h.getFlyOuts());
        Assert.assertEquals(0, h.getAtBats());
    }

    public HittingStats initializeHittingStats(){
        HittingStats h = new HittingStats();

        int games = 32;
        int singles = 42;
        int doubles = 12;
        int triples = 1;
        int homeRuns = 16;
        int rbis = 27;
        int walks = 8;
        int strikeOuts = 10;
        int intenWalks = 2;
        int hitByPitch = 1;
        int sacBunts = 3;
        int sacFlys = 7;
        int groundBallDP = 4;
        int groundOuts = 7;
        int flyOuts = 12;
        int numPitches = 1232;

        for(int i = 0; i < games; i++){
            h.incrementGames();
        }

        for(int i = 0; i < singles; i++){
            h.incrementSingles();
        }

        for(int i = 0; i < doubles; i++){
            h.incrementDoubles();
        }

        for(int i = 0; i < triples; i++){
            h.incrementTriples();
        }

        for(int i = 0; i < homeRuns; i++){
            h.incrementHomeRuns();
        }

        for(int i = 0; i < rbis; i++){
            h.incrementRbis();
        }

        for(int i = 0; i < strikeOuts; i++){
            h.incrementStrikeOuts();
        }

        for(int i = 0; i < intenWalks; i++){
            h.incrementIntenWalks();
        }

        for(int i = 0; i < walks; i++){
            h.incrementWalks();
        }

        for(int i = 0; i < hitByPitch; i++){
            h.incrementHitByPitch();
        }

        for(int i = 0; i < sacBunts; i++){
            h.incrementSacBunts();
        }

        for(int i = 0; i < sacFlys; i++){
            h.incrementSacFlys();
        }

        for(int i = 0; i < groundBallDP; i++){
            h.incrementGroundBallDP();
        }

        for(int i = 0; i < groundOuts; i++){
            h.incrementGroundOuts();
        }

        for(int i = 0; i < flyOuts; i++){
            h.incrementFlyOuts();
        }

        for(int i = 0; i < numPitches; i++){
            h.incrementNumPitches();
        }
        return h;
    }

    @Test
    public void testCalcBattingAvg() throws Exception {
        HittingStats h = initializeHittingStats();
        Assert.assertEquals(((double)71/(double)104), h.calcBattingAvg());
    }

    @Test
    public void testCalcOnBasePct() throws Exception {
        HittingStats h = initializeHittingStats();
        Assert.assertEquals(((double)82/(double)122), h.calcOnBasePct());
    }

    @Test
    public void testCalcSlugPct() throws Exception {
        HittingStats h = initializeHittingStats();
        Assert.assertEquals(((double)133/(double)104), h.calcSlugPct());
    }

    @Test
    public void testCalcOBPS() throws Exception {
        HittingStats h = initializeHittingStats();
        Assert.assertEquals((((double)82/(double)122)+(double)133/(double)104), h.calcOBPS());
    }

    @Test
    public void testCalcTotalBases() throws Exception {
        HittingStats h = initializeHittingStats();
        Assert.assertEquals(133, h.calcTotalBases());
    }

    @Test
    public void testCalcXBH() throws Exception {
        HittingStats h = initializeHittingStats();
        Assert.assertEquals(29, h.calcXBH());
    }

    @Test
    public void testCalcGOAO() throws Exception {
        HittingStats h = initializeHittingStats();
        Assert.assertEquals((double)7/(double)12 , h.calcGOAO());
    }

    @Test
    public void testCalcPlateApps() throws Exception {
        HittingStats h = initializeHittingStats();
        Assert.assertEquals(125, h.calcPlateApps());
    }

    @Test
    public void testCalcHits() throws Exception {
        HittingStats h = initializeHittingStats();
        Assert.assertEquals(71, h.calcHits());
    }
}