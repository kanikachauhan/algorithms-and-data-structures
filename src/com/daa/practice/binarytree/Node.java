package com.daa.practice.binarytree;

public class Node<T> {

	Node<T> left,right;
	T data;
	
	public Node(T data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}
