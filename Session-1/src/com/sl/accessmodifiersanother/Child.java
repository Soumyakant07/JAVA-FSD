package com.sl.accessmodifiersanother;

import com.sl.access.AccessModifiers;

public class Child extends AccessModifiers{

	//child class different package 
	public static void main(String[] args) {
		Child obj=new Child();
		//child will be able to access protected and public properties
		obj.methodPublic();
		obj.methodProtected();
		obj.methodDefault();
		obj.methodPrivate();
	}
}
