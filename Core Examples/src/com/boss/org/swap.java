package com.boss.org;

import static org.junit.Assert.*;

import org.junit.Test;

public class swap {

	@Test
	public void testMain() {
		String input="Hello World";
		//Convert string value to char 
		char[] ch=input.toCharArray();
		//now printing char value in reverse order
		for(int i=input.length()-1;i>=0;i--)
			System.out.print(ch[i]);

	}

}
