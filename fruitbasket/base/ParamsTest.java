package fruitbasket.base;

/**
 * 变量测试
 * Author: FruitBasket
 * Time: 2017年9月30日
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class ParamsTest {
	
	private static final ParamsTest instance=new ParamsTest();
	
	private ParamsTest(){}
	
	public ParamsTest getInstance(){
		return instance;
	}
	
	/**
	 * 测试：long到float和double之间的变换
	 * 结果：long可以直接转换到到float和double
	 */
	public static void test(){
		int v_int;
		long v_long;
		float v_float;
		double v_double;
		
		v_int=1;
		v_long=2;
		v_float=3.0f;
		v_double=4.0;
	
		v_float=v_long;
		v_double=v_long;
		System.out.println(v_float+"\n"+v_double);
	}
	
	/**
	 * 展示浮点数的舍入误差
	 * 原因：
	 * value的值不是人们想象中的０.9，而是0.8999999999999999。这由于
	 * 浮点数值采用二进制系统表示，而在二进制系统中无法精确地表示1/10。
	 * 这就好像十进制无法精确地表示1/3一样
	 */
	public static void test2(){
		double value=2.0-1.1;
		//System.out.println(value);
		
		if(value==0.9){
			System.out.println("value==0.9");
		}
		else{
			System.out.println("value!=0.9");
		}
		/*
		 * 程序输出：
		 * value!=0.9
		 */
	}

	/**
	 * 如何联合test2()解释这个现状？///
	 */
	public static void test3(){
		double value=0.9;
		
		if(value==0.9){
			System.out.println("value==0.9");
		}
		else{
			System.out.println("value!=0.9");
		}
		/*
		 * 程序输出：
		 * value==0.9
		 */
	}
	
	/**
	 * 测试char到整型的转换
	 * 结果：char可以直接转换到整型。char和byte可以相互直接转换
	 */
	public static void test4(){
		byte byte_v='a';
		int int_v='a';
		
		char char_v=0x0F;
	}
	
	/**
	 * 测试：“==”是否可以用户判断int与Integer、Integer与Integer在所代表的数值上是否相等
	 * 结果：可以
	 */
	public static void test5(){
		int a=10;
		Integer b=10;
		Integer c=10;
		
		if(a==b){
			System.out.println("a==b");
		}
		else{
			System.out.println("a!=b");
		}
		
		if(b==c){
			System.out.println("b==c");
		}
		else{
			System.out.println("b!=c");
		}
		
		/*System.out.println("b.hashCode(): "+b.hashCode());
		System.out.println("c.hashCode(): "+c.hashCode());*/
		
		/*
		 * 输出结果：
		 * a==b
		 * b==c
		 */
	}
	
	
	
}
