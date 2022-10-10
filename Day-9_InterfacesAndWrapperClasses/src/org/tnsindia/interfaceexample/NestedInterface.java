package org.tnsindia.interfaceexample;

import java.util.Scanner;

interface InterfaceOuter
{
	void print();
	interface InterfaceInner
	{
		void display();
	}
}

class ImplementableClass implements org.tnsindia.interfaceexample.InterfaceOuter.InterfaceInner
{

	@Override
	public void display() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the batch:");
		String str=s.nextLine();
		System.out.println("The batch is:"+str);
	}
	
}

class ImplementableClassP implements InterfaceOuter
{

	@Override
	public void print() {
		
		System.out.println("Working on nested interface");
	}
	
}

public class NestedInterface {

	public static void main(String[] args) {
		
		ImplementableClass i=new ImplementableClass ();
		i.display();
		ImplementableClassP i1=new ImplementableClassP ();
		i1.print();
	}

}
