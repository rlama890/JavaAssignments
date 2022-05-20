package day12.assignment;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		//Write a program to print the factorial number of given numbers. 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = input.nextInt();
		int fact = 1; 
		for (int i  = n; i >= n; i--) {
			fact = fact * i;
		}
		return;
	}

}

