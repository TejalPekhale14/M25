package org.tnsindia.straem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {

          Stream<String>obj=Stream.of("Tejal","Dattu","Pekhale");
          obj.forEach((i)->System.out.println(i+" "));
          
          System.out.println();
          
          List<Integer>obj1=Arrays.asList(new Integer[] {34,56,87,98});
          obj1.forEach((i)->System.out.println(i+" "));
          
	}

}
