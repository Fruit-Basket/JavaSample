package fruitbasket.designmodel.templatemethod;

public abstract class HummerModel {

	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	protected abstract void engineBoom();
	
	/**
	 * ���ӷ����������ķ���ֵ��Ӱ��ģ�巽����ִ�н��
	 * Ĭ�������ǻ����
	 * @return
	 */
	protected boolean isAlarm(){
		return true;
	}
	
	/**
	 * ģ�巽����ʵ�ֶԻ��������ĵ��ȣ���ɹ̶����߼�
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
