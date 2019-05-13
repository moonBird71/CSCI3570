import java.util.Scanner;
import java.util.Arrays;
public class signature{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int coset = 0, total = 0, k = 0;
		char ch;
		
		System.out.print("Input the ciphertext (no spaces): ");	//need to get ciphertext
		String cipher = in.nextLine();
		cipher = cipher.toUpperCase();
		total = cipher.length();											//get total number of letters
		System.out.print("Input keyword length: ");
		k = in.nextInt();													//get key length
		
		int set[][] = new int[k][26];											//k cosets, each has 26 letters
		double freq[][] = new double[k][26];									//keep track of freq of each letter of each coset
		
		for(int count = 0; count < total; count++){								//need to count each letter in each coset
			coset = (count + 1) % k;		
			ch = cipher.charAt(count);										//get letter at that spot
			switch(ch){															//switch statement to get letter count
				case 'A' :														//letter corresponds to numerical equivalent 
					set[coset][0]++;
					break;
				case 'B' :
					set[coset][1]++;
					break;
				case 'C' :
					set[coset][2]++;
					break;
				case 'D' :
					set[coset][3]++;
					break;
				case 'E' :
					set[coset][4]++;
					break;
				case 'F' :
					set[coset][5]++;
					break;
				case 'G' :
					set[coset][6]++;
					break;
				case 'H' :
					set[coset][7]++;
					break;
				case 'I' :
					set[coset][8]++;
					break;
				case 'J' :
					set[coset][9]++;
					break;
				case 'K' :
					set[coset][10]++;
					break;
				case 'L' :
					set[coset][11]++;
					break;
				case 'M' :
					set[coset][12]++;
					break;
				case 'N' :
					set[coset][13]++;
					break;
				case 'O' :
					set[coset][14]++;
					break;
				case 'P' :
					set[coset][15]++;
					break;
				case 'Q' :
					set[coset][16]++;
					break;
				case 'R' :
					set[coset][17]++;
					break;
				case 'S' :
					set[coset][18]++;
					break;
				case 'T' :
					set[coset][19]++;
					break;
				case 'U' :
					set[coset][20]++;
					break;
				case 'V' :
					set[coset][21]++;
					break;
				case 'W' :
					set[coset][22]++;
					break;
				case 'X' :
					set[coset][23]++;
					break;
				case 'Y' :
					set[coset][24]++;
					break;
				case 'Z' :
					set[coset][25]++;
					break;
				default :
			}//end switch
		}
		//get freq count for each letter; need total of each coset
		for(int r = 0; r < k; r++){
			for(int c = 0; c < 26; c++){			
				freq[r][c] = (set[r][c]) / (double)(total / k);					//set[coset][letter] / number of letters per coset = letter freq
			}
		}
		/*
		//sort in ascending order - keep letter association?
		for(int c = 0; c < freq.length(); c++){
			Arrays.sort(freq[c]);
		}
		//plot on top of English?
		for(int r = 0; r < k; r++){
			System.out.printf("Coset %d: ", r + 1);
			for(int c = 0; c < 26; c++){
				System.out.printf("%f ", freq[r][c]);
			}
			System.out.println();
		}
		*/
		//print freq count
		for(int r = 0; r < k; r++){
			char letter = 'A';
			System.out.printf("Coset %d:\n", r + 1);
			for(int c = 0; c < 26; c++){
				System.out.printf("%c:\t%d\t%f\n", letter, set[r][c], freq[r][c]);
				letter++;
			}
		}
	}
}