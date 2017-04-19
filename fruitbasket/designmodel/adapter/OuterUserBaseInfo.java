package fruitbasket.designmodel.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap=new HashMap();
		baseInfoMap.put("userName", "user_name");
		baseInfoMap.put("mobileNumber","10086");
		return baseInfoMap;
	}

}
