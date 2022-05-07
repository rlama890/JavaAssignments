package day10.assignment;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// Write a program to relate two integers entered by the user using = =or > or <
		// sign.

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = input.nextInt();
		System.out.println("Enter b :");
		int b = input.nextInt();

		if (a == b) {
			System.out.println("a is equal to b");
		}
		if (a > b) {
			System.out.println("a is greater than b");
		}
		if (a < b) {
			System.out.println("a is less than b");
		}

	}
}
