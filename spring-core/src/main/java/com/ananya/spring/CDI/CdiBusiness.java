package com.ananya.spring.CDI;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {

	@Inject
	private CdiDAO cdiDao;

	public CdiDAO getCdiDao() {
		return cdiDao;
	}

	public void setCdiDao(CdiDAO cdiDao) {
		this.cdiDao = cdiDao;
	}

}
