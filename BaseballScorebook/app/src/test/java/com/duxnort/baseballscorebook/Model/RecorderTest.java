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
        game.setScorecard(new Scorecard());
        ArrayList<LineupState> ls = new ArrayList<>();
        ls.add(initializeLineups());
        game.setLineupStatesList(ls);
        ArrayList<GameState> gs = new ArrayList<GameState>();
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
            homeDefense[i] = i;
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
        assertEquals(1, r.getBatterStats().getNumPitches());
        assertEquals(1, r.getPitcherStats().getNumPitches());
        assertEquals(1, r.getGame().getCurrentGameState().getStrikeCount());
        assertEquals(1, r.getGame().getCurrentGameState().getHomePitchCount());
        assertEquals(2, r.getGame().getGameStateList().size());
    }

    @Test
    public void testRecordBall() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordBall();
        assertEquals(1, r.getBatterStats().getNumPitches());
        assertEquals(1, r.getPitcherStats().getNumPitches());
        assertEquals(1, r.getGame().getCurrentGameState().getBallCount());
        assertEquals(1, r.getGame().getCurrentGameState().getHomePitchCount());
        assertEquals(2, r.getGame().getGameStateList().size());
    }

    @Test
    public void testRecordSingle() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordSingle();
        assertEquals(1, r.getCurrentRunnerOnFirst().getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.getCurrentRunnerOnFirst().getStats().getHitStatsRight().getSingles());
        assertEquals(1, r.getCurrentRunnerOnFirst().getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.getCurrentRunnerOnFirst().getStats().getHitStatsRight().getPlateAppearance());
        assertEquals(1, r.getPitcherStats().getNumPitches());
        assertEquals(1, r.getPitcherStats().getSingles());
        assertEquals(1, r.getPitcherStats().getAtBats());
        assertEquals(1, r.getPitcherStats().getTotalNumBF());
        assertEquals(r.getGame().getAwayTeam().getRoster().get(0), r.getCurrentRunnerOnFirst());
        assertEquals(1, r.getCurrentBatterIndex());
        assertEquals(0, r.getGame().getCurrentGameState().getBallCount());
        assertEquals(0, r.getGame().getCurrentGameState().getStrikeCount());
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.getGame().getCurrentGameState().getAwayHits());
//        assertEquals(ScoringSymbol.SINGLE, r.getGame().getScorecard().currentRunnerOnFirstScorecardBox().getBatterScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordDouble() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordDouble();
        assertEquals(1, r.getCurrentRunnerOnSecond().getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.getCurrentRunnerOnSecond().getStats().getHitStatsRight().getDoubles());
        assertEquals(1, r.getCurrentRunnerOnSecond().getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.getCurrentRunnerOnSecond().getStats().getHitStatsRight().getPlateAppearance());
        assertEquals(1, r.getPitcherStats().getNumPitches());
        assertEquals(1, r.getPitcherStats().getDoubles());
        assertEquals(1, r.getPitcherStats().getAtBats());
        assertEquals(1, r.getPitcherStats().getTotalNumBF());
        assertEquals(r.getGame().getAwayTeam().getRoster().get(0), r.getCurrentRunnerOnSecond());
        assertEquals(1, r.getCurrentBatterIndex());
        assertEquals(0, r.getGame().getCurrentGameState().getBallCount());
        assertEquals(0, r.getGame().getCurrentGameState().getStrikeCount());
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.getGame().getCurrentGameState().getAwayHits());
//        assertEquals(ScoringSymbol.DOUBLE, r.getGame().getScorecard().currentRunnerOnSecondScorecardBox().getBatterScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordTriple() throws Exception {
        Recorder r = new Recorder(initializeGame());
        r.recordTriple();
        assertEquals(1, r.getCurrentRunnerOnThird().getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.getCurrentRunnerOnThird().getStats().getHitStatsRight().getTriples());
        assertEquals(1, r.getCurrentRunnerOnThird().getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.getCurrentRunnerOnThird().getStats().getHitStatsRight().getPlateAppearance());
        assertEquals(1, r.getPitcherStats().getNumPitches());
        assertEquals(1, r.getPitcherStats().getTriples());
        assertEquals(1, r.getPitcherStats().getAtBats());
        assertEquals(1, r.getPitcherStats().getTotalNumBF());
        assertEquals(r.getGame().getAwayTeam().getRoster().get(0), r.getCurrentRunnerOnThird());
        assertEquals(1, r.getCurrentBatterIndex());
        assertEquals(0, r.getGame().getCurrentGameState().getBallCount());
        assertEquals(0, r.getGame().getCurrentGameState().getStrikeCount());
        assertEquals(1, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.getGame().getCurrentGameState().getAwayHits());
