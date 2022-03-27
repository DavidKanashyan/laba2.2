package laba4;

public class ArrayMaker {

    protected static int[] newArray = new int[9];

    public ArrayMaker() {
        for (int i = 0; i < 9; i++) {
        newArray[i] = Generator.random;
        new Generator();
        }
    }

    public static int[] getArray() {
        return newArray;
    }

}