package fruitbasket.test;

/**
 * For循环测试
 * Author: FruitBasket
 * Time: 2017年8月29日
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class ForTest {
	
	private static final ForTest instance=new ForTest();
	private ForTest(){}
	public static ForTest getInstance(){
		return instance;
	}
	
	/**
	 * 测试for循环中引用的是否是源对象
	 * 结果表明：是
	 */
	public static void test(){
		System.out.println("test()");
		Element[] elements=new Element[2];
		elements[0]=new Element();
		elements[1]=new Element();
		
		System.out.print("source data: ");//输出“00”
		for(Element e:elements){
			System.out.print(e.data);
		}
		System.out.println();
		
		for(Element e:elements){
			e.data=1;//
		}
		
		System.out.print("after change: ");//输出“11”
		for(Element e:elements){
			System.out.print(e.data);
		}
		System.out.println();
	}
	
	/**
	 * 用于辅助测试
	 * @author FruitBasket
	 *
	 */
	public static class Element{
		public int data;
	}

}
