package tcg;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PlayerTest {
	
	@Test
	void playerTest() {
		Player p = new SimplePlayer();	
		
		p.setHealthCapacity( 30 );
		assertThrows( IllegalArgumentException.class, () -> p.setHealth( 31 ) );
	}
	
	@Test
	void manaLimitTest() {
		Player p = new SimplePlayer();	
		
		p.setManaSlot( 10 );
		assertThrows( IllegalArgumentException.class, () -> p.setMana( 11 ) );
	}

}
