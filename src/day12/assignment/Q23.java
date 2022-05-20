package day12.assignment;

public class Q23 {

	public static void main(String[] args) {
		// Write a Program to sum 1 to nth natural numbers. 
		int n = 10;
		int sum = 0;
		for(int i = 1; i <= n; i++ ) {
			sum = sum + i;
		}
		System.out.println("sum of nth number is: " +sum);
	}

}
