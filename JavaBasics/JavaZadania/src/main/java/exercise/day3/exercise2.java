package exercise.day3;

import java.util.regex.Pattern;

public class exercise2 {

    private static final String PL_IBAN_REGEX = "PL[0-9]{26}";

    public static void main (String [] args){

        String iban = "PL12312312312312312312312312";
        System.out.println(isCorrectIBANformat(iban));

    }

    private static boolean isCorrectIBANformat (String iban){

        Pattern pattern = Pattern.compile(PL_IBAN_REGEX);
        return pattern.matcher(iban).matches();

    }
}
