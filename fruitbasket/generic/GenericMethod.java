package fruitbasket.generic;

/**
 * չʾ���巺�ͷ���
 * Author: FruitBasket
 * Time: 2017��9��27��
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
	 * ���Զ��弰���÷��ͷ���
	 */
	public static void test(){
		GenericMethod instance=getInstance();
		instance.<String>get();//���÷��ͷ���
	}
	
	/**
	 * ��������
	 * @return
	 */
	private <T> T get(){
		T value = null;
		return value;
	}
	
	/**
	 * ���ͷ����﷨����
	 */
	public static void test2(){
		GenericMethod instance=getInstance();
		double middle;
		
		instance.getMiddle(3.14,0,1);
		
		//����佫������﷨���󣬿��Խ������ֵ��Integer��Double�Ĺ�ͬ���ࣺNumber��Compable
		//middle=instance.getMiddle(3.14,0,1);
		
		Number number=instance.getMiddle(3.14,0,1);
	}
	
	/**
	 * ��������
	 * @param names
	 * @return
	 */
	private <T> T getMiddle(T...names){
		return names[names.length/2];
	}
	
	
}
