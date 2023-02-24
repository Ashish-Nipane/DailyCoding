package coding_daily_3;

public class CountNoOfWordsInString {

	public static void main(String[] args) {
		String s = "Hello world from ashish";
		
		if(s==null || s.isEmpty()) {
			System.out.println("Word count is 0");
		}
		
		String words[] = s.split("\\s");
		System.out.println("Word count is "+words.length);
	}
}
