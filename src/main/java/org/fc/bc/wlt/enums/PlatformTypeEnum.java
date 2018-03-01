package org.fc.bc.wlt.enums;

import java.util.HashMap;
import java.util.Map;

public enum PlatformTypeEnum {
	PC ("P", "P"), //状态 P : PC; A : APP
	APP("A", "A");
	
	public static String getNameByValue(String value) {
		PlatformTypeEnum status = valueMap.get(value);
		if (status != null) {
			return status.getName();
		}
		return "未知状态";
	}

	public static String getValueByName(String name) {
		PlatformTypeEnum status = nameMap.get(name);
		if (status != null) {
			return status.getValue();
		}
		return null;
	}

	private static Map<String, PlatformTypeEnum> valueMap;

	private static Map<String, PlatformTypeEnum> nameMap;
	static {
		valueMap = new HashMap<String, PlatformTypeEnum>();
		nameMap = new HashMap<String, PlatformTypeEnum>();
		for (PlatformTypeEnum status : PlatformTypeEnum.values()) {
			valueMap.put(status.getValue(), status);
			nameMap.put(status.getName(), status);
		}
	}

	private String value;
	private String name;

	private PlatformTypeEnum(String value, String name) {
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
