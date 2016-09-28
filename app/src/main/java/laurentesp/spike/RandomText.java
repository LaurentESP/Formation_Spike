package laurentesp.spike;

import android.util.Log;

import java.util.Random;
import java.util.StringTokenizer;

/**
 * Created by SOEOSSA on 28/09/2016.
 */

public class RandomText {

    public RandomText() {
    }

    public static int random(int min, int max) {
        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(max - min + 1) + min;
        return nombreAleatoire;
    }

    public static String randomLettersInAWord(String myWord){
        int wordLength = myWord.length();
        StringBuffer stringBufIn = new StringBuffer(myWord);
        StringBuffer stringBufOut = new StringBuffer("");

        for (int indexMot = 0; indexMot < wordLength; indexMot++) {
            int indexRand = random(0, stringBufIn.length()-1);
            stringBufOut.append(stringBufIn.charAt(indexRand));
            stringBufIn.deleteCharAt(indexRand);
        }
        return stringBufOut.toString();
    }

    public static String mixLettersInWords(String sentenceIn) {

        StringTokenizer stringTokenizer = new StringTokenizer(sentenceIn.trim()," ");
        StringBuffer stringBufToReturn = new StringBuffer("");
        while (stringTokenizer.hasMoreTokens()) {
            stringBufToReturn.append(randomLettersInAWord(stringTokenizer.nextToken()));
        }
        return stringBufToReturn.toString();
    }


}
