package fruitbasket.designmodel.decorator;

public class HighScoreDecorator extends Decorator {

	public HighScoreDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	
	private void reportHighScore(){
		System.out.println("��ο������������75����ѧ��78����Ȼ��80");
	}
	
	@Override
	public void report(){
		//��д����ķ������ڸ��෽���Ļ��������ӹ���reportHighScore
		this.reportHighScore();
		super.report();
	}
	

}
