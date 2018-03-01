package org.fc.bc.wlt.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class BrewChainNewReq {

	private String trade_no;
	private String metadata;
	private List<Signers> signers;
	public BrewChainNewReq(){
		signers = new ArrayList<Signers>();
	}
	
	
	@Data
	public static class Signers{
		private String address;
		private String password;
	}
}
