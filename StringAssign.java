package Otp;

import java.util.Scanner;

public class StringAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Assignment 1");
		StringBuffer sb = new StringBuffer("iNeuron");
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("======================= ");
		
		System.out.println("Assignment 2");
		String s = "Think Twice";
		String s1="";
		String a[]=s.split("");
		for(int i=a.length-1; i>=0;i--) {
			s1=s1 + a[i];
		}
		System.out.println(s1);
		
		
	
	}

}
