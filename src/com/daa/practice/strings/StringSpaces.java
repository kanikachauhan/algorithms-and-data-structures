package com.daa.practice.strings;

public class StringSpaces {

	public String removeSpaces(String str) {
		int count = 0;
		char carr[] = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				carr[count] = str.charAt(i);
				count++;
			}
		}
		for(int i=count;i<str.length();i++) {
			carr[i] = ' ';
		}
		return new String(carr).trim();
	}
	
	public String moveSpacesFront(String str) {
		int count = 0;
		char carr[] = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				count++;
		}
		int j=0;
		for(int i=0;i<count;i++)
			carr[i] = ' ';
		for(int i=0;i<str.length();i++) {
				if(str.charAt(i)!=' ') {
					carr[count] = str.charAt(i);
					count++;
				}
		}
		return new String(carr);
	}
}
