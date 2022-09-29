package org.tnsindia.defaultconstructor;

class Car 
{
	public int speed ;
	void display()
	{
		System.out.println("The speed is :"+speed+"km/hr");
	}
	
	Car()
	{
		speed=50;
	}
	
}

public class DefaultconstructorDemo {

	public static void main(String[] args) {
        Car obj=new Car();
        obj.display();
	}

}
