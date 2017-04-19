package fruitbasket.designmodel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	
	/**
	 * 测试常规代理模式
	 */
	public static void test1(){
		IGamePlayer player=new GamePlayer("Study.Z");
		IGamePlayer proxy =new GamePlayerProxy(player);
		
		proxy.login("user", "password");
		proxy.killBoss();
		proxy.upgrade();
	}
	
	/**
	 * 测试普通代理模式
	 */
	public static void test2(){
		//直接定义一个代练者
		IGamePlayer proxy=new GamePlayerProxyCommon("Study");
		
		proxy.login("Study", "123456");
		proxy.killBoss();
		proxy.upgrade();
	}
	
	public static void test3(){
		IGamePlayer player=new GamePlayer("Study");
		InvocationHandler handler=new GamePlayIH(player);
		ClassLoader cl=player.getClass().getClassLoader();
		IGamePlayer proxy=(IGamePlayer)Proxy.newProxyInstance(
				cl, 
				new Class[]{IGamePlayer.class},
				handler
		);
		proxy.login("Study","123456");
		proxy.killBoss();
		proxy.upgrade();
	}

}
