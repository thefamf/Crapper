package table;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void testGame() {
		Game game = new Game();
		System.out.println(game.roll.toString());
		while (game.roll.checkCraps() == false) {
			game.roll = new Roll();
			System.out.println(game.roll.toString());
		}
	}

	@Test
	public void testComeOutRoll() {
//		Game game = new Game();
		
	}

}
