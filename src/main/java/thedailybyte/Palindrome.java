package thedailybyte;

/**
 * Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical chars.
 * Note: A palindrome is a sequence of characters that reads the same forwards and backwards.
 * @author Jason Gwaley
 */

public class Palindrome {

    public Boolean isPalindrome(String str){

        if(str.replaceAll("[^A-Za-z]", "").equalsIgnoreCase(reverseString(str))) return true;

        return false;
    }

    private String reverseString(String str){
        if(str == null) return "";

        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int position = charArray.length-1;
        while(position>-1){
            if(String.valueOf(charArray[position]).matches("^[A-Za-z]")){
                sb.append(charArray[position]);
            }
            position--;
        }

        return sb.toString();
    }

}