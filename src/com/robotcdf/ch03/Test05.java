package com.robotcdf.ch03;
import java.util.Scanner;


public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入分数：");
		int score=scanner.nextInt();
		if (score>=60) {
			System.out.println(score+"及格");
		}
	}

}
