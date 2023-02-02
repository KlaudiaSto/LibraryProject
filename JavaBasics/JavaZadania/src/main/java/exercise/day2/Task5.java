package exercise.day2;

public class Task5 {

    public static void main (String [] args){
        String input = "Ala ma kota";
        char anyChar = 'a';
        System.out.println("Result: " + ifCharPresent(input, anyChar));
    }

    private static int ifCharPresent (String input, char anyChar){
        int counter = 0;
        if (input != null && !input.isEmpty()){
            for (int i = input.indexOf(anyChar); i < input.length(); i++) {
                if (input.charAt(i) == anyChar){
                    counter++;
                }
            }
        }
        return 0;
    }
}
