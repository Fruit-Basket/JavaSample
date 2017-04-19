package fruitbasket.designmodel.decorator;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	
	private void reportSort(){
		System.out.println("�ҵ�������38��");
	}
	
	@Override
	public void report(){
		super.report();
		reportSort();
	}

}
