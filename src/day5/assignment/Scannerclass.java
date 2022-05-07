package day5.assignment;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1 is :");
		int num1 = input.nextInt();
		System.out.println("Enter num2 is :");
		int num2 = input.nextInt();

		int sum = num1 + num2;

		System.out.println("sum of num1 and num2 is :" + sum);

		input.close();

	}

}
