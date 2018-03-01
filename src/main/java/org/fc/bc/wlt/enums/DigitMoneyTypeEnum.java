package org.fc.bc.wlt.enums;

import java.util.HashMap;
import java.util.Map;

public enum DigitMoneyTypeEnum {

	FBC("0", "泛融币"),
	BTC("1","比特币"),
	ETH("2","以太币"),
	TOKEN("10","其他");
	
	public static String getNameByValue(String value) {
		DigitMoneyTypeEnum status = valueMap.get(value);
			if (status != null) {
				return status.getName();
			}
		return "未知状态";
	}

	public static String getValueByName(String name) {
		DigitMoneyTypeEnum status = nameMap.get(name);
		if (status != null) {
			return status.getValue();
		}
		return null;
	}

	private static Map<String, DigitMoneyTypeEnum> valueMap;

	private static Map<String, DigitMoneyTypeEnum> nameMap;
	static {
		valueMap = new HashMap<String, DigitMoneyTypeEnum>();
		nameMap = new HashMap<String, DigitMoneyTypeEnum>();
		for (DigitMoneyTypeEnum status : DigitMoneyTypeEnum.values()) {
			valueMap.put(status.getValue(), status);
			nameMap.put(status.getName(), status);
		}
	}

	private String value;
	private String name;

	private DigitMoneyTypeEnum(String value, String name) {
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
