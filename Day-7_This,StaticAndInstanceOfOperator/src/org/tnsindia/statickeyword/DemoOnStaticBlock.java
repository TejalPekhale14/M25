package org.tnsindia.statickeyword;

public class DemoOnStaticBlock {

	static int a=12;
	static int b;
	static
	{
		b=a+50;
		
	}
	public static void main(String[] args) {
	
         System.out.println("Value of a:"+a);
         System.out.println("Value of b:"+b);
	}

}
