package com.Listss;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateByK {

	static void Rotate(int left, int right, ArrayList<Integer> al) {
		while (left < right) {
			int temp = al.get(left);
			al.set(left, al.get(right));
			al.set(right, temp);

			right--;
			left++;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();

		al.add(4);  //4 3 5 2 6 7  
		al.add(3);
		al.add(5);
		al.add(2);
		al.add(6);
		al.add(7);
		System.out.println("For Right Rotation Enter Positive\nFor Left Rotation Enter Negative\nEnter a K : ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		// k=-2 == k=3  
		if (k < 0) {
			k = ((k % al.size()) + al.size()) % al.size();
		}
		if (k > al.size()) { // 8>6 16>6
			k = k % al.size(); // 8%6=2 16%6=4

		}

		int left = 0;
		int right = al.size() - 1;

		RotateByK.Rotate(left, right, al);
		RotateByK.Rotate(k, right, al);
		RotateByK.Rotate(left, k - 1, al);

		System.out.println(al);
	}
}
