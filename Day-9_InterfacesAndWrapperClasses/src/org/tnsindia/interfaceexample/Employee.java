package org.tnsindia.interfaceexample;

public class Employee implements HR,Manager {

	@Override
	public void projectDisxussion() {
		
		System.out.println("About the project discussion");
		
	}

	@Override
	public void salaryDiscussion() {
		
		System.out.println("About the salary discussion");
	}

	
}
