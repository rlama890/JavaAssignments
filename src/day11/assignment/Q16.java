package day11.assignment;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// Write a program to find the given number is even or odd.

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = input.nextInt();

		if (a % 2 != 0) {

			System.out.println("The Number is odd");
		} else {
			System.out.println("The Number is even");
		}

		input.close();
	}
}
