package es.viticlick.scoreboard;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestSimpleScoreboard {

	@Test
	public void testTwoPlayerScoreboard(){
		Player player1 = new Player();
		Player player2 = new Player();

		Scoreboard scoreboard = new Scoreboard(player1, player2);
		
		scoreboard.addPoints(2,player1);
		scoreboard.addPoints(4,player2);
		
		assertThat(scoreboard.pointsOf(player1), is(2));
		assertThat(scoreboard.pointsOf(player2), is(4));
	}
	
	@Test
	public void testUnknownPlayer(){
		Scoreboard scoreboard = new Scoreboard();
		assertThat(scoreboard.pointsOf(new Player()), is(0));
	}
	
	
	
}
