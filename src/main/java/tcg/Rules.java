package tcg;

public abstract class Rules {

	InitGameRules initGameRules;
	InitTurnRules initTurnRules;
	Player player;

	public Rules() {
	}
	
	public void setInitGameRules(InitGameRules igr) {
		initGameRules = igr;
	}

	public void setInitTurnRules(InitTurnRules itr) {
		initTurnRules = itr;
	}

	public void applyInitRules() {
		initGameRules.applyInitGameRules(player);
	}

	public void applyTurnRules() {
		initTurnRules.applyInitTurnRules(player);
	}
}
/*
public interface Rules {
	
	public Player getPlayer();
	
	public void setPlayer(Player p);
	
	public void initGameRules();
	
	public void initTurnRules();
	
	public boolean canBePlayed ();
	
}*/
