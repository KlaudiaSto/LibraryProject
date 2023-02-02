package exercise.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercise1 {
    public static final String REGEX_EMAIL = "[A-Za-z0-9._]+@[a-z]+([.]{1}[a-z]+)+";

    public static void main (String [] args) {

        /* check if email address contains
        @
        upper case
        lower case
        numbers
        number@upper case/ lower case
        .pl.fudhf.idji dot cannot be last symbol

         a? zero or more
         a* zero or more
         a+ one or more
         */

        String email1 = "sda@com.pl.lk";
        System.out.println(isCorrectEmail(email1));

    }

        private static boolean isCorrectEmail (String emailAddress){
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();

    }
}


