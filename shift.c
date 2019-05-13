#include<stdio.h>
#include<stdlib.h>
#include<time.h>
/*
Remember to put methods at top
*/
void cTextToCNum(int x, char str[], char array[]);
void cNumToSNum();
void sNumToSText();
/*
int genQuestion(int x);
int answerQuestion(int x);
void response(int x, int y);
*/

/*
In main, need to get input then call 26x (or less) loop to print
*/
int main(void)
{
    char str[100];
	char array[] = {A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z};
	int n = 0;
	
	printf("Type a string of no more than 100 characters");
	fgets(str, 100, stdin);
	/*print a line for each shift*/
	for(int c = 1; c < 27; c++){
		/*cipherText to cipherNum*/
		cTextToCNum();
		/*cipherNum to shiftedNum*/
		cNumToSNum();
		/*shiftedNum to shiftedText*/
		sNumToSText();
	}
	
    return 0;
}
/*
Translate ciphered string into numbers
Count how many chars
*/
void cTextToCNum()
{}
/**/
void cNumToSNum()
{}
/**/
void sNumToSText()
{}


