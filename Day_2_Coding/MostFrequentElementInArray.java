package coding_daily_2;

public class MostFrequentElementInArray {
	
	public static int mostFrequentElement(int[] arr) {
		int n =arr.length;
	    int maxcount = 0;
	    int element = 0;
	    for (int i=0; i<n; i++) {
	      int count = 0;
	      for (int j=0; j<n; j++) {
	        if (arr[i] == arr[j]) {
	          count++;
	        }
	      }
	  
	      if (count > maxcount) {
	        maxcount = count;
	        element = arr[i];
	      }
	    }
	    return element;
	}
	
	public static void main(String[] args) {
		int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
	    System.out.print("Most frequent element in array is "+mostFrequentElement(arr));
	}

}
