package fruitbasket.designmodel.command;

public class Client {

	public static void test(){
		System.out.println("------------------�ͻ�Ҫ������һ������------------------");
		Group rg=new RequirementGroup();
		rg.find();
		rg.add();
		rg.plan();
	}
	
	/**
	 * ��������ģʽ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	 */
	public static void test2(){
		Invoker xiaoSan=new Invoker();
		System.out.println("--------------�ͻ�Ҫ������һ������--------------");
		Command command =new AddRequirementCommand();
		xiaoSan.setCommand(command);
		xiaoSan.action();
	}
}
