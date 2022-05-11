package day7.assignment;

import java.util.Scanner;

//Write a program to swap two numbers 
//a) using temporary variable 
public class Quest11 {

	public static void main(String[] args) {

		//taking input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = input.nextInt();
		System.out.println("Enter b");
		int b = input.nextInt();

		int temp = a;
		a = b;
		b = temp;
		System.out.println("The Value of a :" + a);
		System.out.println("The Value of b :" + b);

		// b) without temp variable
		System.out.println("Enter a :");
		a = input.nextInt();
		System.out.println("Enter b");
		b = input.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("The Value of a is :" + a);
		System.out.println("The Value of b is :" + b);

		input.close();
	}

}
