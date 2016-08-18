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
public class GameStateTest {

    @Test
    public void testIncrementBalls() throws Exception {
        GameState gs = new GameState();
        gs.incrementBalls();
        assertEquals(1, gs.getBallCount());
        assertEquals(1, gs.getPitchCount());
    }

    @Test
    public void testDecrementBalls() throws Exception {
        GameState gs = new GameState();
        gs.incrementBalls();
        gs.decrementBalls();
        assertEquals(0, gs.getBallCount());
        assertEquals(0, gs.getPitchCount());
    }

    @Test
    public void testIncrementStrikes() throws Exception {
        GameState gs = new GameState();
        gs.incrementStrikes();
        assertEquals(1, gs.getStrikeCount());
        assertEquals(1, gs.getPitchCount());
    }

    @Test
    public void testDecrementStrikes() throws Exception {
        GameState gs = new GameState();
        gs.incrementStrikes();
        gs.decrementStrikes();
        assertEquals(0, gs.getStrikeCount());
        assertEquals(0, gs.getPitchCount());
    }

    @Test
    public void testIncrementOuts() throws Exception {
        GameState gs = new GameState();
        gs.incrementOuts();
        gs.incrementOuts();
        assertEquals(2, gs.getNumOuts());
    }

    @Test
    public void testDecrementOuts() throws Exception {
        GameState gs = new GameState();
        gs.incrementOuts();
        gs.decrementOuts();
        assertEquals(0, gs.getNumOuts());
    }

    @Test
    public void testSetTop() throws Exception {
        GameState gs = new GameState();
        gs.setTop(true);
        assertEquals(true, gs.isTop());
        gs.setTop(false);
        assertEquals(false, gs.isTop());
    }

    @Test
    public void testIncrementInning() throws Exception {
        GameState gs = new GameState();
        int inn = gs.getInning();
        gs.incrementInning();
        gs.incrementInning();
        assertEquals(inn + 2, gs.getInning());
    }

    @Test
    public void testDecrementInning() throws Exception {
        GameState gs = new GameState();
        int inn = gs.getInning();
        gs.incrementInning();
        gs.decrementInning();
        assertEquals(inn, gs.getInning());
    }

    @Test
    public void testIncrementLineupStateIndex() throws Exception {
        GameState gs = new GameState();
        gs.incrementLineupStateIndex();
        gs.incrementLineupStateIndex();
        assertEquals(2, gs.getLineupStateIndex());
    }

    @Test
    public void testDecrementLineupStateIndex() throws Exception {
        GameState gs = new GameState();
        gs.incrementLineupStateIndex();
        gs.decrementLineupStateIndex();
        assertEquals(0, gs.getLineupStateIndex());
    }

    @Test
    public void testSetCurrRunnerFirstIndex() throws Exception {
        GameState gs = new GameState();
        gs.setCurrRunnerFirstIndex(42);
        assertEquals(42, gs.getCurrRunnerFirstIndex());
    }

    @Test
    public void testClearRunnerOnFirst() throws Exception {
        GameState gs = new GameState();
        gs.setCurrRunnerFirstIndex(32);
        gs.clearRunnerOnFirst();
        assertEquals(-1, gs.getCurrRunnerFirstIndex());
    }

    @Test
    public void testSetCurrRunnerSecondIndex() throws Exception {
        GameState gs = new GameState();
        gs.setCurrRunnerSecondIndex(42);
        assertEquals(42, gs.getCurrRunnerSecondIndex());
    }

    @Test
    public void testClearRunnerOnSecond() throws Exception {
        GameState gs = new GameState();
        gs.setCurrRunnerSecondIndex(32);
        gs.clearRunnerOnSecond();
        assertEquals(-1, gs.getCurrRunnerSecondIndex());
    }

    @Test
    public void testSetCurrRunnerThirdIndex() throws Exception {
        GameState gs = new GameState();
        gs.setCurrRunnerThirdIndex(42);
        assertEquals(42, gs.getCurrRunnerThirdIndex());
    }

    @Test
    public void testClearRunnerOnThird() throws Exception {
        GameState gs = new GameState();
        gs.setCurrRunnerThirdIndex(32);
        gs.clearRunnerOnThird();
        assertEquals(-1, gs.getCurrRunnerThirdIndex());
    }

    @Test
    public void testClearBaseRunners() throws Exception {
        GameState gs = new GameState();
        gs.setCurrRunnerFirstIndex(42);
        gs.setCurrRunnerSecondIndex(4);
        gs.setCurrRunnerThirdIndex(22);
        gs.clearBaseRunners();
        assertEquals(-1, gs.getCurrRunnerFirstIndex());
        assertEquals(-1, gs.getCurrRunnerSecondIndex());
        assertEquals(-1, gs.getCurrRunnerThirdIndex());
    }

