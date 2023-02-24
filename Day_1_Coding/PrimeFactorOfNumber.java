package coding_daily;

import java.util.Scanner;

public class PrimeFactorOfNumber {
	public static boolean isPrime(int num) {
		if(num==0 || num==1) {
			return false;
		}
		else {
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.print("Prime Factors of "+num+" are ");
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				if(isPrime(i)) {
					System.out.print(i+" ");
				}
				
			}
		}

	}

}
