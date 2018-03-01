package org.fc.bc.wlt.entity;

import lombok.Data;

@Data
public class BrewChainTRCTSCReq {
	private String bc_txid;
	private String ver = "1.0.0";
}
