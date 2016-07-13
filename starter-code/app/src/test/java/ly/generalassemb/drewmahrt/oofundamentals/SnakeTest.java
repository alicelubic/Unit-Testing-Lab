package ly.generalassemb.drewmahrt.oofundamentals;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by owlslubic on 7/13/16.
 */
public class SnakeTest {

    Snake snake = new Snake(true);
    String expectedResult, actualResult;
    int expectedR,actualR;

    @Test
    public void snakeHisses() throws Exception{
        expectedResult = "Hiss!!!";
        actualResult= snake.makeNoise();
        assertTrue(expectedResult.equals(actualResult));
    }

    @Test
    public void checkTopSpeed() throws Exception{
        expectedR = 5;
        actualR = snake.getTopSpeed();
        assertTrue(expectedR==actualR);
    }

}
