package com.alien;

/*
 
* 
* * 
* * * 
* * * * 
* * * * *   
   
*/

//Java Program to Print Right Triangle Star Pattern

public class RightTriangleStarPattern {

	public static void main(String[] args) {

		int n = 5;

		for (int a = 0; a < n; a++) {
			for (int b = 0; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
