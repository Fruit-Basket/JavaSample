package fruitbasket.test;

public class ArrayTest {

	private static final ArrayTest instance=new ArrayTest();
	private ArrayTest(){}
	
	public ArrayTest getInstance(){
		return instance;
	}
	
	/**
	 * ������������֮��ĸ�ֵ
	 * ���Խ������������֮�丳��������
	 */
	public static void test1(){
		int[] array1={0,1,2,3,4,5,6,7,8,9};
		int[] array2=array1;
		
		array2[0]=10;
		
		System.out.println("array1[0]="+array1[0]);
		System.out.println("array2[0]="+array2[0]);
		
		/*
		 * ��������
		 * array1[0]=10
		 * array2[0]=10
		 */
	}
	
	/**
	 * ���Ժ����ڸı����飬�᲻��Ӱ�����鱾��
	 * �����������
	 */
	public static void test2(){
		int[] array={0,1,2,3,4,5,6,7,8,9};
		test3(array);
		System.out.println("array[0]="+array[0]);
		
		/*
		 * ��������
		 * array[0]=111
		 */
	}
	
	/**
	 * ���ڸ���test2()
	 * @param array
	 */
	private static void test3(int[] array){
		if(array!=null&&array.length>0){
			array[0]=111;
		}
		else{
			System.out.println("error");
		}
	}
}
