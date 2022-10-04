package org.tnsindia.abstractkeyword;

abstract class A
{
	abstract void print();
}
class B extends A
{
	void print()
	{
		int balance=20000;
		System.out.println("Account Balance is:"+balance);
	}
	
}

public class ATMMachine {

	public static void main(String[] args) {
		A a=new B();
		a.print();
	}

}
