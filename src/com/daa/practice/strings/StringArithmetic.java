package com.daa.practice.strings;

public class StringArithmetic {

	
	public boolean isDivisibleBy11(String str) {
		long s1=0;
		long s2=0;
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				s1 = s1 + Integer.parseInt(str.charAt(i)+"");
			}else {
				s2 = s2 + Integer.parseInt(str.charAt(i)+"");
			}
		}
		if(s1>s2) {
			return ((s1-s2)%11)==0;
		}else {
			return ((s2-s1)%11)==0;
		}
	}
	
	public boolean isDivisibleBy4(String str) {
		if(str.length()<2)
			return Integer.parseInt(str)%4==0;
		int n = str.length();
		int temp = Integer.parseInt(str.charAt(n-2)+"")*10+Integer.parseInt(str.charAt(n-1)+"");
		return temp%4==0;
	}
	
	public boolean isEvenOrOdd(String str) {
		int n = str.length();
		int temp = Integer.parseInt(str.charAt(n-1)+"");
		return temp%2==0;
	}

	public int sumAddNumbers(String str) {
		int sum = 0 ;
		String temp = "0";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);		
			if(Character.isDigit(c)) {
				temp  = temp + c;
			}else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum+Integer.parseInt(temp);
	}
	
	public int maximumNumericValue(String str) {
		int max = Integer.MIN_VALUE;
		String temp = "0";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				temp = temp + c;
			}else {
				int tempVal = Integer.parseInt(temp);
				if(tempVal>max)
					max = tempVal;
				temp = "0";
			}
		}
		return max;
	}
	
}
