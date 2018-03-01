package org.fc.bc.wlt.enums;

import java.util.HashMap;
import java.util.Map;

public enum BrewChainURITypeEnum {
	ALIAS("/fbs","ALIAS"),
	PORT("8002","PORT"),
	HOST("http://211.159.149.246", "HOST");
	
	public static String getNameByValue(String value) {
		BrewChainURITypeEnum status = valueMap.get(value);
		if (status != null) {
			return status.getName();
		}
		return "未知状态";
	}

	public static String getValueByName(String name) {
		BrewChainURITypeEnum status = nameMap.get(name);
		if (status != null) {
			return status.getValue();
		}
		return null;
	}

	private static Map<String, BrewChainURITypeEnum> valueMap;

	private static Map<String, BrewChainURITypeEnum> nameMap;
	static {
		valueMap = new HashMap<String, BrewChainURITypeEnum>();
		nameMap = new HashMap<String, BrewChainURITypeEnum>();
		for (BrewChainURITypeEnum status : BrewChainURITypeEnum.values()) {
			valueMap.put(status.getValue(), status);
			nameMap.put(status.getName(), status);
		}
	}

	private String value;
	private String name;

	private BrewChainURITypeEnum(String value, String name) {
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
