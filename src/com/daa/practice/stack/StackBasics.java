package com.daa.practice.stack;

public class StackBasics {
	
	private ArrayStack<Integer> stack = null;
	private ArrayStack<String> strStack = null;
	
	public StackBasics() {
		stack = new ArrayStack<Integer>();
		strStack = new ArrayStack<String>();
	}
	
	public void pushStack(int data) {
		stack.push(data);
	}
	
	public int popStack() {
		return stack.pop();
	}
	
	public String prefixToInfixConversion(String str) {
		String res = "";
		for(int i=str.length()-1;i>=0;i--) {
			char c = str.charAt(i);
			if(isOperator(c)) {
				String st1 = strStack.pop();
				String st2 = strStack.pop();
				res = "(" + st1 + c + st2 + ")";
				strStack.push(res);
			}else {
				strStack.push(Character.toString(c));
			}
		}
		return strStack.pop();
	}
	
	public String prefixToPostfixConversion(String str) {
		String res = "";
		for(int i=str.length()-1;i>=0;i--) {
			char c = str.charAt(i);
			if(isOperator(c)) {
				String st1  = strStack.pop();
				String st2  = strStack.pop();
				res = st1 + st2 + c ;
				strStack.push(res);
			}else {
				strStack.push(Character.toString(c));
			}
		}
		return strStack.pop();
	}
	
	public String postfixToInfix(String str) {
		String res = "";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(isOperator(c)) {
				String st1 = strStack.pop();
				String st2 = strStack.pop();
				res = "(" + st2 + c + st1 + ")";
				strStack.push(res);
			}else {
				strStack.push(Character.toString(c));
			}
		}
		return strStack.pop();
	}
	
	public String postfixToPrefix(String str) {
		String res = "";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(isOperator(c)) {
				String st1 = strStack.pop();
				String st2 = strStack.pop();
				res = c +  st2 + st1;
				strStack.push(res);
			}else {
				strStack.push(Character.toString(c));
			}
		}
		return strStack.pop();
	}
	
	private boolean isOperator(char c) {
		return c=='*' || c=='-' || c=='+' || c=='/' || c=='^';
	}
	
}
