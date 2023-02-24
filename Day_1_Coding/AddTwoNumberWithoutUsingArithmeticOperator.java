package coding_daily;

import java.util.Scanner;

public class AddTwoNumberWithoutUsingArithmeticOperator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		for(int i=0; i<num2; i++) {
			num1++;
		}
		System.out.println("Addition is "+num1);
	}

}
