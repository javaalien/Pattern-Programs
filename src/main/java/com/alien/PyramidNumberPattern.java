package com.alien;
/*  
 		1 
      2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5  

*/

public class PyramidNumberPattern {

	public static void main(String[] args) {

		int num = 5;
		int x = 0;

		for (int i = 1; i <= num; i++) {
			x = i - 1;

			for (int j = i; j <= num - 1; j++) {
				System.out.print(" ");
				System.out.print(" ");
			}

			for (int j = 0; j <= x; j++) {
				System.out.print((i + j) < 10 ? (i + j) + " " : (i + j) + " ");
			}

			for (int j = 1; j <= x; j++) {
				System.out.print((i + x - j) < 10 ? (i + x - j) + " " : (i + x - j) + " ");
			}
			System.out.println();
		}
	}
}
