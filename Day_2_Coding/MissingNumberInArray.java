package coding_daily_2;


public class MissingNumberInArray {

	public static int MissingNumber(int[] arr)
    {
        int n=arr.length+1;
        int sum1=((n)*(n+1))/2;
        int sum2 =0;
        for(int i=0; i<arr.length; i++) {
          sum2+=arr[i];
        }
        return sum1-sum2;
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 4, 3, 5, 6 };
        System.out.println("Missing Number in array is "+MissingNumber(arr));
    }

}
