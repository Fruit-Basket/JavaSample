package fruitbasket.designmodel.adapter;

import java.util.Map;

/**
 * ������
 * ʹ��������ķ�ʽʵ������
 * @author FruitBasket
 *
 */
public class OuterUserInfo2 implements IUserInfo {
	
	//ԴĿ�����
	private IOuterUserBaseInfo baseInfo;
	private IOuterUserHomeInfo homeInfo;
	private IOuterUserOfficeInfo officeInfo;
	
	//���ݴ���
	private Map baseMap;
	private Map homeMap;
	private Map officeMap;
	
	/**
	 * ���췽��
	 * ʹ��ԴĿ�������
	 * @param baseInfo
	 * @param homeInfo
	 * @param officeInfo
	 */
	public OuterUserInfo2(IOuterUserBaseInfo baseInfo,IOuterUserHomeInfo homeInfo,IOuterUserOfficeInfo officeInfo){
		this.baseInfo=baseInfo;
		this.homeInfo=homeInfo;
		this.officeInfo=officeInfo;
		
		//���ݴ���
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
