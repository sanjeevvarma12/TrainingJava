package com.SampleJavaProject;

public class Divisors {
		   
	 static void printDivisors(int n) 
	    { 
		 int count=0;
	        for (int i=2;i<=n;i++) 
	            if (n%i==0 && i!=n) { 
	                System.out.printf("%d ",i);
	                count++;}
	            else if(i==n && count==0) {
	            	System.out.println(n);
	            }
	    } 
	  
	    // Driver method 
	    public static void main(String args[]) 
	    { 
	        System.out.println("The divisors of 100 are: "); 
	        printDivisors(12);; 
	    } 
}
