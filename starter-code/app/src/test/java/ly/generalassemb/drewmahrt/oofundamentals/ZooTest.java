package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


/**
 * Created by owlslubic on 7/13/16.
 */
public class ZooTest {
    int expectedInt,actualInt;



    @Test
    public void addAnimalToZoo() throws Exception {
        Zoo zoo = Zoo.getInstance();
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Snake(true));
        zoo.addAnimal(new Snake(true));
        expectedInt = 6;
        actualInt = zoo.getAnimals().size();
        assertTrue(expectedInt==actualInt);
    }
    @Test
    public void removeAnimalsFromZoo() throws Exception{
        Zoo zoo = Zoo.getInstance();
        //should be 6, then return 4 when i remove these two, but I don't understand why it won't do it.
        //if i add the animals within this method, it works, but then it affects the addAnimal check to expect 10
        //but because of the singleton, i shouldnt have to add the in this method, right?

        zoo.getAnimals().remove(2);
        zoo.getAnimals().remove(3);


        expectedInt = 4;
        actualInt = zoo.getAnimals().size();
        assertTrue(expectedInt==actualInt);

    }



}
