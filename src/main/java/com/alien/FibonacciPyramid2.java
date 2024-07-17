package com.alien;

/*

    0 
   1 1 
  2 3 5 
 8 13 21 34 
55 89 144 233 377 

*/

// Java Program to Print a Fibonacci Pyramid

public class FibonacciPyramid2 {

	public static void main(String[] args) {

		int rows = 5;
		printFibonacciPyramid(rows);
	}

	private static void printFibonacciPyramid(int rows) {
		int[] fibonacciSequence = generateFibonacciSequence(rows * (rows + 1) / 2);
		int index = 0;

		for (int i = 1; i <= rows; i++) {
			// Print leading spaces for formatting
			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(fibonacciSequence[index++] + " ");
			}

			System.out.println();
		}
	}

	private static int[] generateFibonacciSequence(int length) {

		int[] fibonacci = new int[length];

		if (length > 0) {
			fibonacci[0] = 0;
		}

		if (length > 1) {
			fibonacci[1] = 1;
		}

		for (int i = 2; i < length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}

		return fibonacci;
	}
}
