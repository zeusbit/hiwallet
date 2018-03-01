package org.fc.bc.wlt.entity;

import lombok.Data;

/**
 * 资产交易信息
 * @author jack
 *
 */
@Data
public class PMTransInfo {
	private PMSignAddress address;// 资产地址
	private String bc_txid;// txid
	private PMFundInfo funds;// 区块金融属性
	private String metadata;// 附属信息
	private PMFundInfo fbc_funds;// 泛融币信息
}
