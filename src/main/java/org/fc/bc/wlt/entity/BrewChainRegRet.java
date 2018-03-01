package org.fc.bc.wlt.entity;

import lombok.Data;

@Data
public class BrewChainRegRet {

	private String err_code;
	private String msg;
	private RegAddrRet[] addrs;
	private PMAssetInfo fbc_asset;

	@Data
	public static class RegAddrRet{
		private String hex_addr;
		private String pki;
		private String pub;
		private String alias;
		private String rpmd_hash;
	}
}