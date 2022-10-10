package tcg;

import java.util.List;

public interface Player {
	
	public int getHealth();
	
	public void setHealth(int h);
	
	public int getHealthCapacity();
	
	public void setHealthCapacity(int hc);
	
	public int getMana();
	
	public void setMana(int m);
	
	public int getManaSlot();
	
	public void setManaSlot(int ms);
	
	public void increaseManaSlot(int ms);
	
	public void setManaSlotCapacity (int msc);
	
	public List<Card> getDeckOfCards();
	
	public void setDeckOfCards(List<Card> cards);
	
	public List<Card> getCardsInHand();
	
	public void setCardsInHand(List<Card> cards);
	
	public boolean isActive();
	
	public boolean setActive(boolean active);
	
	public List<Card> randomDeckOfCards();
	
	public List<Card> takeACards(int n);
	
	public Card takeACard();

}
