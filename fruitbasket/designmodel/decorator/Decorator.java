package fruitbasket.designmodel.decorator;

/**
 * ³éÏó×°ÊÎÕß
 * @author FruitBasket
 *
 */
public abstract class Decorator extends SchoolReport {
	
	private SchoolReport schoolReport;
	
	public Decorator(SchoolReport schoolReport){
		this.schoolReport=schoolReport;
	}

	@Override
	public void report() {
		schoolReport.report();
	}

	@Override
	public void sign(String name) {
		schoolReport.sign(name);
	}

}
