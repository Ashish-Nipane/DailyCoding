package coding_daily;

import java.util.Scanner;

public class LCMOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		int a = num1, b=num2;
		while(num1!=num2) {
			if(num1>num2) {
				num1 = num1-num2;
			}else {
				num2 = num2-num1;
			}
		}
		int lcm = (a*b)/num1;
		System.out.println("LCM of "+a+" and "+b+" is "+lcm);
	}

}
