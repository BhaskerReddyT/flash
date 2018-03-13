package com.boss.org;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="cognizant technology solutions company";
		System.out.println(str.length());
		System.out.print(str.substring(21, 30));
		System.out.print(str.substring(9, 21));
		//converting string to char
			//char[] ch=str.toCharArray();
				
				for(int i=str.length()-1;i>=0;i--)
			
				System.out.print(str.charAt(i));
	}

}


