package com.alien;

/*

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

*/

//  Java Program to Print a Butterfly Pattern

public class ButterflyPattern {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows; i++) { // print first half
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= 2 * (rows - i); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = rows; i >= 1; i--) { // Just Reverse the first for loop
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= 2 * (rows - i); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
