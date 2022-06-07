package q38to42.assignment;

public class Q41 {

	public static void main(String[] args) {
		String s1 = "Great Determination";
		char[] arr = s1.toCharArray();
		
		System.out.println("Duplicate characters in the given words are: ");
		
		for (int i = 0; i < s1.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s1.length(); j++) {
				if (arr[i] == arr[j] && arr[i] != '0'){
					count++;
					arr[j] = '0';
					
					
				}
				
			}
			if (count > 1 && arr[i] != '0')
					System.out.println(arr[i]);
			
		}
		
	}

}
