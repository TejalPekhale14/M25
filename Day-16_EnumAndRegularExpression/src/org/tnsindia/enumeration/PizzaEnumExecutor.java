package org.tnsindia.enumeration;

import java.util.Scanner;

import org.tnsindia.enumeration.PizzaEnumDemo.Size;

public class PizzaEnumExecutor {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size if pizza:");
        String size=s.nextLine();
        
        Size s1=Size.valueOf(size.toUpperCase());
        
        switch(s1)
        {
        
            case SMALL:
        	    System.out.println("Preparing small size pizza for customer");
        	    break;
        	
            case MEDIUM:
        	    System.out.println("Preparing medium size pizza for customer");
        	    break;
        	
            case LARGE:
        	    System.out.println("Preparing large size pizza for customer");
        	    break;
        	
            case EXTRALARGE:
        	    System.out.println("Preparing extralarge size pizza for customer");
        	    break;
        }
	}

}
