package org.fc.bc.wlt.entity;

import lombok.Data;

@Data
public class BrewChainQueryRet {

	private String err_code;
	private String msg;
	private QueryDataRet data;

	@Data
	public static class QueryDataRet{
		private String evidence_id;
		private String metadata;
		private String[] address;
	}
}