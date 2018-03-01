package org.fc.bc.wlt.enums;

import java.util.HashMap;
import java.util.Map;

public enum DataIfaceTypeEnum {

	BELICD("BELICD", "身份证归属地"),
	GETCTY("GETCTY","手机号校验城市码");
	
	public static String getNameByValue(String value) {
		DataIfaceTypeEnum status = valueMap.get(value);
			if (status != null) {
				return status.getName();
			}
		return "未知状态";
	}

	public static String getValueByName(String name) {
		DataIfaceTypeEnum status = nameMap.get(name);
		if (status != null) {
			return status.getValue();
		}
		return null;
	}

	private static Map<String, DataIfaceTypeEnum> valueMap;

	private static Map<String, DataIfaceTypeEnum> nameMap;
	static {
		valueMap = new HashMap<String, DataIfaceTypeEnum>();
		nameMap = new HashMap<String, DataIfaceTypeEnum>();
		for (DataIfaceTypeEnum status : DataIfaceTypeEnum.values()) {
			valueMap.put(status.getValue(), status);
			nameMap.put(status.getName(), status);
		}
	}

	private String value;
	private String name;

	private DataIfaceTypeEnum(String value, String name) {
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
