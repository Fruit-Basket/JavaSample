package fruitbasket.generic;

/**
 * 展示定义泛型方法
 * Author: FruitBasket
 * Time: 2017年9月27日
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class GenericMethod {
	
	private static final GenericMethod instance=new GenericMethod();
	
	private GenericMethod(){}
	
	public static GenericMethod getInstance(){
		return instance;
	}
	
	/**
	 * 测试定义及调用泛型方法
	 */
	public static void test(){
		GenericMethod instance=getInstance();
		instance.<String>get();//调用泛型方法
	}
	
	/**
	 * 辅助方法
	 * @return
	 */
	private <T> T get(){
		T value = null;
		return value;
	}
	
	/**
	 * 泛型方法语法测试
	 */
	public static void test2(){
		GenericMethod instance=getInstance();
		double middle;
		
		instance.getMiddle(3.14,0,1);
		
		//此语句将会出现语法错误，可以将结果赋值给Integer和Double的共同父类：Number或Compable
		//middle=instance.getMiddle(3.14,0,1);
		
		Number number=instance.getMiddle(3.14,0,1);
	}
	
	/**
	 * 辅助方法
	 * @param names
	 * @return
	 */
	private <T> T getMiddle(T...names){
		return names[names.length/2];
	}
	
	
}
