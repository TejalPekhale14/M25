package org.tnsindia.thiskeyword;

class C
{
	public String name;
	public int id;
	
	public void display(C c)
	{
		System.out.println("Display function invoked");
	}
	public void print()
	{
		display(this);
	}
}


public class DemoOnThisKeyworsAsMethodCall {

	public static void main(String[] args) {
		C c=new C();
		c.print();

	}

}
