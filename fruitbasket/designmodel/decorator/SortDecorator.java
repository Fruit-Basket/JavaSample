package fruitbasket.designmodel.decorator;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	
	private void reportSort(){
		System.out.println("我的排名是38名");
	}
	
	@Override
	public void report(){
		super.report();
		reportSort();
	}

}
