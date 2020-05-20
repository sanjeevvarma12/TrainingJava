package com.SampleJavaProject;

public class Numerology {	
		  public static void main(String[] args) {
		    
		     int size, counter = 0, numer = 0, numFin = 0;
		        char a;

		        String input = "", numero = "";
		        int[] nums;
		        String s="S. KANAPATHY";
		    char[] ch=s.toCharArray();
		    for(int i=0;i<ch.length;i++){
		    System.out.println("ch: "+ch[i]);
		      if(ch[i]=='A'|| ch[i]=='I'|| ch[i]=='J'|| ch[i]=='Q'|| ch[i]=='Y'){
		        numer=numer+1;
		      }
		      if(ch[i]=='B'|| ch[i]=='K'|| ch[i]=='R'){
		        numer=numer+2;
		      }
		      if(ch[i]=='C'|| ch[i]=='G'|| ch[i]=='L'|| ch[i]=='S'){
		        numer=numer+3;
		      }
		       if(ch[i]=='D'|| ch[i]=='M'|| ch[i]=='T'){
		        numer=numer+4;
		      }
		       if(ch[i]=='E'|| ch[i]=='H'|| ch[i]=='N'|| ch[i]=='X'){
		        numer=numer+5;
		      }
		       if(ch[i]=='U'|| ch[i]=='V'|| ch[i]=='W'){
		        numer=numer+6;
		      }
		      if(ch[i]=='O'|| ch[i]=='Z'){
		        numer=numer+7;
		      }        
		      if(ch[i]=='F'|| ch[i]=='P'){
		            numer=numer+8;
		      }
		    }
		      
		      System.out.println("numer1 :"+numer);
		      while(numer>0){
		    	  counter=numer%10;
		    	  numer=numer/10;
		      //  System.out.println("counter :"+counter);
		    	  numFin=+numFin+counter;
		      //  System.out.println("numFin: "+numFin);
		      }
		      System.out.println("numFin: "+numFin);
		      
		    }

}
