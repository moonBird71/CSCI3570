import java.util.Scanner;
import java.lang.Math;

public class fermat{
	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
		double n, b, q, a, ab;							//q = a ^ 2
		a = 0;
		
		System.out.print("Please input large number to factor: ");
		n = in.nextDouble();
		b = Math.ceil(Math.sqrt(n));
		
		while((b + a) < (n / 2)){
			q = ((b * b) - n);
			a = Math.sqrt(q);
			ab = b + a;
			System.out.printf("b: %.2f\tq: %.2f\ta: %.2f\tab: %.2f\n", b, q, a, ab);
			
			if(ab % 1 == 0){
				break;
			}
			b++;
		}
		
		System.out.print("Did it work? (Y/N): ");
		char cont = in.next().charAt(0);
		if(cont == 'N'){
			b = Math.ceil(Math.sqrt(n));
			a = 0;
			
			while((b + a) < (n / 2)){
			q = ((b * b) + (2 * b) + 1);
			a = Math.sqrt(q);
			ab = b + a;
			System.out.printf("b: %.2f\tq: %.2f\ta: %.2f\tab: %.2f\n", b, q, a, ab);
			
			if(ab % 1 == 0){
				break;
			}
			b++;
		}
		}
	}
}