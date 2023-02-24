package coding_daily;

import java.util.Scanner;

public class GCDOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		System.out.print("GCD of "+num1+" and "+num2+" is ");
		while(num1!=num2) {
			if(num1>num2) {
				num1 = num1-num2;
			}else {
				num2 = num2-num1;
			}
		}
		System.out.print(num1);

	}

}
