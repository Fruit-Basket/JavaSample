package fruitbasket.designmodel.strategy;

public class GivenGreenLight implements IStrategy {

	@Override
	public void operate() {
		System.out.println("GivenGreenLight.operate()");
	}

}
