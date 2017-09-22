package fruitbasket.base;

/**
 *
 * Author: FruitBasket
 * Time: 2017年9月12日
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class OtherTest1 {

	private static final OtherTest1 instance=new OtherTest1();
	
	private OtherTest1(){}
	
	public static OtherTest1 getInstance(){
		return instance;
	}
	
	/**
	 * 测试double到short的转换
	 * 结果证明，可以直接转换
	 */
 	public static void testDoubleToShort(){
		//double doubleValue=123456789101112131415161718192022122232425262728293031323334353637383940d;
		double doubleValue=32767d;
		long longValue1=Math.round(doubleValue);
		long longValue2=(long)doubleValue;
		
		short shortValue1=(short)longValue1; 
		short shortValue2=(short)doubleValue;
		
		System.out.println("doubleValue=="+doubleValue);
		System.out.println("longValue1=="+longValue1);
		System.out.println("longValue2=="+longValue2);
		System.out.println();
		
		System.out.println("shortValue1=="+shortValue1);
		System.out.println("shortValue2=="+shortValue2);
	}
	
	/**
	 * 一种测试方式：测试一个数是否为2的次方
	 * 这种方法是正确的
	 * 原理在于，2次方值的负值的补码，与该2次方值，在表示数的那些位上，是相等的
	 * 例如：
	 * 8=0000 1000
	 * -8[补]=1111 1000
	 * =>8 & -8[补] = 8
	 */
	public static void testIsPowOfTwo(){
		int value1=8;
		int value2=7;
		
		System.out.println("-value1=="+-value1);
		System.out.println("(-value1)&value1=="+((-value1)&value1));
		
		System.out.println("-value2=="+-value2);
		System.out.println("(-value2)&value2=="+((-value2)&value2));
		
		if(((-value1)&value1)==value1){
			System.out.println(value1+" is  pow of 2");
		}
		else{
			System.out.println(value1+" is not pow of 2");
		}
		
		if(((-value2)&value2)==value2){
			System.out.println(value2+" is  pow of 2");
		}
		else{
			System.out.println(value2+" is not pow of 2");
		}
	}
	
	
}
