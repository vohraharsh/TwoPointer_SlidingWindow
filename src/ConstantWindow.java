public class ConstantWindow {
    
    public static void main(String[] args) {
        
        int arr [] = {-1,2,3,3,4,5,-1};
        int k = 4;

        System.out.println(constantWindowSum(arr, k));
    }

    public static int constantWindowSum(int []arr, int k){
        int maxSum = 0;
        for(int i=0; i<k; i++){
            maxSum += arr[i];
        }
        
        int l = 0;
        int r = k-1;
        int sum = maxSum;
        while ( r < arr.length - 1){
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
