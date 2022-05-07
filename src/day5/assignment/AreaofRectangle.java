package day5.assignment;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The Length of the rectangle is :");
		int l = input.nextInt();
		System.out.println("The Width of the rectangle is :");
		int w = input.nextInt();
		
		int A = l * w;
		System.out.println("The Area of a Rectangle is :" + A);
				
		
		input.close();
		
	}

}
