public class Inc$dec 
{
	public static void main(String[] args) 
	{
		int x = 10 ;
		int y ;
		y = x++ ; // post - increment

		System.out.println("y is " + y);
		System.out.println("x is " + x);

		int a = 20;
		int b ;
		b = ++a ;  // pre - increment
		System.out.println("b is " + b);
		System.out.println("a is " + a);

		int c = 30;
		int d ;
		d = --c;
		System.out.println("d is " + d);
		System.out.println("c is " + c);

		int i = 40 ;
		int j ;
		j = i--;
		System.out.println("i is " + i);
		System.out.println(" j is " + j);
	}
}