package org.tnsindia.exception;

public class ThrowKeyword {

	public static void display(int age,int weight)
	{
		if(age>18 && weight>45)
		{
			System.out.println("Eligible to donate the blood");
		}
		else
		{
			throw new ArithmeticException("Not eligible");
		}
	}
	
	public static void main(String[] args) {
		
         try
         {
        	 display(22,35);
         }
         catch(ArithmeticException e)
         {
        	 System.out.println(e);
         }
	}

}
