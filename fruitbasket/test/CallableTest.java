package fruitbasket.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {

	private static final CallableTest instance=new CallableTest();
	private CallableTest(){}
	
	public CallableTest getInstance(){
		return instance;
	}
	
	/**
	 * ����FutrueTask��get�����᲻��������ǰ���ֳɡ����֤������
	 */
	public static void testFutureTaskGet(){
		Callable<Integer> myCallable=new MyCallable();
		FutureTask<Integer> task=new FutureTask<Integer>(myCallable);
		Thread thread=new Thread(task);
		
		
		try {
			thread.start();
			System.out.println("before getting the result");
			System.out.println("task.get()="+task.get());
			System.out.println("after getting");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
