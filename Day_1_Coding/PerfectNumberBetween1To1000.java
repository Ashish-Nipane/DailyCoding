package coding_daily;

public class PerfectNumberBetween1To1000 {

	public static boolean isPerfect(int num) {
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.print("Perfect number between 1 to 1000 are ");
		for(int i=1; i<=1000; i++) {
			if(isPerfect(i)) {
				System.out.print(i+",");
			}
		}
		

	}

}
