package fruitbasket.base;

/**
 * 位测试
 * Author: FruitBasket
 * Time: 2017年8月30日
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class BitTest {
	private static final BitTest instance=new BitTest();
	private BitTest(){}
	
	public static BitTest getInstance(){
		return instance;
	}
	
	/**
	 * 测试位运算是否也应用于int的符号位
	 * 结果：是的
	 */
	public static void test(){
		int a=0xA0000000;
		int b=0x20000000;
		int c=a&b;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
		
		/*
		输出如下：
		10100000000000000000000000000000
		100000000000000000000000000000
		100000000000000000000000000000
		 */
		
	}
}
