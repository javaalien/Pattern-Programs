package com.alien;

// Java Program to Print a Number Pyramid

/*

      1
    2 3
  4 5 6
7 8 9 10
11 12 13 14 15

*/

public class NumberPyramid {

	public static void main(String[] args) {

		int rows = 5;

		int currentNumber = 1;

		for (int i = 1; i <= rows; i++) {
			System.out.format("%" + (rows - i + 1) * 2 + "s", "");
			for (int j = 1; j <= i; j++) {
				System.out.print(currentNumber + " ");
				currentNumber++;
			}
			System.out.println();
		}
	}
}
