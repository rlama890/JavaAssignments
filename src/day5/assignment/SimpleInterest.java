package day5.assignment;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The Principal Balance is :");
		int P = input.nextInt();
		System.out.println("The Time is :");
		int T = input.nextInt();
		System.out.println("The Rate of Interest is :");
		int R = input.nextInt();
	
		
		int SI = P * T * R/100;
		System.out.println("The Simple Interest is Equals to :" +SI);
		
		input.close();
		
		
	}

}
