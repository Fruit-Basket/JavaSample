package fruitbasket.designmodel.proxy;

/**
 * 普通模式的游戏者
 * @author FruitBasket
 *
 */
public class GamePlayerCommon implements IGamePlayer {
	private String name="";

	public GamePlayerCommon(IGamePlayer gamePlayer,String name)throws Exception{
		//这个构造函数真的很奇怪
		if(gamePlayer==null){
			throw new Exception("不能创建真实角色");
		}
		else{
			this.name=name;
		}
		
	}
	
	@Override
	public void login(String user, String password) {
		System.out.println(user+" : login()");
	}

	@Override
	public void killBoss() {
		System.out.println("killBoss()");
	}

	@Override
	public void upgrade() {
		System.out.println("upgrader()");
	}

}
