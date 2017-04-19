package fruitbasket.test;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int result=0;
		for(int i=0;i<1000000000;++i){
			result+=i;
		}
		return result;
	}
	
}