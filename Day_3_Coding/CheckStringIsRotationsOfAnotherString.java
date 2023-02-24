package coding_daily_3;

public class CheckStringIsRotationsOfAnotherString {

	public static void main(String[] args) {
		String s1 = "javacode";
		String s2 = "codejava";
		
		String s3 = s1+s1;
		if(s3.contains(s2)) {
			System.out.println("\""+s1+"\" is string rotation of "+s2);
		}
		else {
			System.out.println(s1+" is not string rotation of "+s2);
		}
	}

}
