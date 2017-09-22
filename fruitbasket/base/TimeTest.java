package fruitbasket.base;

import java.util.Calendar;
import java.util.Date;

public class TimeTest {

	private static final TimeTest	 instance=new TimeTest();
	
	private TimeTest(){}
	
	public static TimeTest getInstance(){
		return instance;
	}
	
	public static void test(){
		Calendar calendar=Calendar.getInstance();
		System.out.println("year=="+calendar.get(Calendar.YEAR));
	}
	
	/**
	 * 比较日期大小的一种方法
	 */
	public static void compare(){
		
		Date date1=new Date();
		System.out.println("has constructed date1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date date2=new Date();
		System.out.println("has constructed date2");
		
		System.out.println("date1.before(date2)=="+date1.before(date2));
	}
}
