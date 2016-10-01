package com.robotcdf.ch03;
import java.util.Scanner;


public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入5分制分数： ");
		int score=scanner.nextInt();
		if (score==5) {
			System.out.println("优秀");
		} else if (score==4) {
			System.out.println("良好");
		} else if (score==3) {
			System.out.println("及格");
		}else if (score>=0&&score<=2) {
			System.out.println("不及格");
		}else {
			System.out.println("输入的分数不是5分制分数");
		}
	}

}
