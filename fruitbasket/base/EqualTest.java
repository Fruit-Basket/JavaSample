package fruitbasket.base;

/**
 *
 * Author: FruitBasket
 * Time: 2017年10月16日
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class EqualTest {

	private static final EqualTest instance=new EqualTest();
	
	private EqualTest(){}
	
	public static EqualTest getInstance(){
		return instance;
	}
	
	/**
	 * 测试：“==”等号是不是跟句hashCode()的返回值来判断引用是否相等的
	 * 结果：不是
	 */
	public static void test1(){
		EqualTest test=getInstance();
		MyInteger1 a=test.new MyInteger1(10);
		MyInteger1 b=test.new MyInteger1(10);
		
		if(a==b){
			System.out.println("a==b");
		}
		else{
			System.out.println("a!=b");
		}
		
		/*
		 * 输出结果：
		 * a!=b
		 */
	}
	
	
	/**
	 * 辅助测试类
	 * @author FruitBasket
	 *
	 */
	private class MyInteger1 extends Object{
		private int value;
		
		public MyInteger1(int value){
			this.value=value;
		}
		
		@Override 
		public int hashCode(){
			return value;
		}
	}
}
