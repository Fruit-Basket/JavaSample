package fruitbasket.designmodel.observer;

public class Client {
	public static void test(){
		//定义观察者
		Observer liSi=new LiSi();
		Observer wangSi=new WangSi();
		
		//定义被观察者
		HanFeiZi hanFeiZi=new HanFeiZi();
		
		//添加观察者
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(wangSi);
		
		hanFeiZi.haveBreakfast();
	}
}
