public class LongestSubstring {

    public static void main(String[] args) {
        
        String s = "a,b,c,a,b,c,b,b";
        System.out.println(LengthMaxSubstring(s));

        System.out.println(solutionTwo(s));

    }

    public static int LengthMaxSubstring(String s){

        int hash [] = new int[256];
        int maxSubString = 0;

        for(int i=0; i<s.length(); i++){
            hash = new int[256];
            for(int j=i; j<s.length(); j++){
                if(hash[s.charAt(j)] == 1){
                    break;
                }
                hash[s.charAt(j)] = 1;
                maxSubString = Math.max(maxSubString, j-i+1);
            }
        }
        return maxSubString;
    }


    public static int solutionTwo (String s){

        int hash [] = new int [256];

        for(int i=0; i<256; i++){
            hash[i] = -1;
        }

        int l = 0;
        int maxLength = 0;

        for(int r=0; r<s.length(); r++){
            if(hash[s.charAt(r)] != -1 && hash[s.charAt(r)] >= l){
                l = hash[s.charAt(r)] + 1;
            }
            int lg = r-l+1;
            maxLength = Math.max(maxLength, lg);

            hash[s.charAt(r)] = r;
        }
        return maxLength;
    }
}
