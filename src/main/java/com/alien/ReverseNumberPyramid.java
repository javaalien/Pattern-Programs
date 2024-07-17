package com.alien;

// Java Program to Print a Reverse Number Pyramid

/*

15 14 13 12 11
      10 9 8 7
        6 5 4
          3 2
            1

*/

public class ReverseNumberPyramid {

	public static void main(String[] args) {

		int rows = 5;
		int startNumber = rows * (rows + 1) / 2;

		for (int i = rows; i >= 1; i--) {
			System.out.format("%" + (rows - i + 1) * 2 + "s", "");

			for (int j = i; j >= 1; j--) {
				System.out.print(startNumber + " ");
				startNumber--;
			}
			System.out.println();
		}
	}
}
