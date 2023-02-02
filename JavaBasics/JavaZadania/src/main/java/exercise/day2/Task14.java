package exercise.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {

        int[] array1 = {12, -7, 19, -5};

        System.out.println(getMinusValues(array1));
        int size = getMinusValues(array1);
        int [] createMinusArray = createMinusArray(array1, size);
        System.out.println(Arrays.toString(createMinusArray));
    }

    private static int getMinusValues(int[] array1) {
        int counter = 0;
        for (int element : array1) {
            if (element < 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] createMinusArray (int [] array1, int size){
        int [] array2 = new int[size];
        int counter = 0;
        for (int element : array1){
            if (element < 0){
                array2[counter] = element;
                counter++;
            }
        }
        return array2;
    }
}

