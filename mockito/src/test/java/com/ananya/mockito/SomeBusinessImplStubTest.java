package com.ananya.mockito;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessImplStubTest {

	@Test
	public void testFindGreatest() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findGreatest();
		assertEquals(result, 24);

	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 24, 5, 6 };
	}

}
