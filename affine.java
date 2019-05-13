//Not turning this in as homework - so don't need to cite
import java.util.*;
public class affine
{
    public static void main (String args[])
    {
		char c;
		char cipher;
		int asc = 0, x = 0, y = 0, en = 0, a = 0, b = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Input a text string (in all caps and no spaces): ");
        String text = in.nextLine();
		//System.out.println(text);

        System.out.print("Input numerical coefficient a: ");
        a = in.nextInt();
		//System.out.println(a);

        System.out.print("Input numerical coefficent b: ");
        b = in.nextInt();
		
		System.out.println("plain-->ascii-->xnum-->ynum");

        for(int i = 0; i < text.length(); i++)
        {
            c = text.charAt(i);                    //get char
			System.out.print(c);
            asc = Character.getNumericValue(c);     //convert char to ASCII
			System.out.print("-->" + asc);
			
            x = asc - (Character.getNumericValue('A')); //convert ASCII to num
			System.out.print("-->" + x);
			y = ((a * x) + b) % 26;               //find y
			System.out.println("-->" + y);
            /*en = y + (Character.getNumericValue('A')); //enciphered ASCII
			System.out.print("-->" + en);
			
			cipher = (char) en;					//convert ASCII to chars
            System.out.print(en);            //print enciphered ASCII chars in a row
			System.out.println();*/
        }
        System.out.println();
    }
}
