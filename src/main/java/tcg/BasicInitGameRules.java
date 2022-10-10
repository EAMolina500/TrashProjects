package tcg;

public class BasicInitGameRules implements InitGameRules {

	public void applyInitGameRules(Player player) {
		player.setHealthCapacity(30);
		player.setHealth(30);
		player.setManaSlot(0);
		player.setMana(0);
		player.setManaSlotCapacity(10);
		player.setDeckOfCards( player.randomDeckOfCards() );
		player.setCardsInHand( player.takeACards( 3 ) );
	}
}
