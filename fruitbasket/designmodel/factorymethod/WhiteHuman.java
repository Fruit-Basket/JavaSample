package fruitbasket.designmodel.factorymethod;

public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("皮肤是白色的");
	}

	@Override
	public void talk() {
		System.out.println("白种人会说话");
	}

}
