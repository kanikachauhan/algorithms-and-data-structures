package com.daa.practice.arrays;



public class ArrayRearrangement {

	public int[] rearrangeArrayIAtI(int arr[]) {
		int len = arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i]>=0 && arr[i]!=i) {
				int ele = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = ele;
			}else {
				i++;
			}
		}
		return arr;
	}
	
	
	public int[] moveZerosToEnd(int arr[]) {
		int count = 0;
		int len = arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i]!=0) {
				arr[count] = arr[i];
				count++;
			}
		}
		for(int i=count;i<len;i++)
			arr[i] = 0;
		return arr;
	}
	
	//preserve order and extra space allowed
	public int[] moveAllNegativesToEnd(int arr[]) {
		int temparr[] = new int[arr.length];
		int j=arr.length-1;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				temparr[k] = arr[i];
				k++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				temparr[k] = arr[i];
				k++;
			}
		}
		return temparr;
	}

	public int[] segregateEvenOddNumbers(int arr[]) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			if(arr[left]%2==0) {
				left++;
			}else if(arr[right]%2!=0) {
				right--;
			}else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return arr;
	}
	
}
