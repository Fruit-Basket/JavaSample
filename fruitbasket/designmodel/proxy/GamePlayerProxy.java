package fruitbasket.designmodel.proxy;

public class GamePlayerProxy implements IGamePlayer {
	
	private IGamePlayer gamePlayer;
	
	public GamePlayerProxy(IGamePlayer gamePlayer){
		this.gamePlayer=gamePlayer;
	}
	
	@Override
	public void login(String user, String password) {
		gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		gamePlayer.upgrade();
	}

}
