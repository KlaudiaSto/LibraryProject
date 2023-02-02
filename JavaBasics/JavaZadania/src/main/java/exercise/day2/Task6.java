package exercise.day2;

public class Task6 {
    public static void main (String [] args){

        String input = "Ala ma kota";
        char selectedChar = 't';
        System.out.println("Result: " + charIndex(input, selectedChar));
    }

    private static int charIndex (String input, char selectedChar) {
        if (input != null && !input.isEmpty()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == selectedChar){
                    return i;
                }
            }
        }

        return -1;
    }
}
