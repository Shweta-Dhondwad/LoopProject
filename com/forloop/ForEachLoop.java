package com.forloop;

import java.util.Scanner;

public class ForEachLoop {
	public void sum(){
		int a[]={1,2,3};
		int b[]=a;
		for(int i : b){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForEachLoop e = new ForEachLoop();
		e.sum();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int i = s.nextInt();
		System.out.println(i);
		
	}

}
