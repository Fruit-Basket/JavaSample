package fruitbasket.designmodel.adapter;

public class Client {
	
	public static void test(){
		IUserInfo users=new UserInfo();
		//IUserInfo users=new OuterUserInfo();
		
		for(int i=0;i<101;i++){
			users.getMobileNumber();
		}	
	}
	
	public static void test2(){
		IOuterUserBaseInfo baseInfo=new OuterUserBaseInfo();
		IOuterUserHomeInfo homeInfo=new OuterUserHomeInfo();
		IOuterUserOfficeInfo officeInfo=new OuterUserOfficeInfo();
		
		IUserInfo users=new OuterUserInfo2(baseInfo,homeInfo,officeInfo);
		for(int i=0;i<101;i++){
			users.getMobileNumber();
		}
	}
}
