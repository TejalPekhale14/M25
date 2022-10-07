package org.tnsindia.overloading;

class Shape 
{
	public void area()
	{
		System.out.println("Find Area:");
	}
	public void area(int r)
	{
	    System.out.println("Find Area of Circle"+(3.14*r*r));
	}
	public void area(int l,int b)
	{
		System.out.println("Find Area of Rectangle:"+(l*b));
	}
}


public class ExampleOnMethodOfOverloading {

	public static void main(String[] args) {
		
		Shape s=new Shape();
		s.area();
		s.area(2);
		s.area(2,2);
	}

}
