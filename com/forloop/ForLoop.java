package com.forloop;

public class ForLoop {
	
	public void add()
	{
		for(int i=0;i<=5;i++){
			
			if(i==2) {
				continue;
			}
			System.out.print(i);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ForLoop f = new ForLoop();
f.add();

	}

}
