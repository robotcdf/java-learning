package com.robotcdf.ch03;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������Ʒ�����");
		int score=scanner.nextInt();
		boolean isfivescore=score<0 || score>5;
		System.out.println(score+"��������ƣ�"+isfivescore);

	}

}
