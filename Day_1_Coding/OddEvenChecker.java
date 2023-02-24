package coding_daily;
import java.util.*;
public class OddEvenChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be check");
		int num = sc.nextInt();
		System.out.println(num%2==0?num+" is even number":num+" is odd number");
		
		/*if(num%2==0) {
			System.out.println(num+" is even number");
		}else {
			System.out.println(num+" is odd number");
		}*/
	}

}
