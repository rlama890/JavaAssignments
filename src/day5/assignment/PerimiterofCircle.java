package day5.assignment;

import java.util.Scanner;

public class PerimiterofCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("The radius a Circle is :");
		double r = input.nextInt();
	
	    final double PI = Math.PI;

		
		double p = 2 * PI * r;
		System.out.println("The Perimiter of a Circle is :" + p);
		
		
		
	
		
		input.close();

	}

}
