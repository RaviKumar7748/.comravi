package com.mypractice;

public class Test1 {
	int a=34;
	int b=21;
	int c=a++ + ++b;
	int d=--a+ --b+c--;
	int e=a+ +b+ +c +d--;
	int f=-a+b-- + -c -d++;
	int sum=a+b+c+d+e+f ;
	public static void main(String [] args) {
		Test1 t=new Test1();
		
		System.out.println(t.sum);
		
		
	}
	
}