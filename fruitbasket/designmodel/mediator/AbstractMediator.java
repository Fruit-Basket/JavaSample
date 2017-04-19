package fruitbasket.designmodel.mediator;

public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	
	public AbstractMediator(){
		purchase=new Purchase(this);
		sale=new Sale(this);
		stock=new Stock(this);
	}
	
	/**
	 * �¼�����
	 * @param string
	 * @param objects
	 */
	public abstract void execute(String string,Object...objects);
}
