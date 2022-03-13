package com.sl.methods;

public class MethodOverload {

	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverload m=new MethodOverload();
		System.out.println("Addition if 3 int "+m.add(23, 5, 4));
		System.out.println("Addition of 2 float "+m.add(27.0f, 9.78f));
		System.out.println("Addition of 2 double "+m.add(8.7, 9.1));
		System.out.println("Additon of 3 int "+m.add(11, 5, 5));
	}
}
