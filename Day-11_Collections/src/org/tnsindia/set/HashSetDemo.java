package org.tnsindia.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
          Set<Object> s=new HashSet<>();
          s.add("Tejal");
          s.add('T');
          s.add(34.67f);
          s.add(45);
          s.add(null);
          s.add(null);
          System.out.println("THe elements in the set are:"+s);
	}

}
