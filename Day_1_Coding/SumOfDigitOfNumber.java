package coding_daily;

import java.util.Scanner;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum =0, rem =0;
		System.out.print("Sum of Digit of "+num+" is ");
		while(num>0) {
			rem = num%10;
			sum += rem;
			num /= 10;
		}
		System.out.println(sum);
	}

}
