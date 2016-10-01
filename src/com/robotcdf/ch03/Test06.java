package com.robotcdf.ch03;
import java.util.Scanner;


public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入第一个数：");
		int a=scanner.nextInt();
		System.out.println("输入第二个数");
		int b=scanner.nextInt();
		if (a>b) {
			System.out.println(a+"是最大数");
		} else {
			System.out.println(b+"是最大数");
		}
	}

}
