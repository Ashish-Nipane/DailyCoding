package coding_daily;

import java.util.Scanner;

public class PrintDigitOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int rev =0, rem=0;
		System.out.print("Digits in number "+num+ " are");
		while(num>0) {
			rem = num%10;
			rev = rev*10 + rem;
			num /=10;
		}
		rem=0;
		
		while(rev>0) {
			rem = rev%10;
			System.out.print(" "+rem);
			rev /=10;
		}
		
		
	}

}
