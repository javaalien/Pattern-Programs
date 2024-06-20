package com.alien;

/*
        * 
      * * 
    * * * 
  * * * * 
* * * * * 

*/

//Java Program to Print Left Triangle Star Pattern

public class LeftTriangleStarPattern {

	public static void main(String[] args) {

		int k = 5;

		for (int a = 0; a < k; a++) {

			for (int b = 2 * (k - a); b >= 0; b--) {
				System.out.print(" ");
			}

			for (int b = 0; b <= a; b++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
