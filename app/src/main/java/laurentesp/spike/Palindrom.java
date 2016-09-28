package laurentesp.spike;

/**
 * Created by SOEOSSA on 28/09/2016.
 */

public class Palindrom {

    public Palindrom() {
    }

    public static String envers(String mot) {
        StringBuffer motEnvers = new StringBuffer("");
        int longueurMot = mot.length();
        for (int i = longueurMot; i > 0; i--) {
            motEnvers.append(mot.charAt(i - 1));
        }
        return motEnvers.toString();
    }

    public static boolean isPalindrome(String mot) {
        int longueurMot = mot.length();
        boolean palindromeResult = false;
        for (int i = 0; i < longueurMot / 2; i++) {
            if (Character.toLowerCase(mot.charAt(i)) == Character.toLowerCase(mot.charAt(longueurMot - i - 1))) {
                palindromeResult = true;
            } else {
                palindromeResult = false;
                break;
            }
        }
        return palindromeResult;
    }

     public static String checkIfPalindrom(String stringToTest){
        String stringToReturn;
        if (isPalindrome(stringToTest)) {
            stringToReturn = new String(envers(stringToTest));
        } else {
            stringToReturn = new String(stringToTest);
        }
         return stringToReturn;
    }
}
