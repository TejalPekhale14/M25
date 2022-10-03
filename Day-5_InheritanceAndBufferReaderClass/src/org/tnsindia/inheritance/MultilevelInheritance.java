package org.tnsindia.inheritance;

class Vehicle 
{
	private String name="Car";
	public void display() 
	{
		System.out.println(name);
	}
}

class BMW extends Vehicle
{
	private String name1="BMW";
	public void display1() 
	{
		System.out.println(name1);
	}
}

class Tyre extends BMW
{
	private String tyrename="BridgeStone";
	public void display2() 
	{
		System.out.println(tyrename);
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		Tyre t=new Tyre();
        t.display();
        t.display1();
        t.display2();
	}

}
