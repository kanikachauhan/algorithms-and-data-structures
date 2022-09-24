package com.daa.practice.strings;

import java.util.Arrays;

public class StringOccurrence {

	public char kthNonRepeatingCharacter(String str,int k) {
		int carr[] = new int[256];
		int oarr[] = new int[256];
		Arrays.fill(oarr, str.length());
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			carr[c]++;
			if(carr[c]==1)
				oarr[c] = i;
			else
				oarr[c] = str.length();
		}
		Arrays.sort(oarr);
		return str.charAt(oarr[k-1]);
	}
	
	public char firstRepeatedCharacter(String str) {
		int carr[] = new int[256];
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			carr[c]++;
			if(carr[c]>1)
				return c;
		}
		return ' ';
	}
	
	public char maxOccuringCharacter(String str) {
		int carr[] = new int[256];
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			carr[c]++;
		}
		int max = Integer.MIN_VALUE;
		int ind = -1;
		for(int i=0;i<carr.length;i++) {
			if(carr[i]>max) {
				max = carr[i];
				ind = i;
			}
		}
		return (char)ind;
	}
	
	public char firstNonRepeatedCharacter(String str) {
		int carr[] = new int[256];
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			carr[c]++;
		}
		for(int i=0;i<carr.length;i++) {
			if(carr[i]==1)
				return (char)i; 
		}
		return ' ';
	}
	
	public char maxConsecutiveRepeatingCharacter(String str) {
		int count = 0;
		char c = ' ';
		int max = Integer.MIN_VALUE;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}
			else
			{
				if(count>max) {
					max = count;
					c = str.charAt(i);
				}
				count = 1;
			}
		}
		return c;
	}

	public boolean checkOccurrencesTogether(String str,char c) {
		int i=0;
		boolean flag = false;
		int count = 0;
		while(i<str.length()) {
			while(i<str.length() && str.charAt(i)==c) {
				flag = true;
				i++;
			}
			if(flag) {
				count++;
			}i++;
		}
		if(count>1)
			return false;
		return true;
	}
}
