package fruitbasket.designmodel.decorator;

public class HighScoreDecorator extends Decorator {

	public HighScoreDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	
	private void reportHighScore(){
		System.out.println("这次考试语文最高是75，数学是78，自然是80");
	}
	
	@Override
	public void report(){
		//重写父类的方法，在父类方法的基础上增加功能reportHighScore
		this.reportHighScore();
		super.report();
	}
	

}
