package coding_daily_2;

import java.util.Scanner;

public class RotateArrayElementNTimes {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		System.out.println("Enter number want to rotate array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Original Array : ");
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		for(int i=0 ; i<n ; i++) {
			int temp = arr[0];
			for(int j=0 ; j<arr.length-1 ; j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
		System.out.print("Left Rotated Array : ");
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
		/*
		for(int i=0 ; i<n ; i++) {
			int temp = arr[arr.length-1];
			for(int j=arr.length-2 ; j>=0 ; j--) {
				arr[j+1]=arr[j];
			}
			arr[0] = temp;
		}
		
		System.out.print("Right Rotated Array : ");
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		*/
	}

}
