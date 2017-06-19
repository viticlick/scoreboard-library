package es.viticlick.scoreboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Scoreboard {

	private Map<Player,Counter> scores = new HashMap<>();

	public Scoreboard(Player...players) {
		Arrays.stream(players)
			.forEach( player -> scores.put(player, Counter.create()));
	}

	public void addPoints(int points, Player player) {
		scores.compute(player, (key,value) -> value.add(points) );
	}

	public int pointsOf(Player player) {
		return scores.getOrDefault(player, Counter.create()).value();
	}
	
}
