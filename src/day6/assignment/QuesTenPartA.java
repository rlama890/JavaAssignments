package day6.assignment;

import java.util.Scanner;

public class QuesTenPartA {

	public static void main(String[] args) {
//10, a)Write a Program for the following Mathematical Function. 
// s = ut + 0.5at^2		

	Scanner input = new Scanner(System.in);
	System.out.println("The initial velocity is :");
	int u = input.nextInt();
	System.out.println("Enter the acceleration :");
	int a = input.nextInt();
	System.out.println("Enter the time :");
	int t = input.nextInt();
	
	
	double s = u*t + 0.5*a*t*t;
	System.out.println("The velocity is equals to :" + s);
	System.out.println("The Formula to Calulate Velocity is s = u*t + 0.5*a*t*t");
	
	
	
	
	input.close();

	}

}
