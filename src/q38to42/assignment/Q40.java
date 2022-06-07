package q38to42.assignment;

public class Q40 {



	   public static void main(String[] args) {


	       String stringExample  =  "GoodMorning";

	       System.out.println("Original string: "+stringExample);


	       
	       StringBuilder reverseString = new StringBuilder(stringExample);


	       reverseString.reverse();


	       

	       String result = reverseString.toString();


	       System.out.println("Reversed string: "+result); 
	   }

	}
	 

