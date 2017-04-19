package fruitbasket.designmodel.facade;

/**
 * 写信过程接口
 * @author FruitBasket
 *
 */
public interface ILetterProcess {

	/**
	 * 编写内容
	 * @param context 写信的内容
	 */
	public void writeContext(String context);
	
	/**
	 * 编写信封
	 * @param address 寄往地址
	 */
	public void fillEnvelope(String address);
	
	/**
	 *放信进信封
	 */
	public void letterIntoEnvelope();
	
	/**
	 * 寄出信
	 */
	public void sendLetter();
}
