import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {
    Shapes shapes=new Shapes();

    @Test
    void testAreaOfSquare(){

        assertEquals(576,shapes.areaOfSquare(24));

    }

    @Test
    void testAreaOfCircle(){
        assertEquals(28.26, shapes.areaOfCircle(3),
                "Logic of areaOfCircle is wrong");
    }


    @Test //if test case not passed then only the msg evaluated
    //efficient way
    void testAreaOfRectangle(){
        assertEquals(4, shapes.areaOfRectangle(2,2),
                ()->"Logic of areaOfCircle is wrong");
    }

}