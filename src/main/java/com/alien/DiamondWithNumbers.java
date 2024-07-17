package com.alien;

// Java Program to Print a Diamond Shape with Numbers

/*

   1
  123
 12345
1234567
 12345
  123
   1

*/

public class DiamondWithNumbers {

	public static void main(String[] args) {

		int height = 7;
		int n = height / 2 + 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
