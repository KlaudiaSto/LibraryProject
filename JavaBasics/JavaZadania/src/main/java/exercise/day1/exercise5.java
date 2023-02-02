package exercise.day1;

public class exercise5 {
    public static void main (String [] args){


        int firstDigit = 4;
        int secondDigit = 11;
        int sum = sumOfDigits (firstDigit, secondDigit);
        System.out.println("Result: " + sum);

    }

    private static int sumOfDigits (int firstDigit, int secondDigit){
        int sum = 0;
        for (;firstDigit < secondDigit; firstDigit++) {
            sum += firstDigit;
        }
        return sum += firstDigit;
    }
}
