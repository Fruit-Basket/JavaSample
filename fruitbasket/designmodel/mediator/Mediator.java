package fruitbasket.designmodel.mediator;

public class Mediator extends AbstractMediator {
	
	@Override
	public void execute(String string, Object... objects) {
		if(string.equals("purchase.buy")){
			buyComputer((Integer)objects[0]);
		}
		else if(string.equals("sale.sell")){
			sellComputer((Integer)objects[0]);
		}
		else if(string.equals("sale.offsell")){
			offSell();
		}
		else if(string.equals("stock.clear")){
			clearStock();
		}
	}
	
	private void buyComputer(int number){
		int saleStatus=super.sale.getSaleStatus();
		if(saleStatus>80){
			System.out.println("�ɹ�IBM���ԣ�"+number+"̨");
			super.stock.increase(number);
		}
		else{
			int buyNumber=number/2;
			System.out.println("�ɹ�IBM���ԣ�"+buyNumber+"̨");
			super.stock.increase(buyNumber);
		}
	}

	private void sellComputer(int number){
		if(super.stock.getStockNumber()<number){
			super.purchase.buyIBMcomputer(number);
		}
		super.stock.decrease(number);
	}
	
	private void offSell(){
		System.out.println("�ۼ�����IBM����"+stock.getStockNumber()+"̨");
	}
	
	private void clearStock(){
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}
}
