package coding_daily;

import java.util.*;

public class FactorialOfNumberUsingRecursion {
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return (n*factorial(n-1));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int fact = factorial(num);
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
