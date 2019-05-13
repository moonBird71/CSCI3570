//specifically for 3.5.1
import java.util.Scanner;
public class CFB
{
	//need text blocks, key, m, initial, and both formulas
	int[] plainInt = new int[4];
	int[] cipherInt = new int[4];
	int[] key = new int[3];
	
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		//encrypt or decrypt
		System.out.print("Are you 1) encrypting or 2) decrypting?  1 or 2: ");
		int n = in.nextInt();
		
		if(n == 1){
			//encrypt: get x and k
			System.out.print("Please input the plaintext:");
			String plaintext = in.nextLine();
			
			//send to y
		}
		
		else if(n == 2){
			//decrypt: get y and k
			//
		}
		
		//catchall
		else{}
	}
	
	//receive x and k, return y
	public int y(){}
	
	//receive y and k, return x
	public int x(){}
	
	//
	public int z(){}
}