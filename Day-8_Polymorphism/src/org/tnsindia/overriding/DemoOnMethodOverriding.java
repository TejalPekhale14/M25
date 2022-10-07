package org.tnsindia.overriding;

import java.util.Scanner;

class HeadQuarters
{
	protected int totalemp;
	protected String city;
	Scanner s=new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter the city where main branch is situated:");
		city=s.nextLine();
	    System.out.println("Enter the total no of employees in that city headquarters:");
	    totalemp=s.nextInt();
	}
	
	public void showDetails()
	{
		System.out.println("Company is located in:"+city+ " and the no. of employee is:"+totalemp);
	}
}

class MainBranch extends HeadQuarters
{
	public int totalempMB;
	public String citynameMB;
	
	public void getDetails()
	{
		System.out.println("HeadQuarters");
		super.getDetails();
		System.out.println("Main Branch");
		System.out.println("Enter the city where main branch is situated:");
		s.nextLine();
		citynameMB=s.nextLine();
	    System.out.println("Enter the total no of employees in that city headquarters:");
	    totalempMB=s.nextInt();
	}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Main Branch");
		System.out.println("Company is located in:"+citynameMB+ " and the no. of employee is:"+totalempMB);
	}
}

public class DemoOnMethodOverriding {

	public static void main(String[] args) {
		
         MainBranch m=new MainBranch();
         m.getDetails();
         m.showDetails();
	}

}
