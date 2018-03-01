package org.fc.bc.wlt.enums;

import java.util.HashMap;
import java.util.Map;

public enum ReturnCodeTypeEnum {
	LOGINED("000002","LOGINED"),
	SUCCESS("000000", "SUCCESS"),
	FAIL("000001", "FAIL");
	
	public static String getNameByValue(String value) {
		ReturnCodeTypeEnum status = valueMap.get(value);
		if (status != null) {
			return status.getName();
		}
		return "未知状态";
	}

	public static String getValueByName(String name) {
		ReturnCodeTypeEnum status = nameMap.get(name);
		if (status != null) {
			return status.getValue();
		}
		return null;
	}

	private static Map<String, ReturnCodeTypeEnum> valueMap;

	private static Map<String, ReturnCodeTypeEnum> nameMap;
	static {
		valueMap = new HashMap<String, ReturnCodeTypeEnum>();
		nameMap = new HashMap<String, ReturnCodeTypeEnum>();
		for (ReturnCodeTypeEnum status : ReturnCodeTypeEnum.values()) {
			valueMap.put(status.getValue(), status);
			nameMap.put(status.getName(), status);
		}
	}

	private String value;
	private String name;

	private ReturnCodeTypeEnum(String value, String name) {
		this.value = value;
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return this.getValue() + "-" + this.getName();
	}
}
