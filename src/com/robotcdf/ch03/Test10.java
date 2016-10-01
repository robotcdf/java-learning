package com.robotcdf.ch03;
import java.util.Scanner;


public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入5分制分数： ");
		int score=scanner.nextInt();
		switch (score) {
		case 5:
			System.out.println("优秀");
			break;
		case 4:
			System.out.println("良好");
			break;
		case 3:
			System.out.println("及格");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("不及格");
			break;
		default:
			System.out.println("输入的分数不是5分制分数");
		}
	}

}
