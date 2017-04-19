package fruitbasket.designmodel.afm;

public class NvWa {

	private static final NvWa instance=new NvWa();
	private void NvWa(){}
	
	public static NvWa getInstance(){
		return instance;
	}
	
	public void test(){
		HumanFactory maleHumanFactory=new MaleFactory();
		HumanFactory famaleHumanFactory=new FemaleFactory();
		
		Human maleYellowHuman=maleHumanFactory.createYellowHuman();
		
		maleYellowHuman.getSex();
	}
}
