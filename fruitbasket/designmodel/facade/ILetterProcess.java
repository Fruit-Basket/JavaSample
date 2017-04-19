package fruitbasket.designmodel.facade;

/**
 * д�Ź��̽ӿ�
 * @author FruitBasket
 *
 */
public interface ILetterProcess {

	/**
	 * ��д����
	 * @param context д�ŵ�����
	 */
	public void writeContext(String context);
	
	/**
	 * ��д�ŷ�
	 * @param address ������ַ
	 */
	public void fillEnvelope(String address);
	
	/**
	 *���Ž��ŷ�
	 */
	public void letterIntoEnvelope();
	
	/**
	 * �ĳ���
	 */
	public void sendLetter();
}
