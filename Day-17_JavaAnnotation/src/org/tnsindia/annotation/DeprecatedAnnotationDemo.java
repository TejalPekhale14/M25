package org.tnsindia.annotation;

class DeprecatedDemo
{
	@Deprecated
	public void display()
	{
		System.out.println("Deprecated annotation demo");
	}
}

public class DeprecatedAnnotationDemo {

	public static void main(String[] args) {
		
		DeprecatedDemo d=new DeprecatedDemo();
		d.display();
		
	}

}
