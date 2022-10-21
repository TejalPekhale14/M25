package org.tnsindia.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMatcherClass {

	public static void main(String[] args) {
		
         Pattern p=Pattern.compile("Tejal");
         Matcher m=p.matcher("My name is Tejal");
         
         while(m.find())
         {
        	 System.out.println("Pattern found at:"+m.start()+" "+m.end());
         }
	}

}
