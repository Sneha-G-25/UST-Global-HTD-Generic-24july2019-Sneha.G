package com.dev.lambda;

public class Test {

	public static void main(String[] args) {
		FunInt f = () -> {
			try {
			int i = 10/0;
			System.out.println(i);
			}catch(Exception e) {
				System.out.println("their was exception");
			}
		};
		f.printVal();
		
		
		FunIn1 f1 = () -> System.out.println("This is lambda function without curly braces");
		f1.withoutBraces();
		
		FunIn1 f2 = () -> System.out.println("this is second implimentation foe the same funvctional interface");
		f2.withoutBraces();
		
		FunIn2 f3 = (int i) -> {
			for(double j = 0 ; j<=i ; j++) {
				System.out.println("j = "+ j/5);
			}
		};
		f3.loop(5);
		
	}

}
