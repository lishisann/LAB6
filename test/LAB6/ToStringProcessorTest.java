package LAB6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ToStringProcessorTest {

    @Test
    public void testToStringProcessor() {
        Person p = new Person();
        String result = ToStringProcessor.buildString(p);

        assertTrue(result.contains("name=Alice"));
        assertTrue(result.contains("age=25"));
        assertFalse(result.contains("password"));
    }
}
