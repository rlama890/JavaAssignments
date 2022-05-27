package day12.assignment;

public class Q27 {
	
//	Write a Program to sum each digit of given number as well as product. //456 =>4*5*6 and 4+5+6 
		
	
		public int addition() {
			int a = 4; 
			int b = 5; 
			int c = 6;
			int sum = a + b + c; 
			return sum; 

		}
		public int multiplication1() {
		   int a = 4;
		   int b = 5; 
		   int c = 6; 
		   int mul = a* b * c; 
		      
		   return mul;
		   }
		
			
		public static void main(String[] args) {
		Q27 obj = new Q27();
		int sum = obj.addition();
		System.out.println("sum is :"+sum);
		int mul = obj.multiplication1();
		System.out.println("product is :"+mul);
		

	}


		private int multiplication() {
			// TODO Auto-generated method stub
			return 0;
		}

}
