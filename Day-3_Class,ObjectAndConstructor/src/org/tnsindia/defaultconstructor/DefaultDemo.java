package org.tnsindia.defaultconstructor;

import java.util.Scanner;

class Bus 
{
	public int speed;
	
	public Bus()
	{
		System.out.println("default constructor");
	}
}

public class DefaultDemo {

	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of speed:");
        int speed=s.nextInt();
        Bus b=new Bus();
	}

}
