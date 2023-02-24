package coding_daily;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int rev =0, rem=0;
		System.out.print("Reverse of "+num+ " is ");
		while(num>0) {
			rem = num%10;
			rev = rev*10 + rem;
			num /=10;
		}
		System.out.print(rev);
	}

}
