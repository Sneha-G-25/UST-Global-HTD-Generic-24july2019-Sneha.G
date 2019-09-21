package com.dev.Method_overriding;

public class Method_overloding_arithmatic_operations {
	
static Method_overloding_arithmatic_operations ref1 = new Method_overloding_arithmatic_operations();

	
	public  void add(int a , int b) 
	{
		int add = a + b ;
		System.out.println("add operation for 2 variables is "+ add);
		
	}
	public void add(int a, int b,int c)
	{
		int add = a + b + c;
		System.out.println("add operation for 3 variables is "+ add);
		
	}
	public void add(int a, int b, int c, int d)
	{
		int add = a+ b + c+ d ;
		System.out.println("add for 4 variables is"+ add);
	}
	public void sub (int a, int b)
	{
		int sub = a + b;
		System.out.println("subraction for 2 variables is "+ sub);
	}
	public void sub (int a, int b , int c)
	{
		int sub = a + b + c;
		System.out.println("subraction for 3 variables is "+ sub);
		
	}
	public void sub (int a, int b, int c, int d)
	{
		int sub = a + b + c + d;
		System.out.println("subraction for 4 variables is "+ sub);
		
	}
	public void mul(int a, int b)
	{
		int mul = a*b;
		System.out.println("multiplication for 2 variables is "+ mul);
	}
	public void mul(int a, int b , int c)
	{
		int mul = a * b *c;
		System.out.println("multiplication for 3 variables is "+ mul);
		
	}
	public void mul(int a, int b , int c , int d)
	{
		int mul = a * b * c * d;
		System.out.println("multiplication for 4 variables is "+ mul);
		
	}
	public void div (float a, float b) {
		float div = a/b;
		System.out.println("division for 2 variables is "+ div);
		
	}
	
	final void div (float a, float b , float c) {  		// final method can be overloaded
		float div = (a/b)/c;
		System.out.println("division for 3 variables is "+ div);
		
	}
	private void div (float a, float b, float c , float d) {		// private method can be overloaded
		float div = (a/b)/(b/c);
		System.out.println("division for 4 variables is "+ div);
		
	}
	

	public static void main(String[] args) {
		

		 ref1.add(2,3);
		 ref1.sub(2, 4,7);
		 ref1.div(8, 4);
	}

}
