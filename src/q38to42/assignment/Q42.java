package q38to42.assignment;

public class Q42 {
	  
	    public static void main(String[] args) {    
	        String str = "Big mighty mountains are very tall and those big mountains are pleasant to watch.";    
	        int count;    
	            
	        
	        str = str.toLowerCase();    
	            
	          
	        String words[] = str.split(" ");    
	            
	        System.out.println("Duplicate words in a given string : ");     
	        for(int i = 0; i < words.length; i++) {    
	            count = 1;    
	            for(int j = i+1; j < words.length; j++) {    
	                if(words[i].equals(words[j])) {    
	                    count++;    
	                       
	                    words[j] = "0";    
	                }    
	            }    
	                  
	            if(count > 1 && words[i] != "0")    
	                System.out.println(words[i]);    
	        }    
	    }    
	}    

