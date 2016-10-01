package com.robotcdf.ch03;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int socre=scanner.nextInt();
		boolean isfive=socre>=0 && socre<=5;
		System.out.println(socre+"是五分制："+isfive);

	}

}
