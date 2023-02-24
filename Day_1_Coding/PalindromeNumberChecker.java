package coding_daily;

import java.util.Scanner;

public class PalindromeNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int onum = num;
		int rev=0,rem=0;
		while(num>0) {
			rem= num%10;
			rev = rev*10 + rem;
			num /=10;
		}
		if(rev==onum) {
			System.out.println("Number "+onum+" is palindrome number");
		}
		else {
			System.out.println("Number "+onum+" is not palindrome number");
		}
	}

}
