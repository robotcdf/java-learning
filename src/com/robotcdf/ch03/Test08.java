package com.robotcdf.ch03;
import java.util.Scanner;


public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����java������ ");
		int java=scanner.nextInt();
		System.out.println("����android������ ");
		int android=scanner.nextInt();
		System.out.println("����sql������ ");
		int sql=scanner.nextInt();
		
		if (java>=android && java>=sql) {
			System.out.println("��߷֣�"+java);
		} else if(android>=sql){
			System.out.println("��߷֣�"+android);
		}else {
			System.out.println("��߷֣� "+sql);
		}
	}

}
