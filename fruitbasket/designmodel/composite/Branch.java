package fruitbasket.designmodel.composite;

import java.util.ArrayList;

public class Branch extends Corp {

	ArrayList<Corp> subordinateList=new ArrayList<Corp>();
	
	public Branch(String name, String position, int salary) {
		super(name, position, salary);
		
	}

	public void addSubordinate(Corp corp){
		subordinateList.add(corp);
	}
	
	public ArrayList<Corp> getSubordinate(){
		return subordinateList;
	}
}
