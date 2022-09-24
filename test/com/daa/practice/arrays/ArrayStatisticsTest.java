package com.daa.practice.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArrayStatisticsTest {

	private ArrayStatistics arrayStatistics;
	
	@BeforeEach
	public void setUp() {
		arrayStatistics = new ArrayStatistics();
	}
	
	@Test
	public void testLargest() {
		int largest = arrayStatistics.findLargest(new int[] {12, 35, 1, 10, 34, 1 });
		assertEquals(35, largest);
	}
	
	@Test
	public void testSecondLargest() {
		int secondLargest  = arrayStatistics.findSecondLargest(new int[] {12, 35, 1, 10, 34, 1 });
		assertEquals(34, secondLargest);
	}
	
	@Test
	public void testfindThirdLargest() {
		int thirdLargest = arrayStatistics.findThirdLargest(new int[] {12, 35, 1, 10, 34, 1 } );
		assertEquals(12, thirdLargest);
	}
	
	@Test
	public void testSmallest() {
		int smallest = arrayStatistics.findSmallest(new int[] {12, 13, 1, 10, 34, 1});
		assertEquals(1, smallest);
	}
	
	@Test
	public void testSecondSmallest() {
		int smallest = arrayStatistics.findSecondSmallest(new int[] {12, 13, 1, 10, 34, 2});
		assertEquals(2, smallest);
	}
	
}
