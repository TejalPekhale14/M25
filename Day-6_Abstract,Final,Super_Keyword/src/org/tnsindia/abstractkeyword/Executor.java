package org.tnsindia.abstractkeyword;

public class Executor {

	public static void main(String[] args) {
		Person p=new Employee("Tejal","Female",1);
		Person p1=new Employee("Prajkta","Female",2);
		System.out.println(p.toString());
        p.work();
        p1.work();
        p.changeName("Disha");
        System.out.println(p.toString());
	}

}
