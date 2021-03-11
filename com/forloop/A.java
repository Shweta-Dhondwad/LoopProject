package com.forloop;

public abstract class A {
private void m1()
{
	System.out.println("A");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A	 c=new C();
c.m1();
	}

}
class C extends A
{
	protected void m1()
	 {
		System.out.println("B");
	}
}
