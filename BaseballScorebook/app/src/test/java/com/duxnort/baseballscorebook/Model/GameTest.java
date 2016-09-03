package com.duxnort.baseballscorebook.Model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by root on 9/2/16.
 */
public class GameTest {

    @Test
    public void testNewGameState() throws Exception {
        Game g = new Game();
        g.setGameStateList(new ArrayList<GameState>());
        g.newGameState();
        assertEquals(1, g.getGameStateList().size());
        g.newGameState();
        assertEquals(2, g.getGameStateList().size());

    }

    @Test
    public void testCopyGameState() throws Exception {

    }
}