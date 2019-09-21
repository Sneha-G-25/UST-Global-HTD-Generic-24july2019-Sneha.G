package com.dev.constructor;
import com.dev.methods.MethodExample;    // to use the call a method from another pakage we import

public class Demo {

	public static void main(String[] args) {
		int i = MethodExample.calArea(3) ;
		System.out.println(i);
		System.out.println(MethodExample.j);
		
//		double k = MethodExample.areaCir(3) ;
//		System.out.println(i);
//		System.out.println(MethodExample.j);


	}

}
