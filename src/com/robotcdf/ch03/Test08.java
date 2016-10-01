package com.robotcdf.ch03;
import java.util.Scanner;


public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入java分数： ");
		int java=scanner.nextInt();
		System.out.println("输入android分数： ");
		int android=scanner.nextInt();
		System.out.println("输入sql分数： ");
		int sql=scanner.nextInt();
		
		if (java>=android && java>=sql) {
			System.out.println("最高分："+java);
		} else if(android>=sql){
			System.out.println("最高分："+android);
		}else {
			System.out.println("最高分： "+sql);
		}
	}

}
