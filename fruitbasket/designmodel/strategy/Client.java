package fruitbasket.designmodel.strategy;

public class Client {

	public static void test(int value1,int value2){
		System.out.println(value1+" "+"+"+" "+value2+" = "+Calculator.ADD.exec(value1, value2));
	}
}
