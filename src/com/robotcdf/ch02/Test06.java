package com.robotcdf.ch02;

public class Test06 {

	public static void main(String[] args) {
		System.out.println("byte的数值总数：" + (Byte.MAX_VALUE-Byte.MIN_VALUE+1));
		System.out.println("byte的取值范围" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println(Byte.parseByte("108") + 10);
		
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println(Integer.parseInt("50000"+5));
		System.out.println(Integer.toBinaryString(16));
		System.out.println(Integer.toHexString(16));
	}

}
