package testPack;


import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import laba4.ArrayMaker;
import laba4.Generator;
import laba4.Sorter;

public class SorterTest {

    static boolean after;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        new Generator();
        new ArrayMaker();
        new Sorter();
        after = false;
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        for (int i = 0; i < 9; i++) {
            System.out.println(Sorter.getTestingArray()[i]);
        }
    }
    @Test
    public void test() {

        for (int a = 0; a < 8; a++) {
            if (Sorter.getTestingArray()[a] <= Sorter.getTestingArray()[a+1]) {
                after = true;
            }
            assertTrue(after);
        }
    }
}