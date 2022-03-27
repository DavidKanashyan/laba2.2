package testPack;


import static org.junit.Assert.*;
import org.junit.Test;
import laba4.Generator;

public class GeneratorTest {

    @Test
    public void test() {
        new Generator();
        assertTrue(Generator.getRandom()>19 && Generator.getRandom()<91);
        System.out.print(Generator.getRandom());
    }
}
