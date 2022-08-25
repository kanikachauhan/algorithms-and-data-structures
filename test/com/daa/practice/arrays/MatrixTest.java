package com.daa.practice.arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MatrixTest {

	private Matrix matrix;
	
	@BeforeEach
	public void setUp() {
		matrix = new Matrix();
	}
	
	@Test
	public void testRotate180matrix() {
		int[][] mat = { { 1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 } };
		int[][] new_mat = {{9,8,7},{6,5,4},{3,2,1}};
		assertTrue(assertMatrixEquals(new_mat,matrix.rotate180matrix(mat)));
	}
	
	@Test
	public void testSumOfMiddleRowAndColumn() {
		int[][] mat = {{2, 5, 7},{3, 7, 2},{5, 6, 9} };
		assertEquals(30, matrix.sumOfMiddleRowAndColumn(mat));
	}
	
	@Test
	public void testIsLowerTriangular() {
		int[][] mat = { { 1, 0, 0, 0 },{ 1, 4, 0, 0 },{ 4, 6, 2, 0 },{ 0, 4, 7, 6 } };
		assertTrue(matrix.isLowerTriangular(mat));
	}
	
	@Test
	public void testIsUpperTriangular() {
		int[][] mat = { { 1, 3, 5, 3 },{ 0, 4, 6, 2 },{ 0, 0, 2, 5 },{ 0, 0, 0, 6 } };
		assertTrue(matrix.isUpperTriangular(mat));
	}
	
	@Test
	public void testZFormElements() {
		int[][] mat = { { 4, 5, 6, 8 },{ 1, 2, 3, 1 },{ 7, 8, 9, 4 },{ 1, 8, 7, 5 } };
		assertEquals(List.of(4,5,6,8,3,8,1,8,7,5), matrix.zFormElements(mat));
	}
	
	@Test
	public void testMatrixSnake() {
		int[][] mat = { {10, 20, 30, 40},{15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
		assertEquals(List.of(10, 20, 30, 40, 45, 35, 25, 15, 27, 29, 37, 48, 50, 39, 33, 32 ), matrix.matrixSnake(mat));
	}
	
	@Test
	public void testBoundaryElementsMatrixSum() {
		int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		assertEquals(54, matrix.boundaryElementsMatrixSum(mat));
	}
	
	@Test
	public void testIsMarkovMatrix() {
		double[][] mat = { { 0, 0, 1 },{ 0.5, 0, 0.5 },{ 1, 0, 0 } };
		assertTrue(matrix.isMarkovMatrix(mat));
	}
	
	@Test
	public void testMaxElementInEachRow() {
		int[][] mat =  { {3, 4, 1, 8},{1, 4, 9, 11},{76, 34, 21, 1},{2, 1, 4, 5} };
		assertEquals(List.of(8,11,76,5), matrix.maxElementInEachRow(mat));
	}
	
	@Test
	public void testFindUniqueElements() {
		int[][] mat = {{1, 2, 3, 20},{5, 6, 20, 25},{1, 3, 5, 6},{6, 7, 8, 15}};
		assertEquals(List.of(2,7,8,15,25), matrix.findUniqueElements(mat));
	}
	
	@Test
	public void testAddMatrices() {
		int mat1[][] = { {1, 1, 1, 1},{2, 2, 2, 2},{3, 3, 3, 3},{4, 4, 4, 4}};
		int mat2[][] = { {1, 1, 1, 1},{2, 2, 2, 2},{3, 3, 3, 3},{4, 4, 4, 4}};
		int res[][] = {{2,2,2,2},{4, 4, 4, 4},{6, 6, 6, 6},{8, 8, 8, 8}};
		assertTrue(assertMatrixEquals(res, matrix.addMatrices(mat1, mat2)));
	}
	
	@Test
	public void testSubtractMatrices() {
		int mat1[][] = { {1, 1, 1, 1},{2, 2, 2, 2},{3, 3, 3, 3},{4, 4, 4, 4}};
		int mat2[][] = { {1, 1, 1, 1},{2, 2, 2, 2},{3, 3, 3, 3},{4, 4, 4, 4}};
		int res[][] = {{0,0,0,0},{0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0}};
		assertTrue(assertMatrixEquals(res, matrix.subtractMatrices(mat1, mat2)));
	}
	
	@Test
	public void testCountSortedMatrixRows() {
		int mat[][] = { { 1, 2, 3, 4, 5 },{ 4, 3, 1, 2, 6 },{ 8, 7, 6, 5, 4 },{ 5, 7, 8, 9, 10 } };
		assertEquals(3, matrix.countSortedMatrixRows(mat));
	}
	
	@Test
	public void testIsSparseMatrix() {
		int mat[][] = { { 1, 0, 3 },{ 0, 0, 4 },{ 6, 0, 0 } };
		assertTrue(matrix.isSparseMatrix(mat));
	}

	@Test
	public void testUpperTriangularMatrix() {
		int mat[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int res[][] = {{1,2,3},{0,5,6},{0,0,9}};
		assertTrue(assertMatrixEquals(res, matrix.upperTriangularMatrix(mat)));
	}

	@Test
	public void testLowerTriangularMatrix() {
		int mat[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int res[][] = {{1,0,0},{4,5,0},{7,8,9}};
		assertTrue(assertMatrixEquals(res, matrix.lowerTriangularMatrix(mat)));
	}
	
	@Test
	public void testIsMagicSquare() {
		int mat[][] = {{ 2, 7, 6 }, { 9, 5, 1 },{ 4, 3, 8 }};
		assertTrue(matrix.isMagicSquare(mat));
	}
	
	private boolean assertMatrixEquals(int mat1[][],int mat2[][]) {
		if(mat2==null)
			return false;
		if(mat1.length!=mat2.length)
			return false;
		if(mat1[0].length!=mat2[0].length)
			return false;
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[i].length;j++) {
				if(mat1[i][j]!=mat2[i][j])
					return false;
			}
		}
		return true;
	}
}
