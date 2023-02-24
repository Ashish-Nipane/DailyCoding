package coding_daily_3;

public class ReverseStringWithoutUsingInBuildFunction {

	public static void main(String[] args) {
		String s = "Hello";
		String rev = "";
		System.out.println("Original string : "+s);
		for(int i=s.length()-1; i>=0; i--) {
			rev += s.charAt(i);
		}
		System.out.println("Reverse string : "+rev);
	}

}
