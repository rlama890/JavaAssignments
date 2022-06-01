package q28toq37.assignment;

public class Q32 {

	public static void main(String[] args) {
//		Write a Program to accept 5 values in an array and display their sum. 

		int [] arr = {4, 3, 8, 12, 15};
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum +arr[i];
		}
		System.out.println("Sum of an array element is: " +sum);
	}
		
	}


