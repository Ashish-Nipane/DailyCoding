package coding_daily;

import java.util.*;

public class PositiveNegativeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		if(num==0) {
			System.out.println(num+" is neither positive nor negative number");
		}
		else {
			System.out.println(num>0?num+" is positive number":num+" is negative number");
		}

	}

}
