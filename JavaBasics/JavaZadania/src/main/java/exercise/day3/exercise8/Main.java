package exercise.day3.exercise8;

public class Main {

    public static void main (String[] args){

        Poem [] poems = new Poem[3];
        poems[0] = new Poem(new Author("Szymborska", "PL"), 30);
        poems[1] = new Poem(new Author("Brzechwa", "PL"), 22);
        poems[2] = new Poem(new Author("Conrad", "21"), 34);


        int max = 0;
        String surname = "";
        for (Poem element : poems){
            if (element.getStropheNumbers() > max){
                max = element.getStropheNumbers();
                surname = element.getAuthor().getSurname();
            }
        }

        System.out.println(surname);
    }
}
