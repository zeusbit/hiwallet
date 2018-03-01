package org.fc.bc.wlt.entity;

import java.util.List;
import lombok.Data;

@Data
public class BrewChainUpdASTRet {
	private String err_code;
	private String msg;
	private String bc_txid;
	private List<PMSignAddress> asset_address;
	private String raw_data;
	public BrewChainUpdASTRet(){
	}
}
