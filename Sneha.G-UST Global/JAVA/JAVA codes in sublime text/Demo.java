public class Pattren_assi2
{
public static void main(String[] args) {
	int space =3 ;
	for (int i =0; i<3 ;  i++ ) {
		for (int j =0 ; j < space ; j++ ) {
			System.out.print("");
		}
		space --;
		for (int k = 0 ; k<=(2*(i-1)); k++ ) {
			System.out.print("*");
		}
		System.out.println();
	}
	space =2 ;
	for(int a = 0 ; a < 2 ; a++){
		for (int b = 0 ; b <space ; b++ ) {
			System.out.print("");
		}
		space++;
		for (int c = 0 ; c <(2*(3-a)-1);c++ ) {
			System.out.println("*");
		}
		System.out.println();
	}
}
}
