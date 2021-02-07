import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClassIWantToTestsTest {

    @Test
    public void methodIWantToTestTest() {
        String result = ClassIWantToTests.methodIWantToTest("Joci");

        assertEquals("Joci hello",result);

//        assertTrue(result.equals("Joci test"));
    }

}
