package org.tnsindia.generics;

public class GenericMethodExample {
	
	public static <E>void printArray(E[] ele) 
	{
		
		for(E itr:ele)
		{
			System.out.println(itr.getClass().getName());
			System.out.println(itr);
		}
	}

	public static void main(String[] args) {
		
		Integer[] arr1= {10,20,30};
		Character[] arr2= {'x','z','a'};
        System.out.println("Printing array for integer");
        printArray(arr1);
        System.out.println("Printing array for character");
        printArray(arr2);
	}

}
