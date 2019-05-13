import java.util.*;
import java.io.*;
public class vigenere
{	
    public static void main(String args[])
    {
		Scanner in = new Scanner(System.in);

		char ch, ar, m;
		int asc = 0, asc2 = 0, x = 0, k = 0, y = 0, z = 0;
		
		System.out.print("Input a string: ");
        String text = in.nextLine();
		text = text.toUpperCase();
		//need to get key
		System.out.printf("Input a keyword string (in all caps): ");
        String key = in.nextLine();
		int klen = key.length();
		//call function to translate to numbers in String form
		////numArr = textToNum(text);
		//decide if encrypting/decrypting
		System.out.println("Encrypt or Decrypt?");
		System.out.println("1. Encrypt");
		System.out.println("2. Decrypt");
		int call = in.nextInt();
		if(call == 1){										//(key letter's #) + (plain letter's #) = cipher letter's #
			for(int i = 0; i < text.length(); i++){
				ch = text.charAt(i);
				asc = Character.getNumericValue(ch);
				x = asc - (Character.getNumericValue('A'));	//get textletter's number
				k = (i + 1) % (key.length()); 					//get key number
				//enArr += encrypt(x, k);
			}
			/*for(int i = 0; i < enArr.length(); i++){
				//get ints out of string
			}*/
		}
		else if(call == 2){									//(cipher letter's #) - (key letter's #) % 26 = plain letter's #
			for(int i = 0; i < text.length(); i++){
				ch = text.charAt(i);						//get textletter's number
				System.out.printf("Place in text:%d --> Letter:%c", i, ch);
				asc = (int) ch;
				System.out.printf("--> ASCII:%d", asc);
				z = asc - 65;
				System.out.printf("--> Number:%d\n", z);
				k = i % klen; 				//get keyletter's number
				System.out.printf("Place in text:%d --> Place in key:%d", i, k);
				ar = key.charAt(k);
				System.out.printf("--> Letter:%c", ar);
				asc2 = (int) ar;
				System.out.printf("--> ASCII:%d", asc2);
				y = asc2 - 65;
				System.out.printf("--> Number:%d\n", y);
				x = z - y;									//get plainletter's number
				if(x < 0){
					x = 26 + x;
				}
				System.out.printf("-->Plain number:%d\n", x);
				/*m = (char)(x + Character.getNumericValue('A'));
				System.out.printf("Plain letter:%c\n", m);
				*/
			}
		}
		else{
			System.out.println("Please pick either 1 or 2");
		}
		System.out.println();
	}
}