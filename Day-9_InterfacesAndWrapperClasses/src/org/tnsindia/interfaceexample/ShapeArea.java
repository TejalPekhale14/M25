package org.tnsindia.interfaceexample;

import java.util.Scanner;

public class ShapeArea implements Area {

	@Override
	public void circle() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  the radius of circle:");
		double r=s.nextDouble();
		System.out.println(3.142*r*r);
		System.out.println("Area of circle is:"+r*r);
	}

	@Override
	public void square() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  the side of square:");
		double side=s.nextDouble();
		System.out.println(side*side);
		System.out.println("Area of square is:"+side*side);
	}

	
}
