import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void testReverseWords() {
        Example example = new Example();
        
        String input1 = "Welcome to BeginnersBook";
        String expected1 = "emocleW ot kooBsrennigeB";
        assertEquals(expected1, example.reverseWords(input1));
        
        String input2 = "This is an easy Java Program";
        String expected2 = "sihT si na ysae avaJ margorP";
        assertEquals(expected2, example.reverseWords(input2));
    }

    @Test
    public void testSingleWord() {
        Example example = new Example();
        assertEquals("tac", example.reverseWords("cat"));
    }

    @Test
    public void testEmptyString() {
        Example example = new Example();
        assertEquals("", example.reverseWords(""));
    }
}
