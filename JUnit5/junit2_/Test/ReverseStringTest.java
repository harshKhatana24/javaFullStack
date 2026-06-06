import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    public void test(){
        ReverseString rev=new ReverseString();

        assertEquals("avaj", rev.reverseString("java"));
        assertEquals("neilA",rev.reverseString("Alien"));

        System.out.println("test case passed");

    }

}