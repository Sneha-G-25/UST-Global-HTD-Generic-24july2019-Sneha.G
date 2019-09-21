public class Usage_Of_Operators
{
	public static void main(String[] args)
	{
		int a = 10 ;
		char b = 'A';
		int add = a + b ;		// usage of assigment operator also
		System.out.println("output for addition is " + add);

		int incriment = ++a;  // usage of increment operator
		System.out.println("output of increment operator is " + incriment);

		boolean rel_operator = a < b ;
		System.out.println("output of relational operator is " + rel_operator);

		boolean i = true;

		boolean logi_operator = i && !(i);
		System.out.println(" output of logical_operator "+ logi_operator);

		int bit_wise = a & a ;
		System.out.println(" output of bitwise operator is " + bit_wise);


	}
} 