package fruitbasket.designmodel.composite;

import java.util.ArrayList;

public class Client {
	
	/**
	 * ���԰�ȫ���ģʽ
	 */
	public static void test1(){
		Branch root=new Branch("ˮ����","�ϰ�",100);
		
		Branch developDep=new Branch("����","�鳤",90);
		Branch salesDep=new Branch("����ʦ","�鳤",90);
		
		Leaf a=new Leaf("����С��1","������Ա",50);
		Leaf b=new Leaf("����С��2","������Ա",50);
		Leaf c=new Leaf("����С��1","������Ա",50);
		Leaf d=new Leaf("����С��2","������Ա",50);
		
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
		
		//�˴���û�б��������
		
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
