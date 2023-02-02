package exercise.day3.exercise7;

public class Main {

    public static void main (String[] args){

        CAT[] cats = new CAT [3];
        cats[0] = new CAT ("Mruczek");
        cats[1] = new CAT ("Filemon");
        cats[2] = new CAT ("Bonifacy");

        int i = 5;
        for (CAT cat : cats) {
            System.out.print(cat);
            cat.makeSound();
            cat.eatMice(i++ * i);
            System.out.println("***");
        }

    }
}
