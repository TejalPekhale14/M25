package org.tnsindia.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstUnit5Test {

	@Test
	void test() {
		System.out.println("hello");
	}
	
	@Test
	@Disabled
	void display()
	{
	 fail("hii");
	}

}
