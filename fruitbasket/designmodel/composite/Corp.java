package fruitbasket.designmodel.composite;

public abstract class Corp {
	
	private String name="";
	private String position="";
	private int salary=0;
	
	public Corp(String name,String position, int salary){
		this.name=name;
		this.position=position;
		this.salary=salary;
	}
	
	public String getInfo(){
		String info="";
		info="������ "+this.name;
		info=info+"\tְλ�� "+this.position;
		info=info+"\tнˮ�� "+this.salary;
		return info;
	}

}
