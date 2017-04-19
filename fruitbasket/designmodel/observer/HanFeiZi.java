package fruitbasket.designmodel.observer;

import java.util.ArrayList;

/**
 * 具体的被观察者
 * @author FruitBasket
 *
 */
public class HanFeiZi implements IHanFeiZi, Observable {
	
	//定义一个观察者数组
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
		
		//通知所有的观察者
		notifyObservers("HanFeiZi.haveBreakfast()");
	}

	@Override
	public void haveFun() {
		System.out.println("haveFun()");
		
		//通知所有的观察者
		notifyObservers("HanFeiZi.haveFun()");
	}

}
