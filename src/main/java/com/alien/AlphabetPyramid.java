package com.alien;

// Java Program to Print an Alphabet Pyramid

/*

      A 
     B B 
    C C C 
   D D D D 
  E E E E E 
 F F F F F F 
G G G G G G G 


*/

public class AlphabetPyramid {

	public static void main(String[] args) {

		int height = 7;

		char currentChar = 'A';

		for (int i = 0; i < height; i++) {
			for (int j = height - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print(currentChar + " ");
			}
			currentChar++;
			System.out.println();
		}
	}
}
