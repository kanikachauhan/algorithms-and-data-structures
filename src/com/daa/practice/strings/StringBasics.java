package com.daa.practice.strings;

import java.util.HashSet;

public class StringBasics {

	/**
	 * 
	 * @param str
	 * @param ind
	 * @param carr
	 * @return String
	 */
	public String copyStr(String str,int ind,char carr[]) {
		if(ind==str.length())
			return new String(carr);
		carr[ind] = str.charAt(ind); 
		return copyStr(str, ind+1, carr);
	}
	
	/**
	 * 
	 * @param str
	 * @return boolean
	 */
	public boolean isPanagram(String str) {
		int carr[] = new int[26];
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>='a' && c<='z')
				carr[c-'a'] = 1;
			if(c>='A' && c<='Z')
				carr[c-'A'] = 1;
		}
		for(int i=0;i<carr.length;i++) {
			if(carr[i]==0)
				return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @param str
	 * @return String
	 */
	public String missingCharactersToMakePanagram(String str) {
		StringBuilder builder = new StringBuilder();
		int carr[] = new int[26];
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>='a' && c<='z')
				carr[c-'a'] = 1;
			if(c>='A' && c<='Z')
				carr[c-'A'] = 1;
		}
		for(int i=0;i<carr.length;i++) {
			if(carr[i]==0)
				builder.append((char)(i+'a'));
		}
		return builder.toString();
	}
	
	/**
	 * 
	 * @param str
	 * @return boolean
	 */
	public boolean isPangrammaticLipogram(String str) {
		int count = 0;
		int carr[] = new int[26];
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>='a' && c<='z')
				carr[c-'a'] = 1;
			if(c>='A' && c<='Z')
				carr[c-'A'] = 1;
		}
		for(int i=0;i<carr.length;i++) {
			if(carr[i]==0)
				count++;
		}
		return count==1;
	}

	/**
	 * 
	 * @param str
	 * @return String
	 */
	public String removePunctuations(String str) {
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>='a' && c<='z')
				builder.append(c);
			if(c>='A' && c<='Z')
				builder.append(c);
			if(c==' ')
				builder.append(c);
		}
		return builder.toString();
	}

	/**
	 * 
	 * @param str
	 * @return boolean
	 */
	public boolean isInteger(String str) {
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c<'0' || c>'9'){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * @param str
	 * @return boolean
	 */
	public boolean allCharactersAreSame(String str) {
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		return set.size()==1;
	}
	
	/**
	 * 
	 * @param str
	 * @return String
	 */
	public String findInitials(String str) {
		StringBuilder builder = new StringBuilder();
		builder.append(Character.toString(str.charAt(0)).toUpperCase());
		builder.append(" ");
		for(int i=1;i<str.length()-1;i++) {
			char c = str.charAt(i);
			if(c==' ') {
				builder.append(Character.toString(str.charAt(i+1)).toUpperCase());
				builder.append(" ");
			}
		}
		return builder.toString().trim();  
	}

	/**
	 * A Duck number is a positive number which has zeroes present in it, 
	 * For example 3210, 8050896, 70709 are all Duck numbers. Please note that a numbers with only leading 0s is not considered as Duck Number.
	 * @param str
	 * @return String
	 */
	public boolean isDuckNumber(String str) {
		int len = str.length();
		int i=0;
		while(i<len && str.charAt(i)=='0') {
			i++;
		}
		int j = str.length()-1;
		while(j>=0 && str.charAt(j)=='0') {
			j--;
		}
		for(int k = i;k<=j;k++) {
			if(str.charAt(k)=='0')
				return true;
		}
		return false;
	}
	
}
