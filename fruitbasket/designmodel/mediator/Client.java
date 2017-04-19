package fruitbasket.designmodel.mediator;

public class Client {
	public static void test(){
		AbstractMediator mediator=new Mediator();
		
		System.out.println("------�ɹ���Ա�ɹ�����------");
		Purchase purchase =new Purchase(mediator);
		purchase.buyIBMcomputer(100);
		
		System.out.println("\n------������Ա���۵���------");
		Sale sale =new Sale(mediator);
		sale.sellIBMComputer(1);
		
		System.out.println("\n-------�ⷿ������Ա��⴦��-------");
		Stock stock=new Stock(mediator);
		stock.clearStock();
	}
}