package org.tnsindia.junit5;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void display() {
		System.setProperty("Tejal","Pek");
		Assumptions.assumeTrue("Pek".equals(System.getProperty("Tejal")));
	}
	@Test
	void display1() {
		System.setProperty("Tejal","Pek");
		Assumptions.assumeTrue("Pekh".equals(System.getProperty("Tejal")));
	}
}
