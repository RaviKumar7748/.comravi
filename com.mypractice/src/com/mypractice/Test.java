package com.mypractice;
class Parent{
	  //inheritance example

	 
	public void m1() {
		System.out.println("parent class");
		
	}}
	class Child extends Parent{
	public void m2() {
		System.out.println("Child class");
	}
	
}
public class Test {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Parent p= new Parent(); 
		p.m1();
//		p.m2();
		Child c=new Child();
		c.m1();
		c.m2();
		Parent p1=new Child();
		p1.m1();
//		p1.m2();
//		Child c1=new Parent();

		
	}

}
7G63 F