package fruitbasket.test;

/**
 * Forѭ������
 * Author: FruitBasket
 * Time: 2017��8��29��
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
	 * ����forѭ�������õ��Ƿ���Դ����
	 * �����������
	 */
	public static void test(){
		System.out.println("test()");
		Element[] elements=new Element[2];
		elements[0]=new Element();
		elements[1]=new Element();
		
		System.out.print("source data: ");//�����00��
		for(Element e:elements){
			System.out.print(e.data);
		}
		System.out.println();
		
		for(Element e:elements){
			e.data=1;//
		}
		
		System.out.print("after change: ");//�����11��
		for(Element e:elements){
			System.out.print(e.data);
		}
		System.out.println();
	}
	
	/**
	 * ���ڸ�������
	 * @author FruitBasket
	 *
	 */
	public static class Element{
		public int data;
	}

}
