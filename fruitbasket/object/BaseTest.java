package fruitbasket.object;

import fruitbasket.base.OtherTest1;
import fruitbasket.base.OtherTest2;

/**
 *
 * Author: FruitBasket
 * Time: 2017年9月22日
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
	 * 测试给函数的形式参数赋予一个新的对象，是否会影响实参
	 * 结果表明：不会
	 */
	public static void testObject(){
		BaseTest.TestObject o=new BaseTest.TestObject(1);
		changeObject(o);
		System.out.println(o.getValue());//输出1
	}
	
	/**
	 * 辅助测试
	 * @param o
	 */
	private static void changeObject(BaseTest.TestObject o){
		o=new BaseTest.TestObject(2);
	}
	
	/**
	 * 辅助测试
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
	 * 测试创建空对象数组、普通类型数组
	 */
	public static void testObjectArray(){
		Object[] array=new Object[]{};
		int[] intArra=new int[]{};
		System.out.println("length=="+array.length);
	}
	
	/**
	 * 创建有两个元素的对象数组
	 */
	public static void syntaxTest1(){
		Class[] test=new Class[] {OtherTest2.class,OtherTest2.class};
	}
}
