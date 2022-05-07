package day5.assignment;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The base of the triangle is :");
		int b = input.nextInt();
		System.out.println("The height of the triangle is :");
		int h = input.nextInt();
		
		int A = b * h/2;
		System.out.println("The Area of a triangle is :" + A);
				
		
		input.close();
		
	}

}
