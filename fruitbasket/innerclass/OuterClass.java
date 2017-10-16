package fruitbasket.innerclass;

/**
 *
 * Author: FruitBasket
 * Time: 2017��9��18��
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class OuterClass {

	private String name="outer class";//��������
	
	private float f=1.0f;//��������
	
	public OuterClass(){
		
	}
	
	/**
	 * �����ⲿ�ܷ�����ڲ����˽�г�Ա����
	 * ���������
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
		 * �����ڲ����ܷ�����ⲿ���˽�г�Ա����
		 * ���������
		 */
		public void testAccePrivate(){
			OuterClass outerClass=new OuterClass();
			System.out.println(outerClass.name);
		}
	}

	/**
	 * �Ǿ�̬�ڲ��࣬���ܰ�����̬����
	 */
	/*class InnerClass1{
		public static float func(){
			return f;
		}
	}*/
}
