package exercise.day1;

public class exercise8 {

    public static void main(String[] args) {


        int rangeFrom = 0;
        int rangeTo = 100;

    }

    private static boolean isPrimeNo(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return false;
    }
}