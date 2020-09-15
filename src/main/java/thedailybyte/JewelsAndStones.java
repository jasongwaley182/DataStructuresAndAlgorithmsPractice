package thedailybyte;

/**
 * This question is asked by Amazon. Given a string representing your stones and another string representing a list of jewels,
 * return the number of stones that you have that are also jewels.
 *
 * Ex: Given the following jewels and stones...
 *
 * jewels = "abc", stones = "ac", return 2
 * jewels = "Af", stones = "AaaddfFf", return 3
 * jewels = "AYOPD", stones = "ayopd", return 0
 */

public class JewelsAndStones {

    public int getNumOfStonesThatAreJewels(String stones, String jewels){

        if(stones == null || jewels == null) return 0;

        int jewelCounter = 0;

        for(int i = 0; i < stones.length(); i++){
            String stone = Character.toString(stones.charAt(i));
            if(jewels.contains(stone)){
                jewelCounter++;
            }
        }

        return jewelCounter;
    }

}
