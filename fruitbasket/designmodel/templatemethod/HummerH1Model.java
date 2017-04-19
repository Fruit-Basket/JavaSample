package fruitbasket.designmodel.templatemethod;

public class HummerH1Model extends HummerModel {

	private boolean alarmFlag=true;//Ä¬ÈÏÒªÏìÀ®°È
	
	@Override
	protected void start() {
		System.out.println("H1 : start()");
	}

	@Override
	protected void stop() {
		System.out.println("H1 : stop()");
	}

	@Override
	protected void alarm() {
		System.out.println("H1 : alarm()");
	}

	@Override
	protected void engineBoom() {
		System.out.println("H1 : engineBoom()");
	}
	
	@Override
	protected boolean isAlarm(){
		return this.alarmFlag;
	}
	
	public void setAlarm(boolean isAlarm){
		this.alarmFlag=isAlarm;
	}

}
