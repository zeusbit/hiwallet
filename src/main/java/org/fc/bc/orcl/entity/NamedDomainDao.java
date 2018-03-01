package org.fc.bc.orcl.entity;

import lombok.Data;
import lombok.Setter;
import onight.tfw.ojpa.api.DomainDaoSupport;
import onight.tfw.ojpa.api.ServiceSpec;

@Data
public class NamedDomainDao implements DomainDaoSupport {

	@Setter
	String domainName;

	@Override
	public DomainDaoSupport getDaosupport() {
		return this;
	}  

	@Override
	public Class<?> getDomainClazz() {
		return null;
	}

	@Override
	public String getDomainName() {
		return domainName;
	}

	@Override
	public ServiceSpec getServiceSpec() {
		return null;
	}

	@Override
	public void setDaosupport(DomainDaoSupport arg0) {

	}

	public NamedDomainDao(String domainName) {
		super();
		this.domainName = domainName;
	}

}
