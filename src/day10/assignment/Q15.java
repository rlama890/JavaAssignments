package day10.assignment;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// Write a program that receives an ASCII code (between 0 – 128)
		// and display its character [example: 97 (input) ->a(output)].

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		char n = (char) input.nextInt();
		if (n >= 0 && n <= 128) {
			char asciiCode = (char) n;
			System.out.println("The corresponding character is: " + asciiCode);
		}

		input.close();

	}

}
