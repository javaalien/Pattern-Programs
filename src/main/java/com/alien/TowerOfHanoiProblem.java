package com.alien;

// Write a Java program for solving the Tower of Hanoi Problem.

public class TowerOfHanoiProblem {

	public static void main(String[] args) {

		TOH('A', 'B', 'C', 3);

	}

	private static void TOH(char source, char aux, char dest, int noDisk) {

		if (noDisk > 0) {
			TOH(source, dest, aux, noDisk - 1);
			System.out.println("Move 1 disk from " + source + " to " + dest + " using " + aux + ".");
			TOH(aux, source, dest, noDisk - 1);
		}

	}

}
