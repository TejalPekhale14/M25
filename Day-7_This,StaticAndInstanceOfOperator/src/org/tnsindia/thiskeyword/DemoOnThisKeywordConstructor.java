package org.tnsindia.thiskeyword;

import java.util.Scanner;

class B
{
	public String name;
	public int id;
	
	B(String name, int id) 
	{
		this.name=name;
		this.id=id;
	}
	
	public void print()
	{
		System.out.println("The name is:"+name);
		System.out.println("The ID is:"+id);
	}
}


public class DemoOnThisKeywordConstructor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=s.nextLine();
		System.out.println("Enter the id:");
		int id=s.nextInt();
		B a=new B("Tejal",1);
        a.print();
	}

}
