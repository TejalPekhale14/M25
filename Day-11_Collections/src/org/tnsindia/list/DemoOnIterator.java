package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoOnIterator {

	public static void main(String[] args) {
		
		List <String> list=new ArrayList<>();
        list.add("Dattu");
        list.add("Tejal");
        list.add("Sangita");
        
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
       	 System.out.println(itr.next());
        }
        System.out.println("The elements are:"+list);

	}
}


