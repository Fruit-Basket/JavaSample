package fruitbasket.designmodel.chain;

public abstract class Handler {
	public final static int FATHER_LEVEL_REQUEST=1;
	public final static int HUSBAND_LEVEL_REQUEST=2;
	public final static int SON_LEVEL_REQUEST=3;
	
	//�ܴ���ļ���
	private int level=0;
	
	//���δ��ݣ���һ������������˭
	private Handler nextHandler;
	
	/**
	 * ÿ���඼Ҫ˵��һ���Լ��ܴ�����Щ����
	 * @param level
	 */
	public Handler(int level){
		this.level=level;
	}
	
	public void setNext(Handler handler){
		this.nextHandler=handler;
	}
	
	public final void handleMessage(IWomen women){
		if(women.getType()==this.level){
			this.response(women);
		}
		else{
			if(nextHandler!=null){
				nextHandler.handleMessage(women);
			}
			else{
				System.out.println("---û�еط���ʾ�ˣ�����ͬ�⴦��---");
			}
		}
	}
	
	protected abstract void response(IWomen women);
}
