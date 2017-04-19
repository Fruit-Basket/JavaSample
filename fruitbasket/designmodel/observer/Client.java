package fruitbasket.designmodel.observer;

public class Client {
	public static void test(){
		//����۲���
		Observer liSi=new LiSi();
		Observer wangSi=new WangSi();
		
		//���屻�۲���
		HanFeiZi hanFeiZi=new HanFeiZi();
		
		//��ӹ۲���
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(wangSi);
		
		hanFeiZi.haveBreakfast();
	}
}
