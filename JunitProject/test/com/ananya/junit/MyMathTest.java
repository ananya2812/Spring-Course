package com.ananya.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {
	
	@Before
	public void before() {
		System.out.println("Before Every Test");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@Test
	void test() {
		// Absence of Failure is Success
	}
	
	@Test
	void sum_with3numbers() {
		MyMath myMath = new MyMath();
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	void sum_with1number() {
		MyMath myMath = new MyMath();
		assertEquals(1, myMath.sum(new int[] {1}));
	}
	
	@After
	public void after() {
		System.out.println("After Every Test");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}

}