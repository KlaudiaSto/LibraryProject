package exercise.day2;

public class Task4 {

    private static final String REPLACEMENT = " -STOP- ";

    public static void main (String [] args){
        String input = "Ala ma, kota. kot, ma Ale";
        System.out.println(replaceString(input));
    }

    private static String replaceString (String input){
        if (input != null && !input.isEmpty()){
            return input
                    .replace(".", REPLACEMENT)
                    .replace(",", REPLACEMENT);
        }
     return input;
    }
}
