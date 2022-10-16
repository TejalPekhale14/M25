package org.tnsindia.list;

import java.util.ArrayList;
import java.util.List;

public class DemoOnArrayList {

	public static void main(String[] args) {
	
         List list=new ArrayList<>();
         list.add(1);
         list.add("Tejal");
         list.add(34.43f);
         System.out.println("The elements are:"+list);
         System.out.println(list.size());
	}

}
