package fruitbasket.javaclass;

/**
 *
 * Author: FruitBasket
 * Time: 2017��10��5��
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class MethodOverload {
	
	public MethodOverload(){}
	
	/**
	 * ���Է�������
	 */
	public static void test1(){
		MethodOverload instance=new MethodOverload();
		instance.test1_help(new Double(1.0));
		/**
		 * �������
		 * test1_help(Number)
		 */
	}
	
	/**
	 * ��������
	 * @param o
	 */
	public void test1_help(Object o){
		System.out.println("test1_help(Object)");
	}
	
	/**
	 * �������� 
	 * @param n
	 */
	public void test1_help(Number n){
		System.out.println("test1_help(Number)");
	}
	
	/**
	 * ����һ�ַ�������
	 */
	public static void test2(){
		MethodOverload instance=new MethodOverload();
		instance.test2_help('a');
		/*
		 * 
		 */
	}
	
	/**
	 * ��������
	 * @param value
	 */
	public void test2_help(int value){
		System.out.println("test2_help(int)");
	}
	
	/**
	 * ��������
	 * @param value
	 */
	public void test2_help(String value){
		System.out.println("test2_help(String)");
	}
	

}
