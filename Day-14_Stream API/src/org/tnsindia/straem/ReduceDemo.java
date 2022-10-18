package org.tnsindia.straem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		 
		List<Integer>obj1=Arrays.asList(new Integer[]{34,56,87,98,65});
        Optional<Integer>obj2=obj1.stream().reduce((a,b)->a>b?a:b);
	    
        if(obj2.isPresent())
        {
        	System.out.println(obj2.get());
        }
	}

}
