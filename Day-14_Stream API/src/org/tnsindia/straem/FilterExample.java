package org.tnsindia.straem;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		
          List<String>obj=Arrays.asList(new String[]{"Tejal","Dattu","Pekhale"});
	      obj.stream().filter((i->i.length()>3)).forEach((i)->System.out.println(i+" "));
	}

}
