package fruitbasket.designmodel.observer;

/**
 * 具体的观察者
 * @author FruitBasket
 *
 */
public class LiSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("begin to update");
		System.out.println(context);
		System.out.println("end update");
	}

}
