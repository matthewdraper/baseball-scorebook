package com.duxnort.baseballscorebook.Model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by root on 8/26/16.
 */
public class RecorderTest {

    public Game initializeGame() {
        Game game = new Game();
        game.setAwayTeam(initializeAwayTeam());
        game.setHomeTeam(initializeHomeTeam());
        game.setUmpireList(initializeUmpires());
        game.setFieldName("Jacobs Field");
        game.setScorebook(new Scorebook());
        ArrayList<LineupState> ls = new ArrayList<>();
        ls.add(initializeLineups());
        game.setLineupStatesList(ls);
        ArrayList<GameState> gs = new ArrayList<>();
        gs.add(new GameState());
        game.setGameStateList(gs);
        game.setCurrLineupStateIndex(0);
        game.setCurrGameStateIndex(0);
        return game;
    }

    public Team initializeHomeTeam() {
        ArrayList<Player> players = new ArrayList<>();
        // Designated Hitter
        players.add(new Player("Greg", "Jackson", "12", new OverallStats(),
                true, true, true, false,
                86, 220));
        // Pitcher
        players.add(new Player("Larry", "Hammel", "4", new OverallStats(),
                false, true, false, true,
                79, 175));
        // Catcher
        players.add(new Player("Griffin", "Whittle", "32", new OverallStats(),
                true, false, true, false,
                82, 197));
        // First Baseman
        players.add(new Player("Luke", "Atterberry", "17", new OverallStats(),
                true, true, true, false,
                90, 220));
        // Second Baseman
        players.add(new Player("Kam", "Bramson", "42", new OverallStats(),
                true, false, true, false,
                88, 185));
        // Third Baseman
        players.add(new Player("Blair", "Pope", "8", new OverallStats(),
                false, true, true, false,
                87, 175));
        // Shortstop
        players.add(new Player("Ross", "Snelling", "5", new OverallStats(),
                true, false, true, false,
                77, 155));
        // Left Fielder
        players.add(new Player("Delbert", "Paternoster", "28", new OverallStats(),
                false, true, false, true,
                90, 205));
        // Center Fielder
        players.add(new Player("Stuart", "Jeanes", "54", new OverallStats(),
                false, true, false, true,
                88, 190));
        // Right Fielder
        players.add(new Player("Rodney", "Everett", "27", new OverallStats(),
                true, false, true, false,
                89, 230));
        players.add(new Player("Spike", "Burnham", "11", new OverallStats(),
                true, false, true, false,
                97, 215));
        players.add(new Player("Orville", "Sudworth", "2", new OverallStats(),
                false, true, true, false,
                77, 167));
        return new Team(players, "Fireballers", "Springfield", State.ILLINOIS);
    }

    public Team initializeAwayTeam() {
        ArrayList<Player> players = new ArrayList<>();
        // Designated Hitter
        players.add(new Player("Alpha ", "Rennell", "12", new OverallStats(),
                true, true, true, false,
                86, 220));
        // Pitcher
        players.add(new Player("Hugo", "Hale", "4", new OverallStats(),
                false, true, false, true,
                79, 175));
        // Catcher
        players.add(new Player("Manley", "Bone", "32", new OverallStats(),
                true, false, true, false,
                82, 197));
        // First Baseman
        players.add(new Player("Astor", "Treloar", "17", new OverallStats(),
                true, true, true, false,
                90, 220));
        // Second Baseman
        players.add(new Player("Billie", "Banner", "42", new OverallStats(),
                true, false, true, false,
                88, 185));
        // Third Baseman
        players.add(new Player("Cy", "Christopher", "8", new OverallStats(),
                false, true, true, false,
                87, 175));
        // Shortstop
        players.add(new Player("Gib", "Terrell", "5", new OverallStats(),
                true, false, true, false,
                77, 155));
        // Left Fielder
        players.add(new Player("Raphael", "Jeffers", "28", new OverallStats(),
                false, true, false, true,
                90, 205));
        // Center Fielder
        players.add(new Player("Brady", "Ainsworth", "54", new OverallStats(),
                false, true, false, true,
                88, 190));
        // Right Fielder
        players.add(new Player("Darell", "Sims", "27", new OverallStats(),
                true, false, true, false,
                89, 230));
        players.add(new Player("Eugene", "Griffin", "11", new OverallStats(),
                true, false, true, false,
                97, 215));
        players.add(new Player("Larry", "Landon", "2", new OverallStats(),
                false, true, true, false,
                77, 167));
        return new Team(players, "Redbirds", "Springfield", State.ILLINOIS);
    }

    public ArrayList<Umpire> initializeUmpires() {
        ArrayList<Umpire> umpires = new ArrayList<>();
        umpires.add(new Umpire("Jack", "Smith"));
        return umpires;
    }

    public LineupState initializeLineups() {
        Lineup home = new Lineup();
        Lineup away = new Lineup();
        int[] homeDefense = new int[Lineup.NUM_PLAYERS];
        int[] awayDefense = new int[Lineup.NUM_PLAYERS];
        int[] homeBatting = new int[Lineup.NUM_BATTERS];
        int[] awayBatting = new int[Lineup.NUM_BATTERS];
        for (int i = 0; i < Lineup.NUM_PLAYERS; i++) {
            homeDefense[i] = i;
            awayDefense[i] = i;
        }

        for (int i = 0; i < Lineup.NUM_BATTERS; i++) {
            if (i == 1) {
                homeBatting[i] = Lineup.NUM_BATTERS;
                awayBatting[i] = Lineup.NUM_BATTERS;
            } else {
                homeBatting[i] = i;
                awayBatting[i] = i;
            }
        }
        home.setBattingArr(homeBatting);
        home.setDefensiveArr(homeDefense);
        away.setBattingArr(awayBatting);
        away.setDefensiveArr(awayDefense);
        LineupState l = new LineupState();
        l.setHomeLineup(home);
        l.setAwayLineup(away);
        return l;
    }

