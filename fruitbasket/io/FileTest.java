package fruitbasket.io;

import java.io.File;

public class FileTest {
private static final FileTest instance=new FileTest();
	
	private FileTest(){}
	
	public FileTest getInstance(){
		return instance;
	}
	
	/**
	 * ���Ե��ļ��д���ʱ��mkdirs()�ķ���ֵ
	 * ���������
	 * ���ļ����Ѿ�����ʱ����kdirs()�ķ���ֵΪtrue
	 */
	public static void createFileTest(){
		String fileName="folder_for_test";
		boolean state=(new File(fileName)).mkdirs();
		System.out.println("state="+state);
	}
}
