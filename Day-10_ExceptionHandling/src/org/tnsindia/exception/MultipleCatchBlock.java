package org.tnsindia.exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		try
		{
              int a=args.length;
              System.out.println("The length of a is :" +a);
             // int b=12/a;
             //System.out.println(b);
              int arr[] = {11,22,33};
              System.out.println(arr[3]);
		}
		
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException e )
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Finally Block");
		}
	}	
}
