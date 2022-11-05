package org.tnsindia.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	@RepeatedTest(5)
	void test() {
		System.out.println("hello M25");
	}

}
