package fruitbasket.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author: FruitBasket
 * Time: 2017��9��18��
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class SetTest {
	
	private static final SetTest instance=new SetTest();
	
	private SetTest(){}
	
	public static SetTest getInstance(){
		return instance;
	}

	/**
	 * ���Խ�������뼯�Ϻ����޸ĸö����Ƿ��Ӱ�켯���еĶ���
	 * �������
	 */
	public static void testSetReference(){
		SetTest setTest=SetTest.getInstance();
		
		Set<Ball> set=new HashSet<>();
		Ball ball=setTest.new Ball("basketball");
		set.add(ball);
		
		ball.setName("football");//�ı�����
		
		//�����������
		Iterator<Ball> iterator=set.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next().name);
		}
		System.out.println();
		/**
		 * ��������
		 * football
		 */
	}
	
	class Ball{
		private String name="ball";
		Ball(){}
		Ball(String name){
			this.name=name;
		}
		
		public void setName(String name){
			this.name=name;
		}
		
		public String getName(){
			return this.name;
		}
	}
}
