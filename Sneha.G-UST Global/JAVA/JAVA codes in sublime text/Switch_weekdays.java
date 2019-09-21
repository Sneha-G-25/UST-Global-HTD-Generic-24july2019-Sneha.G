public class Switch_weekdays
{
	public static void main(String[] args)
	{
		int dayNum = 17;
		switch(dayNum)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5 :
			System.out.println("Weekdays");
			break;
			case 6:
			case 7:
			System.out.println("Weedends");
			break ;
			default :
			System.out.println("invalied input");
		}
		System.out.println("code outide the switch block");
	}
}