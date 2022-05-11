package day11.assignment;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		//Write a program to display the largest number from given three values.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st Number :");
		int a = input.nextInt();
		System.out.println("Enter the 2nd Number :");
		int b = input.nextInt();
		System.out.println("Enter the 3rd Number");
		int c = input.nextInt();
		
		if (a > b && a > c ) {
			System.out.println(a);
		}	else if (b > a  && b > c) {
			System.out.println(b);
		}   if (c > a && c > b){
			System.out.println(c);
		}input.close();
			
		}
			
		} 
		
	
		
		
	


