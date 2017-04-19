package fruitbasket.designmodel.templatemethod;

public abstract class HummerModel {

	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	protected abstract void engineBoom();
	
	/**
	 * 钩子方法：方法的返回值会影响模板方法的执行结果
	 * 默认喇叭是会响的
	 * @return
	 */
	protected boolean isAlarm(){
		return true;
	}
	
	/**
	 * 模板方法：实现对基本方法的调度，完成固定的逻辑
	 */
	final public void run(){
		this.start();
		this.engineBoom();
		if(this.isAlarm()){
			this.alarm();
		}
		this.stop();
	}
}
