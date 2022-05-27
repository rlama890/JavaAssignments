package day12.assignment;

import java.util.Scanner;

public class Q24 {

		public int findfactorial(int n) {
			
			int fact = 1; 
			for (int i  = n; i >= 1; i--) {
				fact = fact * i;
			}
			return fact;
		}
	public static void main(String[] args) {
		//Write a program to print the factorial number of given numbers. 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = input.nextInt();
		
		
		Q24 obj = new Q24();
    	int factorial = obj.findfactorial(n);
		System.out.println("Factorial of this number is :"+factorial);
	}

}

