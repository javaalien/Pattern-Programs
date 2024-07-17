package com.alien;

/*


*************
 ***********
  *********
   *******
    *****
     ***
      *
*/

// Java Program to Print an Inverted/Reverse Pyramid

public class ReversePyramidStarPattern {

	public static void main(String[] args) {

		int num = 7;

		for (int i = num; i >= 1; i--) {
			for (int j = i; j < num; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
