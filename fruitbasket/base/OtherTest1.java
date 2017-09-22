package fruitbasket.base;

/**
 *
 * Author: FruitBasket
 * Time: 2017��9��12��
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
	 * ����double��short��ת��
	 * ���֤��������ֱ��ת��
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
	 * һ�ֲ��Է�ʽ������һ�����Ƿ�Ϊ2�Ĵη�
	 * ���ַ�������ȷ��
	 * ԭ�����ڣ�2�η�ֵ�ĸ�ֵ�Ĳ��룬���2�η�ֵ���ڱ�ʾ������Щλ�ϣ�����ȵ�
	 * ���磺
	 * 8=0000 1000
	 * -8[��]=1111 1000
	 * =>8 & -8[��] = 8
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
