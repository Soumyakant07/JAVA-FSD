package com.sl.access;

public class TestAccessModifiers {
	
	//another class same package 
			public static void main(String[] args) {
				AccessModifiers obj=new AccessModifiers();
				obj.methodPublic();
				obj.methodDefault();
				obj.methodPrivate();
				obj.methodProtected();
			}

}
