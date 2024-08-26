public class SirQuestion {
    
    public static void main(String[] args) {
        
        /*
         * Given an array of positive integers and a positive integer k, find the maximum sum of any contiguous subarray of size k. 
         * Example: Input: arr = [2, 1, 5, 1, 3, 2] k = 3 Output: 9 
         * Explanation: Subarray with the maximum sum is [5, 1, 3].
         */


         int arr [] = {2, 1, 5, 1, 3, 1, 8, 6, 3, 2, 5, 4};
         int k = 3;

         System.out.println(maximumSum(arr, k));
    }

    public static int maximumSum(int arr[], int k ){

        int sum = 0;
        int maxSum = 0;

        for(int i=0; i<k; i++){
            sum += arr[i];
        }

        maxSum = sum;

        for(int i=k; i<arr.length; i++){
            sum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
