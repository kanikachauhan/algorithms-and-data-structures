package com.daa.practice.strings;

public class StringReverseRotation {

	public String leftRotate(String str,int d) {
		int n = str.length();
		StringBuilder builder = new StringBuilder();
		builder.append(str.substring(d, n));
		builder.append(str.substring(0,d));
		return builder.toString();
	}
	
	public String rightRotate(String str,int d) {
		int n = str.length();
		StringBuilder builder = new StringBuilder();
		builder.append(str.substring(n-d, n));
		builder.append(str.substring(0, n-d));
		return builder.toString();
	}
	
	public String reverseEquation(String str) {
		String res = "";
		String temp = "";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='/'||c=='+'||c=='-'||c=='*'||c=='^') {
				res =  c + temp + res;
				temp = "";
			}else {
				temp = temp + c;
			}
		}
		res =  temp + res;
		return res;
	}
	
	//method 1
	public boolean checkIfTwoStringsAreRotations(String str1,String str2) {
		String str = str1+str1;
		return str.contains(str2);
	}
	
	public String reverse(StringBuilder builder,String str,int i,int n) {
		if(i==n)
			return builder.toString();
		builder.append(str.charAt(n-i-1));
		i=i+1;
		return reverse(builder, str, i, n);
	}
	
	public String reverseWithoutEffectingSpecialCharacters(String str) {
		int l = 0;
		int r = str.length()-1;
		char arr[] = str.toCharArray();
		while(l<r) {
			if(!Character.isAlphabetic(arr[l]))
				l++;
			else if(!Character.isAlphabetic(arr[r]))
				r--;
			else {
				char temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
		}
		return new String(arr);
	}

	public String reverseWordsOfString(String str) {
		StringBuilder builder  = new StringBuilder();
		String rev = reverse(new StringBuilder(), str, 0, str.length());
		String arr[] = rev.split(" ");
		for(int i=0;i<arr.length;i++) {
			builder.append(reverse(new StringBuilder(), arr[i], 0, arr[i].length()));
			builder.append(" ");
		}
		return builder.toString().trim();
	}
	
	public String reverseIndidualWords(String str) {
		String arr[] = str.split(" ");
		StringBuilder builder  = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			builder.append(reverse(new StringBuilder(), arr[i], 0, arr[i].length()));
			builder.append(" ");
		}
		return builder.toString().trim();
	}

	public String reverseWordsPreservingSpaces(String str) {
		int l = 0;
		char arr[] = str.toCharArray();
		int r = str.length()-1;
		while(l<r) {
			if(!Character.isAlphabetic(arr[l])) {
				l++;
			}else if(!Character.isAlphabetic(arr[r])) {
				r--;
			}else {
				char c = arr[l];
				arr[l] = arr[r];
				arr[r] = c;
				l++;
				r--;
			}
		}
		return new String(arr);
	}

	public String reverseStringRemoveVowels(String str) {
		StringBuilder builder = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			char c = str.charAt(i);
			if(!isVowel(c)) {
				builder.append(c);
			}
		}
		return builder.toString();
	}
	
	public boolean checkIfCircularRotations(int mat[][]) {
		String init_str = "";
		for(int i=0;i<mat[0].length;i++) {
			init_str = init_str + mat[0][i];
		}
		String temp_str = init_str + init_str;
		for(int i=1;i<mat.length;i++) {
			String str_temp = "";
			for(int j=0;j<mat[i].length;j++) {
				str_temp = str_temp + mat[i][j];
			}
			if(!temp_str.contains(str_temp))
				return false;
		}
		return true;
	}
	
	private boolean isVowel(char c) {
		return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
	}
	
}
