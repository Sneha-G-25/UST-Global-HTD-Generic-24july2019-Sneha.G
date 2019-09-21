class Oparator{

	public static int add (int i ,int j)
	{
       return i + j;
	}
	public static int sub (int i , int j)
	{
		return i-j;
	}
	public static int div (int i , int j)
	{
		return i/j;

	}
	public static int mul (int i , int j)
	{
		return i*j;
	}
	public static void main(String[] args)
	 {
		int x = add('A',2);
		System.out.println(x);
		int y = sub(10,30);
		System.out.println(y);
		int z = div(20,10);
		System.out.println(z);
		int a = mul(10,10);
		System.out.println(a);
	}
}