package testPack;


import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import laba4.ArrayMaker;
import laba4.Generator;

public class ArrayMakerTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        for (int i = 0; i < 9; i++) {
        new Generator();
        ArrayMaker.getArray()[i] = Generator.getRandom();
        System.out.println(i+1 + " элемент - " + ArrayMaker.getArray()[i]);
        }
    }
    @Test
    public void test() {
        assertNotNull(ArrayMaker.getArray());
        assertTrue(ArrayMaker.getArray().length == 9);
    }
}
