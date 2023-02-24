package coding_daily;

import java.util.Scanner;

public class SmallestOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		System.out.println("Enter third number");
		int num3 = sc.nextInt();
		
		//System.out.println((num1<num2)?(num1<num3 ? num1+" is samllest":num3+" is smallest"):(num2<num3?num2+" is smallest":num3+" is smallest"));
		
		int temp =0;
		while(num1!=0 && num2!=0 && num3!=0) {
			num1--;
			num2--;
			num3--;
			temp++;
		}
		System.out.println(temp+" is smallest number");
	}

}
