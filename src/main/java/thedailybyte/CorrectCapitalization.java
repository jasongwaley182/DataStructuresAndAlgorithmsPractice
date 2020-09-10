package thedailybyte;

/**
 * This question is asked by Google. Given a string, return whether or not it uses capitalization correctly.
 * A string correctly uses capitalization if all letters are capitalized, no letters are capitalized,
 * or only the first letter is capitalized.
 *
 * Ex: Given the following strings...
 *
 * "USA", return true
 * "Calvin", return true
 * "compUter", return false
 * "coding", return true
 */

public class CorrectCapitalization {

    public boolean isCapitalizationCorrect(String str){
        boolean isCapCorrect = false;
        int capCounter = 0;
        boolean firstLetterCap = false;

        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i)) && i == 0){
                firstLetterCap = true;
            }

            if(Character.isUpperCase(str.charAt(i))){
                capCounter++;
            }
        }

        if(capCounter == str.length()){
            isCapCorrect = true;
        } else if(firstLetterCap && capCounter == 1){
            isCapCorrect = true;
        } else if(capCounter == 0){
            isCapCorrect = true;
        } else {
            isCapCorrect = false;
        }

        return isCapCorrect;
    }

}
