package org.tnsindia.straem;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambdaDemo {

	public static void main(String[] args) {
		
		  Set<Integer>obj=new HashSet<>();
          obj.add(45);
          obj.add(55);
          obj.add(23);
          System.out.println(obj);
          
          /*for(Integer itr:obj)
          {
        	  System.out.println(itr+" ");
          }*/
          
          obj.forEach(System.out::println);
	}

}
