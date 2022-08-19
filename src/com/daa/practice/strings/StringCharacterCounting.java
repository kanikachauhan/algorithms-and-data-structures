package com.daa.practice.strings;

public class StringCharacterCounting {

	public int countUpperCase(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>='A' && c<='Z')
				count++;
		}
		return count;
	}
	
	public int countLowerCase(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>='a' && c<='z')
				count++;
		}
		return count;
	}
	
	public int countNumbers(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>='0' && c<='9')
				count++;
		}
		return count;
	}
	
	public int countSpecial(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(!(c>='A' && c<='Z') && !(c>='a' && c<='z') && !(c>='0' && c<='9'))
				count++;
		}
		return count;
	}
	
	//number of substrings of length k is n-k+1 
	public int numberOfSubstrings(String str) {
		int n = str.length();
		return (n*(n+1))/2;
	}
	
	
	public int numberSamePositionASEnglish(String str) {
		int count = 0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			int ind = (int)(c-'a');
			if(ind==i)
				count++;
		}
		return count;
	}

	/**
	 * (frequency of ‘a’+1)C2
	 * @param str
	 * @return
	 */
	public int numberOfSubstringsWithsameEndings(String str) {
		int carr[] = new int[26];
		int result = 0;
		for(int i=0;i<str.length();i++) {
			carr[str.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			result = result + ((carr[i]) * (carr[i]+1)/2); 
		}
		return result;
	}
	
	public String commonCharactersInAlphabeticalOrder(String str1,String str2) {
		int carr1[] = new int[26];
		int carr2[] = new int[26];
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<str1.length();i++) {
			char c = str1.charAt(i);
			carr1[c-'a']++;
		}
		for(int i=0;i<str2.length();i++) {
			char c = str2.charAt(i);
			carr2[c-'a']++;
		}
		for(int i=0;i<26;i++) {
			int min = Integer.min(carr1[i],carr2[i]);
			for(int j=0;j<min;j++) {
				builder.append((char)(i+'a'));
			}
		}
		return builder.toString();
	}
	
	
	public String distinctCharactersInString(String str) {
		int carr[] = new int[256];
		StringBuilder builder = new  StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			carr[c]++;
		}
		
		for(int i=0;i<str.length();i++) {
			if(carr[str.charAt(i)]==1 && str.charAt(i)!=' ' )
				builder.append(str.charAt(i));
		}
		return builder.toString();
	}
	
	public String removeVowelsFromString(String str) {
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(!isVowel(c))
				builder.append(c);
		}
		return builder.toString();
	}
	
	public String removeConsecutiveVowels(String str) {
		//your article is in queue
		StringBuilder builder = new StringBuilder();
		//TODO
		return builder.toString();
	}
	
	public int countVowels(String str,int i,int count) {
		if(i==str.length())
			return count;
		if(isVowel(str.charAt(i)))
			count++;
		return countVowels(str, i+1, count);
	}
	
	public int countConsonants(String str,int i,int count) {
		if(i==str.length())
			return count;
		if(!isVowel(str.charAt(i)) && str.charAt(i)!=' ')
			count++;
		return countConsonants(str, i+1, count);
	}
	
	public boolean halvesHaveSameCharacters(String str) {
		int len = str.length();
		int carr[] = new int[26];
		str = str.toLowerCase();
		for(int i=0;i<len/2;i++) {
			char c = str.charAt(i);
			carr[c-'a']++;
		}
		for(int i=len/2;i<len;i++) {
			char c = str.charAt(i);
			carr[c-'a']--;
		}
		for(int i=0;i<carr.length;i++) {
			if(carr[i]!=0)
				return false;
		}
		return true;
	}
	
	private boolean isVowel(char c) {
		return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
	}
	
}
