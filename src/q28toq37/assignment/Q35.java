package q28toq37.assignment;

public class Q35 {

	public static void main(String[] args) {
//		Write a function to find the second largest number in a given array. 
		
		int [] arr = new int[]{8, 7, 5};
		
		int seclarg = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > seclarg) {
			seclarg = arr[i];
			}
		}
		System.out.println("Second Largest element of an array: " + seclarg);
	}

	}


