package fruitbasket.designmodel.factorymethod;

public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("皮肤是黄色的");
	}

	@Override
	public void talk() {
		System.out.println("黄种人会说话，一般说的都是双字节。");
	}

}
