package org.tnsindia.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPatternMethodDemo {

	public static void main(String[] args) {
		
		String pattern="Tejal Pekhale";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input for matching: ");
		
        String input=s.nextLine();
        boolean result=Pattern.matches(pattern, input);
        System.out.println(result);
	}

}
