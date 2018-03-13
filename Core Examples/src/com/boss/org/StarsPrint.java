package com.boss.org;

import java.util.Scanner;

public class StarsPrint {

	public static void main(String[] args) {
		System.out.println("Pls enter a no:");
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		for(int i=0;i<l;i++)
		{
			for(int j=i;j<l;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
