package com.SampleJavaProject;

import java.util.TreeMap;
import java.util.Vector;

public class TargetValue {
	
	 public static TreeMap<Integer,Object> map=new TreeMap<Integer,Object>();    

	// The vector v stores current subset. 
	static void printAllSubsetsRec(int arr[], int n, Vector<Integer> v, 
							int sum) 
	{ 
		// If remaining sum is 0, then print all 
		// elements of current subset. 
		if (sum == 0) { 
		    map.put(v.size(), v);
			for (int i=0;i<v.size();i++) 
				System.out.print( v.get(i) + " "); 
			System.out.println(); 
			return; 
		} 

		// If no remaining elements, 
		if (n == 0) 
			return; 

		// We consider two cases for every element. 
		// a) We do not include last element. 
		// b) We include last element in current subset. 
		printAllSubsetsRec(arr, n - 1, v, sum); 
		Vector<Integer> v1=new Vector<Integer>(v); 
		v1.add(arr[n - 1]); 
		printAllSubsetsRec(arr, n - 1, v1, sum - arr[n - 1]); 
	} 

	// Wrapper over printAllSubsetsRec() 
	static void printAllSubsets(int arr[], int n, int sum) 
	{ 
		Vector<Integer> v= new Vector<Integer>(); 
		printAllSubsetsRec(arr, n, v, sum); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		int arr[] = {1,2,3,4};; 
		int sum = 6; 
		int n = arr.length; 
		printAllSubsets(arr, n, sum); 
		System.out.println((Vector<Integer>)map.get(map.firstKey()));
	} }
