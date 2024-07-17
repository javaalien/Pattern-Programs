package com.alien;

// Java Program to Print a Plus (+) Pattern

/*

  *
  *
*****
  *
  *
  
*/

public class PlusPattern {

	public static void main(String[] args) {

		int rows = 5;

		int midRow = rows / 2 + 1;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (i == midRow || j == midRow) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
