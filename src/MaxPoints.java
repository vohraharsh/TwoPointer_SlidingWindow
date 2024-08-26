public class MaxPoints {
    
    public static void main(String[] args) {
        
        int arr[] = {6,2,3,4,7,2,1,7,1};
        int k = 4;

        System.out.println(maxPointsInCards(arr, k));
    }

    public static int maxPointsInCards(int arr[], int k){
        int lsum = 0;
        int rsum = 0;
        int Maxsum;
        int sum;
        int rIndex = arr.length -1;

        for(int i=0; i<k; i++){
            lsum += arr[i];
            System.out.println(lsum);
        }
        Maxsum = lsum;

        for(int i=k-1; i>=0; i--){
            lsum = lsum - arr[i];
            rsum = rsum + arr[rIndex];
            rIndex = rIndex - 1;

            sum = lsum + rsum;

            Maxsum = Math.max(Maxsum,sum);
        }
        return Maxsum;

    }
}
