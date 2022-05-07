package day6.assignment;

import java.util.Scanner;

public class PoundsToKg {

	public static void main(String[] args) {
//Write a program that converts pounds into kg. 
//The program prompts the user to enter a number of pounds, 
//converts it to kg and displays the result [1 pound is 0.454 kg]. 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of pounds :");
		int lbs = input.nextInt();
		
		double kg = lbs/2.2;
		System.out.println("The weight in kg is :" + kg);
		System.out.println("1 pound is 0.454 kg");
		
		input.close();
	}

}
