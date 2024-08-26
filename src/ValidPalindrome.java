public class ValidPalindrome {
    
    public static void main(String[] args) {
        
        /*
         * 
         * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
         * and removing all non-alphanumeric characters, it reads the same forward and backward. 
         * Alphanumeric characters include letters and numbers.
         * 
         * Example 1:

            Input: s = "A man, a plan, a canal: Panama"
            Output: true
            Explanation: "amanaplanacanalpanama" is a palindrome.
            Example 2:

            Input: s = "race a car"
            Output: false
            Explanation: "raceacar" is not a palindrome.
         * 
         * 
         */

         String s = "A man, a plan, a canal: Panama";

         System.out.print(validPalindromeString(s));
    }

    public static boolean validPalindromeString(String s){

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = s.length()-1;

        while (start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
