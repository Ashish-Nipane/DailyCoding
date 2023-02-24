package coding_daily;

import java.util.Scanner;

public class ArmstrongNumberBetween1To1000 {

	public static boolean isArmstrong(int num) {
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
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println("Armstrong number between 1 to 1000 are ");
		for(int i=1; i<=1000; i++) {
			if(isArmstrong(i)) {
				System.out.print(i+",");
			}
		}

	}

}
