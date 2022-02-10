package com.sl.methods;

public class CallByValue {
	
	//class level variable, access using this keyword
		int num=260;
		
		void operation(int num)
		{
			this.num=num*20/200;
		}
		
		public static void main(String[] args) {
			CallByValue c=new CallByValue();
			System.out.println("Value of num Before function call "+c.num);
			
			c.operation(100);
			System.out.println("Value of num After function call "+c.num);
		}

}
