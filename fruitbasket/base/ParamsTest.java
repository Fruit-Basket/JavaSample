package fruitbasket.base;

/**
 *
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

}
