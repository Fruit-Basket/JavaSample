package fruitbasket.object;

/**
 *
 * Author: FruitBasket
 * Time: 2017年10月5日
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class MethodOverload {
	
	public MethodOverload(){}
	
	/**
	 * 测试方法重载
	 */
	public static void test1(){
		MethodOverload instance=new MethodOverload();
		instance.test1_help(new Double(1.0));
		/**
		 * 输出如下
		 * test1_help(Number)
		 */
	}
	
	/**
	 * 辅助测试
	 * @param o
	 */
	public void test1_help(Object o){
		System.out.println("test1_help(Object)");
	}
	
	/**
	 * 辅助测试 
	 * @param n
	 */
	public void test1_help(Number n){
		System.out.println("test1_help(Number)");
	}

}
