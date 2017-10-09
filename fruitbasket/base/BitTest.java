package fruitbasket.base;

/**
 * λ����
 * Author: FruitBasket
 * Time: 2017��8��30��
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
	 * ����λ�����Ƿ�ҲӦ����int�ķ���λ
	 * ������ǵ�
	 */
	public static void test(){
		int a=0xA0000000;
		int b=0x20000000;
		int c=a&b;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
		
		/*
		������£�
		10100000000000000000000000000000
		100000000000000000000000000000
		100000000000000000000000000000
		 */
		
	}
}
