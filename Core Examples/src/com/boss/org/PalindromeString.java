package com.boss.org;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="bhaskerreddy515@gmail.com";
		
		/*System.out.println("Enter a String:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();*/
		
		
		int length=str.length();
		System.out.println(length);
		String replaceString=str.replace("reddy","xxxx");
		System.out.println(replaceString);
		System.out.println(str.substring(7, 25));
		
		
		
		
		
		
		
		/*for(int i=length-1;i>=0;i--)
			rev=rev+str.charAt(i);
		if(str.equals(rev))
			System.out.println("Plindrome enter String:"+str);
		else 
			System.out.println("Not a Plindrome Enter String:"+str);
	*/
	}
}
