package day11.assignment;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		// Program to input the number of (1...7) and 
		//translate to its equivalent name of the day of the week. 
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice :");
		int choice = input.nextInt();
		switch (choice) {
		
		case 1:
			System.out.println("Today is Sunday.");
			break;
		case 2:	
			System.out.println("Today is Monday.");
			break;
		case 3:
			System.out.println("Today is Tuesday.");
			break;
		case 4:
			System.out.println("Today is Wednesday.");
			break;
		case 5:	
			System.out.println("Today is Thursday.");
			break;
		case 6:
			System.out.println("Today is Friday.");
			break;
		case 7:
			System.out.println("Today is Saturday.");
			break;
			default:
			System.out.println("wrong choice");
			break;
		} input.close();//end
			
				
		
	}


	}


