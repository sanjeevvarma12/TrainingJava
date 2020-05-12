package com.SampleJavaProject;

public class ShortestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrays=  { {1,2,3,4},{0,2,7},{4,12},{1,2,5,6} };
		//System.out.println("Array 1: "+arrays[0][]+"length is:"+arrays[0].length);
		System.out.println("Array 2: "+arrays[1].length);
		System.out.println("Array 3: "+arrays[2].length);
		System.out.println("Array 4: "+arrays[3].length);
		int shortestArr[][] = null;
		int shortlength = 0;
		for(int i=0;i<arrays.length;i++) {
			// shortestArr=arrays[i];
			int shortlength1=arrays[i].length;
			 for(int j=i+1;j<arrays.length;j++) {
				// shortestArr=arrays[j];
				int shortlength2=arrays[j].length;
				 if(shortlength2<shortlength1) {
					 shortlength=shortlength2;
					 for(int k=0;k<arrays[i].length;k++) {
						 shortestArr[k]=arrays[k];
						 
					 }
					
				 }
				
			 }			
			
		}
		 System.out.println("the shortest array is:"+shortlength+"shortest array is"+shortestArr);
		// for(int k=0;)+
	}

}
