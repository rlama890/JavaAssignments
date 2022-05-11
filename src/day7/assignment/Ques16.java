package day7.assignment;

import java.util.Scanner;

public class Ques16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + " is even number.");
		} else {
			System.out.println(n + " is odd number.");
		}

	}

}
