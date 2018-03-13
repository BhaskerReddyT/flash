package com.boss.org;

public class nestedloopExample {

	public static void main(String[] args) {

		for(int i=1;i<=4;i++)//outer loop
		{
			System.out.println("outer loop started");
			for(int j=1;j<=4;j++)//inner loop
			{
				System.out.println("inner loop");
			}
			System.out.print("outer loop finished");
		}
	}
}


/*//o/p
1 2 3 4
5 6 7
8 9
10*/