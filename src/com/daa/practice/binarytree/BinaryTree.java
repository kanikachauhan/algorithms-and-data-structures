package com.daa.practice.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

	List<Node<Integer>> inorderList,postorderList,preorderList = null;

	public List<Node<Integer>> inorder(Node<Integer> root){
		inorderList = new ArrayList<>();
		inOrderUtils(root);
		return inorderList;
	}
	
	public List<Node<Integer>> preorder(Node<Integer> root){
		preorderList = new ArrayList<>();
		preOrderUtils(root);
		return preorderList;
	}
	
	public List<Node<Integer>> postorder(Node<Integer> root){
		postorderList = new ArrayList<>();
		postOrderUtils(root);
		return postorderList;
	}
	
	
	private void inOrderUtils(Node<Integer> root){
		if(root==null)
			return;
		inOrderUtils(root.left);
		inorderList.add(root);
		inOrderUtils(root.right);
	}
	
	private void postOrderUtils(Node<Integer> root) {
		if(root==null)
			return;
		postOrderUtils(root.left);
		postOrderUtils(root.right);
		postorderList.add(root);
	}

	private void preOrderUtils(Node<Integer> root) {
		if(root==null)
			return;
		preorderList.add(root);
		preOrderUtils(root.left);
		preOrderUtils(root.right);
	}

	public List<Integer> levelOrder(Node<Integer> root){
		List<Integer> lst = new ArrayList<Integer>();
		Queue<Node<Integer>> queue = new LinkedList<Node<Integer>>();
		queue.add(root);
		lst.add(root.data);
		while(!queue.isEmpty()) {
			Node<Integer> node = queue.poll();
			if(node.left!=null) {
				lst.add(node.left.data);
				queue.add(node.left);
			}
			if(node.right!=null) {
				lst.add(node.right.data);
				queue.add(node.right);
			}
		}
		return lst;
	}
	
	public int sumAllNodes(Node<Integer> root) {
		if (root==null)
			return 0;
		return root.data + sumAllNodes(root.left) + sumAllNodes(root.right);
	}

	int sum = 0;
	
	public int sumOfParentNodes(Node<Integer> root,int x) {
		//TODO
		if(root==null)
			return sum;
		
		if((root.left!=null && root.left.data==x) || (root.right!=null && root.right.data==x)) {
			sum = sum + root.data;
			return root.data;
		}
		return sumOfParentNodes(root.left, x) + sumOfParentNodes(root.right, x);
	}
	int res = 0;
	public int sumofLeftLeaves(Node<Integer> root) {
		//TODO
		if(root == null)
			return 0;
		else {
			if(root.left!=null && root.right==null)
				res = res + root.left.data;
			else
				res = res + sumofLeftLeaves(root.left) ;
			sumofLeftLeaves(root.right);
		}
		return res;
	}
	
	public int sumofRightLeaves(Node<Integer> root,int x) {
		//TODO
		if(root == null)
			return x;
		if(root.right!=null && root.right.left==null && root.right.right==null)
			return root.right.data;
		return sumofRightLeaves(root.left, x) + sumofRightLeaves(root.right, x);
	}
	
	public int sumOfAllLeafNodes(Node<Integer> root) {
		//TODO
		if(root==null)
			return 0;
		if(root.right==null && root.left==null)
			return root.data;
		return sumOfAllLeafNodes(root.left) + sumOfAllLeafNodes(root.right);
	}

	
	public List<Integer> levelOrderSpiral(Node<Integer> root){
		//TODO
		return null;
//		List<Integer> lst = new ArrayList<Integer>();
//		List<Node<Integer>> tempLst = new ArrayList<>();
//		Queue<Node<Integer>> queue = new LinkedList<Node<Integer>>();
//		queue.add(root);
//		lst.add(root.data);
//		tempLst.add(root);
//		boolean flag = false;
//		
//		while(!queue.isEmpty()) {
//			int n = tempLst.size();
//			if(!flag) {
//				for(int i=0;i<n;i++) {
//					Node<Integer> node = tempLst.get(i);
//					queue.poll();
//					if(node.left!=null) {
//						lst.add(node.left.data);
//						queue.add(node.left);
//					}
//					if(node.right!=null) {
//						lst.add(node.right.data);
//						queue.add(node.right);
//					}
//					
//				}
//				flag = true;
//			}else {
//				for(int i=n-1;i>=0;i--) {
//					Node<Integer> node = tempLst.get(i);
//					queue.poll();
//					if(node.left!=null) {
//						lst.add(node.left.data);
//						queue.add(node.left);
//					}
//					if(node.right!=null) {
//						lst.add(node.right.data);
//						queue.add(node.right);
//					}
//					
//				}
//				flag = false;
//			}
//		}
//		return lst;
	}

}
