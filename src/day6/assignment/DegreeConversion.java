package day6.assignment;

import java.util.Scanner;

public class DegreeConversion {
//Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit. 
	// Fahrenheit to Celsius

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Fahrenheit to Celsius
		System.out.println("Enter the Fahrenheit :");
		int fahren = input.nextInt();

		int celcius = (fahren - 32) * 5 / 9;
		System.out.println("The Celcius is equals to :" + celcius);

		// Celsius to Fahrenheit
		System.out.println("Enter the Celcius :");
		celcius = input.nextInt();

		fahren = celcius * 5 / 9 + 32;
		System.out.println("The Fahrenheit is equals to :" + fahren);

		input.close();
	}

}
