package laurentesp.spike;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void shouldReturnReverseStringIfPalindrom() throws Exception {
        assertEquals("lavaL", Palindrom.checkIfPalindrom("Laval"));
    }

    @Test
    public void shouldReturnFalseIfParenthesesNOK() throws Exception {
        assertEquals(")(",false);
    }

    @Test
    public void shouldReturnTrueIfParenthesesOK() throws Exception {
        assertEquals("(()())",true);
    }
}