//        assertEquals(ScoringSymbol.DOUBLE, r.getGame().getScorecard().currentRunnerOnSecondScorecardBox().getBatterScoringEvent().getScoringSymbol());
    }

    @Test
    public void testRecordHomeRun() throws Exception {

    }

    @Test
    public void testRecordStolenBase() throws Exception {

    }

    @Test
    public void testRecordRunBattedIn() throws Exception {

    }

    @Test
    public void testRecordWalk() throws Exception {

    }

    @Test
    public void testRecordIntentionalWalk() throws Exception {

    }

    @Test
    public void testRecordCaughtStealing() throws Exception {

    }

    @Test
    public void testRecordStrikeOutLooking() throws Exception {

    }

    @Test
    public void testRecordStrikeOutSwinging() throws Exception {

    }

    @Test
    public void testRecordHitByPitch() throws Exception {

    }

    @Test
    public void testRecordSacrificeBunt() throws Exception {

    }

    @Test
    public void testRecordSacrificeFly() throws Exception {

    }

    @Test
    public void testRecordRegularGroundBallDoublePlay() throws Exception {

    }

    @Test
    public void testRecordNonRegularGroundBallDoublePlay() throws Exception {

    }

    @Test
    public void testRecordGroundBallOut() throws Exception {

    }

    @Test
    public void testRecordFlyBallOut() throws Exception {

    }

    @Test
    public void testRecordImpliedFieldingStats() throws Exception {

    }

    @Test
    public void testRecordPutOut() throws Exception {

    }

    @Test
    public void testRecordAssist() throws Exception {

    }

    @Test
    public void testRecordWildPitch() throws Exception {

    }

    @Test
    public void testRecordPassedBall() throws Exception {

    }

    @Test
    public void testRecordBalk() throws Exception {

    }

    @Test
    public void testRecordPickOff() throws Exception {

    }

    @Test
    public void testRecordUnassistedPutOut() throws Exception {

    }

    @Test
    public void testRecordFieldersChoice() throws Exception {

    }

    @Test
    public void testRecordOffensiveInterference() throws Exception {

    }

    @Test
    public void testRecordDefensiveInterference() throws Exception {

    }

    @Test
    public void testRecordCatchersInterference() throws Exception {

    }

    @Test
    public void testRecordFlyOutDoublePlay() throws Exception {

    }

    @Test
    public void testRecordGroundBallTriplePlay() throws Exception {

    }

    @Test
    public void testRecordOut() throws Exception {

    }

    @Test
    public void testGetCurrentHomeLineup() throws Exception {

    }

    @Test
    public void testGetCurrentAwayLineup() throws Exception {

    }

    @Test
    public void testGetHomePlayerAtPos() throws Exception {

    }

    @Test
    public void testGetAwayPlayerAtPos() throws Exception {

    }

    @Test
    public void testGetCurrentDefensivePlayer() throws Exception {

    }

    @Test
    public void testGetCurrentHomeBatter() throws Exception {

    }

    @Test
    public void testGetCurrentAwayBatter() throws Exception {

    }

    @Test
    public void testGetCurrentBatter() throws Exception {

    }

    @Test
    public void testGetCurrentPitcher() throws Exception {

    }

    @Test
    public void testGetCurrentCatcher() throws Exception {

    }

    @Test
    public void testGetCurrentRunnerOnFirst() throws Exception {

    }

    @Test
    public void testGetCurrentRunnerOnSecond() throws Exception {

    }

    @Test
    public void testGetCurrentRunnerOnThird() throws Exception {

    }

    @Test
    public void testNextBatter() throws Exception {

    }

    @Test
    public void testRecordGameState() throws Exception {

    }

    @Test
    public void testPlateAppearanceFinished() throws Exception {

    }

    @Test
    public void testClearCount() throws Exception {

    }

    @Test
    public void testIncrementOuts() throws Exception {

    }

    @Test
    public void testGetBatterStats() throws Exception {

    }

    @Test
    public void testGetPitcherStats() throws Exception {

    }

    @Test
    public void testGetCatcherStats() throws Exception {

    }

    @Test
    public void testGetNumberOfBaserunners() throws Exception {

    }

    @Test
    public void testIsNextBaseOccupied() throws Exception {

    }

    @Test
    public void testMoveToNextBase() throws Exception {

    }
}