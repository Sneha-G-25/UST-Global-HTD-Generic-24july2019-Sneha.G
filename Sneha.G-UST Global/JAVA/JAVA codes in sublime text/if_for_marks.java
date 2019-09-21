public class if_for_marks
{
	public static void main(String[] args)
	 {
		int marks = 70 ;

		if (marks <=100 && marks>=91)
		{
			System.out.println("execlent it you got A grade");
		}	
		else if (marks<=90 && marks >=81)
		{
			System.out.println("great job you got B grade");
		}
		else if(marks <=80 && marks >=71)
		{
			System.out.println("yepee you got C grade");
		}
		else if(marks <= 70 && marks >=61)
		{
			System.out.println(" good you got D grade");

		}
		else if(marks <= 60 && marks >=51)
		{
			System.out.println("can improve  you got E grade");
		}
		else if (marks <=50 && marks >=41)
		{
			System.out.println("sory poor performance , have to take retest");
		}
		else if ( marks <= 40 && marks >=0 )
		{
			System.out.println("better luck next time");
		}
		else if (marks >=100 && marks >=0)
		{
			System.out.println(" in-valied input");
		}
		else
		{
			System.out.println("in valied input");
		}
	}
}