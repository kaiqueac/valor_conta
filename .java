import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	   double A, B, quantidade;
	   
	   A = sc.nextDouble();
	   B = sc.nextDouble();
	   if (A == 1 ) {
		   quantidade = B * 4.00;
	   }
	   else if (A == 2) {
		   quantidade = B * 4.50;
	   }
	   else if (A == 3) {
		   quantidade = B * 5.00;
	   }
	   else if (A == 4) {
		   quantidade = B * 2.00;
	   }
	   else {
		   quantidade = B * 1.50;
	   }
	   System.out.printf("Total: R$ %.2f%n", quantidade);
	   
	   sc.close();
	}
}
