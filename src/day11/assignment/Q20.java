package day11.assignment;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// Write a program to create the equivalent of a four-function calculator. 
		//The program to enter two integer’s numbers and an operator. 
		//It then carries out the specified arithmetic operator operation: addition, 
		//subtraction, multiplication or division of the two numbers. Finally, it displays the result. 

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter operator :");
		char operator = input.next().charAt(0);
		int a =0; int b = 0;
		if (operator == '+'|| operator == '-' || operator == '*' || operator == '/');{
		
		System.out.println("Enter a :");
		a = input.nextInt();
		System.out.println("Enter b :");
		b = input.nextInt();
		}
		
		switch (operator) {
		case '+':
			int sum = a + b;
			System.out.println("Sum is :" +sum);
			break;
		case '-':
			int sub = a - b;
			System.out.println("Subtraction is :" +sub);
			break;
		case '*':
			int mul = a * b;
			System.out.println("Multiplication is :" +mul);
			break;
		case '/':
			int div = a / b;
			System.out.println("Division is :" +div);

			break;	
			default:
				System.out.println("Wrong operator selection!!");

			break;
		} System.out.println("exit");
		input.close();
	}

}
