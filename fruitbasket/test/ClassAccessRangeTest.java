package fruitbasket.test;

public class ClassAccessRangeTest {

	private static final ClassAccessRangeTest instance=new ClassAccessRangeTest();
	
	private ClassAccessRangeTest(){}
	
	public ClassAccessRangeTest getInstance(){
		return instance;
	}
	
	/**
	 * ��͹��캯�����ʷ�Χ����
	 */
	public static void test1(){
		/*
		 * ��import fruitbasket.test.TestClass1�����ǲ��ܹ������
		 */
		//TestClass1 testClass1=new TestClass1();
		
		/*
		 * ���� import fruitbasket.test.TestClass2
		 */
		//TestClass2 testClass2=new TestClass2();
	}
}
