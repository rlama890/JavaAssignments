package q38to42.assignment;

import java.util.Scanner;

public class InitialsQ39 {
	
	
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your First Name: ");
		String first = input.next();
		System.out.print("Enter your Last Name: ");
		String last = input.next();
		
		String intitials = first.substring(0, 1) + "." + last.substring(0, 1);
		System.out.println(intitials);
		
		

}

	
}

