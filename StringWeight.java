package com.SampleJavaProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringWeight {
	
		// Function to find string score 
		 static int strScore(String s) 
		 { 
		     int score = 0, index=0; 
		     for (int i = 0; i <s.length(); i++) {
		    	 System.out.println("11111 "+s.charAt(i));
		    	 
		    	 score=score+s.charAt(i) - 'a' ;		    	
		    	 score=score+1;
			
		            
		         }  
		     return score; 
		     }
		
		   
		 // Driver code 
		   
		   
		     public static void main (String[] args) { 
		             
		     String s = "apple"; 
		      
		     int score = strScore(s); 
		     System.out.println( score); 
		     } 
	 } 
		    
		    

	
	


