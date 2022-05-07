package day10.assignment;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// Write a program to print the number entered by the user only if the number
		// entered is negative.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = input.nextInt();

		if (num < 0) {
			System.out.println("The entered negative number is " + num);
		}

		input.close();
	}

}
