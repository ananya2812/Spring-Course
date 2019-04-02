package com.ananya.spring.Basic;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ananya.spring.CDI.CdiBusiness;
import com.ananya.spring.CDI.CdiDAO;

@RunWith(MockitoJUnitRunner.class)
public class CdiBusinessTest {

	@InjectMocks
	CdiBusiness cdiBusiness;

	@Mock
	CdiDAO cdiDaoMock;

	@Test
	public void testBasicScenario() {
		when(cdiDaoMock.getData()).thenReturn(new int[] { 1, 2, 3 });
		assertEquals(3, cdiBusiness.findGreatest());

	}

}
