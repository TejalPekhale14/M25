package org.tnsindia.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoOnQueue {

	public static void main(String[] args) {
		
         Queue<Character> list=new PriorityQueue<>();
         list.add('z');
         list.offer('a');
         list.offer('s');
         list.offer('p');
         for(Character c:list)
         {
        	 System.out.println(c);
         }
         
         System.out.println(list);
         //list.remove();
         list.poll();
         System.out.println(list);
         System.out.println(list.peek());
	}

}
