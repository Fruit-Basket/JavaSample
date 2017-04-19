package fruitbasket.designmodel.decorator;

public class Client {

	public static void test(){
		SchoolReport schoolReport;
		schoolReport=new FouthGradeSchoolReport();
		schoolReport=new HighScoreDecorator(schoolReport);
		schoolReport=new SortDecorator(schoolReport);
		
		schoolReport.report();
		schoolReport.sign("ÀÏÈý");
	}
}
