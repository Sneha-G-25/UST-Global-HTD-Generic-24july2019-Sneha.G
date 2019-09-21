public class Logical
{
	public static void main(String[] args) 
	{
		boolean b = true;
		boolean c = false ;
		boolean d = b && c ;   // Logical AND condition
		System.out.println("out put is " + d);   // output will be false sice c is false
		boolean or = b || c ;  	// logical  OR  condition
		System.out.println("output is " + or);	// output will be true since aleast one input is true

		boolean some = !(or);
		System.out.println("Some output is " + some);

		byte x = 3;
		byte y = 2 ;
		int bit = x & y;	// bit_wise and
		System.out.println("out of bitwise AND is " + bit); 

		byte i = 5 ;
		byte  j = 4;
		int  bit_or = i | j ;	// bit_wise or
		System.out.println(" output of bitwise OR is " + bit_or);  

		int bit_xor = i ^ j ;
		System.out.println(" output of bitwise xor operator is " + bit_xor);


	}
}