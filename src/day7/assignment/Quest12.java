package day7.assignment;

import java.util.Scanner;

public class Quest12 {

	public static void main(String[] args) {
		// Write a program to accept the roll, name, and 
		// nationality of the person and display those values in good format. 
        
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String name = input.nextLine();
		System.out.println("Enter the Roll Number :");
		int roll = input.nextInt();
		System.out.println("What is your Nationality :");
		String nationality = input.next();
		
		System.out.println("The Roll Number is :" +roll);
		System.out.println("The Name is :" +name);		
		System.out.println("Your Nationality is :" +nationality);		
		input.close();
		
	}

}
