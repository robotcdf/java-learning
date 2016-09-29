package com.robotcdf.ch02;

import com.sun.prism.ResourceFactoryListener;

public class Test01 {
	/**
	 * ((sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))
	 * @param args
	 */
	public static void main(String[] args) {
/*		System.out.println("((sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))=" +
	    Math.round(10*(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)))/10.0);*/
		double sqrt20 = Math.sqrt(20); 
		double sqrt10 = Math.sqrt(10); 
		double result = (sqrt20+sqrt10)/(sqrt20-sqrt10);
		result = Math.round(10*result)/10.0;
		System.out.println("((sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+result);
		
		
	}

}
