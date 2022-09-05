package com.daa.practice.strings;

public class StringSubsequence {
	
	public boolean isSubsequence(String str1,String str2) {
		if(str2.length()>str1.length())
			return false;
		int len1 = str1.length();
		int len2 = str2.length();
		int i=0,j=0;
		while(i<len1 && j<len2) {
			if(str1.charAt(i)==str2.charAt(j)) {
				j++;
			}
			i++;
		}
		return j==len2;
	}
	
}
