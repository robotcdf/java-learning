package com.robotcdf.ch03;
import java.util.Scanner;


public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����5���Ʒ����� ");
		int score=scanner.nextInt();
		if (score==5) {
			System.out.println("����");
		} else if (score==4) {
			System.out.println("����");
		} else if (score==3) {
			System.out.println("����");
		}else if (score>=0&&score<=2) {
			System.out.println("������");
		}else {
			System.out.println("����ķ�������5���Ʒ���");
		}
	}

}
