package com.SampleJavaProject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Good day day bye bye";
		StringTokenizer st= new StringTokenizer(s," ");
		
		System.out.println("***"+s);
		String[] str= s.split("\\s");
		System.out.println("str:"+str);
		//Set hs= new HashSet<String>()(str);
		List<String> lst= Arrays.asList(str);
		System.out.println(lst);
		LinkedHashSet<String> lhs=new LinkedHashSet<String>(Arrays.asList(str));
		for(String ls:lhs) {
			System.out.println(ls);
		}
		StringBuilder sb=new StringBuilder();
		int index=0;
		for(String s1:lhs) {
			if(index>0)
				sb.append(" ");
			
			sb.append(s1);
			index++;
		}
		s=sb.toString();
		System.out.println("After removing duplicates:"
				+ s);
		

	}

}
