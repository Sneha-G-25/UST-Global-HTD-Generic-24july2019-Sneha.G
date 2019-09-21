package com.dev.strings;

public class String_methods {

	public static void main(String[] args) {
		
		String name1 = "Sun is rising" ;
		// converting string to character 
		char[] charecter = name1.toCharArray();
		System.out.println("Using toCharArray() Charecter at 0 position is "+ charecter[0]);

		//using charAt()
		char At = name1.charAt(3);
		System.out.println("Using charAt() the charecter at 3rd index is" + At);

		//using equals()
		String compare1 = "sun is rising";
		boolean output = name1.contentEquals(compare1);
		System.out.println("Using equals() compared result is " + output);
		
		// using equalsIgnoreCase()
		
		boolean ignore = name1.equalsIgnoreCase(compare1);
		System.out.println("output of the equalseIgnoreCase() compared output is " +ignore);

	}

}
