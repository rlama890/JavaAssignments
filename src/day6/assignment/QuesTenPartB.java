package day6.assignment;

import java.util.Scanner;

public class QuesTenPartB {

	public static void main(String[] args) {
		//10. b)  Write a Program for the following Mathematical Function. 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a :");
		double a = input.nextDouble();
		System.out.println("Enter b");
        double b = input.nextDouble();
        System.out.println("Enter c");
        double c = input.nextDouble();
        
        double s =(a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The Area is :" + area);
        
        input.close();
        
	}

}
