package thedailybyte;

/**
 * This question is asked by Facebook. Given a string and the ability to delete at most one character,
 * return whether or not it can form a palindrome.
 * Note: a palindrome is a sequence of characters that reads the same forwards and backwards.
 *
 * Ex: Given the following strings...
 *
 * "abcba", return true
 * "foobof", return true (remove the first 'o', the second 'o', or 'b')
 * "abccab", return false
 */

public class ValidPalindromeWithRemoval {

    public boolean isPalindromeWithRemoval(String str){
        int removalCounter = 0;

        while(removalCounter < str.length()){

            StringBuilder sb = new StringBuilder(str);

            sb.deleteCharAt(removalCounter);

            if(isPalindrome(sb.toString())){
                return true;
            }

            sb.delete(0, sb.length());

            removalCounter++;
        }

        return false;


    }

    private boolean isPalindrome(String str){
        StringBuilder palSb = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--){
            palSb.append(str.charAt(i));
        }

        if(str.equalsIgnoreCase(palSb.toString())){
            return true;
        }

        return false;
    }

}
