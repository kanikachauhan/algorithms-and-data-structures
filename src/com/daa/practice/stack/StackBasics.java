package com.daa.practice.stack;

public class StackBasics {
	
	private ArrayStack<Integer> stack = null;
	
	public StackBasics() {
		stack = new ArrayStack<Integer>();
	}
	
	public void pushStack(int data) {
		stack.push(data);
	}
	
	public int popStack() {
		return stack.pop();
	}
	
	
}
