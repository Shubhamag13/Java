package com.Listss;
//MOVE ZERO TO END IN ARRAY
public class Demo3 {
public static void main(String[] args) {
	int[] arr= {4,0,5,0,6,7};
	
	int s=0;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
		int temp=arr[s];
		arr[s]=arr[i];
		arr[i]=temp;
		s++;
		}
		
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
