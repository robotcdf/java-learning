package com.robotcdf.ch02;

import java.util.Scanner;

public class Test18 {
	/**
	 * �ŷ� �� ���ŵ�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����1.����Scanner����
		Scanner scanner=new Scanner(System.in);
		//����2.�����̨����ı�
		System.out.println("������");
		//����3.��������������ַ���
		String name=scanner.next();
		System.out.println("�Ա�");
		char sex=scanner.next().charAt(0);
		System.out.println("���䣺");
		int age=scanner.nextInt();
		System.out.println("��ߣ�");
		double height=scanner.nextDouble();
		System.out.println("�Ը�");
		String type=scanner.next();
		
	}
	
}
