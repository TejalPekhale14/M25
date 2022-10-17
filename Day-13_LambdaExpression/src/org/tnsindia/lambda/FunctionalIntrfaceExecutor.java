package org.tnsindia.lambda;

public class FunctionalIntrfaceExecutor {

	public static void main(String[] args) {
		
		FunctionalInterfaceDemo obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.display("Welcome to the concept of Lambda Expression"));
	}

}
