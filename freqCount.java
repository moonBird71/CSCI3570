//Not turning this in as homework - so don't need to cite
import java.util.*;
public class freqCount
{
    public static void main (String args[])
    {
		int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0, k=0, l=0, m=0, n=0, o=0, p=0, q=0, r=0, s=0, t=0, u=0, v=0, w=0, x=0, y=0, z=0;
		int total = 0, index = 0, divisor = 0;
		char capital = 'A';
        Scanner in = new Scanner(System.in);

        System.out.print("Input a text string: ");
        String text = in.nextLine();
		text = text.toUpperCase();
		
		for(int count = 0; count < text.length(); count++)
		{
			char ch = text.charAt(count);
			switch(ch)
			{
				case 'A' :
					a++;
					break;
				case 'B' :
					b++;
					break;
				case 'C' :
					c++;
					break;
				case 'D' :
					d++;
					break;
				case 'E' :
					e++;
					break;
				case 'F' :
					f++;
					break;
				case 'G' :
					g++;
					break;
				case 'H' :
					h++;
					break;
				case 'I' :
					i++;
					break;
				case 'J' :
					j++;
					break;
				case 'K' :
					k++;
					break;
				case 'L' :
					l++;
					break;
				case 'M' :
					m++;
					break;
				case 'N' :
					n++;
					break;
				case 'O' :
					o++;
					break;
				case 'P' :
					p++;
					break;
				case 'Q' :
					q++;
					break;
				case 'R' :
					r++;
					break;
				case 'S' :
					s++;
					break;
				case 'T' :
					t++;
					break;
				case 'U' :
					u++;
					break;
				case 'V' :
					v++;
					break;
				case 'W' :
					w++;
					break;
				case 'X' :
					x++;
					break;
				case 'Y' :
					y++;
					break;
				case 'Z' :
					z++;
					break;
				default :
			}//end switch
			total++;
		}//end for( ; <text.length; )
		System.out.println("Frequency Count:");
		System.out.printf("A:%d\t%f\n", a, (a / (double)total));
		System.out.printf("B:%d\t%f\n", b, (b / (double)total));
		System.out.printf("C:%d\t%f\n", c, (c / (double)total));
		System.out.printf("D:%d\t%f\n", d, (d / (double)total));
		System.out.printf("E:%d\t%f\n", e, (e / (double)total));
		System.out.printf("F:%d\t%f\n", f, (f / (double)total));
		System.out.printf("G:%d\t%f\n", g, (g / (double)total));
		System.out.printf("H:%d\t%f\n", h, (h / (double)total));
		System.out.printf("I:%d\t%f\n", i, (i / (double)total));
		System.out.printf("J:%d\t%f\n", j, (j / (double)total));
		System.out.printf("K:%d\t%f\n", k, (k / (double)total));
		System.out.printf("L:%d\t%f\n", l, (l / (double)total));
		System.out.printf("M:%d\t%f\n", m, (m / (double)total));
		System.out.printf("N:%d\t%f\n", n, (n / (double)total));
		System.out.printf("O:%d\t%f\n", o, (o / (double)total));
		System.out.printf("P:%d\t%f\n", p, (p / (double)total));
		System.out.printf("Q:%d\t%f\n", q, (q / (double)total));
		System.out.printf("R:%d\t%f\n", r, (r / (double)total));
		System.out.printf("S:%d\t%f\n", s, (s / (double)total));
		System.out.printf("T:%d\t%f\n", t, (t / (double)total));
		System.out.printf("U:%d\t%f\n", u, (u / (double)total));
		System.out.printf("V:%d\t%f\n", v, (v / (double)total));
		System.out.printf("W:%d\t%f\n", w, (w / (double)total));
		System.out.printf("X:%d\t%f\n", x, (x / (double)total));
		System.out.printf("Y:%d\t%f\n", y, (y / (double)total));
		System.out.printf("Z:%d\t%f\n", z, (z / (double)total));
		System.out.printf("Total:%d\n", total);
		index = ((a * (a - 1)) + (b * (b - 1)) + (c * (c - 1)) + (d * (d - 1)) + (e * (e - 1)) + (f * (f - 1)) + (g * (g - 1)) + (h * (h - 1)) + (i * (i - 1)) + (j * (j - 1)) + (k * (k - 1)) + (l * (l - 1)) + (m * (m - 1)) + (n * (n - 1)) + (o * (o - 1)) + (p * (p - 1)) + (q * (q - 1)) + (r * (r - 1)) + (s * (s - 1)) + (t * (t - 1)) + (u * (u - 1)) + (v * (v - 1)) + (w * (w - 1)) + (x * (x - 1)) + (y * (y - 1)) + (z * (z - 1)));
		System.out.printf("Index of Coincidence: %f\n", ((double)index / (total * (total - 1))));
    }//end main()
}//end class
