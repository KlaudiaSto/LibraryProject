package exercise.day3.exercise8;

import java.util.Objects;

public class Author {

    private String surname;

    private String nationality;

    public Author (String surname, String nationality){
        this.surname = surname;
        this.nationality = nationality;
    }

    public String getSurname() {
        return surname;
    }

    public void print (String surname, String nationality){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        return Objects.equals(surname, author.surname) && Objects.equals(nationality, author.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, nationality);
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
