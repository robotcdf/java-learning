package com.robotcdf.ch02;

import java.util.Scanner;

public class Test18 {
	/**
	 * 张飞 男 豪放的
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//步骤1.创建Scanner对象
		Scanner scanner=new Scanner(System.in);
		//步骤2.向控制台输出文本
		System.out.println("姓名：");
		//步骤3.接收输入的姓名字符串
		String name=scanner.next();
		System.out.println("性别：");
		char sex=scanner.next().charAt(0);
		System.out.println("年龄：");
		int age=scanner.nextInt();
		System.out.println("身高：");
		double height=scanner.nextDouble();
		System.out.println("性格：");
		String type=scanner.next();
		
	}
	
}
