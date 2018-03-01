package org.fc.bc.wlt.entity;

import java.util.List;

import lombok.Data;

@Data
public class BrewChainTRCTSCRet {
	private String err_code;
	private String msg;
	private String trade_no;
	private String metadata;
	private String alias;
	private long block_height;
	private List<PMTransInfo> inputs;
	private List<PMTransInfo> outputs;
	private List<PMContract> scs;
	private String signed_code;
}
