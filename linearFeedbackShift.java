import java.util.*;
public class linearFeedbackShift
{
    public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		//establish array of register numbers (don't need more than 6 for 3.4)
		int registers[] = new int[6];
		//other variables
		int formula[] = new int[6];
		int a = 0;
		//ask for final shift register and initial condition
			//ask for number of shift registers
		System.out.print("How many registers?");
		int last = in.nextInt();
			//ask for initial condition
			//use scanner and for-loop (--) to assign to variables
		for(int n = last; n > 0; n--)
		{
			System.out.printf("What is the initial condition of register %d?", n);
			registers[n - 1] = in.nextInt();
		}
			//ask for final shift register formula (only need addition and MOD 2 for 3.4)
				//use while-loop to keep getting variables to add and mod
		System.out.print("What is the formula for the final shift register?  Give the number of the register to be added : ");
		
		//will need to check no repeats, not just initial condition
		//while-loop (condition != initial condition && t > 0)
			//concatenate variables into condition
			//print t and condition
			//change variables 
				//(including t)
	}
}
