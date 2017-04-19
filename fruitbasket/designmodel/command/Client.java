package fruitbasket.designmodel.command;

public class Client {

	public static void test(){
		System.out.println("------------------客户要求增加一项需求------------------");
		Group rg=new RequirementGroup();
		rg.find();
		rg.add();
		rg.plan();
	}
	
	/**
	 * 测试命令模式                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	 */
	public static void test2(){
		Invoker xiaoSan=new Invoker();
		System.out.println("--------------客户要求增加一项需求--------------");
		Command command =new AddRequirementCommand();
		xiaoSan.setCommand(command);
		xiaoSan.action();
	}
}
