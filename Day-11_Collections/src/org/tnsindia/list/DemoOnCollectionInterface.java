package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnCollectionInterface {

	public static void main(String[] args) {
		
          Collection obj=new ArrayList<>();
          obj.add("Tejal");
          obj.add('x');
          obj.add(87.90f);
          System.out.println("The elements in collection are:"+obj);
	}

}
