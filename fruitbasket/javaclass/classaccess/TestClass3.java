package fruitbasket.javaclass.classaccess;

/**
 * 用于类的访问范围和构造函数访问范围测试
 * @author FruitBasket
 *
 */
public class TestClass3 {
	
	public TestClass3(){
		System.out.println("TestClass3");
		InnerClass1 innerClass1=new InnerClass1();
	}
	
	private class InnerClass1{
		private InnerClass1(){
			System.out.println("InnerClass1");
		}
	}
	
	public class InnerClass2{
		private InnerClass2(){
			System.out.println("InnerClass2");
		}
	}

}
