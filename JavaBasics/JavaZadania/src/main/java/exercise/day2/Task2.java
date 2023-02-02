package exercise.day2;

public class Task2 {
    public static void main (String [] args){

        String input = "programowanie";
        String prefix = "pro";
        System.out.println("Result: " + ifPrefix(input, prefix));

        input = "null";
        prefix = "abc";
        System.out.println("Result: " + ifPrefix(input, prefix));

        input = "programowanie";
        prefix = "null";
        System.out.println("Result: " + ifPrefix(input, prefix));

    }

    private static boolean ifPrefix (String input, String prefix) {
        if (input != null && !input.isEmpty() && prefix != null && !prefix.isEmpty()) {
            return input.startsWith(prefix);
        }

        return false;

    }
}
