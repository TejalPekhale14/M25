package org.tnsindia.thiskeyword;

class A
{
	public String name;
	public int id;
	public void accept(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void print()
	{
		System.out.println("The name is:"+name);
		System.out.println("The ID is:"+id);
	}
}

public class DemoOnThisKeywordInstanceVariable {

	public static void main(String[] args) {
		A a=new A();
		a.accept("Tejal",1);
        a.print();
	}

}
