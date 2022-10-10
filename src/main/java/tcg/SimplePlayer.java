package tcg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimplePlayer implements Player {
	
	boolean isActive;
	int health;
	int healthCapacity;
	int mana;
	int manaSlot;
	int manaSlotCapacity;
	List<Card> deckOfCards;
	List<Card> cardsInHand;
	
	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public void setHealth(int h) {
		if (health + h > healthCapacity) {
			throw new IllegalArgumentException("entered value exceeds health capacity");
		}
		health = h;
	}
	
	@Override
	public int getHealthCapacity() {
		return healthCapacity;
	}

	@Override
	public void setHealthCapacity(int hc) {
		healthCapacity = hc;
	}

	@Override
	public int getMana() {
		return mana;
	}

	@Override
	public void setMana(int m) {
		if (mana + m > manaSlot) {
			throw new IllegalArgumentException("entered value exceeds mana slot");
		}
		mana = m;
	}
	
	@Override
	public int getManaSlot() {
		return manaSlot;
	}
 
	@Override
	public void setManaSlot(int ms) {
		if (manaSlot + ms > manaSlotCapacity) {
			throw new IllegalArgumentException("entered value exceeds mana slot");
		}
		manaSlot = ms;
	}
	
	@Override
	public void increaseManaSlot(int ms) {
		if (manaSlot + ms > manaSlotCapacity) {
			manaSlot += 0;
		}
		else {
			manaSlot += ms;
		}
	}
	
	@Override
	public void setManaSlotCapacity (int msc) {
		manaSlotCapacity = msc;
	}

	@Override
	public List<Card> getDeckOfCards() {
		return deckOfCards;
	}

	@Override
	public void setDeckOfCards(List<Card> cards) {
		deckOfCards = cards;
	}

	@Override
	public List<Card> getCardsInHand() {
		return cardsInHand;
	}

	@Override
	public void setCardsInHand(List<Card> cards) {
		cardsInHand = cards;
	}
	
	@Override
	public boolean isActive() {
		return isActive;
	}
	
	@Override
	public boolean setActive(boolean active) {
		return isActive = active;
	}
	
	public String toString() {
		return String.valueOf("H: " + health + " M: " + mana);
	}
	
	public Card takeACard() {
		List<Card> deckOfCards = getDeckOfCards();
		List<Card> cardsInHand = new ArrayList<Card>();
		Random r = new Random();
		
		int numbersCardsInDeck = getDeckOfCards().size();
		int i = r.nextInt(numbersCardsInDeck);

		Card c = deckOfCards.get(i);
		cardsInHand.add( c );

		deckOfCards.remove(c);
		setDeckOfCards(deckOfCards);
		
		return c;
	}
	
	public List<Card> randomDeckOfCards() {
		List<Card> cards = new ArrayList<Card>();
		Random r = new Random();
		
		for (int i = 0; i < 20; i++) {
			cards.add( randomCard() );
		}
		
		return cards;
	}
	
	private Card randomCard() {
		Random r = new Random();
		Card c = new BasicCard();
		
		c.setNumber( r.nextInt( 9 ) );
		
		return c;
	}
	
	public List<Card> takeACards(int n) {
		List<Card> cards = new ArrayList<Card>();
		
		for (int i = 0; i < n; i++) {
			cards.add( takeACard() );
		}
		
		return cards;
	}

}
