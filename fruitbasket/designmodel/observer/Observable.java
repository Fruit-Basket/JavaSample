package fruitbasket.designmodel.observer;

/**
 * 被观察者
 * 可使用java.util.Observable代替
 * @author FruitBasket
 *
 */
public interface Observable {

	public void addObserver(Observer observer);
	public void deleteObserver(Observer observer);
	
	/**
	 * 通知所有观察者
	 * @param context 通知的内容
	 */
	public void  notifyObservers(String context);
	
}
