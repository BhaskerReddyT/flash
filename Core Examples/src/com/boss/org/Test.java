package com.boss.org;

public class Test {
	public void getData(){
		int i=10;
		int j=30;
		int k=i+j;
		System.out.println(k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		t1.getData();
		Test2 t2=new Test2();
		t2.setData();
		System.out.println(t1.hashCode());
		
	}

}
