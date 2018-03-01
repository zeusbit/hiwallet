package org.fc.bc.wlt.entity;

import lombok.Data;

@Data
public class BrewChainNewRet {

	private String err_code;
	private String msg;
	NewDataRet data;
	
	@Data
	public static class NewDataRet{
		private String bc_hash;
		private String evidence_id;		
	}
}