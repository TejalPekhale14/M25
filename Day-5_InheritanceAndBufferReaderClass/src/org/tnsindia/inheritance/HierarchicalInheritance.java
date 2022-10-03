package org.tnsindia.inheritance;

class AndroidVersion
{
	protected String name="Android latest version";
	public void display1()
	{
		System.out.println(name);
	}
}

class Tiramisu extends AndroidVersion
{
	public String v13="Tiramisu";
	public void display()
	{
		System.out.println(v13);
	}
}

class Snowcone extends AndroidVersion
{
	public String v12="Snowcone";
	public void display()
	{
		System.out.println(v12);
	}
}



public class HierarchicalInheritance {

	public static void main(String[] args) {
		Tiramisu t=new Tiramisu();
        t.display(); 
        Snowcone s=new Snowcone();
        s.display();
        s.display1();
	}

}
