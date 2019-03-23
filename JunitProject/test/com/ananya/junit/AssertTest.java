package com.ananya.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertTest {

	@Test
	void test() {
		MyMath obj1 = null;
		MyMath obj2 = new MyMath();
		assertEquals(1, 1);
		assertTrue(true);
		assertFalse(false);
		assertNull(obj1);
		assertNotNull(obj2);
		assertArrayEquals(new int[] {1}, new int[] {1});

	}
}
