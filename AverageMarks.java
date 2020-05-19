package com.SampleJavaProject;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AverageMarks {
	
	public static void main(String args[]) {
		String array[][]= {{"Abc","80"},{"xyz","60"},{"pqr","65"},{"Abc","86"}};
		Map<String,Integer> map= new HashMap<>();
		String key="";
		int value=0;
		for(String[] m:array) {
			key=m[0];
			value=Integer.valueOf(m[1]);
			if(map.containsKey(key)) {
				int mapValue= map.get(key);
				map.put(key,(mapValue+value)/2);
				
			}else {
				map.put(key,value);
			}
			
		}
		
		int max=Collections.max(map.values());
		for(Entry<String,Integer> entryset:map.entrySet()) {
			if(entryset.getValue() == max)
				System.out.println(entryset.getKey()+" "+entryset.getValue());
		}
		
		
	}

}
