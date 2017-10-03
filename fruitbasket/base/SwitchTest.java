package fruitbasket.base;

/**
 *
 * Author: FruitBasket
 * Time: 2017��9��27��
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class SwitchTest {
	
	private static final SwitchTest instance=new SwitchTest();
	
	private SwitchTest(){}
	
	public SwitchTest getInstance(){
		return instance;
	}
	
	/**
	 *  ���ԣ�default�᲻��Ҳ˳��ִ��
	 *  �������
	 */
	public static void test(){
		switch(2){
		case 1:
			System.out.println("1");
			
		case 2:
			System.out.println("2");
			
		case 3:
			System.out.println("3");
			
			default:
				System.out.println("default");
		}
		/*
		 * ���������
		 * 2
		 * 3
		 * default
		*/
	}

}
