package fruitbasket.designmodel.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfo=new HashMap();
		officeInfo.put("jobPosition", "Boss");
		officeInfo.put("officeTelNumber","10086");
		return officeInfo;
	}

}
