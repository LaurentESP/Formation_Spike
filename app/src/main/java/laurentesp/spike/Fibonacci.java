package laurentesp.spike;

/**
 * Created by SOEOSSA on 28/09/2016.
 */

public class Fibonacci {
    public Fibonacci() {
    }

    public static String fiboSequence(int nbIteration) {
        int sumVal = 1;
        int sumValOld = 0;
        int inter = 0;
        StringBuffer fiboString = new StringBuffer("1 ");
        for (int i = 0; i < nbIteration - 1; i++) {
            inter = sumVal;
            sumVal = sumVal + sumValOld;
            sumValOld = inter;
            fiboString.append(sumVal + " ");
        }
        return fiboString.toString();
    }
}
