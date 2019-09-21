package com.dev.methods;

 public class MethodExample {

	public static int j = 0;   // public keyword is used to import it in another package
	static MethodExample a = new MethodExample();  // since it is static it is applicable only in static methods

	public static void main(String[] args) {

		
		j = calArea(7) ;  // method utilization with same data type

		System.out.println("Area of square is " + j);  // using global variable

		double  area1 = a.areaCir(4);		// creating a object to call non-static method
		System.out.println(area1);
		
	

	}
	public static int calArea(int side)
	{
		j = side * side ;
		double  area1 = a.areaCir(4);
		System.out.println(area1); // since the created object in global we can call the method in any method
		return j;

	}
	   double areaCir ( int rad)   // procted can not be accessed in any other package
	{
		double area_cir = 3.14 * rad * rad ;
		return  area_cir ;
	}

}
