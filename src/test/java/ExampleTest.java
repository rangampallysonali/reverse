import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    public void testReverseWordInMyString() {
        Example ex = new Example();
        assertEquals("emocleW ot kooBsrennigeB", ex.reverseWordInMyString("Welcome to BeginnersBook"));
        assertEquals("sihT si na ysae avaJ margorP", ex.reverseWordInMyString("This is an easy Java Program"));
    }
}
