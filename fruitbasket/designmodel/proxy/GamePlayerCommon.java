package fruitbasket.designmodel.proxy;

/**
 * ��ͨģʽ����Ϸ��
 * @author FruitBasket
 *
 */
public class GamePlayerCommon implements IGamePlayer {
	private String name="";

	public GamePlayerCommon(IGamePlayer gamePlayer,String name)throws Exception{
		//������캯����ĺ����
		if(gamePlayer==null){
			throw new Exception("���ܴ�����ʵ��ɫ");
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
