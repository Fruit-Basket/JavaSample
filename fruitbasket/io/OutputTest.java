package fruitbasket.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OutputTest {
	
	private static final OutputTest instance=new OutputTest();
	private OutputTest(){}
	
	public OutputTest getInstance(){
		return instance;
	}

	/**
	 * ����ĳ������Ƿ�ᴴ���ļ�
	 * ����������ᴴ���ļ�
	 */
	public static void test1(){
		File file=new File("test.txt");
		
		if(file.exists()==true){
			System.out.println("TAG1: file.exists()==true");
		}
		else{
			System.out.println("TAG1: file.exists()==false");
		}
		
		//�����������Ƿ�ᴴ���ļ�
		//�����������ᴴ���ļ�
		try {
			DataOutputStream outputStream=new DataOutputStream(
			        new BufferedOutputStream(
			                new FileOutputStream(file,true)
			        )
			);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		if(file.exists()==true){
			System.out.println("TAG2: file.exists()==true");
		}
		else{
			System.out.println("TAG2: file.exists()==false");
		}
		
		System.out.println("file.length()=="+file.length());
	}
}
