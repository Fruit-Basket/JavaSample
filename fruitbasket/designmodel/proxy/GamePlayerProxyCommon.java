package fruitbasket.designmodel.proxy;

public class GamePlayerProxyCommon implements IGamePlayer {

	private IGamePlayer gamePlayer=null;
	
	public GamePlayerProxyCommon(String name){
		try{
			gamePlayer=new GamePlayerCommon(this,name);
		}
		catch (Exception e){
			e.printStackTrace();
		}
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
