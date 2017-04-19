package fruitbasket.designmodel.facade;

public class Client {
	
	public static void test(){
		ModenPostOffice office=new ModenPostOffice();
		
		String address="Computer Science and Software Engineering College,Shenzhen University";
		String context="Hello, I am FruitBasket!";
		
		office.sendLetter(address,context);
	}

}
