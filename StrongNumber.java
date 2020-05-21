package com.SampleJavaProject;

public class StrongNumber {
	static int factorial(int n) {
		int facto=n;
		while(n>1) {
			facto=facto*(n-1);
			n=n-1;			
		}
		System.out.println("facto:  "+facto);
		return facto;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int given=146;
		int n=given;	
		int factValue=0;
		while(n>0){
			int m=n%10;
			factValue=factValue+factorial(m);
			n=n/10;
		}
		System.out.println("factValue: "+factValue);
		if(factValue==given)
		System.out.println("It is Storng number");
		else
			System.out.println("Its not strong number");
	}

}
