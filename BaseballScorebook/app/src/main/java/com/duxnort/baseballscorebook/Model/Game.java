package com.duxnort.baseballscorebook.Model;

import java.util.ArrayList;
import java.util.Date;

public class Game {
    private ArrayList<GameState> gameStateList = null;
    private ArrayList<LineupState> lineupStatesList = null;
    private int currGameStateIndex = 0;
    private int currLineupStateIndex = 0;
    private Team homeTeam = null;
    private Team awayTeam = null;
    private Date startTime = null;
    private Date endTime = null;
    private ArrayList<Umpire> umpireList = null;
    private String fieldName = null;
}
