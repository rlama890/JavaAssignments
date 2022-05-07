package day5.assignment;

import java.util.Scanner;

public class Permiteroftriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The side of the triangle is :");
		int a = input.nextInt();
		
		System.out.println("The base of the triangle is :");
		int b = input.nextInt();
		System.out.println("The side of the triangle is :");
		int c = input.nextInt();
		
		int P = a * b * c;
		System.out.println("The Perimeter of a triangle is :" + P);
				
		
		input.close();
		
	}
}
