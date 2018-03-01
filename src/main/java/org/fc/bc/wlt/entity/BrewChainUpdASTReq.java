package org.fc.bc.wlt.entity;

import java.util.List;

import lombok.Data;

@Data
public class BrewChainUpdASTReq {

	private String trade_no;
	private String meta_data;
	private String alias;
	private List<PMTransInfo> inputs;
	private List<PMTransInfo> outputs;
	private List<PMContract> src;
	private String signed_code;
	private String ver;
}
