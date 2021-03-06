package laurentesp.spike;

import org.junit.Test;

import static org.hamcrest.core.StringContains.containsString;
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
        assertEquals(false, Brackets.checkBrackets(")("));
    }

    @Test
    public void shouldReturnTrueIfParenthesesOK() throws Exception {
        assertEquals(true, Brackets.checkBrackets("(()())"));
    }

    @Test
    public void shouldReturnTrueIfFibo3IterationsIsGood() throws Exception {
        assertEquals("1 1 2", Fibonacci.fiboSequence(3).trim());
    }

    @Test
    public void testIfRandomTextIsOk() throws Exception {
        assertThat("one oen eon eno noe neo", containsString( RandomText.mixLettersInWords("one")));
    }
}