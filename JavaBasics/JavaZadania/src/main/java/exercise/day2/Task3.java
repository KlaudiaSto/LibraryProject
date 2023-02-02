package exercise.day2;

public class Task3 {

    public static void main (String [] args){


    }

    private static int getIndex (String input, String word){
        if (input != null && !input.isEmpty()){
            if (input.contains(word)){
                return input.indexOf(word);
            }
            else {
                return -1;
            }
        }
        return -1;
    }

}
