/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.Model;

import junit.framework.Assert;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by matt on 8/17/16.
 */
public class PlayerTest {

    @Test
    public void testGetJerseyNumber() throws Exception {
        String jerseyNum = "98";
        Player p = new Player();
        p.setJerseyNumber(jerseyNum);
        Assert.assertEquals(jerseyNum, p.getJerseyNumber());
    }

    @Test
    public void testSetJerseyNumber() throws Exception {
        String jerseyNum = "98";
        Player p = new Player();
        p.setJerseyNumber(jerseyNum);
        Assert.assertEquals(jerseyNum, p.getJerseyNumber());
    }

    @Test
    public void testGetStats() throws Exception {
        OverallStats stats = new OverallStats();
        RunningStats runningStats = new RunningStats();
        runningStats.setRuns(2);
        stats.setRunningStats(runningStats);
        Player p = new Player();
        p.setStats(stats);
        Assert.assertEquals(stats, p.getStats());
    }

    @Test
    public void testSetStats() throws Exception {
        OverallStats stats = new OverallStats();
        RunningStats runningStats = new RunningStats();
        runningStats.setRuns(2);
        stats.setRunningStats(runningStats);
        Player p = new Player();
        p.setStats(stats);
        Assert.assertEquals(stats, p.getStats());
    }

    @Test
    public void testIsBatRight() throws Exception {
        Player p = new Player();
        boolean isRightHanded = true;
        p.setBatRight(isRightHanded);
        Assert.assertEquals(isRightHanded, p.isBatRight());
    }

    @Test
    public void testSetBatRight() throws Exception {
        Player p = new Player();
        boolean isRightHanded = true;
        p.setBatRight(isRightHanded);
        Assert.assertEquals(isRightHanded, p.isBatRight());
    }

    @Test
    public void testIsBatLeft() throws Exception {
        Player p = new Player();
        boolean isLeftHanded = true;
        p.setBatLeft(isLeftHanded);
        Assert.assertEquals(isLeftHanded, p.isBatLeft());
    }

    @Test
    public void testSetBatLeft() throws Exception {
        Player p = new Player();
        boolean isLeftHanded = true;
        p.setBatLeft(isLeftHanded);
        Assert.assertEquals(isLeftHanded, p.isBatLeft());
    }

    @Test
    public void testIsThrowRight() throws Exception {
        Player p = new Player();
        boolean isRightHanded = true;
        p.setThrowRight(isRightHanded);
        Assert.assertEquals(isRightHanded, p.isThrowRight());
    }

    @Test
    public void testSetThrowRight() throws Exception {
        Player p = new Player();
        boolean isRightHanded = true;
        p.setThrowRight(isRightHanded);
        Assert.assertEquals(isRightHanded, p.isThrowRight());
    }

    @Test
    public void testIsThrowLeft() throws Exception {
        Player p = new Player();
        boolean isLeftHanded = true;
        p.setThrowLeft(isLeftHanded);
        Assert.assertEquals(isLeftHanded, p.isThrowLeft());
    }

    @Test
    public void testSetThrowLeft() throws Exception {
        Player p = new Player();
        boolean isLeftHanded = true;
        p.setThrowLeft(isLeftHanded);
        Assert.assertEquals(isLeftHanded, p.isThrowLeft());
    }

    @Test
    public void testGetHeightInches() throws Exception {
        Player p = new Player();
        int inches = 72;
        p.setHeightInches(inches);
        Assert.assertEquals(inches, p.getHeightInches());
    }

    @Test
    public void testSetHeightInches() throws Exception {
        Player p = new Player();
        int inches = 72;
        p.setHeightInches(inches);
        Assert.assertEquals(inches, p.getHeightInches());
    }

    @Test
    public void testGetWeight() throws Exception {
        Player p = new Player();
        int weight = 223;
        p.setWeight(weight);
        Assert.assertEquals(weight, p.getWeight());
    }

    @Test
    public void testSetWeight() throws Exception {
        Player p = new Player();
        int weight = 223;
        p.setWeight(weight);
        Assert.assertEquals(weight, p.getWeight());
    }

//    @Test
//    public void testGetDateOfBirth() throws Exception {
//        Player p = new Player();
//        Date dob = new Date()
//    }
//
//    @Test
//    public void testSetDateOfBirth() throws Exception {
//
//    }

    @Test
    public void testIsSwitchHitter() throws Exception {
        Player p = new Player();
        p.setBatLeft(true);
        p.setBatRight(true);
        Assert.assertEquals(true, p.isSwitchHitter());
    }
}