package com.daa.practice.arrays;

public class ArrayStatistics {

	public int findLargest(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public int findSecondLargest(int arr[]) {
		int max = Integer.MIN_VALUE;
		int secondMax = max;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax = max;
				max = arr[i];
			}else if(arr[i]>secondMax) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	
	public int findThirdLargest(int arr[]) {
		int max = Integer.MIN_VALUE;
		int secondMax = max;
		int thirdMax = secondMax;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				thirdMax = secondMax;
				secondMax = max;
				max = arr[i];
			}else if(arr[i]>secondMax) {
				thirdMax = secondMax;
				secondMax = arr[i];
			}else if(arr[i]>thirdMax) {
				thirdMax = arr[i];
			}
		}
		return thirdMax;
	}
	
	public int findSmallest(int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public int findSecondSmallest(int arr[]) {
		int min = Integer.MAX_VALUE;
		int secondMin = min;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondMin = min;
				min = arr[i];
			}else if(arr[i]<secondMin) {
				secondMin = arr[i];
			}
		}
		return secondMin;
	}
}
