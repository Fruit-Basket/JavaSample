package fruitbasket.initializationblock;

/**
 *
 * Author: FruitBasket
 * Time: 2017��9��12��
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class InitializationBlockTest {

	private static final InitializationBlockTest instance=new InitializationBlockTest();
	
	private InitializationBlockTest(){}
	
	public static InitializationBlockTest getInstance(){
		return instance;
	}
	
	/**
	 * ���Գ�ʼ�����빹�췽����ִ��˳��
	 * �������̬��ʼ����->��ʼ����->���췽��
	 */
	public static void test1(){
		new Father();
		/*
		 * �����
		 * Father static initialization block: female
		 * Father initialization block: Father
		 * Father constructor: Father
		 */
	}
	
	/**
	 * ���Ը����ʼ�����빹�췽����ִ��˳��
	 * �����
	 * 1.���������ľ�̬��ʼ����
	 * 2.����ĳ�ʼ����͹��췽��
	 * 3.����ĳ�ʼ����͹��췽��
	 */
	public static void test2(){
		new Son();
		/*
		 * �����
		 * Father static initialization block: female
		 * Son static initialization block: female
		 * 
		 * Father initialization block: Father
		 * Father constructor: Father
		 * 
		 * Son initialization block: Son
		 * Son constructor: Son
		 */
	}
}
