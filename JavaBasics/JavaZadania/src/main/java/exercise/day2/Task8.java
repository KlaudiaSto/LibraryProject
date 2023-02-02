package exercise.day2;

public class Task8 {

    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;

    public static void main (String [] args){

        String input = "Ala ma kota i trzy psy";
        System.out.println("Result: " + replaceChars(input));
    }

    private static String replaceChars (String input){
        if (input != null && !input.isEmpty()){
            String result = "";
            for (int i = 0; i < input.length(); i++){
                char currentChar = input.charAt(i);
                if (currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII){
                    //mamy wielką literę, zamieniamy na małą
                    result += currentChar + 32;
                }
                else if (currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII){
                    // mamy małą literę, zamieniamy na wielką
                    result += currentChar;
                }
                else {
                    //mamy inny znak niż litety, nic nie modyfikujemy
                    result += currentChar;
                }
            }

        }
        return input;
    }
}
