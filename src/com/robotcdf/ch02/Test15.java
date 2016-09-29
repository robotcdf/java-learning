package com.robotcdf.ch02;

public class Test15 {

	public static void main(String[] args) {
		long l=0x20000000000001l;
		double d=l;
		System.out.println(Long.toBinaryString(l)+":"+l);
		System.out.println(Long.toBinaryString((long)d)+":"+d);  
	}

}
