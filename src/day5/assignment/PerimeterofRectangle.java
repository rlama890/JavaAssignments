package day5.assignment;

import java.util.Scanner;

public class PerimeterofRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The Length of the rectangle is :");
		int l = input.nextInt();
		System.out.println("THe Width of the rectangle is :");
		int w = input.nextInt();
		
		int P = 2 * (l + w);
		System.out.println("The Area of a Rectangle is :" + P);
				
		
		input.close();
		

	}

}
