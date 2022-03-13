package com.sl.accessmodifiersanother;

import com.sl.access.AccessModifiers;

public class TestAccessInAnotherPackage {

	//another class different package 
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		obj.methodPublic();
		obj.methodDefault();
		obj.methodPrivate();
		obj.methodProtected();
	}
}
