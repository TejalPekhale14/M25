package org.tnsindia.thiskeyword;

class D
{
	
	D()
	{
		this(5);
		System.out.println("Default consructor");
	}
	D(int i)
	{
		System.out.println("Parameterized consructor");
	}
}


public class DemoONInvokedConstructor {

	public static void main(String[] args) {
		D d=new D();

	}

}
