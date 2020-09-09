package thedailybyte;

/**
 * The reverseString function takes in a String parameter and reverses it.
 * @author Jason Gwaley
 */

public class ReverseString {

    public String reverseString(String original){
        char[] chars = original.toCharArray();
        StringBuilder reversedString = new StringBuilder();
        int len = chars.length-1;

        while(len > -1){
            reversedString.append(chars[len]);
            len--;
        }

        return reversedString.toString();
    }
}