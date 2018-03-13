package com.boss.org;

public class SwapDemo {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		System.out.println("Before swaping:");
		System.out.println("i value="+i);
		System.out.println("j value="+j);
		i=i+j;//30
		j=i-j;//30-20=10
		i=i-j;//30-10=20
		System.out.println("After swaping:");
		System.out.println("i value="+i);
		System.out.println("j value="+j);
		
	}

}

