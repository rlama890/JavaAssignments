package q28toq37.assignment;

public class Q33 {
	
	static int length;
//		Write a Program to display numbers in ascending order in array. 
		 public static void printArray(int[] array){
		    {
		      
		        for (int i = 0; i < length; i++) {
		            System.out.print(array[i] + " ");
		        }
		        System.out.println();
		    }
		  
		 int temporary = 0;
		  
	        for (int i = 0; i < length; i++) {
	            for (int j = i + 1; j < length; j++) {
	                if (array[i] > array[j]) {
	                    temporary = array[i];
	                    array[i] = array[j];
	                    array[j] = temporary;
	                }
	            }
	        }
	  
	       
	        System.out.println(
	            "Elements of array sorted in ascending order: ");
	        printArray(array);
	    }

	}

