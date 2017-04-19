package fruitbasket.designmodel.observer;

/**
 * ���۲���
 * ��ʹ��java.util.Observable����
 * @author FruitBasket
 *
 */
public interface Observable {

	public void addObserver(Observer observer);
	public void deleteObserver(Observer observer);
	
	/**
	 * ֪ͨ���й۲���
	 * @param context ֪ͨ������
	 */
	public void  notifyObservers(String context);
	
}
