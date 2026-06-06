import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class reverseStringTest {

    reverseString rev=new reverseString();

    @Test
    void test(){
        assertEquals("avaJ", rev.reverseString("Java"));

    }

    @Test
    void testReverseString_MultipleWords(){
        assertEquals("ysae si avaJ", rev.reverseString("Java is easy"));

    }

}