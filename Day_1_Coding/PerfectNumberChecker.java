package coding_daily;

import java.util.Scanner;

public class PerfectNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			System.out.println(num+" is perfect Number");
		}
		else {
			System.out.println(num+" is not perfect Number");
		}

	}

}
