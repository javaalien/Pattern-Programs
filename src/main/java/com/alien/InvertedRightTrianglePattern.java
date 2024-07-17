package com.alien;

// Java Program to Print an Inverted Right Triangle Star Pattern

/*

* * * * *
* * * *
* * *
* *
*

*/

public class InvertedRightTrianglePattern {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = rows; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
