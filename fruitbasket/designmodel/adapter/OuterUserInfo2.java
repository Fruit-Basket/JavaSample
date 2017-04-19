package fruitbasket.designmodel.adapter;

import java.util.Map;

/**
 * 适配器
 * 使用类关联的方式实现适配
 * @author FruitBasket
 *
 */
public class OuterUserInfo2 implements IUserInfo {
	
	//源目标对象
	private IOuterUserBaseInfo baseInfo;
	private IOuterUserHomeInfo homeInfo;
	private IOuterUserOfficeInfo officeInfo;
	
	//数据处理
	private Map baseMap;
	private Map homeMap;
	private Map officeMap;
	
	/**
	 * 构造方法
	 * 使用源目标对象构造
	 * @param baseInfo
	 * @param homeInfo
	 * @param officeInfo
	 */
	public OuterUserInfo2(IOuterUserBaseInfo baseInfo,IOuterUserHomeInfo homeInfo,IOuterUserOfficeInfo officeInfo){
		this.baseInfo=baseInfo;
		this.homeInfo=homeInfo;
		this.officeInfo=officeInfo;
		
		//数据处理
		baseMap=this.baseInfo.getUserBaseInfo();
		homeMap=this.homeInfo.getUserHomeInfo();
		officeMap=this.officeInfo.getUserOfficeInfo();
	}

	@Override
	public String getUserName() {
		String userName=(String)this.baseMap.get("userName");
		System.out.println(userName);
		return userName;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress=(String)this.homeMap.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMobileNumber() {
		String mobileNumber=(String)this.baseMap.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber=(String)this.officeMap.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}

	@Override
	public String getJobPosition() {
		String jobPosition=(String)this.officeMap.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}

	@Override
	public String getHomeTelNumber() {
		String homeTelNumber=(String)this.homeMap.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}
}
