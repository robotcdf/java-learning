package com.robotcdf.ch03;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入五分制分数：");
		int score=scanner.nextInt();
		boolean isfivescore=score<0 || score>5;
		System.out.println(score+"不是五分制："+isfivescore);

	}

}
