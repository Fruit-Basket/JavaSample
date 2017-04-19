package fruitbasket.designmodel.factorymethod;

public class NvWa {

	private static final NvWa instance=new NvWa();
	private void NvWa(){}
	
	public static NvWa getInstance(){
		return instance;
	}
	
	public void test(){
		//ÉùÃ÷ÒõÑô°ËØÔÂ¯
		AbstractHumanFactory yinYangLu=new HumanFactory();
		
		Human yellowHuman=yinYangLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
