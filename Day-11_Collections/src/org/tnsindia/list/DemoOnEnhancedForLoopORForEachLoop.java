package org.tnsindia.list;

import java.util.ArrayList;
import java.util.List;

public class DemoOnEnhancedForLoopORForEachLoop {

	public static void main(String[] args) {
		
		 List <String> list=new ArrayList<>();
         list.add("Dattu");
         list.add("Tejal");
         list.add("Sangita");
         for(String itr:list)
         {
        	 System.out.println(itr);
         }
         System.out.println("The elements are:"+list);

	}

}
