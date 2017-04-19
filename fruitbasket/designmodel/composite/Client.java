package fruitbasket.designmodel.composite;

import java.util.ArrayList;

public class Client {
	
	/**
	 * 测试安全组合模式
	 */
	public static void test1(){
		Branch root=new Branch("水果篮","老板",100);
		
		Branch developDep=new Branch("马大哥","组长",90);
		Branch salesDep=new Branch("昌老师","组长",90);
		
		Leaf a=new Leaf("开发小弟1","开发人员",50);
		Leaf b=new Leaf("开发小弟2","开发人员",50);
		Leaf c=new Leaf("销售小弟1","销售人员",50);
		Leaf d=new Leaf("销售小弟2","销售人员",50);
		
		root.addSubordinate(developDep);
		root.addSubordinate(salesDep);
		
		developDep.addSubordinate(a);
		developDep.addSubordinate(b);
		salesDep.addSubordinate(c);
		salesDep.addSubordinate(d);
		
		System.out.println(getTreeInfo(root));
	}
	
	
	private static String getTreeInfo(Branch root){
		ArrayList<Corp> subordinateList=root.getSubordinate();
		String info="";
		
		//此处并没有遍历跟结点
		
		for(Corp s:subordinateList){
			if(s instanceof Leaf){
				info=info+s.getInfo()+"\n";
			}
			else{
				info=info+s.getInfo()+"\n"+getTreeInfo((Branch)s);
			}
		}
		return info;
	}
}
