package tcg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class RulesTest {
	
	@Test
	void healthTest() {
		Player p = new SimplePlayer();	
		Rules r = new BasicRules(p);
		
		r.applyInitRules();
		
		assertTrue(p.getHealthCapacity() == 30);
		assertTrue(p.getHealth() == 30);
	}
	
	@Test
	void manaTest() {
		Player p = new SimplePlayer();	
		Rules r = new BasicRules(p);
		
		r.applyInitRules();
		
		assertTrue(p.getManaSlot() == 0);
		assertTrue(p.getMana() == 0);
	}
	
	@Test
	void cardsTest() {
		Player p = new SimplePlayer();	
		Rules r = new BasicRules(p);
		
		r.applyInitRules();
		
		assertTrue(p.getDeckOfCards().size() == 17);
	}
	
	@Test
	void cardsTest2() {
		Player p = new SimplePlayer();	
		Rules r = new BasicRules(p);
		
		r.applyInitRules();
		
		assertTrue(p.getCardsInHand().size() == 3);
	}
	
	@Test
	void manaSlotLimitTest() {
		Player p = new SimplePlayer();	
		Rules r = new BasicRules(p);
		
		r.applyInitRules();
		p.setManaSlot(10);
		p.increaseManaSlot(1);
		
		assertTrue(p.getManaSlot() == 10);
	}
	
	@Test
	void initTurnRulesIncreaseManaSlotTest() {
		Player p = new SimplePlayer();	
		Rules r = new BasicRules(p);
		
		r.applyInitRules();
		p.setActive(true);
		int oldManaSlot = p.getManaSlot();
		r.applyTurnRules();
		
		assertEquals(p.getManaSlot(), oldManaSlot + 1);
	}
	
	@Test
	void initTurnRulesEmptyManaRefilledTest() {
		Player p = new SimplePlayer();	
		Rules r = new BasicRules(p);
		
		r.applyInitRules();
		p.setActive(true);
		r.applyTurnRules();
		
		assertEquals(p.getMana(), p.getManaSlot());
	}
	
	@Test
	void initTurnRulesIncreaseCardsInHandTest() {
		Player p = new SimplePlayer();	
		Rules r = new BasicRules(p);
		
		r.applyInitRules();
		p.setActive(true);
		int oldCardsInHand = p.getCardsInHand().size();
		int oldDeckOfCards = p.getDeckOfCards().size();
		r.applyTurnRules();
		
		assertEquals(p.getCardsInHand().size(), oldCardsInHand + 1);
		assertEquals(p.getDeckOfCards().size(), oldDeckOfCards - 1);
	}
/*	
	@Test
	void canBePlayedTest() {
		Player p = new SimplePlayer();	
		Rules r = new BasicRules(p);
		
		r.applyInitRules();
		p.setActive(true);
		p.setManaSlot(10);
		p.setMana(5);
		List<Card> cardsInHandList = new ArrayList<Card>();
		Card c1 = new BasicCard();
		Card c2 = new BasicCard();
		c1.setNumber(4);
		c2.setNumber(8);
		cardsInHandList.add(c1);
		cardsInHandList.add(c2);
		p.setCardsInHand(cardsInHandList);
		
		assertTrue(r.canBePlayed());
	}
	
	@Test
	void cantBePlayedTest() {
		Player p = new SimplePlayer();	
		Rules r = new BasicRules(p);
		
		r.getPlayer().setActive(true);
		r.getPlayer().setManaSlot(10);
		r.getPlayer().setMana(5);
		List<Card> cardsInHandList = new ArrayList<Card>();
		Card c1 = new BasicCard();
		Card c2 = new BasicCard();
		c1.setNumber(6);
		c2.setNumber(8);
		cardsInHandList.add(c1);
		cardsInHandList.add(c2);
		r.getPlayer().setCardsInHand(cardsInHandList);
		
		assertFalse(r.canBePlayed());
	}
	
	@ParameterizedTest
	@CsvSource({
		"10, 7, '[9, 8, 4]'"
	})
	public void listPrimeTest(int slotMana, int mana, @ConvertWith(FromStringToArray.class) int[] array) {
		Player p = new SimplePlayer();	
		Rules r = new BasicRules();
		List<Card> cardsInHandList = new ArrayList<Card>();
		Card c1 = new BasicCard();
		Card c2 = new BasicCard();
		Card c3 = new BasicCard();
		
		r.getPlayer().setActive(true);
		r.getPlayer().setManaSlot(slotMana);
		r.getPlayer().setMana(mana);
		c1.setNumber(array[0]);
		c2.setNumber(array[1]);
		c3.setNumber(array[2]);
		cardsInHandList.add(c1);
		cardsInHandList.add(c2);
		cardsInHandList.add(c3);
		r.getPlayer().setCardsInHand(cardsInHandList);
		
		assertTrue(r.canBePlayed());
	}
*/
}
