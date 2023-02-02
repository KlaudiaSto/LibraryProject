package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class Library {

    private HashSet<Book> booksContent;

    public Library() {

        this.booksContent = new HashSet<>();
    }

    public static void {
        System.out.println("Please indicate book you wish to borrow");
        Scanner bookScan = new Scanner(System.in);
        String userTitle = bookScan.nextLine();

    }

    public Boolean checkTheBookAvailability(Book newBookContent) {
        if (this.booksContent.contains(userTitle)) {
            System.out.println("Available");
        } else {
            System.out.println("Not available");
        }
    }

}


