public class LongestSubarray {
    
    public static void main(String[] args) {
        
        int arr [] = {2,4,6,1,-1,9,5,0,4,7};
        int k = 12;

        System.out.println(longestSubarraySumLesserThanK(arr, k));
    }

    public static int longestSubarraySumLesserThanK (int arr[], int k){
        int l = 0;
        int r = 0;
        int maxSum = 0;
        int sum = 0;

        while (r < arr.length){
            sum = sum + arr[r];
            //System.out.println(sum);
            if(sum > k){
                sum = sum - arr[l];
                l = l+1;
            }
            if(sum <= k){
                maxSum = Math.max(maxSum, sum);
            }
            r = r+1;
        }
        return maxSum;
    }
}
