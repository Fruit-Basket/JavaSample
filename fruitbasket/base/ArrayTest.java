package fruitbasket.base;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayTest {

	private static final ArrayTest instance=new ArrayTest();
	private ArrayTest(){}
	
	public ArrayTest getInstance(){
		return instance;
	}
	
	/**
	 * 测试ArrayList的地带起始位置的设置
	 * 结果请看注释
	 */
	public static void test4(){
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(0);
		array.add(1);
		array.add(2);
		
		System.out.println(array.size());//输出3
		System.out.println(array.get(0));//输出0
		System.out.println(array.get(2));//输出2
		
		ListIterator listlterator=array.listIterator(3);//注意这里填入的是size()
		while(listlterator.hasPrevious()){
			System.out.print(listlterator.previous());//输出210
		}
		System.out.println();
		
		listlterator=array.listIterator(0);//注意这里填入的是0
		while(listlterator.hasNext()){
			System.out.print(listlterator.next());//输出012
		}
		System.out.println();
		
		listlterator=array.listIterator(1);//注意这里填入的是1
		while(listlterator.hasNext()){
			System.out.print(listlterator.next());//输出12
		}
		System.out.println();
	}
	
	/**
	 * 测试数组名字之间的赋值
	 * 测试结果：数组名字之间赋的是引用
	 */
	public static void test1(){
		int[] array1={0,1,2,3,4,5,6,7,8,9};
		int[] array2=array1;
		
		array2[0]=10;
		
		System.out.println("array1[0]="+array1[0]);
		System.out.println("array2[0]="+array2[0]);
		
		/*
		 * 输出结果：
		 * array1[0]=10
		 * array2[0]=10
		 */
	}
	
	/**
	 * 测试函数内改变数组，会不会影响数组本身
	 * 结果表明：会
	 */
	public static void test2(){
		int[] array={0,1,2,3,4,5,6,7,8,9};
		test3(array);
		System.out.println("array[0]="+array[0]);
		
		/*
		 * 输出结果：
		 * array[0]=111
		 */
	}
	
	/**
	 * 用于辅助test2()
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
