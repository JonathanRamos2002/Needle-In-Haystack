package testing.haystack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HaystackTest {
    Haystack haystack;

    @BeforeEach
    void initialize()
    {
        int [] exampleArray = {0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
        // comment above and uncomment below to make "testFindNeedle" fail
        //int [] exampleArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        haystack = new Haystack(exampleArray);
    }

    @Test
    void testFindNeedle()
    {
        assertTrue(haystack.findNeedle());
    }

}