    @Test
    public void testGetGame() throws Exception {
        Game g = initializeGame();
        Recorder r = new Recorder(g);
        assertEquals(g, r.getGame());
    }

    @Test
    public void testSetGame() throws Exception {
        Game g = initializeGame();
        Recorder r = new Recorder();
        r.setGame(g);
        assertEquals(g, r.getGame());
    }

    @Test
    public void testRecordStrike() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordStrike();
        assertEquals(1, r.currentBatterStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.getGame().getCurrentGameState().getStrikeCount());
        assertEquals(1, r.getGame().getCurrentGameState().getHomePitchCount());
        assertEquals(2, r.getGame().getGameStateList().size());
    }

    @Test
    public void testRecordBall() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordBall();
        assertEquals(1, r.currentBatterStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.getGame().getCurrentGameState().getBallCount());
        assertEquals(1, r.getGame().getCurrentGameState().getHomePitchCount());
        assertEquals(2, r.getGame().getGameStateList().size());
    }

    @Test
    public void testRecordSingle() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getSingles());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getPlateAppearance());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getSingles());
        assertEquals(1, r.currentPitcherStats().getAtBats());
        assertEquals(1, r.currentPitcherStats().getTotalNumBF());
        assertEquals(r.getGame().getAwayTeam().getRoster().get(0), r.currentRunnerOnFirst());
        assertEquals(1, r.currentBatterIndex());
        assertEquals(0, r.getGame().getCurrentGameState().getBallCount());
        assertEquals(0, r.getGame().getCurrentGameState().getStrikeCount());
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.getGame().getCurrentGameState().getAwayHits());
        assertEquals(ScoringSymbol.SINGLE, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordDouble() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordDouble();
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getDoubles());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getPlateAppearance());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getDoubles());
        assertEquals(1, r.currentPitcherStats().getAtBats());
        assertEquals(1, r.currentPitcherStats().getTotalNumBF());
        assertEquals(r.getGame().getAwayTeam().getRoster().get(0), r.currentRunnerOnSecond());
        assertEquals(1, r.currentBatterIndex());
        assertEquals(0, r.getGame().getCurrentGameState().getBallCount());
        assertEquals(0, r.getGame().getCurrentGameState().getStrikeCount());
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.getGame().getCurrentGameState().getAwayHits());
        assertEquals(ScoringSymbol.DOUBLE, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordTriple() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordTriple();
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getTriples());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getPlateAppearance());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getTriples());
        assertEquals(1, r.currentPitcherStats().getAtBats());
        assertEquals(1, r.currentPitcherStats().getTotalNumBF());
        assertEquals(r.getGame().getAwayTeam().getRoster().get(0), r.currentRunnerOnThird());
        assertEquals(1, r.currentBatterIndex());
        assertEquals(0, r.getGame().getCurrentGameState().getBallCount());
        assertEquals(0, r.getGame().getCurrentGameState().getStrikeCount());
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.getGame().getCurrentGameState().getAwayHits());
        assertEquals(ScoringSymbol.TRIPLE, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordHomeRun() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordHomeRun(true, false, false, false);
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getHomeRuns());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getPlateAppearance());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getRbis());
        assertEquals(1, r.offensivePlayer(0).getStats().getRunningStats().getRuns());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getHomeRuns());
        assertEquals(1, r.currentPitcherStats().getRuns());
        assertEquals(1, r.currentPitcherStats().getEarnedRuns());
        assertEquals(1, r.currentPitcherStats().getAtBats());
        assertEquals(1, r.currentPitcherStats().getTotalNumBF());
        assertEquals(1, r.currentBatterIndex());
        assertEquals(0, r.getGame().getCurrentGameState().getBallCount());
        assertEquals(0, r.getGame().getCurrentGameState().getStrikeCount());
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.getGame().getCurrentGameState().getAwayHits());
        assertEquals(1, r.getGame().getCurrentGameState().getAwayScore());
        assertEquals(ScoringSymbol.HOMERUN, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordStolenBase() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordStolenBase(r.currentRunnerOnFirstIndex(), false);
        assertEquals(1, r.currentRunnerOnSecond().getStats().getRunningStats().getStolenBases());
        assertEquals(0, r.currentRunnerOnSecondIndex());
        assertEquals(-1, r.currentRunnerOnFirstIndex());
        assertEquals(1, r.currentPitcherStats().getStolenBases());
        assertEquals(1, r.currentCatcherStats().getStolenBases());
        assertEquals(ScoringSymbol.STOLEN_BASE, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordRunBattedIn() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordRunBattedIn();
        assertEquals(1, r.currentBatterStats().getRbis());
    }

    @Test
    public void testRecordWalk() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordBall();
        r.recordBall();
        r.recordBall();
        r.recordWalk();
        assertEquals(4, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(4, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(4, r.currentPitcherStats().getNumPitches());
        assertEquals(0, r.currentRunnerOnFirstIndex());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getWalks());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getPlateAppearance());
        assertEquals(1, r.currentPitcherStats().getWalks());
        assertEquals(1, r.currentPitcherStats().getTotalNumBF());
        assertEquals(ScoringSymbol.WALK, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordIntentionalWalk() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordBall();
        r.recordBall();
        r.recordBall();
        r.recordIntentionalWalk();
        assertEquals(4, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(4, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(4, r.currentPitcherStats().getNumPitches());
        assertEquals(0, r.currentRunnerOnFirstIndex());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getIntenWalks());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getPlateAppearance());
        assertEquals(1, r.currentPitcherStats().getIntenWalks());
        assertEquals(1, r.currentPitcherStats().getTotalNumBF());
        assertEquals(ScoringSymbol.INTENTIONAL_WALK, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordCaughtStealing() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordCaughtStealing(0, "26");
        assertEquals(1, r.currentPitcherStats().getCaughtStealing());
        assertEquals(1, r.currentCatcherStats().getCaughtStealing());
        assertEquals(1, r.offensivePlayer(0).getStats().getRunningStats().getCaughtStealing());
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals(-1, r.currentRunnerOnFirstIndex());
        assertEquals(ScoringSymbol.CAUGHT_STEALING, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
        assertEquals("26", r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getPositionsInvolved());
        assertEquals(1, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getOutNumber());
    }

    @Test
    public void testRecordStrikeOutLooking() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordStrike();
        r.recordStrike();
        r.recordStrikeOutLooking();
        assertEquals(3, r.currentGameState().getPitchCount());
        assertEquals(1, r.currentPitcherStats().getStrikeOutLook());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getStrikeOuts());
        assertEquals(1, r.currentCatcherStats().getPutOuts());
        assertEquals(1, r.currentPitcherStats().getTotalNumBF());
        assertEquals(1, r.currentPitcherStats().getAtBats());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals(ScoringSymbol.STRIKEOUT_LOOKING, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordStrikeOutSwinging() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordStrike();
        r.recordStrike();
        r.recordStrikeOutSwinging();
        assertEquals(3, r.currentGameState().getPitchCount());
        assertEquals(1, r.currentPitcherStats().getStrikeOutSwing());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getStrikeOuts());
        assertEquals(1, r.currentCatcherStats().getPutOuts());
        assertEquals(1, r.currentPitcherStats().getTotalNumBF());
        assertEquals(1, r.currentPitcherStats().getAtBats());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals(ScoringSymbol.STRIKEOUT_SWINGING, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordHitByPitch() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordHitByPitch();
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(0, r.currentRunnerOnFirstIndex());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getHitByPitch());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getPlateAppearance());
        assertEquals(1, r.currentPitcherStats().getHitBatsmen());
        assertEquals(1, r.currentPitcherStats().getTotalNumBF());
        assertEquals(ScoringSymbol.HIT_BY_PITCH, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordSacrificeBunt() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordTriple();
        r.recordSacrificeBunt("13");
        assertEquals(2, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(1).getStats().getHitStatsLeft().getNumPitches());
        assertEquals(2, r.currentPitcherStats().getNumPitches());
        assertEquals(ScoringSymbol.SACRIFICE_BUNT, r.currentScorecard().playerScorecardBox(1, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("13", r.currentScorecard().playerScorecardBox(1, 1).getBatterScoringEvent().getPositionsInvolved());
        assertEquals(1, r.currentScorecard().playerScorecardBox(1, 1).getBatterScoringEvent().getOutNumber());
    }

    @Test
    public void testRecordSacrificeFly() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordTriple();
        r.recordSacrificeFly("7");
        assertEquals(2, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(1).getStats().getHitStatsLeft().getNumPitches());
        assertEquals(2, r.currentPitcherStats().getNumPitches());
        assertEquals(ScoringSymbol.SACRIFICE_FLY, r.currentScorecard().playerScorecardBox(1, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("7", r.currentScorecard().playerScorecardBox(1, 1).getBatterScoringEvent().getPositionsInvolved());
        assertEquals(1, r.currentScorecard().playerScorecardBox(1, 1).getBatterScoringEvent().getOutNumber());
    }

    @Test
    public void testRecordGroundBallDoublePlay() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordBatterGroundBallDoublePlay("563");
        assertEquals(2, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(1).getStats().getHitStatsLeft().getNumPitches());
        assertEquals(2, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.offensivePlayer(1).getStats().getHitStatsLeft().getGroundBallDP());
        assertEquals(1, r.currentPitcherStats().getInducedGBDPs());
        assertEquals(ScoringSymbol.DOUBLE_PLAY, r.currentScorecard().playerScorecardBox(1, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("563", r.currentScorecard().playerScorecardBox(1, 1).getBatterScoringEvent().getPositionsInvolved());
        assertEquals(1, r.currentScorecard().playerScorecardBox(1, 1).getBatterScoringEvent().getOutNumber());
        assertEquals(1, r.currentGameState().getNumOuts());
    }

    @Test
    public void testRecordGroundBallOut() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordGroundBallOut("43");
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getGroundOuts());
        assertEquals(1, r.currentPitcherStats().getGroundOuts());
        assertEquals(ScoringSymbol.GROUNDOUT, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("43", r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getPositionsInvolved());
        assertEquals(1, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getOutNumber());
        assertEquals(1, r.currentGameState().getNumOuts());
    }

    @Test
    public void testRecordFlyBallOut() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordFlyBallOut("7");
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getFlyOuts());
        assertEquals(1, r.currentPitcherStats().getFlyOuts());
        assertEquals(ScoringSymbol.FLYOUT, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("7", r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getPositionsInvolved());
        assertEquals(1, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getOutNumber());
        assertEquals(1, r.currentGameState().getNumOuts());
    }

    @Test
    public void testRecordCatchersInterference() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordCatchersInterference();
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(ScoringSymbol.INTERFERENCE, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("2", r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getPositionsInvolved());
        assertEquals(0, r.currentRunnerOnFirstIndex());
    }


    @Test
    public void testRecordDroppedStrikeOutLookingPB() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordDroppedStrikeOutLookingPB();
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getStrikeOutLook());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getStrikeOuts());
        assertEquals(1, r.currentCatcherStats().getPassedBalls());
        assertEquals(ScoringSymbol.STRIKEOUT_LOOKING, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals(ScoringSymbol.PASSED_BALL, r.currentScorecard().playerScorecardBox(0, 1).getHomeToFirstScoringEvent().getScoringSymbol());
        assertEquals(0, r.currentRunnerOnFirstIndex());
        assertEquals(0, r.currentGameState().getNumOuts());
    }

    @Test
    public void testRecordDroppedStrikeOutSwingingPB() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordDroppedStrikeOutSwingingPB();
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getStrikeOutSwing());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getStrikeOuts());
        assertEquals(1, r.currentCatcherStats().getPassedBalls());
        assertEquals(ScoringSymbol.STRIKEOUT_SWINGING, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals(ScoringSymbol.PASSED_BALL, r.currentScorecard().playerScorecardBox(0, 1).getHomeToFirstScoringEvent().getScoringSymbol());
        assertEquals(0, r.currentRunnerOnFirstIndex());
        assertEquals(0, r.currentGameState().getNumOuts());
    }

    @Test
    public void testRecordDroppedStrikeOutSwingingWP() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordDroppedStrikeOutSwingingWP();
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getStrikeOutSwing());
        assertEquals(1, r.currentPitcherStats().getWildPitches());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getStrikeOuts());
        assertEquals(1, r.currentCatcherStats().getWpCatching());
        assertEquals(ScoringSymbol.STRIKEOUT_SWINGING, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals(ScoringSymbol.WILD_PITCH, r.currentScorecard().playerScorecardBox(0, 1).getHomeToFirstScoringEvent().getScoringSymbol());
        assertEquals(0, r.currentRunnerOnFirstIndex());
        assertEquals(0, r.currentGameState().getNumOuts());
    }

    @Test
    public void testRecordBatterGroundBallDoublePlay() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordBatterGroundBallDoublePlay("543");
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getInducedGBDPs());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getGroundBallDP());
        assertEquals(0, r.currentPitcherStats().getGroundOuts());
        assertEquals(0, r.offensivePlayer(0).getStats().getHitStatsRight().getGroundOuts());
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals(ScoringSymbol.DOUBLE_PLAY, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("543", r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getPositionsInvolved());
    }

    @Test
    public void testRecordBatterFlyBallDoublePlay() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordBatterFlyBallDoublePlay("74");
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getFlyOuts());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getFlyOuts());
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals(ScoringSymbol.DOUBLE_PLAY, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("74", r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getPositionsInvolved());
    }

    @Test
    public void testRecordBatterGroundBallTriplePlay() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordBatterGroundBallTriplePlay("543");
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getInducedGBDPs());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getGroundBallDP());
        assertEquals(0, r.currentPitcherStats().getGroundOuts());
        assertEquals(0, r.offensivePlayer(0).getStats().getHitStatsRight().getGroundOuts());
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals(ScoringSymbol.TRIPLE_PLAY, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("543", r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getPositionsInvolved());
    }

    @Test
    public void testRecordBatterFlyBallTriplePlay() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordBatterFlyBallTriplePlay("53");
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getFlyOuts());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getFlyOuts());
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals(ScoringSymbol.TRIPLE_PLAY, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("53", r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getPositionsInvolved());
    }

    @Test
    public void testRecordRunnerAdvanced() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordRunnerAdvanced(0);
        r.recordSingle();
        assertEquals(2, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(2, r.currentPitcherStats().getNumPitches());
        assertEquals(2, r.currentGameState().getAwayHits());
        assertEquals(0, r.currentRunnerOnSecondIndex());
        assertEquals(1, r.currentRunnerOnFirstIndex());
        assertEquals(ScoringSymbol.RUNNER_ADVANCED, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordRunnerAdvancedError() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordRunnerAdvancedError(0, "7");
        r.recordBatterReachedOnError("7");
        assertEquals(2, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(2, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentGameState().getAwayHits());
        assertEquals(0, r.currentRunnerOnSecondIndex());
        assertEquals(1, r.currentRunnerOnFirstIndex());
        assertEquals(ScoringSymbol.ERROR, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
        assertEquals("7", r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getPositionsInvolved());
    }

    @Test
    public void testRecordBatterReachedOnError() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordBatterReachedOnError("7");
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(0, r.currentGameState().getAwayHits());
        assertEquals(0, r.currentRunnerOnFirstIndex());
        assertEquals(ScoringSymbol.ERROR, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("7", r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getPositionsInvolved());
    }

    @Test
    public void testRecordRunnerAdvancedInterference() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordRunnerAdvancedInterference(0, "4");
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentGameState().getAwayHits());
        assertEquals(0, r.currentRunnerOnSecondIndex());
        assertEquals(ScoringSymbol.INTERFERENCE, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
        assertEquals("4", r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getPositionsInvolved());
    }

    @Test
    public void testRecordRunnerAdvancedBalk() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordRunnerAdvancedBalk(0);
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(0, r.currentPitcherStats().getBalks());
        assertEquals(1, r.currentGameState().getAwayHits());
        assertEquals(0, r.currentRunnerOnSecondIndex());
        assertEquals(ScoringSymbol.BALK, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordRunnerAdvancedWP() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordRunnerAdvancedWP(0);
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(0, r.currentPitcherStats().getWildPitches());
        assertEquals(0, r.currentCatcherStats().getWpCatching());
        assertEquals(1, r.currentGameState().getAwayHits());
        assertEquals(0, r.currentRunnerOnSecondIndex());
        assertEquals(ScoringSymbol.WILD_PITCH, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordRunnerAdvancedPB() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordRunnerAdvancedPB(0);
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(0, r.currentCatcherStats().getPassedBalls());
        assertEquals(1, r.currentGameState().getAwayHits());
        assertEquals(0, r.currentRunnerOnSecondIndex());
        assertEquals(ScoringSymbol.PASSED_BALL, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordRunnerOut() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordRunnerOut(0);
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentGameState().getAwayHits());
        assertEquals(-1, r.currentRunnerOnSecondIndex());
        assertEquals(-1, r.currentRunnerOnFirstIndex());
        assertEquals(ScoringSymbol.RUNNER_OUT, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
        assertEquals(1, r.currentGameState().getNumOuts());
    }

    @Test
    public void testRecordPutOut() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordPutOut(Position.CATCHER);
        assertEquals(1, r.currentCatcherStats().getPutOuts());
    }

    @Test
    public void testRecordAssist() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordAssist(Position.CATCHER);
        assertEquals(1, r.currentCatcherStats().getAssists());
    }

    @Test
    public void testRecordWildPitch() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordWildPitch();
        assertEquals(1, r.currentPitcherStats().getWildPitches());
        assertEquals(1, r.currentCatcherStats().getWpCatching());
    }

    @Test
    public void testRecordPassedBall() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordPassedBall();
        assertEquals(1, r.currentCatcherStats().getPassedBalls());
    }

    @Test
    public void testRecordRunnerPickOff() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordRunnerPickOff("13", 0);
        assertEquals(-1, r.currentRunnerOnSecondIndex());
        assertEquals(-1, r.currentRunnerOnFirstIndex());
        assertEquals(ScoringSymbol.PICKED_OFF, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals("13", r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getPositionsInvolved());
    }

    @Test
    public void testRecordRunnerPickoffCaughtStealing() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordRunnerPickoffCaughtStealing("134", 0);
        assertEquals(-1, r.currentRunnerOnSecondIndex());
        assertEquals(-1, r.currentRunnerOnFirstIndex());
        assertEquals(ScoringSymbol.CAUGHT_STEALING, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals("134", r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getPositionsInvolved());
    }

    @Test
    public void testRecordUnassistedPutOut() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordUnassistedPutOut("3");
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals(1, r.currentPitcherStats().getGroundOuts());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getGroundOuts());
        assertEquals(ScoringSymbol.UNASSISTED_PUTOUT, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("3", r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getPositionsInvolved());
    }

    @Test
    public void testRecordFieldersChoice() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordFieldersChoice("64");
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(0, r.currentGameState().getNumOuts());
        assertEquals(1, r.currentPitcherStats().getGroundOuts());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getGroundOuts());
        assertEquals(ScoringSymbol.FIELDERS_CHOICE, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("64", r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getPositionsInvolved());
    }

    @Test
    public void testRecordRunnerInterference() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        r.recordRunnerInterference(0, "4");
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.currentGameState().getAwayHits());
        assertEquals(-1, r.currentRunnerOnSecondIndex());
        assertEquals(-1, r.currentRunnerOnFirstIndex());
        assertEquals(ScoringSymbol.INTERFERENCE, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
        assertEquals("4", r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getPositionsInvolved());
        assertEquals(1, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getOutNumber());
        assertEquals(1, r.currentGameState().getNumOuts());
    }

    @Test
    public void testRecordBatterInterference() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordBatterInterference();
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(0).getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.currentPitcherStats().getNumPitches());
        assertEquals(-1, r.currentRunnerOnSecondIndex());
        assertEquals(-1, r.currentRunnerOnFirstIndex());
        assertEquals(ScoringSymbol.INTERFERENCE, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("2", r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getPositionsInvolved());
        assertEquals(1, r.currentScorecard().playerScorecardBox(0, 1).getBatterScoringEvent().getOutNumber());
        assertEquals(1, r.currentGameState().getNumOuts());
    }

    @Test
    public void testRecordOut() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(0, r.currentGameState().getNumOuts());
        assertEquals(1, r.currentGameState().getInning());
        assertEquals(true, r.currentGameState().isTop());
        r.recordOut();
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals(1, r.currentGameState().getInning());
        assertEquals(true, r.currentGameState().isTop());
        r.recordOut();
        assertEquals(2, r.currentGameState().getNumOuts());
        assertEquals(1, r.currentGameState().getInning());
        assertEquals(true, r.currentGameState().isTop());
        r.recordOut();
        assertEquals(0, r.currentGameState().getNumOuts());
        assertEquals(1, r.currentGameState().getInning());
        assertEquals(false, r.currentGameState().isTop());
        r.recordOut();
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals(1, r.currentGameState().getInning());
        assertEquals(false, r.currentGameState().isTop());
        r.recordOut();
        assertEquals(2, r.currentGameState().getNumOuts());
        assertEquals(1, r.currentGameState().getInning());
        assertEquals(false, r.currentGameState().isTop());
        r.recordOut();
        assertEquals(0, r.currentGameState().getNumOuts());
        assertEquals(2, r.currentGameState().getInning());
        assertEquals(true, r.currentGameState().isTop());
        r.recordOut();
        assertEquals(1, r.currentGameState().getNumOuts());
        assertEquals(2, r.currentGameState().getInning());
        assertEquals(true, r.currentGameState().isTop());
        r.recordOut();
        assertEquals(2, r.currentGameState().getNumOuts());
        assertEquals(2, r.currentGameState().getInning());
        assertEquals(true, r.currentGameState().isTop());
        r.recordOut();
        assertEquals(0, r.currentGameState().getNumOuts());
        assertEquals(2, r.currentGameState().getInning());
        assertEquals(false, r.currentGameState().isTop());
        r.recordOut();
    }

    @Test
    public void testCurrentHomeLineup() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeLineups().getHomeLineup(), r.currentHomeLineup());
    }

    @Test
    public void testCurrentAwayLineup() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeLineups().getAwayLineup(), r.currentAwayLineup());
    }

    @Test
    public void testHomePlayerAtPos() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeHomeTeam().getRoster().get(0), r.homePlayerAtPos(Position.DESIGNATED_HITTER));
    }

    @Test
    public void testAwayPlayerAtPos() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeAwayTeam().getRoster().get(0), r.awayPlayerAtPos(Position.DESIGNATED_HITTER));
    }

    @Test
    public void testCurrentDefensivePlayer() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeHomeTeam().getRoster().get(1), r.currentDefensivePlayer(Position.PITCHER));
    }

    @Test
    public void testCurrentHomeBatter() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeHomeTeam().getRoster().get(0), r.currentHomeBatter());
        r.nextBatter();
        assertEquals(initializeHomeTeam().getRoster().get(0), r.currentHomeBatter());
        r.recordOut();
        r.recordOut();
        r.recordOut();
        assertEquals(initializeHomeTeam().getRoster().get(0), r.currentHomeBatter());
        r.recordSingle();
        assertEquals(initializeHomeTeam().getRoster().get(1), r.currentHomeBatter());
    }

    @Test
    public void testCurrentAwayBatter() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeAwayTeam().getRoster().get(0), r.currentAwayBatter());
        r.recordStrikeOutSwinging();
        assertEquals(initializeAwayTeam().getRoster().get(1), r.currentAwayBatter());
        r.recordStrikeOutLooking();
        assertEquals(initializeAwayTeam().getRoster().get(2), r.currentAwayBatter());
        r.recordFlyBallOut("7");
        assertEquals(initializeAwayTeam().getRoster().get(3), r.currentAwayBatter());
        r.recordSingle();
        assertEquals(initializeAwayTeam().getRoster().get(3), r.currentAwayBatter());

    }

    @Test
    public void testCurrentBatter() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeAwayTeam().getRoster().get(0), r.currentBatter());
        r.recordStrikeOutSwinging();
        assertEquals(initializeAwayTeam().getRoster().get(1), r.currentBatter());
        r.recordStrikeOutLooking();
        assertEquals(initializeAwayTeam().getRoster().get(2), r.currentBatter());
        r.recordFlyBallOut("7");
        assertEquals(initializeHomeTeam().getRoster().get(0), r.currentBatter());
        r.recordFlyBallOut("8");
        assertEquals(initializeHomeTeam().getRoster().get(1), r.currentBatter());
        r.recordStrikeOutLooking();
        assertEquals(initializeHomeTeam().getRoster().get(2), r.currentBatter());
        r.recordFlyBallOut("9");
        assertEquals(initializeAwayTeam().getRoster().get(3), r.currentBatter());
    }

    @Test
    public void testCurrentBatterIndex() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(0, r.currentBatterIndex());
        r.recordStrikeOutSwinging();
        assertEquals(1, r.currentBatterIndex());
        r.recordStrikeOutSwinging();
        assertEquals(2, r.currentBatterIndex());
        r.recordStrikeOutSwinging();
        assertEquals(0, r.currentBatterIndex());
        r.recordStrikeOutSwinging();
        assertEquals(1, r.currentBatterIndex());
        r.recordStrikeOutSwinging();
        assertEquals(2, r.currentBatterIndex());
        r.recordStrikeOutSwinging();
        assertEquals(3, r.currentBatterIndex());
    }

