package fruitbasket.test;

public class OtherTest {

	private static final OtherTest instance=new OtherTest();
	
	private OtherTest(){}
	
	public OtherTest getInstance(){
		return instance;
	}
	
	/**
	 * ����double��short��ת�������֤��������ֱ��ת��
	 */
	public static void testDoubleToShort(){
		//double doubleValue=123456789101112131415161718192022122232425262728293031323334353637383940d;
		double doubleValue=32767d;
		long longValue1=Math.round(doubleValue);
		long longValue2=(long)doubleValue;
		
		short shortValue1=(short)longValue1; 
		short shortValue2=(short)doubleValue;
		
		System.out.println("doubleValue=="+doubleValue);
		System.out.println("longValue1=="+longValue1);
		System.out.println("longValue2=="+longValue2);
		System.out.println();
		
		System.out.println("shortValue1=="+shortValue1);
		System.out.println("shortValue2=="+shortValue2);
	}
	
	/**
	 * һ�ֲ��Է�ʽ������һ�����Ƿ�Ϊ2�Ĵη�
	 * ���ַ�������ȷ��
	 * ԭ�����ڣ�2�η�ֵ�ĸ�ֵ�Ĳ��룬���2�η�ֵ���ڱ�ʾ������Щλ�ϣ�����ȵ�
	 * ���磺
	 * 8=0000 1000
	 * -8[��]=1111 1000
	 * =>8 & -8[��] = 8
	 */
	public static void testIsPowOfTwo(){
		int value1=8;
		int value2=7;
		
		System.out.println("-value1=="+-value1);
		System.out.println("(-value1)&value1=="+((-value1)&value1));
		
		System.out.println("-value2=="+-value2);
		System.out.println("(-value2)&value2=="+((-value2)&value2));
		
		if(((-value1)&value1)==value1){
			System.out.println(value1+" is  pow of 2");
		}
		else{
			System.out.println(value1+" is not pow of 2");
		}
		
		if(((-value2)&value2)==value2){
			System.out.println(value2+" is  pow of 2");
		}
		else{
			System.out.println(value2+" is not pow of 2");
		}
	}
	
	public static void syntaxTest1(){
		//����������Ԫ�صĶ�������
		Class[] test=new Class[] {OtherTest.class,OtherTest.class};
	}
	
	/**
	 * ��Ϣ�ں��㷨�Ĳ���
	 */
	public static void test2(){
		System.out.println("TEST 1:");
		int[] xArray1={65,66,67,68,69};
		int[] yArray1={70,71,72,73,74};
		int[] result1=InformationMergeTest.merge3(xArray1, yArray1);
		
		System.out.print("result1==");
		for(int e:result1){
			System.out.print(e+"  ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("TEST 2:");
		int[] xArray2={66,67,68,69};
		int[] yArray2={65,66,67,68,69,70};
		int[] result2=InformationMergeTest.merge3(xArray2, yArray2);
		
		System.out.print("result2==");
		for(int e:result2){
			System.out.print(e+"  ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("TEST 3:");
		int[] xArray3={66,68,69};
		int[] yArray3={66,67,68,69};
		int[] result3=InformationMergeTest.merge3(xArray3, yArray3);
		
		System.out.print("result3==");
		for(int e:result3){
			System.out.print(e+"  ");
		}
		System.out.println();
		System.out.println();
		
		//�����ظ�Ԫ�ز���
		System.out.println("TEST 4:");
		int[] xArray4={66,66,67,67,67,69,70,70};
		int[] yArray4={66,66,66,67,67,67,68,69,70,70,70};
		int[] result4=InformationMergeTest.merge3(xArray4, yArray4);
		
		System.out.print("result4==");
		for(int e:result4){
			System.out.print(e+"  ");
		}
		System.out.println();
		System.out.println();
		
		//�������ظ�����
		System.out.println("TEST 5:");
		int[] xArray5={66,67,66,67,68,72};
		int[] yArray5={66,67,66,67,68,72};
		int[] result5=InformationMergeTest.merge3(xArray5, yArray5);
		
		System.out.print("result5==");
		for(int e:result5){
			System.out.print(e+"  ");
		}
		System.out.println();
		System.out.println();
		
		//������������ظ�����
		System.out.println("TEST 6:");
		int[] xArray6={66,67,66,66,67,67,68,72};
		int[] yArray6={66,67,66,66,67,67,68,72,73};
		int[] result6=InformationMergeTest.merge3(xArray6, yArray6);
		
		System.out.print("result6==");
		for(int e:result6){
			System.out.print(e+"  ");
		}
		System.out.println();
		System.out.println();
		
		//�������
		System.out.println("TEST 7:");
		int[] xArray7={};
		int[] yArray7={};
		int[] result7=InformationMergeTest.merge3(xArray7, yArray7);
		
		System.out.print("result7==");
		for(int e:result7){
			System.out.print(e+"  ");
		}
		System.out.println();
		System.out.println();
	}
	
	/**
	 * �����һ��sin��
     */
	public static void sinWave(){
		final int waveRate=13000;//����Ƶ��
		final int sampleRate=44100;//�����豸��ʵ�ʷ���Ƶ��
		final int sampleCount=42462;//���ɵĲ�����������
		
		double sampleCountInWave=sampleRate /(double)waveRate;//ÿһ��Sin���У�����������������
		System.out.println("sampleCountInWave=="+sampleCountInWave);
		short[] wave=new short[adjustBufferSize(waveRate,sampleRate,sampleCount)];
		
		for(int i=0;i<wave.length;++i){
			wave[i]=(short)(Short.MAX_VALUE*Math.sin(2.0 * Math.PI * i / sampleCountInWave));
			switch(i){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 42457:
			case 42458:
			case 42459:
			case 42460:
			case 42461:
				System.out.println("wave["+i+"]=="+wave[i]); 
			}
		}
	}
	
	/**
	 *����bufferSize
	 *ʹ�����bufferSize��С�պ�װ�����������ɸ�Sin��
	 * @param waveRate ����Ƶ��
	 * @param sampleRate �����豸��ʵ�ʷ���Ƶ��
    */
	public static int adjustBufferSize(int waveRate,int sampleRate,int bufferSize){
		double sampleCountInWave=sampleRate /(double)waveRate;//ÿһ��Sin���У�����������������
		System.out.println("bufferSize=="+bufferSize);
		System.out.println("sampleCountlnWave=="+sampleCountInWave);
		System.out.println("-----");
		System.out.println("bufferSzie/sampleCountlnWave=="+bufferSize/sampleCountInWave);
		System.out.println("Math.floor(bufferSize/sampleCountInWave)=="+Math.floor(bufferSize/sampleCountInWave));
		System.out.println("-----");
		System.out.println("(bufferSize-1)/sampleCountInWave=="+(bufferSize-1)/sampleCountInWave);
		System.out.println("Math.floor((bufferSize-1)/sampleCountInWave)=="+Math.floor((bufferSize-1)/sampleCountInWave));
		System.out.println("-----");
		
		while(Math.floor(bufferSize/sampleCountInWave)==Math.floor((bufferSize-1)/sampleCountInWave)){
			bufferSize--;
			System.out.println("bufferSize--");
		}
		System.out.println("bufferSize=="+bufferSize);
		return bufferSize;
	}
}
