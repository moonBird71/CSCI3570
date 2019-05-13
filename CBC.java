//specifically for 3.5.1
import java.util.Scanner;
import java.lang.*;
public class CBC
{	
	public static void main (String args[])
	{
		//need text blocks, key, m, initial, etc.
		int[] plainInt = new int[25];
		int[] cipherInt = new int[25];
		//int[] key = new int[3];
		int[] array = new int[20];
		Scanner in = new Scanner(System.in);
		int count = 0;
		
		//encrypt or decrypt
		System.out.print("Are you 1) encrypting or 2) decrypting?  1 or 2: ");
		int n = in.nextInt();
		
		if(n == 1){
			//encrypt: get x and k
			System.out.print("Please input the plaintext (no spaces):");
			String plaintext = in.nextLine();
			for(int i = 0; i < plaintext.length(); i++)
			{
				char ch = plaintext.charAt(i);	//get char at that spot
				int ascii = (int) ch;			//get ascii for char
				String ascStr = String.valueOf(ascii);
				for(int j = 0; j < ascStr.length(); j++)
				{
					if(j <= 3)
					{
						plainInt[count] += ascStr.charAt(j);
					}
					if(j > 3)
					{
						plainInt[count + 1] += ascStr.charAt(j);
					}
				}
				count += 2;
			}
			System.out.print("Please input the key: ");
			int key = in.nextInt();
			//send to getY
			for(int i = 0; i < count; i++)
			{
				cipherInt[i] = getY(plainInt[i], key);
			}
		}
		
		else if(n == 2){
			//decrypt: get y and k
			//
		}
		
		//catchall
		else{}
	}
	
	//receive x and k, return y
	public int getY(int plain, int key)
	{
		int k = key;
		int x = plain;
		int[] arrK = new int [3];
		int[] arrX = new int [4];
		//int[] arrS = {11, 01, 00, 10, 01, 00, 11, 10};
		for(int i = 3; i > 0; i--)
		{
			int n = (int) Math.pow(10, i);
			arrX[i] = x / n;					//set arrX
			x = x % n;
			if(i < 3)
			{
				arrK[i] = k / n;				//set arrK
				k = k % n;
			}
		}
		int s1 = (arrX[2] + arrK[0]) % 2;
		int s2 += (arrX[3] + arrK[1]) % 2;
		int s3 += (arrX[2] + arrK[2]) % 2;
	}
	
	//receive y and k, return x
	public int getX(){}
	
	//
	public int getZ(){}
}