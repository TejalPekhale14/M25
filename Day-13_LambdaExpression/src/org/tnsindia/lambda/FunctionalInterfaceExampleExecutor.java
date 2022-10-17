package org.tnsindia.lambda;

public class FunctionalInterfaceExampleExecutor {

	public static void main(String[] args) {
		
		FunctionalInterfaceExample obj=(int a,int b)->
		{
			int result=(a>b)?a:b;
			return result;
		};
		System.out.println("The max no. is:"+obj.max(34, 10));
	}

}
