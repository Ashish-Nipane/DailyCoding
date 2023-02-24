package coding_daily_2;

import java.util.Arrays;

public class MostFrequentElementInArrayUsingSorting {

	public static void main(String[] args) {
		int []arr= {14,14,40,30,50,12,12,14,14};
		int frequent=0;
		int maxcount=0;
		int count=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count>maxcount) {
					maxcount=count;
					frequent=arr[i];
					count=0;
				}
			}			
		}
		System.out.println("Most frequent element in array is "+frequent);
	}

}