    @Test
    public void testNextBatter() throws Exception {
        GameState gs = new GameState();
        gs.nextBatter();
        gs.nextBatter();
        gs.nextBatter();
        assertEquals(3, gs.getCurrAwayBatterIndex());
        gs.setTop(false);
        gs.nextBatter();
        assertEquals(1, gs. getCurrHomeBatterIndex());
    }

    @Test
    public void testClearCount() throws Exception {
        GameState gs = new GameState();
        gs.incrementStrikes();
        gs.incrementBalls();
        gs.incrementStrikes();
        gs.clearCount();
        assertEquals(0, gs.getStrikeCount());
        assertEquals(0, gs.getBallCount());
    }

    @Test
    public void testIncrementRuns() throws Exception {
        GameState gs = new GameState();
        gs.incrementRuns();
        gs.incrementRuns();
        gs.setTop(false);
        gs.incrementRuns();
        gs.incrementRuns();
        gs.incrementRuns();
        assertEquals(2, gs.getAwayScore());
        assertEquals(3, gs.getHomeScore());
    }

    @Test
    public void testDecrementRuns() throws Exception {
        GameState gs = new GameState();
        gs.incrementRuns();
        gs.decrementRuns();
        gs.setTop(false);
        gs.incrementRuns();
        gs.decrementRuns();
        gs.incrementRuns();
        assertEquals(0, gs.getAwayScore());
        assertEquals(1, gs.getHomeScore());
    }

    @Test
    public void testIncrementPitchCount() throws Exception {
        GameState gs = new GameState();
        gs.incrementStrikes();
        gs.incrementStrikes();
        gs.incrementBalls();
        gs.incrementBalls();
        gs.incrementBalls();
        assertEquals(5, gs.getPitchCount());
        gs.setTop(false);
        gs.clearCount();
        gs.incrementStrikes();
        gs.incrementStrikes();
        gs.incrementBalls();
        gs.incrementBalls();
        assertEquals(4, gs.getPitchCount());
    }

    @Test
    public void testDecrementPitchCount() throws Exception {
        GameState gs = new GameState();
        gs.incrementStrikes();
        gs.decrementStrikes();
        gs.incrementBalls();
        gs.decrementBalls();
        gs.incrementBalls();
        assertEquals(1, gs.getPitchCount());
        gs.setTop(false);
        gs.incrementStrikes();
        gs.decrementStrikes();
        gs.incrementBalls();
        gs.decrementBalls();
        assertEquals(0, gs.getPitchCount());
    }

    @Test
    public void testIncrementScore() throws Exception {
        GameState gs = new GameState();
        gs.incrementScore();
        gs.incrementScore();
        assertEquals(2, gs.getAwayScore());
        gs.setTop(false);
        gs.incrementScore();
        assertEquals(1, gs.getHomeScore());
    }

    @Test
    public void testDecrementScore() throws Exception {
        GameState gs = new GameState();
        gs.incrementScore();
        gs.decrementScore();
        assertEquals(0, gs.getAwayScore());
        gs.setTop(false);
        gs.incrementScore();
        gs.incrementScore();
        gs.decrementScore();
        assertEquals(1, gs.getHomeScore());
    }

    @Test
    public void testIncrementHits() throws Exception {
        GameState gs = new GameState();
        gs.incrementHits();
        gs.incrementHits();
        assertEquals(2, gs.getAwayHits());
        gs.setTop(false);
        gs.incrementHits();
        assertEquals(1, gs.getHomeHits());
    }

    @Test
    public void testDecrementHits() throws Exception {
        GameState gs = new GameState();
        gs.incrementHits();
        gs.incrementHits();
        gs.decrementHits();
        assertEquals(1, gs.getAwayHits());
        gs.setTop(false);
        gs.incrementHits();
        gs.incrementHits();
        gs.decrementHits();
        assertEquals(1, gs.getHomeHits());
    }

    @Test
    public void testIncrementErrors() throws Exception {
        GameState gs = new GameState();
        gs.incrementErrors();
        gs.incrementErrors();
        assertEquals(2, gs.getHomeErrors());
        gs.setTop(false);
        gs.incrementErrors();
        assertEquals(1, gs.getAwayErrors());
    }

    @Test
    public void testDecrementErrors() throws Exception {
        GameState gs = new GameState();
        gs.incrementErrors();
        gs.decrementErrors();
        assertEquals(0, gs.getHomeErrors());
        gs.setTop(false);
        gs.incrementErrors();
        gs.incrementErrors();
        gs.decrementErrors();
        assertEquals(1, gs.getAwayErrors());
    }

    @Test
    public void testNextHalfInning() throws Exception {
        GameState gs = new GameState();
        gs.nextHalfInning();
        assertEquals(false, gs.isTop());
        gs.nextHalfInning();
        assertEquals(true, gs.isTop());
    }
}