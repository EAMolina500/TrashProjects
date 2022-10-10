package tcg;

public class BasicRules extends Rules {

	public BasicRules(Player p) {
		initGameRules = new BasicInitGameRules();
		initTurnRules = new BasicInitTurnRules();
		player = p;
	}
/*
	@Override
	public Player getPlayer() {
		return player;
	}

	@Override
	public void setPlayer(Player p) {
		player = p;
	}

	@Override
	public void initGameRules() {
		player.setHealthCapacity(30);
		player.setHealth(30);
		player.setManaSlot(0);
		player.setMana(0);
		player.setManaSlotCapacity(10);
		player.setDeckOfCards( randomDeckOfCards() );
		player.setCardsInHand( takeACards( 3 ) );
	}
	
	@Override
	public void initTurnRules() {
		if (player.isActive()) {
			player.increaseManaSlot(1);
		
			int refillMana = player.getManaSlot() - player.getMana();
			player.setMana(refillMana);
			
			Card c = takeACard();
			player.getCardsInHand().add(c);
		}
	}
	
	private Card randomCard() {
		Random r = new Random();
		Card c = new BasicCard();
		
		c.setNumber( r.nextInt( 9 ) );
		
		return c;
	}
	
	private List<Card> randomDeckOfCards() {
		List<Card> cards = new ArrayList<Card>();
		Random r = new Random();
		
		for (int i = 0; i < 20; i++) {
			cards.add( randomCard() );
		}
		
		return cards;
	}
	
	private Card takeACard() {
		List<Card> deckOfCards = player.getDeckOfCards();
		List<Card> cardsInHand = new ArrayList<Card>();
		Random r = new Random();
		
		int numbersCardsInDeck = player.getDeckOfCards().size();
		int i = r.nextInt(numbersCardsInDeck);

		Card c = deckOfCards.get(i);
		cardsInHand.add( c );

		deckOfCards.remove(c);
		player.setDeckOfCards(deckOfCards);
		
		return c;
	}
	
	private List<Card> takeACards(int n) {
		List<Card> cards = new ArrayList<Card>();
		
		for (int i = 0; i < n; i++) {
			cards.add( takeACard() );
		}
		
		return cards;
	}
	
	@Override
	public boolean canBePlayed () {
		if (heHasCardsInHisHand() && hasManaToPayCardFromHand()) {
			return true;
		}
		return false;
	}
	
	private boolean heHasCardsInHisHand () {
		if (player.getCardsInHand().isEmpty() == false) {
			return true;
		}
		return false;
	}
	
	private boolean hasManaToPayCardFromHand () {
		for (Card c : player.getCardsInHand()) {
			if (c.getNumber() <= player.getMana()) {
				return true;
			}
		}
		return false;
	}
	*/
}
