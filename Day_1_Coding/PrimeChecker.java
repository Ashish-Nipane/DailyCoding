package coding_daily;

import java.util.Scanner;

public class PrimeChecker {
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
		boolean res= isPrime(num);
		
		if(res) {
			System.out.println("Number "+num+" is Prime Number");
		}
		else {
			System.out.println("Number "+num+" is not Prime Number");
		}
	}

}
