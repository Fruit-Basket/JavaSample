package fruitbasket.designmodel.strategy;

public class ZhaoYun {

	public static void test(){
		Context context;
		
		System.out.println("part 1---");
		context=new Context(new BackDoor());
		context.operate();
		System.out.println("\n");
		
		System.out.println("part 2---");
		context=new Context(new GivenGreenLight());
		context.operate();
		System.out.println("\n");
		
		System.out.println("part 3---");
		context=new Context(new BlockEnemy());
		context.operate();
		System.out.println("\n");
	}
}
