package org.fc.bc.wlt.enums;

import java.util.HashMap;
import java.util.Map;

public enum TransactionTypeEnum {

	个人2个人("0", "个人2个人"),
	个人2企业("1","个人2企业"),
	企业2企业("2","企业2企业"),
	其他("10","其他");
	
	public static String getNameByValue(String value) {
		TransactionTypeEnum status = valueMap.get(value);
			if (status != null) {
				return status.getName();
			}
		return "未知状态";
	}

	public static String getValueByName(String name) {
		TransactionTypeEnum status = nameMap.get(name);
		if (status != null) {
			return status.getValue();
		}
		return null;
	}

	private static Map<String, TransactionTypeEnum> valueMap;

	private static Map<String, TransactionTypeEnum> nameMap;
	static {
		valueMap = new HashMap<String, TransactionTypeEnum>();
		nameMap = new HashMap<String, TransactionTypeEnum>();
		for (TransactionTypeEnum status : TransactionTypeEnum.values()) {
			valueMap.put(status.getValue(), status);
			nameMap.put(status.getName(), status);
		}
	}

	private String value;
	private String name;

	private TransactionTypeEnum(String value, String name) {
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
