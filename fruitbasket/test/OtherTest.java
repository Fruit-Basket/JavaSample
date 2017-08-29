package fruitbasket.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class OtherTest {

	private static final OtherTest instance=new OtherTest();
	
	private OtherTest(){}
	
	public static OtherTest getInstance(){
		return instance;
	}
	
	/**
	 * 测试给函数的形式参数赋予一个新的对象，是否会影响实参
	 * 结果表明：不会
	 */
	public static void testObject(){
		OtherTest.TestObject o=new OtherTest.TestObject(1);
		changeObject(o);
		System.out.println(o.getValue());//输出1
	}
	
	/**
	 * 辅助测试
	 * @param o
	 */
	private static void changeObject(OtherTest.TestObject o){
		o=new OtherTest.TestObject(2);
	}
	
	/**
	 * 辅助测试
	 * @author FruitBasket
	 *
	 */
    private static  class TestObject{
		
		private int value;
		
		public TestObject(int value){
			this.value=value;
		}
		
		public int getValue(){
			return value;
		}
	}
	
	
	/**
	 * 测试创建空对象数组、普通类型数组
	 */
	public static void testObjectArray(){
		Object[] array=new Object[]{};
		int[] intArra=new int[]{};
		System.out.println("length=="+array.length);
	}
	
	/**
	 * 测试double到short的转换
	 * 结果证明，可以直接转换
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
	 * 一种测试方式：测试一个数是否为2的次方
	 * 这种方法是正确的
	 * 原理在于，2次方值的负值的补码，与该2次方值，在表示数的那些位上，是相等的
	 * 例如：
	 * 8=0000 1000
	 * -8[补]=1111 1000
	 * =>8 & -8[补] = 8
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
		//创建有两个元素的对象数组
		Class[] test=new Class[] {OtherTest.class,OtherTest.class};
	}
	
	/**
	 * 信息融合算法的测试
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
		
		//连续重复元素测试
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
		
		//非连续重复测试
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
		
		//连续与非连续重复测试
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
		
		//随机测试
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
	 * 计算得一段sin波
     */
	public static void sinWave(){
		final int waveRate=13000;//波的频率
		final int sampleRate=44100;//发声设备的实际发声频率
		final int sampleCount=42462;//生成的波的样本数量
		
		double sampleCountInWave=sampleRate /(double)waveRate;//每一个Sin波中，包含的样本点数量
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
	 *调整bufferSize
	 *使得这个bufferSize大小刚好装下完整的若干个Sin波
	 * @param waveRate 波的频率
	 * @param sampleRate 发声设备的实际发声频率
    */
	public static int adjustBufferSize(int waveRate,int sampleRate,int bufferSize){
		double sampleCountInWave=sampleRate /(double)waveRate;//每一个Sin波中，包含的样本点数量
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
	
	
	
	
	/**
	 * 信息融合算法的测试
	 * @author FruitBasket
	 *
	 */
	private static class InformationMergeTest {
		private static final InformationMergeTest instance=new InformationMergeTest();
		
		private InformationMergeTest(){}
		
		public InformationMergeTest getInstance(){
			return instance;
		}
		
		/**
	     *将信息融合在一起。
	     *
	     *为了便于处理，信息以字符串表示，而字符串以整形数组表示：使用字符的ASC||码表示一个字符。
	     *例如，”apple“可使用{97,112,112,108,101}表示; ”012345“可使用{48,49,50,51,52,53}表示
	     *
	     * @param xArray 包含信息的数组
	     * @param yArray 包含信息的数组
	     * @return 返回一个数组，它包含了融合在一起的信息
	     */
	    public static int[] merge(int[] xArray,int[] yArray){
	    	//Log.i(TAG,"merge() : before merge : "+stringOfIndexs(xArray)+" ; "+stringOfIndexs(yArray)+" ;");
	        //特殊情况的处理
	        //1
	        if(xArray==null){
	            //Log.i(TAG,"merge() : after merge : "+stringOfIndexs(yArray)+" ;");
	            return yArray;
	        }
	        else if(yArray==null){
	            //Log.i(TAG,"merge() : after merge : "+stringOfIndexs(xArray)+" ;");
	            return xArray;
	        }
	        else if(yArray.length<2){
	            //Log.i(TAG,"merge() : after merge : "+stringOfIndexs(xArray)+" ;");
	            return xArray;
	        }
	        else if(xArray.length<2){
	            //Log.i(TAG,"merge() : after merge : "+stringOfIndexs(yArray)+" ;");
	            return yArray;
	        }
	        //2.如果两个参数相同
	        if(xArray.length==yArray.length){
	            int i;
	            for(i=0;i<xArray.length;++i){
	                if(xArray[i]!=yArray[i]){
	                    break;
	                }
	            }
	            if(i>=xArray.length){
	                int[] resultArray=new int[xArray.length];
	                System.arraycopy(xArray, 0, resultArray, 0, resultArray.length);
	                return resultArray;
	            }
	        }

	        ArrayList<Integer> resultArray=new ArrayList<>();
	        int xPt,yPt;//xArray和yArray的指针
	        int xSameCounter,ySameCounter;//记录数组中连续连续相同元素的个数
	        int maxSameCounter;//记录xSameCounter和ySameCounter的较大者;
	        boolean isHasSame=false;//记录xArray中的指定元素是否与yArray中的指定元素相同

	        for(xPt=0;xPt<xArray.length;++xPt){
	            isHasSame=false;
	            for(yPt=0;yPt<yArray.length;++yPt){
	                if(xArray[xPt]==yArray[yPt]){
	                    xSameCounter=1;
	                    ySameCounter=1;
	                    while(xPt+xSameCounter<xArray.length
	                            &&xArray[xPt]==xArray[xPt+xSameCounter]){
	                        xSameCounter++;
	                    }
	                    while(yPt+ySameCounter<yArray.length
	                            &&yArray[yPt]==yArray[yPt+ySameCounter]){
	                        ySameCounter++;
	                    }
	                    maxSameCounter=Math.max(xSameCounter, ySameCounter);
	                    while(maxSameCounter>1){
	                        resultArray.add(xArray[xPt]);///这里会遇到特殊情况
	                        --maxSameCounter;
	                    }
	                    xPt+=(xSameCounter-1);
	                    yPt+=(ySameCounter-1);

	                    if(xPt==0&&yPt==1){//如果在开头处有信息可以合并
	                        resultArray.add(yArray[0]);
	                        resultArray.add(xArray[xPt]);
	                    }
	                    else if(xPt==xArray.length-1
	                            &&yPt==yArray.length-2){//如果在结束处有信息可以合并
	                        resultArray.add(xArray[xPt]);
	                        resultArray.add(yArray[yPt+1]);
	                    }
	                    else if(yPt+2<yArray.length
	                            &&xArray[xPt+1]==yArray[yPt+2]
	                            &&yArray[yPt+1]!=yArray[yPt+2]){//如果在中间处有信息可以合并
	                        resultArray.add(xArray[xPt]);
	                        resultArray.add(yArray[yPt+1]);
	                    }
	                    else{
	                        if(isHasSame==false){
	                            resultArray.add(xArray[xPt]);
	                        }
	                    }
	                    isHasSame=true;
	                }

	                if(yPt>=yArray.length-1&&isHasSame==false){
	                    resultArray.add(xArray[xPt]);
	                }
	            }
	        }
	        ///进行ArrayList到int数组的转换。这里的转换方式有待改进
	        int[] array=new int[resultArray.size()];
	        ListIterator<Integer> listIterator=resultArray.listIterator();
	        int i=0;
	        while(listIterator.hasNext()){
	            array[i++]=(Integer)listIterator.next();
	        }
	        //Log.i(TAG,"merge() : after merge : "+stringOfIndexs(array)+" ;");
	        return array;
	    }
	    
	    /**
	     * 方法有待改进
	     * @param xArray
	     * @param yArray
	     * @return
	     */
	    public static int[] merge2(int[] xArray,int[] yArray){///private
	    	//特殊情况的处理
	        //1.在参数数组长度小于2时，无法进行信息的合并
	        if(yArray.length<2){
	            return xArray;
	        }
	        else if(xArray.length<2){
	            return yArray;
	        }
	        //2.如果两个参数相同
	        if(xArray.length==yArray.length){
	        	int i;
	        	for(i=0;i<xArray.length;++i){
	        		if(xArray[i]!=yArray[i]){ 
	        			break;
	        		}
	        	}
	        	if(i>=xArray.length){
	        		int[] resultArray=new int[xArray.length];
	        		System.arraycopy(xArray, 0, resultArray, 0, resultArray.length);
	        		return resultArray;
	        	}
	        }
	        
	        ArrayList<Integer> resultArray=new ArrayList<>();
	        int xPt,xSameCounter;
	        int yPt,ySameCounter;
	        int maxSameCounter,temCounter;
	        boolean isHasSame;
	        
	        for(xPt=0;xPt<xArray.length;xPt+=xSameCounter){
	        	xSameCounter=0;
	        	while(xPt+xSameCounter<xArray.length
	        			&&xArray[xPt]==xArray[xPt+xSameCounter]){
	        		xSameCounter++;
	        	}
	        	
	        	isHasSame=false;
	            for(yPt=0;yPt<yArray.length;yPt+=ySameCounter){
	            	ySameCounter=0;
	            	while(yPt+ySameCounter<yArray.length
	            			&&yArray[yPt]==yArray[yPt+ySameCounter]){
	            		ySameCounter++;
	            	}
	            	
	            	if(xArray[xPt]==yArray[yPt]){
	            		isHasSame=true;
	            		
	            		if(xPt==0
	            				&&yPt==ySameCounter){//如果在开头处有信息可以合并
	            			temCounter=ySameCounter;
	            			while(temCounter>0){
	            				resultArray.add(yArray[0]);
	            				--temCounter;
	            			}
	            			temCounter=xSameCounter;
	            			while(temCounter>0){
	            				resultArray.add(xArray[0]);
	            				--temCounter;
	            			}
	            		}
	            		else if(xPt+xSameCounter==xArray.length-1){///
	            			///
	            		}
	            		else if(yPt+ySameCounter+1<yArray.length
	            				&&xArray[xPt+1]==yArray[yPt+ySameCounter+1]){//如果在中间处有信息可以合并
	            			resultArray.add(xArray[xPt]);
	            			///
	            		}
	            		else{
	            			
	            		}
	            		
	            	}
	            	
	            	if(yPt+ySameCounter>=yArray.length&&isHasSame==false){
	            		temCounter=xSameCounter;
	            		while(temCounter>0){
	            			resultArray.add(xArray[xPt]);
	            			--temCounter;
	            		}
	            	}
	            }
	        }
	        return null;
	    }
	    
	    /**
	     * 方法有待改进
	     * @param xArray
	     * @param yArray
	     * @return
	     */
	    public static int[] merge3(int[] xArray,int[] yArray){
	    	//特殊情况的处理
	        if(xArray==null){
	            return yArray;
	        }
	        else if(yArray==null){
	            return xArray;
	        }
	        else if(yArray.length<2){
	            return xArray;
	        }
	        else if(xArray.length<2){
	            return yArray;
	        }
	        
	        //init
	    	int[][] mp=new int[xArray.length+1][yArray.length+1];
	    	boolean []xFlag=new boolean[xArray.length+1];
	    	boolean []yFlag=new boolean[yArray.length+1];
	    	for(int i=0;i<xArray.length;i++){
	    		mp[i][0]=0;
	    		xFlag[i]=false;
	    	}
	    	for(int i=0;i<yArray.length;i++){
	    		mp[0][i]=0;
	    		yFlag[i]=false;
	    	}
	    	
	    	//LCS
	    	for(int i=1;i<=xArray.length;i++){
	    		for(int j=1;j<=yArray.length;j++){
	    			if(xArray[i-1]==yArray[j-1]){
	    				mp[i][j]=mp[i-1][j-1]+1;
	    			}else{
	    				mp[i][j]=Math.max(mp[i][j-1],mp[i-1][j]);
	    			}
	    		}
	    	}
	    	
	    	//标记最长公共子序列
	    	int xIndex=xArray.length;
	    	int yIndex=yArray.length;
	    	while(xIndex>0 && yIndex>0){
	    		if(mp[xIndex][yIndex]==mp[xIndex][yIndex-1]){
					yIndex--;
				}else if(mp[xIndex][yIndex]==mp[xIndex][yIndex-1]){
					yIndex--;
				}else if(mp[xIndex][yIndex]==mp[xIndex-1][yIndex-1]+1){
					xFlag[xIndex-1]=true;
					yFlag[yIndex-1]=true;
					xIndex--;	yIndex--;
				}
	    	}
	    	
	    	//merge
	    	xIndex=0;
	    	yIndex=0;
	    	int[] ans=new int[xArray.length+yArray.length];
	    	int ansIndex=0;
	    	while(xIndex<xArray.length && yIndex<yArray.length){
	    		if(xFlag[xIndex] && yFlag[yIndex]){
	    			ans[ansIndex++]=xArray[xIndex];
	    			xIndex++;	yIndex++;
	    		}else if(xFlag[xIndex]){
	    			ans[ansIndex++]=yArray[yIndex++];
	    		}else{
	    			ans[ansIndex++]=xArray[xIndex++];
	    		}
	    	}
	    	while(xIndex<xArray.length){
	    		ans[ansIndex++]=xArray[xIndex++];
	    	}
	    	while(yIndex<yArray.length){
	    		ans[ansIndex++]=yArray[yIndex++];
	    	}
	    	ans=Arrays.copyOf(ans, ansIndex);
			return ans;
		}

	    /**
	     * 将以int数组表示的信息转换为以字符串表示
	     * @param indexs
	     * @return
	     */
	    public static String stringOfIndexs(int[] indexs){
	    	final String charBook=" !\"#$%&'()*+'-./0123456789:j<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007F";
	    	StringBuilder tem=new StringBuilder(indexs.length);
	    	for(int index:indexs){
	    		tem.append(charBook.charAt(index-' '));
	    	}
	    	return tem.toString();
	    }
	}
}
