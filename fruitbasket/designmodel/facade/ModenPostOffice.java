package fruitbasket.designmodel.facade;

/**
 * 门面
 * 但是，这个类作为一个门面，却参与了具体的业务逻辑？
 * @author FruitBasket
 *
 */
public class ModenPostOffice {
	
	private ILetterProcess letterProcess=new LetterProcessImpl();
	
	public void sendLetter(String context,String address){
		letterProcess.writeContext(context);
		letterProcess.fillEnvelope(address);
		letterProcess.letterIntoEnvelope();
		letterProcess.sendLetter();
	}

}
