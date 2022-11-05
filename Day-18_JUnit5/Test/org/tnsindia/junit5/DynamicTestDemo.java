package org.tnsindia.junit5;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class DynamicTestDemo {

	Collection<DynamicTest>print()
	{
		return Arrays.asList(dynamicTest("Simple dynamic test",()->assertTrue(true)),
				dynamicTest("My Executable class",new MyExecutableDynamicDemo()));
				
	}
	
class MyExecutableDynamicDemo implements Executable
{
	@Override
	public void execute() throws Throwable
	{
		System.out.println("Welcome to M25 Batch");
	}
}

}
