package fruitbasket.base;

/**
 *
 * Author: FruitBasket
 * Time: 2017��10��16��
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
	 * ���ԣ���==���Ⱥ��ǲ��Ǹ���hashCode()�ķ���ֵ���ж������Ƿ���ȵ�
	 * ���������
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
		 * ��������
		 * a!=b
		 */
	}
	
	
	/**
	 * ����������
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
