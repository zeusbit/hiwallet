package org.fc.bc.wlt.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class BrewChainCRTASTReq {
	private String trade_no;
	private List<PMSignAddressR> co_signers;
	private String meta_data;
	private String signed_code;
	private String alias;
	private List<PMFundInfoR> funds;
	public BrewChainCRTASTReq(){
		co_signers = new ArrayList<PMSignAddressR>();
		funds = new ArrayList<PMFundInfoR>();
	}
}
