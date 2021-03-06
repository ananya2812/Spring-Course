package com.ananya.springusingspringboot.Basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.ananya.springusingspringboot.SpringBootBasicApplication;

@RunWith(SpringRunner.class) // Loading the Specific context
@ContextConfiguration(classes = SpringBootBasicApplication.class) // Specifying the context
public class BinarySearchImplTest {

	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		assertEquals(1, binarySearch.binarySearch(new int[] { 1, 2 }, 2));

	}

}
