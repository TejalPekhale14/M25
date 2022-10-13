package org.tnsindia.exception;

import java.util.Scanner;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the value of a:");
         int a=s.nextInt();
         System.out.println("Enter the value of b:");
         int b=s.nextInt();
         try
         {
        	 int result=a/b;
             System.out.println("The result is:"+result);
         }
         catch(Exception e)
         {
        	 System.out.println(e);
        	 System.out.println("Arithmetic exception handled using catch block");
         }
         finally
         {
        	 System.out.println("Finally block is always executed");
         }
         System.out.println("Exception Handled");
         s.close();
	}

}