//    @Test
//    public void testPreviousBatter() throws Exception {
//        Recorder r = new Recorder(initializeGame());
//        assertEquals(0, r.currentBatterIndex());
//        r.recordStrikeOutSwinging();
//        assertEquals(1, r.currentBatterIndex());
//        r.recordStrikeOutSwinging();
//        assertEquals(2, r.currentBatterIndex());
//
//    }
//
//    @Test
//    public void testPreviousBatterIndex() throws Exception {
//
//    }

    @Test
    public void testCurrentPitcher() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeHomeTeam().getRoster().get(1), r.currentPitcher());
        r.recordStrikeOutSwinging();
        assertEquals(initializeHomeTeam().getRoster().get(1), r.currentPitcher());
        r.recordStrikeOutSwinging();
        assertEquals(initializeHomeTeam().getRoster().get(1), r.currentPitcher());
        r.recordStrikeOutSwinging();
        assertEquals(initializeAwayTeam().getRoster().get(1), r.currentPitcher());
        r.recordStrikeOutSwinging();
        assertEquals(initializeAwayTeam().getRoster().get(1), r.currentPitcher());
        r.recordStrikeOutSwinging();
        assertEquals(initializeAwayTeam().getRoster().get(1), r.currentPitcher());
        r.recordStrikeOutSwinging();
        assertEquals(initializeHomeTeam().getRoster().get(1), r.currentPitcher());
    }

    @Test
    public void testCurrentCatcher() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeHomeTeam().getRoster().get(2), r.currentCatcher());
        r.recordStrikeOutSwinging();
        assertEquals(initializeHomeTeam().getRoster().get(2), r.currentCatcher());
        r.recordStrikeOutSwinging();
        assertEquals(initializeHomeTeam().getRoster().get(2), r.currentCatcher());
        r.recordStrikeOutSwinging();
        assertEquals(initializeAwayTeam().getRoster().get(2), r.currentCatcher());
        r.recordStrikeOutSwinging();
        assertEquals(initializeAwayTeam().getRoster().get(2), r.currentCatcher());
        r.recordStrikeOutSwinging();
        assertEquals(initializeAwayTeam().getRoster().get(2), r.currentCatcher());
        r.recordStrikeOutSwinging();
        assertEquals(initializeHomeTeam().getRoster().get(2), r.currentCatcher());
    }

    @Test
    public void testPlayerBattingOrderIndex() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(0, r.playerBattingOrderIndex(0));
        assertEquals(1, r.playerBattingOrderIndex(9));
    }

    @Test
    public void testHomePlayerIndex() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(0, r.homePlayerIndex(r.homePlayerAtPos(Position.DESIGNATED_HITTER)));
        assertEquals(9, r.homePlayerIndex(r.homePlayerAtPos(Position.RIGHTFIELD)));
    }

    @Test
    public void testAwayPlayerIndex() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(0, r.awayPlayerIndex(r.awayPlayerAtPos(Position.DESIGNATED_HITTER)));
        assertEquals(9, r.awayPlayerIndex(r.awayPlayerAtPos(Position.RIGHTFIELD)));
    }

    @Test
    public void testHomePlayer() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeHomeTeam().getRoster().get(0), r.homePlayer(0));
        assertEquals(initializeHomeTeam().getRoster().get(9), r.homePlayer(9));
    }

    @Test
    public void testAwayPlayer() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeAwayTeam().getRoster().get(0), r.awayPlayer(0));
        assertEquals(initializeAwayTeam().getRoster().get(9), r.awayPlayer(9));
    }

    @Test
    public void testOffensivePlayer() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeAwayTeam().getRoster().get(0), r.offensivePlayer(0));
        assertEquals(initializeAwayTeam().getRoster().get(5), r.offensivePlayer(5));
        r.recordOut();
        r.recordOut();
        r.recordOut();
        assertEquals(initializeHomeTeam().getRoster().get(0), r.offensivePlayer(0));
        assertEquals(initializeHomeTeam().getRoster().get(5), r.offensivePlayer(5));
    }

    @Test
    public void testOffensivePlayerIndex() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(0, r.offensivePlayerIndex(initializeAwayTeam().getRoster().get(0)));
        assertEquals(6, r.offensivePlayerIndex(initializeAwayTeam().getRoster().get(6)));
        r.recordOut();
        r.recordOut();
        r.recordOut();
        assertEquals(0, r.offensivePlayerIndex(initializeHomeTeam().getRoster().get(0)));
        assertEquals(6, r.offensivePlayerIndex(initializeHomeTeam().getRoster().get(6)));
    }

    @Test
    public void testDefensivePlayer() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeHomeTeam().getRoster().get(0), r.defensivePlayer(0));
        assertEquals(initializeHomeTeam().getRoster().get(5), r.defensivePlayer(5));
        r.recordOut();
        r.recordOut();
        r.recordOut();
        assertEquals(initializeAwayTeam().getRoster().get(0), r.defensivePlayer(0));
        assertEquals(initializeAwayTeam().getRoster().get(5), r.defensivePlayer(5));
    }

    @Test
    public void testDefensivePlayerIndex() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(0, r.defensivePlayerIndex(initializeHomeTeam().getRoster().get(0)));
        assertEquals(6, r.defensivePlayerIndex(initializeHomeTeam().getRoster().get(6)));
        r.recordOut();
        r.recordOut();
        r.recordOut();
        assertEquals(0, r.defensivePlayerIndex(initializeAwayTeam().getRoster().get(0)));
        assertEquals(6, r.defensivePlayerIndex(initializeAwayTeam().getRoster().get(6)));
    }

    @Test
    public void testPlayerScorecardBox() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(r.getGame().getAwayScorecard().getScoreBoxes()[0][0], r.playerScorecardBox(0, 1));
        assertEquals(0, r.getGame().getAwayScorecard().getCurrRow());
        assertEquals(0, r.getGame().getAwayScorecard().getCurrCol());
        r.recordStrikeOutLooking();
        assertEquals(1, r.getGame().getAwayScorecard().getCurrRow());
        assertEquals(0, r.getGame().getAwayScorecard().getCurrCol());
        assertEquals(r.getGame().getAwayScorecard().getScoreBoxes()[0][0], r.playerScorecardBox(0, 1));
        r.recordStrikeOutSwinging();
        assertEquals(2, r.getGame().getAwayScorecard().getCurrRow());
        assertEquals(0, r.getGame().getAwayScorecard().getCurrCol());
        assertEquals(r.getGame().getAwayScorecard().getScoreBoxes()[1][0], r.playerScorecardBox(1, 1));
        r.recordStrikeOutLooking();
        assertEquals(3, r.getGame().getAwayScorecard().getCurrRow());
        assertEquals(0, r.getGame().getAwayScorecard().getCurrCol());
        assertEquals(0, r.getGame().getHomeScorecard().getCurrRow());
        assertEquals(0, r.getGame().getHomeScorecard().getCurrCol());
        assertEquals(initializeGame().getHomeScorecard().getScoreBoxes()[0][0], r.playerScorecardBox(0, 1));
        r.recordStrikeOutSwinging();
        assertEquals(initializeGame().getHomeScorecard().getScoreBoxes()[1][0], r.playerScorecardBox(1, 1));
        r.recordStrikeOutLooking();
        assertEquals(initializeGame().getHomeScorecard().getScoreBoxes()[2][0], r.playerScorecardBox(2, 1));
        r.recordStrikeOutSwinging();
        assertEquals(initializeGame().getAwayScorecard().getScoreBoxes()[2][1], r.playerScorecardBox(3, 2));
    }

    @Test
    public void testCurrentBatterScorecardBox() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(initializeGame().getScorecard().getScoreBoxes()[0][0], r.currentBatterScorecardBox());
        r.recordOut();
        assertEquals(initializeGame().getScorecard().getScoreBoxes()[1][0], r.currentBatterScorecardBox());
        r.recordOut();
        assertEquals(initializeGame().getScorecard().getScoreBoxes()[0][0], r.currentBatterScorecardBox());
        r.recordOut();
        assertEquals(initializeGame().getScorecard().getScoreBoxes()[0][0], r.currentBatterScorecardBox());
        r.recordOut();
        assertEquals(initializeGame().getScorecard().getScoreBoxes()[1][0], r.currentBatterScorecardBox());
        r.recordOut();
        assertEquals(initializeGame().getScorecard().getScoreBoxes()[2][0], r.currentBatterScorecardBox());
        r.recordOut();
    }

    @Test
    public void testCurrentGameState() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(r.getGame().getGameStateList().get(0), r.currentGameState());
        r.recordSingle();
        assertEquals(r.getGame().getCurrentGameState(), r.currentGameState());
        assertEquals(1, r.getGame().getCurrGameStateIndex());
    }

    @Test
    public void testCurrentScorecard() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(r.getGame().getAwayScorecard(), r.currentScorecard());
        r.recordStrikeOutLooking();
        assertEquals(r.getGame().getAwayScorecard(), r.currentScorecard());
        r.recordStrikeOutSwinging();
        assertEquals(r.getGame().getAwayScorecard(), r.currentScorecard());
        r.recordStrikeOutLooking();
        assertEquals(r.getGame().getHomeScorecard(), r.currentScorecard());
        r.recordStrikeOutLooking();
        assertEquals(r.getGame().getHomeScorecard(), r.currentScorecard());
        r.recordStrikeOutLooking();
        assertEquals(r.getGame().getHomeScorecard(), r.currentScorecard());
        r.recordStrikeOutLooking();
        assertEquals(r.getGame().getAwayScorecard(), r.currentScorecard());
        r.recordStrikeOutLooking();
        assertEquals(r.getGame().getAwayScorecard(), r.currentScorecard());
    }

    @Test
    public void testCurrentRunnerOnFirst() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.getGame().getCurrentGameState().setCurrRunnerFirstIndex(0);
        assertEquals(r.getGame().getAwayTeam().getRoster().get(0), r.currentRunnerOnFirst());
        r.getGame().getCurrentGameState().setCurrRunnerFirstIndex(5);
        assertEquals(r.getGame().getAwayTeam().getRoster().get(5), r.currentRunnerOnFirst());
    }

    @Test
    public void testCurrentRunnerOnFirstIndex() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.getGame().getCurrentGameState().setCurrRunnerFirstIndex(30);
        assertEquals(30, r.currentRunnerOnFirstIndex());
        r.getGame().getCurrentGameState().setCurrRunnerFirstIndex(3);
        assertEquals(3, r.currentRunnerOnFirstIndex());
    }

    @Test
    public void testCurrentRunnerOnSecond() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.getGame().getCurrentGameState().setCurrRunnerSecondIndex(0);
        assertEquals(r.getGame().getAwayTeam().getRoster().get(0), r.currentRunnerOnSecond());
        r.getGame().getCurrentGameState().setCurrRunnerSecondIndex(5);
        assertEquals(r.getGame().getAwayTeam().getRoster().get(5), r.currentRunnerOnSecond());
    }

    @Test
    public void testCurrentRunnerOnSecondIndex() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.getGame().getCurrentGameState().setCurrRunnerSecondIndex(30);
        assertEquals(30, r.currentRunnerOnSecondIndex());
        r.getGame().getCurrentGameState().setCurrRunnerSecondIndex(3);
        assertEquals(3, r.currentRunnerOnSecondIndex());
    }

    @Test
    public void testCurrentRunnerOnThird() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.getGame().getCurrentGameState().setCurrRunnerThirdIndex(0);
        assertEquals(r.getGame().getAwayTeam().getRoster().get(0), r.currentRunnerOnThird());
        r.getGame().getCurrentGameState().setCurrRunnerThirdIndex(5);
        assertEquals(r.getGame().getAwayTeam().getRoster().get(5), r.currentRunnerOnThird());
    }

    @Test
    public void testCurrentRunnerOnThirdIndex() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.getGame().getCurrentGameState().setCurrRunnerThirdIndex(30);
        assertEquals(30, r.currentRunnerOnThirdIndex());
        r.getGame().getCurrentGameState().setCurrRunnerThirdIndex(3);
        assertEquals(3, r.currentRunnerOnThirdIndex());
    }

    @Test
    public void testNextBatter() throws Exception {
        Recorder r = new Recorder(initializeGame());
        assertEquals(0, r.currentBatterIndex());
        r.recordStrike();
        r.recordBall();
        assertEquals(1, r.currentGameState().getStrikeCount());
        assertEquals(1, r.currentGameState().getBallCount());
        r.nextBatter();
        assertEquals(1, r.currentBatterIndex());
        assertEquals(0, r.currentGameState().getStrikeCount());
        assertEquals(0, r.currentGameState().getBallCount());
        r.nextBatter();
        r.nextBatter();
        r.nextBatter();
        r.nextBatter();
        r.nextBatter();
        r.nextBatter();
        r.nextBatter();
        r.nextBatter();
        assertEquals(0, r.currentBatterIndex());

    }

    @Test
    public void testRecordGameState() throws Exception {
        Recorder r = new Recorder(initializeGame());

    }

    @Test
    public void testRecordBatterEvent() throws Exception {

    }

    @Test
    public void testClearCount() throws Exception {

    }

    @Test
    public void testIncrementOuts() throws Exception {

    }

    @Test
    public void testCurrentBatterStats() throws Exception {

    }

    @Test
    public void testCurrentPitcherStats() throws Exception {

    }

    @Test
    public void testCurrentCatcherStats() throws Exception {

    }

    @Test
    public void testCurrNumBaserunners() throws Exception {

    }

    @Test
    public void testIsBaseOccupied() throws Exception {

    }

    @Test
    public void testMoveToNextBase() throws Exception {

    }

    @Test
    public void testRecordLocation() throws Exception {

    }


}