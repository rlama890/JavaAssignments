package q28toq37.assignment;

public class Q31 {

	public static void main(String[] args) {
//		Write a Program display following patterns. 
//
//	      1 
//
//	      12 
//
//	      123 
//
//	      1234 
//
//	      12345 
int [][] jj = new int[5][];
		
		
		jj[0] = new int[1];
		jj[0][0] = 1;
		
		jj[1] = new int[2];
		jj[1][0] = 1;
		jj[1][1] = 2;
		
		jj[2] = new int[3];
		jj[2][0] = 1;
		jj[2][1] = 2;
		jj[2][2] = 3;
		
		jj[3] = new int[4];
		jj[3][0] = 1;
		jj[3][1] = 2;
		jj[3][2] = 3;
		jj[3][3] = 4;
		
		jj[4] = new int[5];
		jj[4][0] = 1;
		jj[4][1] = 2;
		jj[4][2] = 3;
		jj[4][3] = 4;
		jj[4][4] = 5;
		
		for (int i = 0; i < jj.length; i++) {
			for (int j = 0; j < jj[i].length; j++) {
				System.out.print(jj[i][j] + "");
				
			}
			System.out.println();
		}
		
		
		

	}

}

