public class Method_1
{
	public static int calcArea(int side){
		int area = side * side ;
		return area;
	}
	public static double areaCircle(int rad){
		double area1 = 3.14 * rad* rad ;
		return area1;
	}
	public static int avgNum(int a, int b, int c){
		int avg =(a + b+ c)/2 ;
		return avg;
	}
	public static double areaTri(int height , int base){
		double area2 = 0.5 * base * height  ;
		return area2;
	}

	public static void main(String[] args)
	{
		 int a = calcArea(5);
		 System.out.println("Area of square is " + a);
		 double b = areaCircle(7);
		 System.out.println("Area of circle is "+ b);
		 int c = avgNum(6,7,9);
		 System.out.println("Average of numbers is " + c);
		 double d = areaTri(6,2);
		 System.out.println("Area of triangle is " + d);
	}
}