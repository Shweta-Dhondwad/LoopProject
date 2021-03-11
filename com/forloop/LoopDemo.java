package com.forloop;

import java.util.Arrays;

public class LoopDemo {

	static String[] array_name={"I","dont","want","to","go","school"};
	static String s="ABCD";
	
	public static void main(String[] args) {
		String str="";
		for (int i = 0; i < array_name.length; i++) {
			
			 str=str+array_name[i];
			
		}
	
	//String str=array_name[0]+array_name[1]+array_name[2]+array_name[3]+array_name[4]+array_name[5];

		System.out.println(str);

	
//	System.out.println(Arrays.toString(array_name));
	
}

	}


