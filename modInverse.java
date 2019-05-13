import java.util.Scanner;
public class modInverse{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int a = 0, m = 0, n = 0;
		
		System.out.println("Inverse of int a mod m is x * a = 1 (mod m)");
		System.out.print("Input a: ");
		a = in.nextInt();
		System.out.print("Input m: ");
		m = in.nextInt();
		System.out.print("Input range of numbers to check: ");
		n = in.nextInt();
		
		System.out.println("Multiples of a:\t\tMultiples of m:");
		for(int num = 1; num <= n; num++){
			System.out.printf("%d * %d = %d\t\t%d * %d = %d\n", a, num, (a * num), m, num, (m * num));
		}
		System.out.println("---------------------------------");
		/*for(int num = 0; num < n; num++){
			System.out.printf("%d * -%d = %d\t\t%d * %d = %d\n", a, num, (a * -(num)), m, num, (m * -(num)));
		}*/
	}
}