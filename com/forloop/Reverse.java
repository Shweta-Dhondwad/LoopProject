package com.forloop;

import java.util.Scanner;

class Reverse
{
	public static void main(String[ ] arg)
{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:" );
		str=sc.nextLine();
		System.out.print("The reverse of '"+str+"'is ");
		int i = str.length();
		while(i>0)
		{
			System.out.print(str.charAt(i-1));
			i--;
		}
}
} 