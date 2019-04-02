package com.ananya.spring.CDI;

import org.springframework.stereotype.Repository;

@Repository
public class CdiDAO {

	public CdiDAO() {
		System.out.println("Cdi Dao");
	}

	public int[] getData() {
		return new int[] { 1, 2, 3 };
	}
}
