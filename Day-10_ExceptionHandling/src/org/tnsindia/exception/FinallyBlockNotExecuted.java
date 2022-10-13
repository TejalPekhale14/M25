package org.tnsindia.exception;

public class FinallyBlockNotExecuted {

	public static void print()
	{
		try
		{
		    int x=12;
		    int y=5;//OR y=0
		    System.out.println("Inside try block :"+x/y);
		    System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		finally
		{
			System.out.println("Finally Block");
		}
	}
	
	public static void main(String[] args) {
		
         print();
	}

}
