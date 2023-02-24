package coding_daily;

import java.util.Scanner;

public class ArmstrongNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int onum = num;
		int count=0;
		while(onum>0) {
			count++;
			onum /= 10;
		}
		onum = num;
		int rem;
		int sum=0;
		while(onum>0) {
			rem = onum%10;
			sum = sum + (int)Math.pow(rem,count);
			onum /= 10;
		}
		
		if(num==sum) {
			System.out.println("Number "+num+" is Armstrong Number");
		}
		else {
			System.out.println("Number "+num+" is not Armstrong Number");
		}

	}

}
