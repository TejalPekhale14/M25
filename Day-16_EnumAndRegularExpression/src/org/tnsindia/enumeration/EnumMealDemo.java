package org.tnsindia.enumeration;

public class EnumMealDemo {

	public static void main(String[] args) {
		
		for(Meal m:Meal.values())
		{
			System.out.println(m+" "+m.getValue());
		}
		

	}

}
