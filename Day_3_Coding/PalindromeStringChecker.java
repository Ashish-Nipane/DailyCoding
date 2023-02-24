package coding_daily_3;

public class PalindromeStringChecker {

	public static void main(String[] args) {
		//String s = "Palindrome Check";
		String s = "anna";
		String rev = "";
		for(int j=s.length(); j>0; j--) {
			rev +=s.charAt(j-1);
		}
		//System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("\""+s+"\" is Palindrome string");
		}else {
			System.out.println("\""+s+"\" is not Palindrome string");
		}
	}

}
