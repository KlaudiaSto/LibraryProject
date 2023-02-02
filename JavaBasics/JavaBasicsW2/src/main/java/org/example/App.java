package org.example;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {

        Book book1 = new Book ("Wiedźmin ", "Andrzej Sapkowski ","x ", "fantasy ", 330, true);
        Book book2 = new Book ("Dzieci z Bullerbyn ", "Astrid Lindgren ","x ", "adventure ", 352, true);
        Book book3 = new Book ("Ania z Zielonego Wzgórza ", "Lucy Montgomery ","x ", "adventure ", 352, true);
        Book book4 = new Book ("Harry Potter i Kamień Filozoficzny ", "J.K.Rowling ","x ", "fantasy", 960, false);

        HashSet <Book> booksContent = new HashSet<>();
        booksContent.add(book1);
        booksContent.add(book2);
        booksContent.add(book3);
        booksContent.add(book4);

        for (Book book : booksContent){
            book.bookDetails();
        }


    }
}

