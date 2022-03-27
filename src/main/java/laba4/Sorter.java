package laba4;

public class Sorter {

    protected static int[] testingArray = new int[9];

    public Sorter() {
        int x = 0;
        int y = 0;
        for(int k = 0; k<8; k++) {
        for (int i = 0; i < 8; i++) {
            if(ArrayMaker.newArray[i] > ArrayMaker.newArray[i+1]) {
                x = ArrayMaker.newArray[i];
                y = ArrayMaker.newArray[i+1];
                ArrayMaker.newArray[i] = y;
                ArrayMaker.newArray[i+1] = x;
            }
        }
        for (int h = 0; h < 9; h++) {
            testingArray[h] = ArrayMaker.newArray[h];
        }
        }
    }
    public static int[] getTestingArray() {
        return testingArray;
    }
}