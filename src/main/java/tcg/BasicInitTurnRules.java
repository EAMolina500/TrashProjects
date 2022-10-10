package tcg;

public class BasicInitTurnRules implements InitTurnRules {

	public void applyInitTurnRules(Player player) {
		if (player.isActive()) {
			player.increaseManaSlot(1);
		
			int refillMana = player.getManaSlot() - player.getMana();
			player.setMana(refillMana);
			
			Card c = player.takeACard();
			player.getCardsInHand().add(c);
		}
	}
}
