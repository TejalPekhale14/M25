package org.tnsindia.straem;

import java.util.Arrays;
import java.util.List;

public class FilteringMethodDemo {

	public static void main(String[] args) {
		  
		  List<Integer>obj1=Arrays.asList(new Integer[]{34,56,87,98,65});
          obj1.stream().filter(i->i>58).forEach((i)->System.out.print(i+" "));
	      System.out.println();
	      System.out.println();
	      obj1.stream().distinct().forEach((i)->System.out.print(i+" "));
	      System.out.println();
	      obj1.stream().limit(3).forEach((i)->System.out.print(i+" "));
	      System.out.println();
	      obj1.stream().skip(4).forEach((i)->System.out.println(i+" "));
	      
	}

}
