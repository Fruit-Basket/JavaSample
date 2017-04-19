package fruitbasket.designmodel.chain;

import java.util.ArrayList;
import java.util.Random;

public class Client {
	public static void test(){
		Random rand=new Random();
		ArrayList<IWomen> arrayList=new ArrayList();
		for(int i=0;i<5;i++){
			arrayList.add(new Women(rand.nextInt(4),"��Ҫ��ȥ���"));
		}
		//����������ʾ����
		Handler father=new Father();
		Handler husband=new Husband();
		Handler son=new Son();
		
		//������ʾ˳��
		father.setNext(husband);
		husband.setNext(son);
		for(IWomen women:arrayList){
			father.handleMessage(women);
		}
	}

}
