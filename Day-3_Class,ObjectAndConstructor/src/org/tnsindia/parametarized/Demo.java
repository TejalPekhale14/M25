package org.tnsindia.parametarized;

import java.util.Scanner;

class Bus 
{
	public int speed;
	
	Bus(int s)
	{
		speed=s;
		System.out.println("The speed is :"+speed+"km/hr");
	}
}


public class Demo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of speed:");
        int speed=s.nextInt();
        Bus b=new Bus(speed);


	}

}
