package exercise.day3.exercise8;

import java.util.Objects;

public class Poem {

    private Author author;
    private int stropheNumbers;

    public Author getAuthor() {
        return author;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public Poem(Author author, int stropheNumbers) {
        this.author = author;
        this.stropheNumbers = stropheNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Poem poem)) return false;
        return stropheNumbers == poem.stropheNumbers && Objects.equals(author, poem.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, stropheNumbers);
    }

    @Override
    public String toString() {
        return "Poem{" +
                "author=" + author +
                ", stropheNumbers=" + stropheNumbers +
                '}';
    }
}
