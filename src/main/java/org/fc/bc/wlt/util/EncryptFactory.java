package org.fc.bc.wlt.util;

public class EncryptFactory {

	/**
	 * 
	 * @param type
	 * @return
	 */
	public EncryptUtil getInterface(String type){
		if(type.equals("reversal")){
			return new ReversalUtil();
		}
		
		return new ReversalUtil();
	}
}
