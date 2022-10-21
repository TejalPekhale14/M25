package org.tnsindia.enumeration;

public class EnumCarDemo {

	public static void main(String[] args) {
		
          /*Car r=Car.TESLA;
          System.out.println(r);*/
		
		for(Car c:Car.values())
		{
			System.out.println(c);
			
			System.out.println();
			
			//System.out.println(c.TESLA);
		}
	}

}
