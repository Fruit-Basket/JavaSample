package fruitbasket.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 * ��Ϣ�ں��㷨�Ĳ���
 * @author FruitBasket
 *
 */
public class InformationMergeTest {
	private static final InformationMergeTest instance=new InformationMergeTest();
	
	private InformationMergeTest(){}
	
	public InformationMergeTest getInstance(){
		return instance;
	}
	
	/**
     *����Ϣ�ں���һ��
     *
     *Ϊ�˱��ڴ�����Ϣ���ַ�����ʾ�����ַ��������������ʾ��ʹ���ַ���ASC||���ʾһ���ַ���
     *���磬��apple����ʹ��{97,112,112,108,101}��ʾ; ��012345����ʹ��{48,49,50,51,52,53}��ʾ
     *
     * @param xArray ������Ϣ������
     * @param yArray ������Ϣ������
     * @return ����һ�����飬���������ں���һ�����Ϣ
     */
    public static int[] merge(int[] xArray,int[] yArray){
    	//Log.i(TAG,"merge() : before merge : "+stringOfIndexs(xArray)+" ; "+stringOfIndexs(yArray)+" ;");
        //��������Ĵ���
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
        //2.�������������ͬ
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
        int xPt,yPt;//xArray��yArray��ָ��
        int xSameCounter,ySameCounter;//��¼����������������ͬԪ�صĸ���
        int maxSameCounter;//��¼xSameCounter��ySameCounter�Ľϴ���;
        boolean isHasSame=false;//��¼xArray�е�ָ��Ԫ���Ƿ���yArray�е�ָ��Ԫ����ͬ

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
                        resultArray.add(xArray[xPt]);///����������������
                        --maxSameCounter;
                    }
                    xPt+=(xSameCounter-1);
                    yPt+=(ySameCounter-1);

                    if(xPt==0&&yPt==1){//����ڿ�ͷ������Ϣ���Ժϲ�
                        resultArray.add(yArray[0]);
                        resultArray.add(xArray[xPt]);
                    }
                    else if(xPt==xArray.length-1
                            &&yPt==yArray.length-2){//����ڽ���������Ϣ���Ժϲ�
                        resultArray.add(xArray[xPt]);
                        resultArray.add(yArray[yPt+1]);
                    }
                    else if(yPt+2<yArray.length
                            &&xArray[xPt+1]==yArray[yPt+2]
                            &&yArray[yPt+1]!=yArray[yPt+2]){//������м䴦����Ϣ���Ժϲ�
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
        ///����ArrayList��int�����ת���������ת����ʽ�д��Ľ�
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
     * �����д��Ľ�
     * @param xArray
     * @param yArray
     * @return
     */
    public static int[] merge2(int[] xArray,int[] yArray){///private
    	//��������Ĵ���
        //1.�ڲ������鳤��С��2ʱ���޷�������Ϣ�ĺϲ�
        if(yArray.length<2){
            return xArray;
        }
        else if(xArray.length<2){
            return yArray;
        }
        //2.�������������ͬ
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
            				&&yPt==ySameCounter){//����ڿ�ͷ������Ϣ���Ժϲ�
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
            				&&xArray[xPt+1]==yArray[yPt+ySameCounter+1]){//������м䴦����Ϣ���Ժϲ�
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
     * �����д��Ľ�
     * @param xArray
     * @param yArray
     * @return
     */
    public static int[] merge3(int[] xArray,int[] yArray){
    	//��������Ĵ���
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
    	
    	//��������������
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
     * ����int�����ʾ����Ϣת��Ϊ���ַ�����ʾ
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
