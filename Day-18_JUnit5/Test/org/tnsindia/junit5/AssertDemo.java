package org.tnsindia.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertDemo {

	@Test
	public void assertdemo() {
		
		assertEquals(7,7);
	}

	@Test
	public void assertdemo1() {
		
		assertNull(null);
	}
}
