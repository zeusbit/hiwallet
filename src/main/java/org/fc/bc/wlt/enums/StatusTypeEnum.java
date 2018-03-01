package org.fc.bc.wlt.enums;

import java.util.HashMap;
import java.util.Map;

public enum StatusTypeEnum {
	ENABLED("1", "ENABLED"), //状态 1启用 2停用 3已删除
	DISABLED("0", "DISABLED"),
	YES("1", "YES"),
	NO("0", "NO"),
	SUCCESS("success", "SUCCESS"),
	FAIL("fail", "FAIL"),
	NOT_READY("-2","NOT_READY"),
	REGISTED("-1","REGISTED"),
	REQUEST_SUCCESSFUL("0","REQUEST_SUCCESSFUL"),
	REQUEST_FAILED("1","REQUEST_FAILED"),
	
	DELETED("3", "DELETED");
	
	public static String getNameByValue(String value) {
		StatusTypeEnum status = valueMap.get(value);
		if (status != null) {
			return status.getName();
		}
		return "未知状态";
	}

	public static String getValueByName(String name) {
		StatusTypeEnum status = nameMap.get(name);
		if (status != null) {
			return status.getValue();
		}
		return null;
	}

	private static Map<String, StatusTypeEnum> valueMap;

	private static Map<String, StatusTypeEnum> nameMap;
	static {
		valueMap = new HashMap<String, StatusTypeEnum>();
		nameMap = new HashMap<String, StatusTypeEnum>();
		for (StatusTypeEnum status : StatusTypeEnum.values()) {
			valueMap.put(status.getValue(), status);
			nameMap.put(status.getName(), status);
		}
	}

	private String value;
	private String name;

	private StatusTypeEnum(String value, String name) {
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
