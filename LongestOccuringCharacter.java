package com.SampleJavaProject;

public class LongestOccuringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1 = "aabbabacbccccddd";  
	       int count;
	       int count2=0;
	       int k=0;
	         
	       //Converts given string into character array  
	       char string[] = string1.toCharArray();  
	         
	       System.out.println("Duplicate characters in a given string: ");  
	       //Counts each character present in the string  
	       for(int i = 0; i <string.length; i++) {  
	           count = 1;
	           int j=0; 
	           for(j = i+1; j <string.length; j++) {  
	               if(string[i] == string[j] && string[i] != ' ') {
	            	  // System.out.println("string[i]"+string[i]);
	                   count++; 
	                  
	                   //Set string[j] to 0 to avoid printing visited character  
	                   string[j] = '0';  
	               }  
	           }  
	           //A character is considered as duplicate if count is greater than 1  
	           int temp=0;
	           if(count > 1 && string[i] != '0') {
	        	   
	        	   temp=count;
	        	   
	        	   System.out.println("char "+string[i]+"--> count:"+count+" at index:"+i);
	        	   if(temp>count2) {
	        		   count2=count;
	        		   k=i;
	        		   
	        		//   System.out.println("char "+string[i]+"--> count is greater here:"+count+" at index:"+i);
	        		 //  System.out.println("This is the highest repeated character");
	        	   }
	           }
	           else if(count==1 && string[i] != '0') {
	        	//   System.out.println("char "+string[i]+"--> count is greater here:"+count+" at index:"+i);
	           if(temp>count2) {
	        	   count2=count;
        		 //  System.out.println("This is the highest repeted character");
        	   }
	           }
	       }
	       System.out.println("this is the highest count :"+count2);
	       System.out.println("char "+string[k]+"--> count is greater:"+count2+" at index:"+k);
		
		
		
		
		

	}

}
