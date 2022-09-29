package org.tnsindia.abstraction;

class B
{
	public String dob="2000-06-14";
	void display() 
	{
		System.out.println("The DOB is:"+dob);
	}
}

public class DemoOnPublic {

	public static void main(String[] args) {
		
        B b=new B();
        b.display();
	}

}
