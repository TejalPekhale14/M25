package org.tnsindia.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
            Map<Integer,String>obj=new HashMap<>();
            obj.put(1,"Tejal");
            obj.put(4,"Soni");
            obj.put(3,"Tejal");
            obj.put(2,"Teju");
            obj.put(null, null);
            obj.put(6, null);
            System.out.println(obj);
            obj.remove(1);
            System.out.println(obj);
            
            for(Map.Entry m:obj.entrySet())
            {
            	System.out.println(m.getKey()+" "+m.getValue());
            }
	}

}
