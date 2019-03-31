package com.ananya.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplMockAnnotationTest {

	@InjectMocks
	SomeBusinessImpl businessImpl;

	@Mock
	DataService dataServiceMock;

	@Test
	public void testFindGreatest1() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 5, 6 });
		assertEquals(businessImpl.findGreatest(), 24);
	}

}
