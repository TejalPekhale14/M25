package org.tnsindia.list;

import java.util.LinkedList;
import java.util.List;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		
		List list=new LinkedList<>();
        list.add(1);
        list.add("Tejal");
        list.add(34.43f);
        System.out.println("The elements are:"+list);
	}

}
