public class isSubsequence {
    
    public static void main(String[] args) {
        
        /*
         * A subsequence of a string is a new string that is formed from the original string by 
         * deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. 
         * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
         * 
         */

         String s = "abc";
         String t = "hbgdc";
    }

    public static boolean Subsequence(String s, String t){

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(i)){
                i++;
            }
            j++;
        }
        return i == s.length();
    } 
}
