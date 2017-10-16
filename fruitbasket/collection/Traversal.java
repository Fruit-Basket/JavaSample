package fruitbasket.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * Author: FruitBasket
 * Time: 2017年10月16日
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
public class Traversal {
	
	
	private static final Traversal instance=new Traversal();
	
	private Traversal(){}
	
	public static Traversal getInstance(){
		return instance;
	}

	/**
	 * 测试：ArrayList的不同遍历方法
	 * 结果：遍历速度1<2<3
	 */
	public static void test1(){
		final int MAX=10000000;
		List<Integer> list=new ArrayList<Integer>(MAX);
		long start,time;
		
		for(int i=0;i<MAX;++i){
			list.add(i);
		}
		
		//遍历方法1
		start= System.currentTimeMillis();
		for(Integer value:list){
			;
		}
		time=System.currentTimeMillis()-start;
		System.out.println("for each: "+time);
		
		//遍历方法2
		start= System.currentTimeMillis();
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()){
			iterator.next();
		}
		time=System.currentTimeMillis()-start;
		System.out.println("Iterator: "+time);
		
		//遍历方法3
		//最快
		start= System.currentTimeMillis();
		for(int i=0;i<list.size();++i){
			list.get(i);
		}
		time=System.currentTimeMillis()-start;
		System.out.println("for list: "+time);
	}
}
