package thedailybyte;

public class ReverseString {

    /**
     * The reverseString function takes in a String parameter and reverses it.
     * @Author Jason Gwaley
     * @param original
     * @return String
     */

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