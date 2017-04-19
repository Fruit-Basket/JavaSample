package fruitbasket.designmodel.builderpattern;

import java.util.ArrayList;

public abstract class CarModel {
	
	private ArrayList<String> sequence=new ArrayList<String>();
	
	final public void setSequence(ArrayList<String> sequence){
		this.sequence=sequence;
	}
	
	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();
	
	final public void run(){
		String actionName;
		//循环一遍，谁在前，就执行谁
		for(int i=0;i<this.sequence.size();i++){
			actionName=this.sequence.get(i);
			if(actionName.equalsIgnoreCase("start")){
				this.start();
			}
			else if(actionName.equalsIgnoreCase("stop")){
				this.stop();
			}
			else if(actionName.equalsIgnoreCase("alarm")){
				this.alarm();
			}
			else if(actionName.equalsIgnoreCase("engine boom")){
				this.engineBoom();
			}
		}
	}

}
