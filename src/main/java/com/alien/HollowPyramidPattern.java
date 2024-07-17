package com.alien;

// Java Program to Print a Hollow Pyramid

/*

    *
   * *
  *   *
 *     *
*********
 
*/

public class HollowPyramidPattern {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || k == (2 * i - 1) || i == rows) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
