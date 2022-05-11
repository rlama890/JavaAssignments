package day11.assignment;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// Write a program to calculate leap year. 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Year :");
		int leapYear = input.nextInt();
		
		
		if (leapYear % 4 == 0) {
		System.out.println("The Year is LeapYear because year is evenly divisible by 4." +leapYear);
		}else {
			System.out.println("The Year is not a Leap Year.");
			
		input.close();
		}
		
	}

}
