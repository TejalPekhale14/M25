package org.tnsindia.abstraction;

class A
{
	private float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}

public class DemoOnPrivate {

	public static void main(String[] args) {
		
        A a=new A();
        a.setSalary(5000);
        System.out.println("The salary is:"+a.getSalary());
	}

}
