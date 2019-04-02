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

	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = cdiDao.getData();
		for (int d : data) {
			if (d > greatest) {
				greatest = d;
			}
		}
		return greatest;

	}
}
