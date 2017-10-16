package fruitbasket.innerclass;

/**
 *
 * Author: FruitBasket
 * Time: 2017年9月18日
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class OuterClass {

	private String name="outer class";//辅助测试
	
	private float f=1.0f;//辅助测试
	
	public OuterClass(){
		
	}
	
	/**
	 * 测试外部能否访问内部类的私有成员变量
	 * 结果：可以
	 */
	public void testAccessPrivate(){
		InnerClass innerClass=new InnerClass();
		System.out.println(innerClass.name);
	}
	
	private class InnerClass{
		private String name="inner class";
		
		public InnerClass(){
			
		}
		
		/**
		 * 测试内部类能否访问外部类的私有成员变量
		 * 结果：可以
		 */
		public void testAccePrivate(){
			OuterClass outerClass=new OuterClass();
			System.out.println(outerClass.name);
		}
	}

	/**
	 * 非静态内部类，不能包含静态方法
	 */
	/*class InnerClass1{
		public static float func(){
			return f;
		}
	}*/
}
