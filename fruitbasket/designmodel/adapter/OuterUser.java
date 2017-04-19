package fruitbasket.designmodel.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap=new HashMap();
		baseInfoMap.put("userName", "user_name_1");
		baseInfoMap.put("mobileNumber", "10086");
		return baseInfoMap;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap homeInfo=new HashMap();
		homeInfo.put("homeTelNumber", "10086");
		homeInfo.put("homeAddress","home_address");
		return homeInfo;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap officeInfo=new HashMap();
		officeInfo.put("jobPosition", "BOSS");
		officeInfo.put("officeTelNumber", "office_tel_number");
		return officeInfo;
	}

}
