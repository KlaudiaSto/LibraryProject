package exercise.day3.exercise7;

import java.util.Objects;

public class CAT {

    private String name;

    public CAT (String name) {
        this.name = name;
    }

    public void makeSound (){
        System.out.println("Meow Meow");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CAT cat)) return false;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "CAT{" +
                "name='" + name + '\'' +
                '}';
    }

    public void eatMice (int mice){
        System.out.println("I ate " + mice + " mice");





    }

}
