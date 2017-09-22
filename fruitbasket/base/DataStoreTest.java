package fruitbasket.base;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * data store
 * @author Study
 *
 */
public class DataStoreTest {

	private static final DataStoreTest instance=new DataStoreTest();
	
	private DataStoreTest(){}
	
	public DataStoreTest getInstance(){
		return instance;
	}
	
	/**
	 * 测试Java是低位存储还是高位存储
	 */
	public static void testJavaStoreOrder(){
		System.out.println("Store.testJavaStoreOrder()");
		String dataFileName="testJavaStoreOrder.test";
		short data1=0x7654,data2=0x3210,data3=0x0000;
		
		System.out.print("begin to save data :");
		System.out.println(" 0x"+Integer.toHexString(data1&0xFFFF)+"  0x"+Integer.toHexString(data2&0xFFFF)+"  0x"+Integer.toHexString(data3&0xFFFF));
		try {
			FileOutputStream fos=new FileOutputStream(dataFileName);
			DataOutputStream output=new DataOutputStream(fos);
			
			output.writeShort(data1);
			output.writeShort(data2);
			output.writeShort(data3);
			
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("data saved");
		
		System.out.println("begin to read data");
		try{
			FileInputStream fis=new FileInputStream(dataFileName);
			
			byte readByte;
			System.out.print("read in bytes: ");
			while((readByte=(byte)fis.read())>-1){//FileInputStream.read()方法只会从流中读取一个字节
				System.out.print("0x"+Integer.toHexString(readByte&0xFF)+"  ");
			}
			System.out.println();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try{
			FileInputStream fis=new FileInputStream(dataFileName);
			DataInputStream input=new DataInputStream(fis);
			short readShort;
			System.out.print("read in shorts: ");
			while(input.available()>0){
				readShort=input.readShort();
				System.out.print("0x"+Integer.toHexString(readShort&0xFFFF)+"  ");
			}
			System.out.println();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end read data");
	}
	
}
