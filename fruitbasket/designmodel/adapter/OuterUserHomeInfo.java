package fruitbasket.designmodel.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfo=new HashMap();
		homeInfo.put("homeTelNumber", "10086");
		homeInfo.put("homeAddress", "address");
		return homeInfo;
	}

}
