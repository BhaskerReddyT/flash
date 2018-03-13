package com.boss.org;

import java.util.Scanner;

public class CoreString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter String: ");
		String str=sc.nextLine();
*/	      String str="bhaskerreddy515@gmail.com";
		//System.out.println(str);
		/*for(int i=str.length()-1;i>=0;i--)
		System.out.print(str.charAt(i));
		System.out.println(str.isEmpty());
		//System.out.println(str.equals(str1));
		 * 
*/		
		//Replace 
		System.out.println(str.substring(0, 7));
		try{
		System.out.println(str.replace(str, null));
		}catch (NullPointerException e)
		{
			System.out.println(e);
			System.out.println("=========================");
		}
		finally{
			StringBuffer str3=new StringBuffer(str);
			System.out.println(str3.replace(7, 12, "XXXX"));
		}
		

	}

}
