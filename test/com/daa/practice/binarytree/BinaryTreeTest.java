package com.daa.practice.binarytree;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

	Node<Integer> binRoot;
	
	BinaryTree binaryTree;
	
	@BeforeEach
	public void setUp() {
		binaryTree = new BinaryTree();
		createBinaryTree();
	}
	
	@Test
	public void testInorder() {
		List<Node<Integer>> nodes = binaryTree.inorder(binRoot);
		List<Node<Integer>> expectedNodes = List.of(new Node(4), new Node(2), new Node(5), new Node(1), new Node(3));
		assertTrue(compareList(expectedNodes, nodes));
	}
	
	@Test
	public void testPostorder() {
		List<Node<Integer>> nodes = binaryTree.postorder(binRoot);
		List<Node<Integer>> expectedNodes = List.of(new Node(4), new Node(5), new Node(2), new Node(3), new Node(1));
		assertTrue(compareList(expectedNodes, nodes));
	}
	
	@Test
	public void testPreorder() {
		List<Node<Integer>> nodes = binaryTree.preorder(binRoot);
		List<Node<Integer>> expectedNodes = List.of(new Node(1), new Node(2), new Node(4), new Node(5), new Node(3));
		assertTrue(compareList(expectedNodes, nodes));
	}
	
	@Test
	public void testLevelOrder() {
		List<Integer> levelOrderList = binaryTree.levelOrder(binRoot);
		List<Integer> expectedNodes = List.of(1,2,3,4,5);
		assertTrue(compareList(expectedNodes, levelOrderList));
	}
	
	@Test
	public void testLevelOrderSpiral() {
//		List<Integer> levelOrderList = binaryTree.levelOrderSpiral(binRoot);
//		System.out.println(levelOrderList);
//		List<Integer> expectedNodes = List.of(1,3,2,4,5);
//		assertTrue(compareList(expectedNodes, levelOrderList));
	}
	
	@Test
	public void testSumAllNodes() {
		createNewBinaryTree();
		int sum = binaryTree.sumAllNodes(binRoot);
		assertEquals(106, sum);
	}
	
//	@Test
	public void testsumOfParentNodes() {
		createNewBinaryTreeTwo();
		int sum = binaryTree.sumOfParentNodes(binRoot, 2);
		assertEquals(11, sum);
	}
	
	@Test
	public void testSumofLeftLeaves() {
		createNewBinaryTreeThree();
		int sum = binaryTree.sumofLeftLeaves(binRoot);
		assertEquals(78, sum);
	}

	@Test
	public void testSumofRightLeaves() {
		createNewBinaryTreeFour();
		int sum = binaryTree.sumofRightLeaves(binRoot, 0);
		assertEquals(14, sum);
	}
	
	
	
	private boolean compareList(List lst1, List lst2) {
		if(lst2==null || lst1.size()!=lst2.size())
			return false;
		if(lst1.get(0) instanceof Node) {
			for(int i=0;i<lst1.size();i++) {
				if(((Node)lst1.get(i)).data!=((Node)lst2.get(i)).data)
					return false;
			}
			return true;
		}else if(lst1.get(0) instanceof Integer) {
			for(int i=0;i<lst1.size();i++) {
				if(((Integer)lst1.get(i)).compareTo((Integer)lst2.get(i))!=0)
					return false;
			}
			return true;
		}
		return false;
	}
	
	private void createBinaryTree() {
		binRoot = new Node<>(1);
		binRoot.left = new Node<>(2);
		binRoot.right = new Node<>(3);
		binRoot.left.left = new Node<>(4);
		binRoot.left.right = new Node<>(5);
	}
	
	private void createNewBinaryTree() {
		binRoot = new Node<Integer>(15);
		binRoot.left = new Node<Integer>(10);
		binRoot.right = new Node<Integer>(20);
		binRoot.left.left = new Node<Integer>(8);
		binRoot.left.right = new Node<Integer>(12);
		binRoot.right.left = new Node<Integer>(16);
		binRoot.right.right = new Node<Integer>(25);
	}
	
	private void createNewBinaryTreeTwo() {
		binRoot = new Node<Integer>(4);
		binRoot.left = new Node<Integer>(2);
		binRoot.right = new Node<Integer>(5);
		binRoot.left.left = new Node<Integer>(7);
		binRoot.left.right = new Node<Integer>(2);
		binRoot.right.left = new Node<Integer>(2);
		binRoot.right.right = new Node<Integer>(3);
	}
	
	private void createNewBinaryTreeThree() {
		binRoot = new Node(20);
		binRoot.left = new Node(9);
		binRoot.right = new Node(49);
		binRoot.left.right = new Node(12);
		binRoot.left.left = new Node(5);
		binRoot.right.left = new Node(23);
		binRoot.right.right = new Node(52);
		binRoot.left.right.right = new Node(12);
		binRoot.right.right.left = new Node(50);
	}
	
	private void createNewBinaryTreeFour() {
		binRoot = new Node<Integer>(1);
		binRoot.left = new Node<Integer>(2);
		binRoot.right = new Node<Integer>(3);
		binRoot.left.left = new Node<Integer>(4);
		binRoot.left.right = new Node<Integer>(5);
		binRoot.left.left.right= new Node<Integer>(2);
		binRoot.right.right = new Node<Integer>(8);
		binRoot.right.right.right = new Node<Integer>(7);
		binRoot.right.right.left = new Node<Integer>(6);
				
	}
}
