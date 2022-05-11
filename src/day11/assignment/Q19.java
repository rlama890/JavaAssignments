package day11.assignment;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// Write a Program to accept three sides of a triangle and display which kind of triangle is formed.
		Scanner input = new Scanner(System.in);  
		
		
		System.out.println("Enter the length of side a :");
		int a = input.nextInt();
		System.out.println("Enter the length of side b :");
		int b = input.nextInt();
		System.out.println("Enter the length of side c :");
		int c = input.nextInt();
		
		if (a ==b && b == c){
			System.out.println("The triangle is Equilateral Traingle");
		} else if (a ==b && c != a && c !=b) {
		    System.out.println("The triangle is Isoceles Triangle");
		}else {
			System.out.println("The triangle is Scalene triangle");
			input.close();
		}
		} 
		
		
	}
	
	



