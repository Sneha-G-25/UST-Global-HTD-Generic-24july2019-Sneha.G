public class Pattren_assi1
{
	public static void main(String[] args) 
	{
		
		int row = 4;
		for (int i = 1 ; i<= row ; i++ ) 
		{
			int num = i;
			
			for ( int j = 1 ; j <= i ; j++ ) 
			{
				System.out.print( num + " ");
				num = num + row -j ;
			}
			System.out.println();
		}
	}
}