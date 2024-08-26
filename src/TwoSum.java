import java.util.Arrays;

public class TwoSum {
    
    public static void main(String[] args) {

        int arr[] = {2,5,7,3,2,5,7};
        int k = 8;
        
        int result [] = sumTwo(arr, k);
        System.out.println(result[0] + " " + result[1]);

    }

    public static int [] sumTwo (int [] arr, int k){

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length-1;

        while (left < right){
            if(arr[left] + arr[right] == k){
                return new int[]{left+1, right+1};
            }
            else if (arr[left] + arr[right] < k){
                left++;
            }
            else {
                right--;
            }
        }
        return new int[0];
    } 
}