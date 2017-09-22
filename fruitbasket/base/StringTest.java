package fruitbasket.base;

public class StringTest {

	private static final StringTest instance=new StringTest();
	private StringTest(){}
	public StringTest getInstance(){
		return instance;
	}
	
	/**
	 * ½øÐÐ×Ö·û´®ÇÐ¸î
	 */
	public static void test1(){
		String string="hello i am Study Zhou";
		int total=string.split(" ").length;
		System.out.println("total="+total);
	}
	
	/**
	 * ¿Õ×Ö·û´®µÄ³¤¶È
	 */
	public static void test2(){
		String [] list=null;
		System.out.println(list.length);
	}
}
