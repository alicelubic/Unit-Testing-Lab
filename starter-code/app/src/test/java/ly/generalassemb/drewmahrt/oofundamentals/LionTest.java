package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by owlslubic on 7/13/16.
 */
public class LionTest {

    Lion lion = new Lion(true);
    String expectedResult, actualResult;
    int expectedInt, actualInt;

    @Test
    public void lionRoars() throws Exception{
        expectedResult = "Roar!!!";
        actualResult= lion.makeNoise();
        assertTrue(expectedResult.equals(actualResult));

        //how can you test this more rigorously? since there isn't really another option for input to fudge it up..

    }

    @Test
    public void checkTopSpeed() throws Exception{
        expectedInt = 50;
        actualInt = lion.getTopSpeed();
        assertTrue(expectedInt == actualInt);
    }


}
