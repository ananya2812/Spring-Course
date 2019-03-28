package com.ananya.springusingspringboot.CDI;

import org.springframework.stereotype.Repository;

@Repository
public class CdiDAO {

	public CdiDAO() {
		System.out.println("Cdi Dao");
	}
}
