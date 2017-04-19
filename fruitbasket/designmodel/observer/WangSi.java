package fruitbasket.designmodel.observer;

public class WangSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("begin to update");
		System.out.println(context);
		System.out.println("end update");
	}

}
