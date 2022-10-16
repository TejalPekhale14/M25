package org.tnsindia.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
          SortedSet<String> s=new TreeSet<>();
          s.add("Tejal");
          s.add("Dattu");
          s.add("Pekhale");
          System.out.println("The elements in the TreeSet are:"+s);
	}

}
