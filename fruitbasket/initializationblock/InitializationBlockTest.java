package fruitbasket.initializationblock;

/**
 *
 * Author: FruitBasket
 * Time: 2017年9月12日
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
	 * 测试初始化块与构造方法的执行顺序
	 * 结果：静态初始化块->初始化块->构造方法
	 */
	public static void test1(){
		new Father();
		/*
		 * 输出：
		 * Father static initialization block: female
		 * Father initialization block: Father
		 * Father constructor: Father
		 */
	}
	
	/**
	 * 测试父类初始化块与构造方法的执行顺序
	 * 结果：
	 * 1.父类和子类的静态初始化块
	 * 2.父类的初始化块和构造方法
	 * 3.子类的初始化块和构造方法
	 */
	public static void test2(){
		new Son();
		/*
		 * 输出：
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
