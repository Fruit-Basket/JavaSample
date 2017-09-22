package fruitbasket.io;

import java.io.File;

public class FileTest {
private static final FileTest instance=new FileTest();
	
	private FileTest(){}
	
	public FileTest getInstance(){
		return instance;
	}
	
	/**
	 * 测试当文件夹存在时，mkdirs()的返回值
	 * 结果表明：
	 * 当文件夹已经存在时，ｍkdirs()的返回值为true
	 */
	public static void createFileTest(){
		String fileName="folder_for_test";
		boolean state=(new File(fileName)).mkdirs();
		System.out.println("state="+state);
	}
}
