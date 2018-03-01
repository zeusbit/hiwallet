package org.fc.bc.wlt.dao;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import onight.osgi.annotation.iPojoBean;
import onight.tfw.ntrans.api.ActorService;
import onight.tfw.ntrans.api.annotation.ActorRequire;
import onight.tfw.ojpa.api.DomainDaoSupport;
import onight.tfw.ojpa.api.IJPAClient;
import onight.tfw.ojpa.api.OJpaDAO;
import onight.tfw.ojpa.api.annotations.StoreDAO;

import org.apache.felix.ipojo.annotations.Provides;
import org.fc.bc.ordbgens.wlt.entity.BCWltAccessLog;
import org.fc.bc.ordbgens.wlt.entity.BCWltAsset;
import org.fc.bc.ordbgens.wlt.entity.BCWltFile;
import org.fc.bc.ordbgens.wlt.entity.BCWltFund;
import org.fc.bc.ordbgens.wlt.entity.BCWltLedger;
import org.fc.bc.ordbgens.wlt.entity.BCWltTransaction;
import org.fc.bc.ordbgens.wlt.entity.BCWltUser;
import org.fc.bc.ordbgens.wlt.entity.BCWltUserAddress;
import org.fc.bc.ordbgens.wlt.entity.BCWltUserLog;
import org.fc.bc.ordbgens.wlt.entity.BCWltWallet;

@iPojoBean
@Provides(specifications = { IJPAClient.class, ActorService.class }, strategy = "SINGLETON")
@Slf4j
@Data
public class Daos implements ActorService, IJPAClient {
	@StoreDAO
	public OJpaDAO<BCWltAsset> bcWltAssetDao;
	@StoreDAO
	public OJpaDAO<BCWltUser> bcWltUserDao;
	@StoreDAO
	public OJpaDAO<BCWltUserLog> bcWltUserLogDao;
	@StoreDAO
	public OJpaDAO<BCWltTransaction> bcWltTransactionDao;
	@StoreDAO
	public OJpaDAO<BCWltLedger> bcWltLedgerDao;
	@StoreDAO
	public OJpaDAO<BCWltWallet> bcWltWalletDao;
	@StoreDAO
	public OJpaDAO<BCWltUserAddress> bcWltUserAddressDao;
	@StoreDAO
	public OJpaDAO<BCWltFile> bcWltFileDao;
	@StoreDAO
	public OJpaDAO<BCWltAccessLog> bcWltAccessLogDao;
	@StoreDAO
	public OJpaDAO<BCWltFund> bcWltFundDao;
	@ActorRequire
	SysDBProvider dbprovider;
	
	@Override
	public void onDaoServiceAllReady() {
		log.debug("AllDao Ready........");
	}

	@Override
	public void onDaoServiceReady(DomainDaoSupport arg0) {

	}
}
