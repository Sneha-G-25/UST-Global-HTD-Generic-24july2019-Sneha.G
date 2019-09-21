package com.dev.strings;

public class String_impli {

	public static void main(String[] args) {
		String  name = "Sneha G";
		int len = name.length();
		System.out.println("Length of the string is " + len);

		// converting string to character 
		char[] charecter = name.toCharArray();
		System.out.println("string to charecter convertion was "+ charecter[0]);

		//using charAt()
		char At = name.charAt(3);
		System.out.println("Charecter at index 3 is " + At);

		//using equals()
		String compare = "sneha G";
		boolean output = name.contentEquals(compare);
		System.out.println("compared output for to string is " + output);
		
		// using equalsIgnoreCase()
		
		boolean ignore = name.equalsIgnoreCase(compare);
		System.out.println("output of the equalsIgnorecase() is "+ ignore);
		
		//Using contains()
		boolean check = name.contains("neha");
		System.out.println("output of contains() is "+ check);
		
		// using replace()
		String newValue = compare.replace('s','S');
		System.out.println("output for replace() is "+ newValue);
		
		// using indexOf()
		int index = name.indexOf('S');  // returns the letter at first occurrence
		System.out.println("output of indexOf() is " + index);
		
		// using toUpperCase()
		String upperCase = name.toUpperCase();
		System.out.println("output of the toUppercase() is "+ upperCase);
		
		//Using sudstring()
		 String sub = name.substring(3) ;
		 System.out.println("output of the substring method is " + sub);
		 
		 // Substring() with 2 arguments
		 String  sub1 = name.substring(2,7);   
		 // begining index letter will also be printed untill the end-index minus one
		 System.out.println("output of substring with 2 arguments is " + sub1);
	}

}
