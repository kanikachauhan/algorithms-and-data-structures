package com.daa.practice.stack;

public class ArrayStack<T> {
	
	private T arr[]; 
	
	private static int top = -1;
	private static int CAPACITY = 1000;
	
	public ArrayStack() {
		arr = (T[]) new Object[CAPACITY];
	}

	public void push(T data) {
		if(top==CAPACITY) {
			System.out.println("Stack flow !");
			return ;
		}
		top = top + 1;
		arr[top] = data;
	}
	
	public T pop() {
		if(top==-1) {
			System.out.println("Stack underflow !");
			return null;
		}
		T data = arr[top];
		top = top-1;
		return data;
	}

	public T peek() {
		if(top==-1) {
			System.out.println("Stack underflow !");
			return null;
		}
		T data = arr[top];
		return data;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}
