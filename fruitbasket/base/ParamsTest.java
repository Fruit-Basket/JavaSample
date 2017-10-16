package fruitbasket.base;

/**
 * ��������
 * Author: FruitBasket
 * Time: 2017��9��30��
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
	 * ���ԣ�long��float��double֮��ı任
	 * �����long����ֱ��ת������float��double
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
	 * չʾ���������������
	 * ԭ��
	 * value��ֵ�������������еģ�.9������0.8999999999999999��������
	 * ������ֵ���ö�����ϵͳ��ʾ�����ڶ�����ϵͳ���޷���ȷ�ر�ʾ1/10��
	 * ��ͺ���ʮ�����޷���ȷ�ر�ʾ1/3һ��
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
		 * ���������
		 * value!=0.9
		 */
	}

	/**
	 * �������test2()���������״��///
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
		 * ���������
		 * value==0.9
		 */
	}
	
	/**
	 * ����char�����͵�ת��
	 * �����char����ֱ��ת�������͡�char��byte�����໥ֱ��ת��
	 */
	public static void test4(){
		byte byte_v='a';
		int int_v='a';
		
		char char_v=0x0F;
	}
	
	/**
	 * ���ԣ���==���Ƿ�����û��ж�int��Integer��Integer��Integer�����������ֵ���Ƿ����
	 * ���������
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
		 * ��������
		 * a==b
		 * b==c
		 */
	}
	
	
	
}
