package exercise.day2;

public class Task15 {
    public static void main(String[] args) {

        String array1[] = {"Ala", "ma", "kota"};
        String array2[] = {null, "ma", "kota"};
        System.out.println(areIdentical(array1, array2));

    }

    private static boolean areIdentical(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            String array1Element = array1[i];
            String array2Element = array2[i];
            if(array1Element == null && array2Element == null){
                continue;
            }
            if(array1Element == null || (!array1Element.equals(array2Element))){
                return false;
            }
        }
        return true;
    }
}
