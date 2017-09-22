package fruitbasket.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author: FruitBasket
 * Time: 2017年9月18日
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
	 * 测试将对象放入集合后，再修改该对象，是否会影响集合中的对象
	 * 结果：是
	 */
	public static void testSetReference(){
		SetTest setTest=SetTest.getInstance();
		
		Set<Ball> set=new HashSet<>();
		Ball ball=setTest.new Ball("basketball");
		set.add(ball);
		
		ball.setName("football");//改变名字
		
		//访问这个集合
		Iterator<Ball> iterator=set.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next().name);
		}
		System.out.println();
		/**
		 * 输出结果：
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
