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
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getSingles());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getPlateAppearance());
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
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getDoubles());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getPlateAppearance());
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
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getTriples());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getPlateAppearance());
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
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getNumPitches());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getHomeRuns());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getAtBats());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getPlateAppearance());
        assertEquals(1, r.previousBatter().getStats().getHitStatsRight().getRbis());
        assertEquals(1, r.previousBatter().getStats().getRunningStats().getRuns());
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
        r.recordGroundBallDoublePlay("563", 0, false);
        assertEquals(2, r.getGame().getCurrentGameState().getPitchCount());
        assertEquals(1, r.offensivePlayer(1).getStats().getHitStatsLeft().getNumPitches());
        assertEquals(2, r.currentPitcherStats().getNumPitches());
        assertEquals(1, r.offensivePlayer(1).getStats().getHitStatsLeft().getGroundBallDP());
        assertEquals(1, r.currentPitcherStats().getInducedGBDPs());
        assertEquals(ScoringSymbol.DOUBLE_PLAY, r.currentScorecard().playerScorecardBox(1, 1).getBatterScoringEvent().getScoringSymbol());
        assertEquals("563", r.currentScorecard().playerScorecardBox(1, 1).getBatterScoringEvent().getPositionsInvolved());
        assertEquals(1, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getOutNumber());
        assertEquals(ScoringSymbol.RUNNER_OUT, r.currentScorecard().playerScorecardBox(0, 1).getFirstToSecondScoringEvent().getScoringSymbol());
        assertEquals(2, r.currentScorecard().playerScorecardBox(1, 1).getBatterScoringEvent().getOutNumber());
        assertEquals(2, r.currentGameState().getNumOuts());
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