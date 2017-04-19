package fruitbasket.designmodel.facade;

/**
 * ����
 * ���ǣ��������Ϊһ�����棬ȴ�����˾����ҵ���߼���
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
