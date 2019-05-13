import java.util.Scanner;
import java.lang.Math;

public class findPrimes{
	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input the number you want to find factors of: ");
		double n = in.nextDouble();
		double end = Math.sqrt(n);		//find end of possible primes
		
		for(int i = 2; i <= end; i++){	//iterate through all possible primes
			if(n % i == 0){				//if perfect divisor
				System.out.printf("\t%d\n", i);
			}
		}
	}
}