package org.fc.bc.wlt.entity;

import lombok.Data;

@Data
public class BrewChainCRTASTRet {
	private String err_code;
	private String msg;
	private String bc_txid;
	private PMAssetInfoR asset;
	private String raw_data;
}
