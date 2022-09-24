package com.daa.practice.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArrayRearrangementTest {

	private ArrayRearrangement arrayRearrangement;
	
	@BeforeEach
	public void setUp() {
		arrayRearrangement = new ArrayRearrangement();
	}
	
	@Test
	public void testRearrangeArrayIAtI() {
		int arr[]  = new int[] { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		assertTrue(arrayEqual(new int[] {-1, 1, 2, 3, 4, -1, 6, -1, -1, 9}, arrayRearrangement.rearrangeArrayIAtI(arr)));
	}
	
	@Test
	public void testMoveZerosToEnd() {
		int arr[] = {1, 2, 0, 0, 0, 3, 6};
		assertTrue(arrayEqual(new int[] {1, 2, 3, 6, 0, 0, 0}, arrayRearrangement.moveZerosToEnd(arr)));
	}
	
	@Test
	public void testMoveAllNegativesToEnd() {
		int arr[] =  {1, -1, 3, 2, -7, -5, 11, 6 };
		assertTrue(arrayEqual(new int[] {1, 3,2,11,6,-1,-7,-5}, arrayRearrangement.moveAllNegativesToEnd(arr)));
	}
	
	@Test
	public void testSegregateEvenOddNumbers() {
		int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
		assertTrue(arrayEqual(new int[] {10, 6, 2, 4, 7, 3, 9, 1}, arrayRearrangement.segregateEvenOddNumbers(arr)));
	}
	
	private boolean arrayEqual(int arr1[],int arr2[]) {
		if(arr2==null || arr1.length!=arr2.length)
			return false;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}

}
