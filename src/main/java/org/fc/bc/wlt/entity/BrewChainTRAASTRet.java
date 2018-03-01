package org.fc.bc.wlt.entity;

import java.util.List;

import lombok.Data;

@Data
public class BrewChainTRAASTRet {
	private String err_code;
	private String msg;
	private PMAssetInfoBC asset;
	private String trade_no;
	private List<PMSignAddressR> co_signers;
	private PMContract scs;
}
