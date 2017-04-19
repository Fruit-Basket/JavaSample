package fruitbasket.designmodel.observer;

import java.util.ArrayList;

/**
 * ����ı��۲���
 * @author FruitBasket
 *
 */
public class HanFeiZi implements IHanFeiZi, Observable {
	
	//����һ���۲�������
	private ArrayList<Observer> observerList=new ArrayList<Observer>();

	@Override
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObservers(String context) {
		for(Observer observer:observerList){
			observer.update(context);
		}
	}

	@Override
	public void haveBreakfast() {
		System.out.println("haveBreakfast()");
		
		//֪ͨ���еĹ۲���
		notifyObservers("HanFeiZi.haveBreakfast()");
	}

	@Override
	public void haveFun() {
		System.out.println("haveFun()");
		
		//֪ͨ���еĹ۲���
		notifyObservers("HanFeiZi.haveFun()");
	}

}
