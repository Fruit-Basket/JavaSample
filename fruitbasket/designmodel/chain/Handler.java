package fruitbasket.designmodel.chain;

public abstract class Handler {
	public final static int FATHER_LEVEL_REQUEST=1;
	public final static int HUSBAND_LEVEL_REQUEST=2;
	public final static int SON_LEVEL_REQUEST=3;
	
	//能处理的级别
	private int level=0;
	
	//责任传递，下一个人责任人是谁
	private Handler nextHandler;
	
	/**
	 * 每个类都要说明一下自己能处理哪些请求
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
				System.out.println("---没有地方请示了，按不同意处理---");
			}
		}
	}
	
	protected abstract void response(IWomen women);
}
