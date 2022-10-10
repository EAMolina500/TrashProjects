package tcg;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
 

public class GameTest {
	
	@Test
	void gameTest() {
		Game g = new Game();
		Player p1 = new SimplePlayer();
		Rules r = new BasicRules(p1);
		Player p2 = new SimplePlayer();		
		r = new BasicRules(p2);
		g.game(r, p1, p2);
		
		assertTrue(p1.getHealth() <= 0);
	}

}
