package com.alien;

import java.util.Scanner;

/*

1 
1 2 
3 5 8 
13 21 34 55 
89 144 233 377 610 

*/

// Java Program to Print a Fibonacci Pyramid

public class FibonacciPyramid {

	public static void main(String[] args) {
		int n = 5;
		fiboTriangle(n);
	}

	private static void fiboTriangle(int n) {
		int N = n * (n + 1) / 2;
		int f[] = new int[N + 1];
		fib(f, N);
		int fiboNum = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(f[fiboNum++] + " ");
			System.out.println();
		}
	}

	private static void fib(int[] f, int n) {
		f[1] = 1;
		f[2] = 1;
		for (int i = 3; i <= n; i++)
			f[i] = f[i - 1] + f[i - 2];
	}
}
