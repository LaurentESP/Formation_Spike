package laurentesp.spike;

/**
 * Created by SOEOSSA on 28/09/2016.
 */

public class Brackets {
    public Brackets() {
    }

    public static boolean checkBrackets(String bracketsString) {
        int maxIndex = bracketsString.length();
        int valeurBracket = 0;
        boolean resultCheckString = false;
        for (int indexString = 0; indexString < maxIndex; indexString++) {
            //An opening bracket increments the counter
            if (bracketsString.charAt(indexString) == '(') {
                valeurBracket++;
            } else {
                // A closing bracket decrements the counter
                if (bracketsString.charAt(indexString) == ')') {
                    valeurBracket--;
                }
                // If too much closing brackets -> error so return false which will stop the program
                if (valeurBracket < 0) {
                    resultCheckString = false;
                    return false;
                } else {
                    resultCheckString = true;
                }
            }

        }
        // Check if there is too much opening brackets
        if (valeurBracket > 0) {
            resultCheckString = false;
        }
        return resultCheckString;
    }

}
