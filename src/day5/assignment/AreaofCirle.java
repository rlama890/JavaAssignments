package day5.assignment;

import java.util.Scanner;

public class AreaofCirle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("The radius a Circle is :");
		double r = input.nextDouble();

		final double PI = Math.PI;

		double area = PI * r * r;
		System.out.println("The Area of a Circle is :" + area);

		input.close();
	}

}
