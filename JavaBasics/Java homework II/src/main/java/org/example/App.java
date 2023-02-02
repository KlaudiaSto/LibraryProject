package org.example;

import java.util.Locale;

public class App {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Anna"));
    }



    public static Boolean isPalindrome(String text) {

        String lowerText = text.toLowerCase(Locale.ROOT)
                .replaceAll(" ", "")
                .replaceAll(",","")
                .replaceAll("\\.","");

        for (Integer i = 0; i < lowerText.length(); i++) {
            Integer j = lowerText.length() - i - 1;
            if (lowerText.charAt(i) != lowerText.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}

