package day6.assignment;

import java.util.Scanner;

public class VolumeOfCylinder {

	// Write a program that reads the radius and length of a cylinder and computes volume.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("The Radius of a cylinder is :");
		int r = input.nextInt();
		System.out.println("The length of a cylinder is :");
		int h = input.nextInt();
		
		final double PI = Math.PI;
		
		double vol = PI * r * r * h;
		System.out.println("The Volume of a cylinder is :" + vol);
		
		input.close();
		
		
		
	}

}
