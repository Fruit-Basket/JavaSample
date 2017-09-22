package fruitbasket.object;

import fruitbasket.base.OtherTest1;
import fruitbasket.base.OtherTest2;

/**
 *
 * Author: FruitBasket
 * Time: 2017��9��22��
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class BaseTest {
	private static final BaseTest instance=new BaseTest();
	private BaseTest(){}
	public BaseTest getInstance(){
		return instance;
	}
	
	/**
	 * ���Ը���������ʽ��������һ���µĶ����Ƿ��Ӱ��ʵ��
	 * �������������
	 */
	public static void testObject(){
		BaseTest.TestObject o=new BaseTest.TestObject(1);
		changeObject(o);
		System.out.println(o.getValue());//���1
	}
	
	/**
	 * ��������
	 * @param o
	 */
	private static void changeObject(BaseTest.TestObject o){
		o=new BaseTest.TestObject(2);
	}
	
	/**
	 * ��������
	 * @author FruitBasket
	 *
	 */
    private static  class TestObject{
		
		private int value;
		
		public TestObject(int value){
			this.value=value;
		}
		
		public int getValue(){
			return value;
		}
	}
	
	/**
	 * ���Դ����ն������顢��ͨ��������
	 */
	public static void testObjectArray(){
		Object[] array=new Object[]{};
		int[] intArra=new int[]{};
		System.out.println("length=="+array.length);
	}
	
	/**
	 * ����������Ԫ�صĶ�������
	 */
	public static void syntaxTest1(){
		Class[] test=new Class[] {OtherTest2.class,OtherTest2.class};
	}
}
