package fruitbasket.designmodel.facade;

public class LetterProcessImpl implements ILetterProcess{

	@Override
	public void writeContext(String context) {
		System.out.println("writeContext(): "+context);
	}

	@Override
	public void fillEnvelope(String address) {
		System.out.println("fillEnvelope(): "+address);
	}

	@Override
	public void letterIntoEnvelope() {
		System.out.println("letterIntoEnvelope()");
	}

	@Override
	public void sendLetter() {
		System.out.println("sendLetter()");
	}

}
