package com.daa.practice.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Matrix {

	public int[][] rotate180matrix(int mat[][]){
		int m = mat.length;
		int n = mat[0].length;
		int h = m/2;
		for(int i=0;i<h;i++) {
			for(int j=0;j<n;j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[m-i-1][j];
				mat[m-i-1][j] = temp;
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n/2;j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[i][n-j-1];
				mat[i][n-j-1] = temp;
			}
		}
		return mat;
	}
	
	public int sumOfMiddleRowAndColumn(int mat[][]) {
		int m = mat.length;
		int n = mat[0].length;
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum = sum + mat[m/2][i];
		}
		for(int i=0;i<m;i++) {
			sum = sum + mat[i][n/2];
		}
		return sum;
	}
	
	public boolean isLowerTriangular(int mat[][]) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(i<j && mat[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isUpperTriangular(int mat[][]) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(i>j && mat[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public List<Integer> zFormElements(int mat[][]){
		List<Integer> lst = new ArrayList<Integer>();
		int m = mat.length;
		int n = mat[0].length;
		for(int i=0;i<n;i++) {
			lst.add(mat[0][i]);
		}
		for(int i=1;i<m-1;i++) {
			lst.add(mat[i][n-i-1]);
		}
		for(int i=0;i<n;i++) {
			lst.add(mat[m-1][i]);
		}
		
		return lst;
	}
	
	public List<Integer> matrixSnake(int mat[][]){
		List<Integer> lst = new ArrayList<Integer>();
		int m = mat.length;
		int n = mat[0].length;
		for(int i=0;i<m;i++) {
			if(i%2==0) {
				for(int j=0;j<n;j++)
					lst.add(mat[i][j]);
			}else {
				for(int j=(n-1);j>=0;j--)
					lst.add(mat[i][j]);
			}
		}
		return lst;
	}
	
	public int boundaryElementsMatrixSum(int mat[][]){
		int sum = 0;
		int m = mat.length;
		int n = mat[0].length;
		for(int i=0;i<n;i++) {
			sum = sum + mat[0][i];
		}
		for(int i=1;i<(m-1);i++) {
			sum = sum + mat[i][0] + mat[i][n-1];
		}
		
		for(int i=0;i<n;i++) {
			sum = sum + mat[m-1][i];
		}
		return sum;
	}
	
	public boolean isMarkovMatrix(double mat[][]) {
		for(int i=0;i<mat.length;i++) {
			double sum = 0;
			for(int j=0;j<mat[i].length;j++) {
				sum = sum + mat[i][j];
			}
			if(sum!=1)
				return false;
		}
		return true;
	}
	
	public List<Integer> maxElementInEachRow(int mat[][]){
		List<Integer> lst = new ArrayList<Integer>();
		for(int i=0;i<mat.length;i++) {
			int max = Integer.MIN_VALUE;
			for(int j=0;j<mat[i].length;j++) {
				if(max<mat[i][j]) {
					max = mat[i][j];
				}
			}
			lst.add(max);
		}
		return lst;
	}
	
	
	public List<Integer> findUniqueElements(int mat[][]){
		List<Integer> lst = new ArrayList<Integer>();
		TreeMap<Integer,Integer> map = new TreeMap();
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(!map.containsKey(mat[i][j])) {
					map.put(mat[i][j], 1);
				}else {
					map.put(mat[i][j], map.get(mat[i][j])+1);
				}
			}
		}
		for(Integer keys:map.keySet()) {
			if(map.get(keys)==1)
				lst.add(keys);
		}
		return lst;
	}
	
	private void print(int mat[][]) {
		int m = mat.length;
		int n = mat[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}System.out.println();
		}
	}
}
