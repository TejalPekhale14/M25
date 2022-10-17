package org.tnsindia.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemoUsingLambda {

	public static void main(String[] args) {
		
         Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(),s2.length());
         String str[]= {"Tejal","Dattu","Pekhale","Teju"};
         Collections.sort(Arrays.asList(str),obj);
         
         for(String itr:str)
         {
        	 System.out.println(itr+" ");
         }
	}

}
